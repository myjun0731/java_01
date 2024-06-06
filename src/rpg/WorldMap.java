package rpg;

import java.util.HashMap;

public class WorldMap {
    private HashMap<String, String> locationInfo; // 지역 이름과 해당 지역의 정보를 매핑

    public WorldMap() {
        locationInfo = new HashMap<>();
        // 세계 지도 초기화
        initializeMap();
    }

    private void initializeMap() {
        // 세계 지도를 초기화합니다.
        // 예시로 몇 개의 지역을 추가합니다.
        locationInfo.put("마을", "마을 정보...");
        locationInfo.put("숲", "숲 정보...");
        locationInfo.put("동굴", "동굴 정보...");
        // 추가적인 지역 초기화 작업을 수행할 수 있습니다.
    }

    // 지도 출력 메서드
    public void displayMap() {
        System.out.println("<세계 지도>");
        for (String location : locationInfo.keySet()) {
            System.out.println(location);
        }
    }

    // 지역 정보 반환 메서드
    public String getLocationInfo(String locationName) {
        return locationInfo.get(locationName);
    }

    // 지역 정보 업데이트 메서드
    public void updateLocationInfo(String locationName, String info) {
        locationInfo.put(locationName, info);
    }

    // 유효한 지역인지 확인하는 메서드
    public boolean isValidLocation(String locationName) {
        return locationInfo.containsKey(locationName);
    }
}