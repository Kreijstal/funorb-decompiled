/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pn extends fj implements ButtonListener {
    private boolean field_lb;
    private boolean field_ob;
    private boolean field_tb;
    static char[] field_nb;
    static tb field_pb;
    private BitmapFont field_sb;
    private boolean field_mb;
    private jm field_rb;
    static String[] field_qb;

    final void a(String param0, int param1, int param2) {
        String stackIn_15_2 = null;
        String stackIn_31_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (this.field_mb) {
            return;
          }
          boolean stackIn_7_1 = (param2 == 256);
          this.field_tb = stackIn_7_1;
          if (param1 != -1) {
            return;
          }
          this.field_mb = true;
          this.field_rb.a(4210752, 8405024, -127);
          qi var6 = new qi(this, this.field_sb, param0);
          if (param2 == 5) {
            var6.a(false, TerrainMap.field_i, 11);
            var6.a(false, EmailAvailabilityRequest.field_d, 17);
          } else if (param2 == 256) {
            var6.a((UiListener) (this), (byte) -67, WeightedCacheEntry.field_s);
          } else {
            qi stackIn_14_0 = var6;
            boolean stackIn_14_1 = false;
            if (this.field_ob) {
              stackIn_15_2 = WeightedCacheEntry.field_s;
            } else {
              stackIn_15_2 = Minimap.field_O;
            }
            ((qi) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_15_2, -1);
          }
          if (param2 == 3) {
            var6.a(false, qk.field_a, 7);
          } else if (param2 == 4) {
            var6.a(false, ei.field_k, 8);
          } else if (6 != param2) {
            if (9 != param2) {
              this.a(var6, 30);
              return;
            }
            var6.a((UiListener) (this), (byte) -67, WhirlpoolHasher.field_g);
          } else {
            var6.a(false, ej.field_c, 9);
          }
          this.a(var6, 30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_30_0 = var4;
          StringBuilder stackIn_30_1 = new StringBuilder().append("pn.MB(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean p(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        boolean stackIn_7_0 = false;
        Throwable decompiledCaughtException = null;
        Object var1_ref = ThreeSliceButtonPainter.field_v;
        synchronized (var1_ref) {
          if (param0 >= -66) {
            field_nb = (char[]) null;
          }
          if (ta.field_w == MarkerSliderPainter.field_l) {
            return false;
          }
          PasswordValidator.field_n = td.field_b[MarkerSliderPainter.field_l];
          jc.field_c = ek.field_a[MarkerSliderPainter.field_l];
          MarkerSliderPainter.field_l = 127 & 1 + MarkerSliderPainter.field_l;
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    final void r(int param0) {
        int var3 = -15 / ((26 - param0) / 47);
        this.field_rb.a(4210752, 2121792, -127);
        qi var2 = new qi(this, this.field_sb, DraggableWidget.field_K);
        var2.a(false, gj.field_u, 15);
        this.a(var2, 30);
    }

    public static void releaseStatics(int guard) {
        field_nb = null;
        if (guard != -5) {
          return;
        }
        field_qb = null;
        field_pb = null;
    }

    final static byte[][][] a(int[] param0, ResourceArchive param1, byte[][][] param2, ResourceArchive param3, byte param4) {
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        try {
          if (param4 > 53) {
            byte[][][] stackIn_4_0 = sl.a(param1, param3, param0, param2, 2, 0);
            return stackIn_4_0;
          }
          byte[][][] stackIn_2_0 = (byte[][][]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var5;
          StringBuilder stackIn_7_1 = new StringBuilder().append("pn.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        String stackIn_11_2 = null;
        try {
          if (guard < 0) {
            return true;
          }
          if (keyCode != 13) {
            boolean stackIn_7_0 = super.onFocusedKey(root, character, keyCode, 117);
            return stackIn_7_0;
          }
          this.o(-18861);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var5;
          StringBuilder stackIn_10_1 = new StringBuilder().append("pn.G(");
          if (root == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    public void onAction(TextButton button, int buttonCode, int localY, int guard, int localX) {
        String stackIn_9_2 = null;
        try {
          if (guard != 1) {
            return;
          }
          if (!this.field_tb) {
            md.a(PointCloudEffect.d((byte) -85), (byte) -96, "tochangedisplayname.ws");
            return;
          }
          WhirlpoolHasher.a(3, guard + 106);
          this.o(-18861);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var6;
          StringBuilder stackIn_8_1 = new StringBuilder().append("pn.K(");
          if (button == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(buttonCode).append(',').append(localY).append(',').append(guard).append(',').append(localX).append(')').toString());
        }
    }

    final void o(int param0) {
        if (!this.field_G) {
          return;
        }
        if (param0 != -18861) {
          return;
        }
        this.field_G = false;
        if (this.field_ob) {
          jj.a(0);
          return;
        }
        if (this.field_lb) {
          DialWidget.k(0);
          return;
        }
    }

    pn(tb param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new qi((pn) null, param1, param2), 77, 10, 10);
        try {
          this.field_mb = false;
          this.field_lb = param4 ? true : false;
          this.field_tb = false;
          this.field_sb = param1;
          this.field_ob = param3 ? true : false;
          this.field_rb = new jm(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_rb.field_G = true;
          this.b(this.field_rb, false);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "pn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        String stackIn_5_2 = null;
        try {
          int var2_int = param1.length;
          byte[] var3 = new byte[var2_int];
          qg.a(param1, param0, var3, 0, var2_int);
          byte[] stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var2;
          StringBuilder stackIn_4_1 = new StringBuilder().append("pn.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    static {
        field_nb = new char[]{(char)91, (char)93, (char)35};
        field_qb = new String[]{"Fly the container out of the cave<br>and away from the asteroid.", "Fly the container out of the cave<br>and away from the moon.", "Fly the container out of the cave<br>and away from the planet."};
    }
}
