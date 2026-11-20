/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteAsset {
    static volatile int field_a;
    Sprite field_b;
    static int[] field_c;
    static String field_d;
    private String field_e;

    public static void clearSharedReferences(byte param0) {
        field_c = null;
        if (param0 >= -29) {
          field_c = (int[]) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final boolean isLoaded(byte param0) {
        if (param0 == 10) {
          return null != this.field_b ? true : false;
        }
        this.isLoaded((byte) -68);
        return null != this.field_b ? true : false;
    }

    final Sprite getSprite(int param0) {
        Sprite dupTemp$0 = null;
        if (this.field_b != null) {
          return this.field_b;
        }
        if (param0 == 8192) {
          dupTemp$0 = RoadSegment.loadSpriteByName(this.field_e, (byte) -63);
          this.field_b = dupTemp$0;
          return dupTemp$0;
        }
        String var3 = (String) null;
        SpriteAsset.createAccount(-37, (String) null, (byte) 101, true, 47, (String) null, (String) null);
        Sprite dupTemp$1 = RoadSegment.loadSpriteByName(this.field_e, (byte) -63);
        this.field_b = dupTemp$1;
        return dupTemp$1;
    }

    final static void sortPlayerStatViews(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          TriangleMesh.sortPlayerStatIndexes(param1, param0, true, true, Vector2f.field_h, MatchingTextValidator.field_j, ServerConnectionState.field_c);
          for (var2_int = 0; Vector2f.field_h > var2_int; var2_int++) {
            IterableNodeHashTable.field_h[param1 + var2_int] = var2_int;
          }
          TriangleMesh.sortPlayerStatIndexes(param1 + param1, param1, true, false, Vector2f.field_h + param1, SavedRasterState.field_j, VehicleDefinition.field_t);
          if (param1 >= Vector2f.field_h) {
            return;
          }
          Vector2f.field_h = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "uf.E(" + param0 + ',' + param1 + ')');
        }
    }

    SpriteAsset(String param0) {
        try {
          this.field_e = param0;
          this.field_b = null;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "uf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int createAccount(int param0, String param1, byte param2, boolean param3, int param4, String param5, String param6) {
        AccountFormText var7 = null;
        RuntimeException var7_ref = null;
        AccountFormText var8 = null;
        int var9 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = -6 / ((0 - param2) / 52);
          var7 = new AccountFormText(param5);
          var8 = new AccountFormText(param1);
          stackIn_1_0 = NetworkArchiveRequest.processAccountRequest(65500, param0, param4, var7, param3, param6, var8);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_4_0 = var7_ref;
          stackIn_4_1 = new StringBuilder().append("uf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_a = 0;
        field_c = new int[8192];
        field_d = "Waiting for fonts";
    }
}
