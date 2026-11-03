/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends SingleChildWidget {
    static IntrusiveDeque field_E;
    private static int[] field_G;
    static int[] field_F;
    private static int[] field_A;
    static int field_C;
    private static int[] field_I;
    private static int[] field_H;
    static String field_B;

    final static void a(String param0, int param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (GzipInflater.field_c == -1 &&
            cb.field_n == -1) {
            GzipInflater.field_c = pd.field_k;
            cb.field_n = bb.field_b;
          }
          boolean decompiledFrameRemainder0 = true;
          LinkPainter.field_e = LinkPainter.field_e + 1;
          if (param0 == null) {
            decompiledFrameRemainder0 = (GameKeyHandler.field_d == null);
          } else {
            decompiledFrameRemainder0 = !(param0.equals(GameKeyHandler.field_d));
          }
          if (decompiledFrameRemainder0) {
            if (!AggressiveAi.field_q) {
              if (ri.field_F <= LinkPainter.field_e) {
                stackIn_16_0 = (LinkPainter.field_e < ri.field_F + de.field_i) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
            var2_int = stackIn_16_0;
            if (param0 == null) {
              LinkPainter.field_e = 0;
            } else {
              if (AggressiveAi.field_q) {
                LinkPainter.field_e = ri.field_F;
              } else {
                if (var2_int == 0) {
                  LinkPainter.field_e = 0;
                } else {
                  LinkPainter.field_e = ri.field_F;
                }
              }
            }
            if (param0 != null) {
              AggressiveAi.field_q = false;
            } else {
              if (var2_int != 0) {
                AggressiveAi.field_q = true;
              }
            }
            rs.field_Fb = cb.field_n;
            RandomAccessCacheFile.field_g = GzipInflater.field_c;
          }
          GameKeyHandler.field_d = param0;
          if (!AggressiveAi.field_q &&
            LinkPainter.field_e < ri.field_F &&
            UrlLoader.field_d) {
            LinkPainter.field_e = 0;
            rs.field_Fb = cb.field_n;
            RandomAccessCacheFile.field_g = GzipInflater.field_c;
          }
          GzipInflater.field_c = -1;
          if (param1 != 0) {
            field_F = (int[]) null;
          }
          cb.field_n = -1;
          if (AggressiveAi.field_q &&
            LinkPainter.field_e == StarLinkPlanner.field_f) {
            AggressiveAi.field_q = false;
            LinkPainter.field_e = 0;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("vj.A(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String g(byte param0) {
        if (!(DefensiveAi.field_p >= 2)) {
          return de.field_h;
        }
        if (StarAnnotation.field_j != null) {
          if (!StarAnnotation.field_j.isIndexLoaded((byte) 107)) {
            return DialPainter.field_a;
          }
          return ns.field_xb;
        }
        if (!LinkPainter.field_g.isIndexLoaded((byte) 13)) {
          return fa.field_J;
        }
        if (!LinkPainter.field_g.a("commonui", 77)) {
          return SpriteState.field_r + " - " + LinkPainter.field_g.a("commonui", (byte) 65) + "%";
        }
        if (!tq.field_f.isIndexLoaded((byte) -69)) {
          return LinkPainter.field_h;
        }
        if (!tq.field_f.a("commonui", -91)) {
          return IntrusiveDequeCursor.field_h + " - " + tq.field_f.a("commonui", (byte) 28) + "%";
        }
        int var1 = 32 % ((param0 - 15) / 52);
        if (!GalaxyMap.field_g.isIndexLoaded((byte) -2)) {
          return MouseInputHandler.field_e;
        }
        if (!GalaxyMap.field_g.preloadAll(-1)) {
          return ToggleButton.field_v + " - " + GalaxyMap.field_g.getOverallProgress(100) + "%";
        }
        return IsaacBackedRandom.field_d;
    }

    public static void f(byte param0) {
        field_F = null;
        field_I = null;
        field_G = null;
        if (param0 == 111) {
          field_E = null;
          field_B = null;
          field_A = null;
          field_H = null;
          return;
        }
        vj.i(-3);
        field_E = null;
        field_B = null;
        field_A = null;
        field_H = null;
    }

    final void handleRelease(int param0, int param1, int param2, int param3, int param4, UiWidget param5) {
        super.handleRelease(param0, param1, param2, param3, param4 + 0, param5);
        fr var8 = oa.field_b;
        if (param4 != -600269855) {
          return;
        }
        try {
          if (var8 != null &&
            this.containsPoint(param0, 87, param3, param1, param2)) {
            if (this.field_u instanceof lf) {
              ((lf) (this.field_u)).a(-27619, this, var8);
              oa.field_b = null;
              return;
            }
            if (var8.field_u instanceof lf) {
              ((lf) (var8.field_u)).a(param4 ^ 600248316, this, var8);
              oa.field_b = null;
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "vj.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private vj(int param0, int param1, int param2, int param3, WidgetPainter param4, WidgetListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_z = param6;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "vj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static String i(int param0) {
        if (param0 >= -90) {
          field_B = (String) null;
          if (ue.field_a == ee.field_l) {
            return aa.field_G;
          }
          return oj.field_Ib;
        }
        if (ue.field_a == ee.field_l) {
          return aa.field_G;
        }
        return oj.field_Ib;
    }

    static {
        int var0 = 0;
        field_E = new IntrusiveDeque();
        field_F = new int[256];
        field_G = new int[256];
        field_I = new int[256];
        field_H = new int[256];
        field_A = new int[256];
        field_B = "Diplomacy";
        for (var0 = 0; 256 > var0; var0++) {
          field_F[var0] = 65793 * var0;
          field_A[var0] = 65793 * (var0 >> 2);
          field_I[var0] = var0 * 65536;
          field_G[var0] = ee.a(we.a(var0, -1912602370) << 7, var0);
          field_H[var0] = (var0 >> 1) * 65537;
        }
    }
}
