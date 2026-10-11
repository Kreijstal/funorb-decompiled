/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static String field_b;
    static String field_a;
    static mm field_c;
    static gn field_d;
    static String field_e;

    final static void a(int param0, int param1, int param2, boolean param3) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          nc.field_h.a(param1, param2);
          if (param3) {
            var4_int = io.field_b % nc.field_h.field_s * 2;
            if (nc.field_h.field_s <= var4_int) {
              var4_int = nc.field_h.field_s + (-var4_int + nc.field_h.field_s);
            }
            boolean decompiledSharedTail0 = !(var4_int < 10);
            if (!decompiledSharedTail0) {
              var4_int = 10;
              decompiledSharedTail0 = (HoldTheLine.field_D != 0);
            }
            if ((decompiledSharedTail0) &&
              (var4_int > nc.field_h.field_s - 40)) {
              var4_int = nc.field_h.field_s - 40;
            }
            cd.a(nc.field_h, (byte) 121, var4_int, param2, 30, 0, 80, 0, param1);
          }
          if (param0 != 80) {
            b.a(true, 89, -61, (ei) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "b.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        try {
          field_c = null;
          field_b = null;
          field_e = null;
          field_a = null;
          int var1_int = -2 / ((param0 + 18) / 57);
          field_d = null;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "b.C(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_14_0 = 0;
        fi stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        fi stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        da var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        fi var5_ref = null;
        fi var6 = null;
        String var6_ref = null;
        fi var7 = null;
        String var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = HoldTheLine.field_D;
        try {
          if (param0 != 10) {
            return;
          }
          var1 = rd.field_e;
          var2 = var1.f((byte) -103);
          if (var2 == 0) {
            if (ah.field_a == null) {
              ah.field_a = new rg(128);
              se.field_l = 0;
            }
            stackIn_14_0 = (1 != var1.f((byte) -18)) ? 0 : 1;
            var3_int = stackIn_14_0;
            var4_ref_String = var1.j(-1231);
            if (var3_int != 0) {
              var1.j(-1231);
            }
            var5_ref = wc.a(param0 - 10, var4_ref_String);
            var6_ref = var1.j(param0 - 1241);
            var7_ref = kf.a((CharSequence) ((Object) var4_ref_String), (byte) 94);
            if (null == var7_ref) {
              var7_ref = var4_ref_String;
            }
            if (null == var5_ref) {
              var5_ref = wc.a(0, var6_ref);
              if (null != var5_ref) {
                ah.field_a.a((long)var7_ref.hashCode(), (byte) -75, var5_ref);
              }
            }
            if (var5_ref == null) {
              var5_ref = new fi();
              ah.field_a.a((long)var7_ref.hashCode(), (byte) -75, var5_ref);
              fieldTemp$1 = se.field_l;
              se.field_l = se.field_l + 1;
              var5_ref.field_gb = fieldTemp$1;
              sj.field_H.a((byte) -128, var5_ref);
            }
            var5_ref.field_mb = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (eg.field_b == 1) {
                eg.field_b = 2;
              }
              return;
            }
            if (3 == var2) {
              if (eg.field_b == 2) {
                eg.field_b = 1;
              }
              return;
            }
            if (var2 != 4) {
              bl.a((Throwable) null, (byte) 55, "F1: " + em.b(false));
              r.a(-28036);
              return;
            }
            eg.field_b = 1;
            var3 = var1.j(-1231);
            vl.field_g = ((String) (var3)).intern();
            var4 = var1.f((byte) -70);
            jh.a(var4, (byte) 61);
            return;
          }
          if (jo.field_b == null) {
            jo.field_b = new rg(128);
            sl.field_a = 0;
          }
          var3Lifetime1 = var1.j(-1231);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.j(-1231);
          var5 = var1.j(-1231);
          var6 = ra.a(var4_ref_StringLifetime1, param0 ^ 85);
          if (null == var6) {
            var6 = ra.a(var5, param0 ^ 101);
            if (var6 != null) {
              jo.field_b.a((long)kf.a((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 111).hashCode(), (byte) -75, var6);
            }
          }
          if (null == var6) {
            var6 = new fi();
            jo.field_b.a((long)kf.a((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 111).hashCode(), (byte) -75, var6);
            fieldTemp$0 = sl.field_a;
            sl.field_a = sl.field_a + 1;
            var6.field_gb = fieldTemp$0;
            be.field_j.a((byte) -105, var6);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6.field_mb = var4_ref_StringLifetime1;
          var6.field_hb = (String) (var3Lifetime1);
          var6.d(param0 ^ 10);
          var7 = (fi) (be.field_j.b((byte) 96));
          L7: while (true) {
            if (var7 != null) {
              stackIn_63_0 = var6;
              stackIn_63_1 = 200;
              stackIn_63_2 = var7;
              if (var8 != 0) {
                break L7;
              }
              if (gi.a(stackIn_63_0, stackIn_63_1, stackIn_63_2)) {
                var7 = (fi) (be.field_j.c((byte) -33));
                continue;
              }
            }
            if (null == var7) {
              be.field_j.a((byte) -125, var6);
              if (var8 == 0) {
                return;
              }
            }
            stackIn_63_0 = var7;
            stackIn_63_1 = 0;
            stackIn_63_2 = var6;
            break;
          }
          ah.a(stackIn_63_0, stackIn_63_1, stackIn_63_2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1_ref), "b.E(" + param0 + ')');
        }
    }

    final static void a(hd[] param0, byte param1, int param2) {
        hd var3 = null;
        int var4 = 0;
        int var5 = 0;
        hd[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = HoldTheLine.field_D;
        try {
          if (param1 <= 63) {
            b.a(true, 65, 85, (ei) null);
          }
          var3 = param0[param2];
          var4 = -1 + param2;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (0 > var4))) {
            stackIn_14_0 = (hd[]) (param0);
            stackIn_14_1 = var4;
            if (var5 == 0) {
              if (((hd) (Object) stackIn_14_0[stackIn_14_1]).a((byte) -101, var3) < 0) {
                param0[var4 + 1] = var3;
                return;
              }
              param0[1 + var4] = param0[var4];
              var4--;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_14_0 = (hd[]) (param0);
            stackIn_14_1 = 0;
          }
          stackIn_14_0[stackIn_14_1] = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("b.F(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, int param1, int param2, ei param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ei var6 = null;
        int var7 = 0;
        vj var8 = null;
        int var9 = 0;
        int stackIn_16_0 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = HoldTheLine.field_D;
        try {
          if (param0) {
            field_a = (String) null;
          }
          var4_int = 0;
          var5 = 0;
          L1: while (true) {
            if (param3.field_e > var5) {
              var6 = (ei) (param3.field_b[var5]);
              stackIn_16_0 = 0;
              if (var9 != 0) {
                break L1;
              }
              var7 = stackIn_16_0;
              while (var6.field_e > var7) {
                var8 = (vj) (var6.field_b[var7]);
                var4_int = var4_int + ah.a(var8, (byte) 78, param2, param1);
                var7++;
              }
              var5++;
              continue L1;
            }
            stackIn_16_0 = 1;
            break;
          }
          stackIn_20_0 = (stackIn_16_0 == var4_int % 2);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("b.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        ih var2 = null;
        hl var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          var2 = (ih) (io.field_c.b((byte) 121));
          do {
            if (null == var2) {
              if (!param0) {
                return;
              }
              break;
            }
            mk.a(1, param1, var2);
            var2 = (ih) (io.field_c.c((byte) -108));
          } while (var3 == 0);
          var2_ref = sg.field_v.b((byte) 127);
          while (var2_ref != null) {
            hh.a(param1, (byte) -23);
            var2_ref = sg.field_v.c((byte) -78);
            if (var3 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) runtimeException), "b.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_a = "Accelerate";
        field_e = "Mine";
    }
}
