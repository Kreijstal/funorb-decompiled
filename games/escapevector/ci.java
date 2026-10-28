/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    boolean field_h;
    Sprite field_e;
    static int field_g;
    boolean field_f;
    int field_b;
    private int field_c;
    static om field_d;
    static PcmSample field_a;

    public static void releaseStatics(int guard) {
        field_d = null;
        field_a = null;
        if (guard != 4) {
          ci.a(-111, 38, 24, -46);
        }
    }

    final static PointCloudEffect a(byte param0, PcmSample param1, int param2, Sprite param3, boolean param4, int param5) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          PointCloudEffect var6 = new PointCloudEffect(param3, param5, param2, param1);
          if (param0 != -43) {
            ci.releaseStatics(68);
          }
          PointCloudEffect stackIn_4_0 = var6;
          boolean stackIn_5_1 = (param4);
          stackIn_4_0.field_q = stackIn_5_1;
          PointCloudEffect stackIn_6_0 = var6;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var6_ref;
          StringBuilder stackIn_9_1 = new StringBuilder().append("ci.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (!TrackerMusicDefinition.field_f.b(param0 + 117)) {
          if (null == IntValueNode.field_i) {
            if (param0 != 0) {
              field_d = (om) null;
              return;
            }
            return;
          }
          kh.a(lh.b((byte) 116), param0 - 1230, true);
          if (param0 != 0) {
            field_d = (om) null;
            return;
          }
          return;
        }
        SpriteState.a(-106, true);
        if (param0 == 0) {
          return;
        }
        field_d = (om) null;
    }

    final static ll a(int param0, int param1, int param2, int param3) {
        ll var4 = new ll();
        var4.field_i = param1;
        var4.field_g = param0;
        jl.field_n.addLast(-12328, var4);
        if (param2 == -1) {
          BoundedRandomAccessFile.a(-100, param3, var4);
          return var4;
        }
        field_g = 109;
        BoundedRandomAccessFile.a(-100, param3, var4);
        return var4;
    }

    final boolean a(int param0, byte param1) {
        if (param1 > -56) {
          return false;
        }
        if (UiContainer.e((byte) -52)) {
          int var3 = 1 << param0;
          boolean var4 = (0 != (this.field_c & var3));
          return (var4);
        }
        if (this.field_h) {
          return false;
        }
        int var3Lifetime1 = 1 << param0;
        boolean var4Lifetime1 = (0 != (this.field_c & var3Lifetime1));
        return (var4Lifetime1);
    }

    ci(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        this.field_e = jb.field_w;
        this.field_h = param1 ? true : false;
        this.field_b = param0;
        this.field_f = param2 ? true : false;
        this.field_c = param3;
    }

    static {
        field_g = -1;
        field_d = new om(6, 0, 4, 2);
    }
}
