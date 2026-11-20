/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveRequestQueue {
    private int progressScale;
    private int nextRequestIndex;
    private ArchiveLoadRequest[] requests;
    private int requestCount;
    float progress;
    String statusText;
    static GameStateFactory field_e;
    static String field_c;
    static int field_f;
    static int field_b;

    final boolean pollRequests(byte param0) {
        ArchiveLoadRequest var2;
        int var3;
        String var4;
        ArchiveLoadRequest var5;
        var3 = VoidHunters.field_G;
        while (this.requestCount > this.nextRequestIndex) {
          var5 = this.requests[this.nextRequestIndex];
          var2 = var5;
          if (!var5.archive.loadIndex((byte) 123)) {
            this.updateProgress(var5, 0, (byte) 125);
            return false;
          }
          if (0 <= var5.groupId &&
            !var5.archive.isGroupReady(68, var5.groupId)) {
            this.updateProgress(var2, var5.archive.getGroupLoadPercent(var5.groupId, 1045), (byte) 118);
            return false;
          }
          if (var5.groupName != null &&
            !var5.archive.isNamedGroupReady(32171, var5.groupName)) {
            this.updateProgress(var2, var5.archive.getNamedGroupLoadPercent(var5.groupName, -2118), (byte) 25);
            return false;
          }
          if (var5.groupId < 0 &&
            var5.groupName == null &&
            var5.progressLabel != null &&
            !var5.archive.loadAllGroups(105)) {
            this.updateProgress(var2, var5.archive.getLoadPercent(-107), (byte) 120);
            return false;
          }
          this.nextRequestIndex = this.nextRequestIndex + 1;
        }
        if (param0 > 85) {
          return true;
        }
        var4 = (String) null;
        this.enqueueRequest((ResourceArchive) null, (String) null, false, (String) null, (String) null);
        return true;
    }

    final static int highestOneBit(int param0, int param1) {
        int var2 = param0 >>> 1;
        if (param1 == 1302374146) {
          var2 = var2 | var2 >>> 1;
          var2 = var2 | var2 >>> 2;
          var2 = var2 | var2 >>> 4;
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return param0 & ~var2;
        }
        return -70;
    }

    private final void enqueueRequest(String param0, byte param1, int param2, String param3, String param4, ResourceArchive param5) {
        ArchiveLoadRequest[] var10 = null;
        ArchiveLoadRequest var9 = null;
        ArchiveLoadRequest var11 = null;
        int fieldTemp$0 = 0;
        try {
          if (this.requests.length <= this.requestCount) {
            var10 = new ArchiveLoadRequest[this.requestCount * 2];
            ArchiveLoadRequest[] var7 = var10;
            ArrayOperations.copy(this.requests, 0, var10, 0, this.requestCount);
            this.requests = var10;
          }
          if (param1 != -62) {
            ResourceArchive var8 = (ResourceArchive) null;
            this.enqueueRequest((String) null, 126, (String) null, (ResourceArchive) null);
          }
          var9 = new ArchiveLoadRequest();
          var11 = var9;
          ArchiveLoadRequest var7_ref = var11;
          var11.groupId = param2;
          var11.archive = param5;
          var11.progressLabel = param0;
          var11.groupName = param3;
          var11.pendingLabel = param4;
          fieldTemp$0 = this.requestCount;
          this.requestCount = this.requestCount + 1;
          this.requests[fieldTemp$0] = var9;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "wsb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void enqueueRequest(ResourceArchive param0, String param1, boolean param2, String param3, String param4) {
        try {
          this.enqueueRequest(param1, (byte) -62, -1, param3, param4, param0);
          if (param2) {
            field_b = -110;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "wsb.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void enqueueRequest(String param0, int param1, String param2, ResourceArchive param3) {
        try {
          this.enqueueRequest(param0, (byte) -62, param1, (String) null, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "wsb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_c = null;
        if (param0 > -102) {
          field_f = -17;
          field_e = null;
          return;
        }
        field_e = null;
    }

    ArchiveRequestQueue(int param0) {
        this.requests = new ArchiveLoadRequest[16];
        this.progressScale = param0;
    }

    private final void updateProgress(ArchiveLoadRequest param0, int param1, byte param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = (float)param1 / 100.0f + (float)(this.nextRequestIndex + 1);
          var5 = 40 % ((-27 - param2) / 40);
          this.progress = (float)this.progressScale * var4_float / (float)(1 + this.requestCount);
          if (param1 != 0) {
            this.statusText = param0.progressLabel + " - " + param1 + "%";
            return;
          }
          this.statusText = param0.pendingLabel;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("wsb.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_e = (GameStateFactory) ((Object) new MapZoneFactory());
        field_b = 200;
        field_f = field_b / 2;
        field_c = "Hull triangle";
    }
}
