/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static int field_a;

    final static void a(int param0) {
        int var1 = (kh.field_Mb + -640) / 2;
        int var2 = ed.field_f * ed.field_f;
        int var3 = var2 - qa.field_t * qa.field_t;
        ia.field_j.a(199, -124 + (gf.field_k + -90), (byte) 49, 90, -(199 * var3 / var2) + var1);
        se.field_i.a(param0, gf.field_k - 124, (byte) 56, 0, var1 + (202 + var3 * 438 / var2));
    }

    final static String a(String param0, int param1, byte param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_17_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        sl var6 = null;
        CharSequence var7 = null;
        try {
          L0: {
            var7 = (CharSequence) ((Object) param0);
            if (gb.a((byte) -118, var7)) {
              if (po.field_b == 2) {
                if (!jp.a(param0, (byte) -105)) {
                  if (da.a(-30106, param0)) {
                    stackIn_12_0 = re.a(tr.field_pb, 4371, new String[]{param0});
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L1: {
                      if (-101 < (r.field_c ^ -1)) {
                        break L1;
                      } else {
                        if (es.field_m <= 0) {
                          stackIn_17_0 = hd.field_p;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                    L2: {
                      if (param2 <= -57) {
                        break L2;
                      } else {
                        var5 = (String) null;
                        nj.a((String) null, -114, (byte) -20);
                        break L2;
                      }
                    }
                    if (-201 < (r.field_c ^ -1)) {
                      if (ti.a(param0, true)) {
                        stackIn_26_0 = re.a(go.field_G, 4371, new String[]{param0});
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        var6 = js.field_f;
                        var6.h(param1, 255);
                        var6.field_j = var6.field_j + 1;
                        var4 = var6.field_j;
                        var6.c(0, (byte) -58);
                        var6.a(param0, (byte) 0);
                        var6.b(-var4 + var6.field_j, (byte) 118);
                        stackIn_28_0 = null;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      }
                    } else {
                      stackIn_22_0 = hd.field_p;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                } else {
                  stackIn_8_0 = wb.field_f;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = of.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = tm.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("nj.D(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L3;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      return (String) ((Object) stackIn_28_0);
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(float param0, int param1, String param2) {
        try {
            il.field_cb = param0;
            pc.field_r = param2;
            if (param1 != 2) {
                field_a = 17;
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "nj.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        int var1;
        var1 = -119 % ((param0 - -49) / 41);
        fa.field_X = null;
        if (ck.field_a != null) {
          cg.field_C = er.field_j;
          uq.field_j = ck.field_a;
          uq.field_j.field_jb = -1;
          er.field_j = null;
          uq.field_j.field_qb = -1;
          ck.field_a = null;
          sg.field_Ab = null;
          hd.field_m = null;
          mb.field_n = null;
          cb.field_l = null;
          sr.field_h = true;
          return;
        } else {
          sg.field_Ab = null;
          hd.field_m = null;
          mb.field_n = null;
          cb.field_l = null;
          sr.field_h = true;
          return;
        }
    }

    static {
    }
}
