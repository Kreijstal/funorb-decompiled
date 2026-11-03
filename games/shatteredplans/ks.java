/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ks {
    static int field_i;
    private boolean field_d;
    static gq field_a;
    static String[] field_b;
    static String field_c;
    static Sprite field_j;
    static byte[] field_e;
    private String field_f;
    private boolean field_g;
    static Sprite field_h;

    final static boolean a(boolean param0, boolean param1) {
        if (!param1) {
          nf var3 = (nf) null;
          ks.a((nf) null, -105);
          if (WeightedLruCache.field_g != null) {
            if (pd.field_k < e.field_f) {
              return false;
            }
            if (pd.field_k >= ei.field_e) {
              return false;
            }
            if (ByteArrayNode.field_k > bb.field_b) {
              return false;
            }
            if (AttackTask.field_o <= bb.field_b) {
              return false;
            }
            if (je.field_d == 0) {
              return true;
            }
            if (!param0) {
              return true;
            }
            if (WeightedLruCache.field_g != hm.field_q) {
              js.a((byte) -10);
              if (BattleSnapshot.a(0)) {
                NodeHashTableIterator.a(0, "enter");
              }
              return true;
            }
            if (BattleSnapshot.a(0)) {
              NodeHashTableIterator.a(0, "enter");
              return true;
            }
            return true;
          }
          if (null == hm.field_q) {
            return false;
          }
          if (pd.field_k < e.field_f) {
            return false;
          }
          if (pd.field_k >= ei.field_e) {
            return false;
          }
          if (ByteArrayNode.field_k <= bb.field_b) {
            if (AttackTask.field_o <= bb.field_b) {
              return false;
            }
            if (je.field_d != 0) {
              if (!param0) {
                return true;
              }
              if (WeightedLruCache.field_g != hm.field_q) {
                js.a((byte) -10);
                if (BattleSnapshot.a(0)) {
                  NodeHashTableIterator.a(0, "enter");
                  return true;
                }
                return true;
              }
              if (BattleSnapshot.a(0)) {
                NodeHashTableIterator.a(0, "enter");
                return true;
              }
            }
            return true;
          }
          return false;
        }
        if (WeightedLruCache.field_g == null) {
          if (null == hm.field_q) {
            return false;
          }
          if (pd.field_k < e.field_f) {
            return false;
          }
          if (pd.field_k < ei.field_e &&
            ByteArrayNode.field_k <= bb.field_b) {
            if (AttackTask.field_o <= bb.field_b) {
              return false;
            }
            if (je.field_d != 0) {
              if (!param0) {
                return true;
              }
              if (WeightedLruCache.field_g != hm.field_q) {
                js.a((byte) -10);
                if (BattleSnapshot.a(0)) {
                  NodeHashTableIterator.a(0, "enter");
                  return true;
                }
                return true;
              }
              if (BattleSnapshot.a(0)) {
                NodeHashTableIterator.a(0, "enter");
                return true;
              }
            }
            return true;
          }
          return false;
        }
        if (pd.field_k >= e.field_f &&
          pd.field_k < ei.field_e &&
          ByteArrayNode.field_k <= bb.field_b) {
          if (AttackTask.field_o <= bb.field_b) {
            return false;
          }
          if (je.field_d != 0) {
            if (!param0) {
              return true;
            }
            if (WeightedLruCache.field_g != hm.field_q) {
              js.a((byte) -10);
              if (BattleSnapshot.a(0)) {
                NodeHashTableIterator.a(0, "enter");
                return true;
              }
              return true;
            }
            if (BattleSnapshot.a(0)) {
              NodeHashTableIterator.a(0, "enter");
              return true;
            }
          }
          return true;
        }
        return false;
    }

    final boolean b(int param0) {
        if (param0 != 14) {
          this.b(-102);
          return this.field_g;
        }
        return this.field_g;
    }

    final static tm a(int param0, boolean param1, String param2) {
        tm var3 = null;
        RuntimeException var3_ref = null;
        tm stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new tm(param2, param1);
          if (param0 > -86) {
            field_c = (String) null;
          }
          if (RasterBuffer.field_a >= 18) {
            NanoFrameTimer.a(var3, true);
          } else {
            ld.field_p.addLast((byte) -113, var3);
          }
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("ks.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static WidgetStyle c(int param0) {
        if (GameRules.field_a == null) {
          GameRules.field_a = new WidgetStyle();
          GameRules.field_a.a(gn.field_u, true);
          GameRules.field_a.field_h = EmailValidator.field_x;
          GameRules.field_a.field_l = 14;
          GameRules.field_a.field_i = 7697781;
          GameRules.field_a.field_e = 5;
          GameRules.field_a.field_k = 2763306;
          GameRules.field_a.field_c = 4;
          GameRules.field_a.field_d = 6;
          GameRules.field_a.field_t = 0;
        }
        int var1 = -68 / ((param0 - 66) / 40);
        return GameRules.field_a;
    }

    final void a(boolean param0, int param1) {
        if (param1 > 1) {
          this.field_g = true;
          this.field_d = param0 ? true : false;
          return;
        }
        this.field_f = (String) null;
        this.field_g = true;
        this.field_d = param0 ? true : false;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        return this.field_d;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nf var11 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (SoftwareRasterizer.field_a > param5) {
            param4 = param4 + (param5 - SoftwareRasterizer.field_a) * param3;
            param1 = param1 + (param5 - SoftwareRasterizer.field_a);
            param5 = SoftwareRasterizer.field_a;
          }
          if (SoftwareRasterizer.field_f < param5 + param1) {
            param1 = SoftwareRasterizer.field_f - param5;
          }
          var6_int = SoftwareRasterizer.field_b + param3;
          if (param0 != -18166) {
            var11 = (nf) null;
            ks.a((nf) null, -32);
          }
          var8 = SoftwareRasterizer.field_b * param5 + param4;
          var9 = param4;
          while (param1 > 0) {
            if (SoftwareRasterizer.field_i <= var9 &&
              var9 < SoftwareRasterizer.field_l) {
              param4 = SoftwareRasterizer.field_h[var8];
              var7 = param2;
              param5 = var7 + param4;
              var7 = (16711935 & param4) + (16711935 & var7);
              param4 = (16777472 & var7) + (param5 - var7 & 65536);
              SoftwareRasterizer.field_h[var8] = ee.intOr(-(param4 >>> 8) + param4, param5 - param4);
            }
            var8 = var8 + var6_int;
            param1--;
            var9 = var9 + param3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var6), "ks.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String a(int param0) {
        int var2 = 2 / ((28 - param0) / 39);
        return this.field_f;
    }

    final static void a(nf param0, int param1) {
        Object stackIn_2_0;
        long stackIn_2_1;
        String stackIn_2_2;
        String stackIn_2_3;
        int stackIn_2_4;
        Object stackIn_2_5;
        qr stackIn_2_6;
        int stackIn_2_7;
        int stackIn_3_8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        fc var5 = null;
        String var6 = null;
        fc var7 = null;
        String var8 = null;
        fc var9 = null;
        String var10 = null;
        fc var11 = null;
        String var12 = null;
        fc var13 = null;
        try {
          stackIn_2_0 = null;
          stackIn_2_1 = param0.field_p;
          stackIn_2_2 = param0.field_d;
          stackIn_2_3 = param0.field_b;
          stackIn_2_4 = param1 + 293;
          stackIn_2_5 = null;
          stackIn_2_6 = param0.field_j;
          stackIn_2_7 = param0.field_n;
          if (param0.field_n == 1) {
            stackIn_3_8 = param0.field_g;
          } else {
            stackIn_3_8 = 0;
          }
          SliderPainter.a((int[]) (stackIn_2_0), stackIn_2_1, stackIn_2_2, stackIn_2_3, stackIn_2_4, (ub) (stackIn_2_5), stackIn_2_6, stackIn_2_7, stackIn_3_8);
          if (param0.field_n == 0 &&
            !ha.a((byte) 95) &&
            null == np.field_a &&
            he.field_p == null) {
            if (!ae.field_b) {
              var5 = DerelictVictoryChecker.field_m;
              var6 = GzipInflater.field_h;
              var5.field_j.a(param1 + 1, 14, var6);
            }
            var7 = DerelictVictoryChecker.field_m;
            var8 = gb.field_o;
            var7.field_j.a(param1 + 1, 20, var8);
          }
          if (1 == param0.field_n &&
            !ha.a((byte) 111) &&
            null != np.field_a &&
            param0.field_g == np.field_a.g(-101)) {
            if (!ae.field_b) {
              var9 = DerelictVictoryChecker.field_m;
              var10 = MenuLabel.field_z;
              var9.field_j.a(1, 14, var10);
            }
            var11 = DerelictVictoryChecker.field_m;
            var12 = sn.field_a;
            var11.field_j.a(1, 20, var12);
          }
          DerelictVictoryChecker.field_m.a(false);
          DerelictVictoryChecker.field_m.a(false, -16661);
          DerelictVictoryChecker.field_m.a(param0.field_f, param0.field_n, (byte) -116);
          DerelictVictoryChecker.field_m.b(17);
          DerelictVictoryChecker.field_m.a(param0, (byte) -100);
          var13 = DerelictVictoryChecker.field_m;
          var3 = PointsVictoryChecker.field_p;
          var4 = SliderWidget.field_P;
          var13.field_j.b(0, param1, 0, var3, var4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ks.F(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    ks(String param0) {
        this.field_d = false;
        this.field_g = false;
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ks.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= 122) {
          field_e = null;
          field_a = null;
          field_b = null;
          field_h = null;
          field_j = null;
          return;
        }
        ks.c(-61);
        field_e = null;
        field_a = null;
        field_b = null;
        field_h = null;
        field_j = null;
    }

    final static void a(int param0, wj param1, int param2) {
        try {
          wd.field_P.addLast((byte) -113, param1);
          if (param0 != 20) {
            field_i = -24;
          }
          BattleEvent.a(param2, param1, true);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ks.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = new gq(14, 0, 4, 1);
        field_c = "Derelict";
        field_b = new String[16];
    }
}
