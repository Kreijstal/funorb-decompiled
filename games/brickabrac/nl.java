/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static int field_c;
    static jp field_d;
    static mf field_a;
    static om field_f;
    static jp field_e;
    static jp field_b;

    public static void a() {
        field_a = null;
        field_d = null;
        field_f = null;
        field_e = null;
        field_b = null;
    }

    final static boolean a(int[] param0) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        pg var4_ref_pg = null;
        int var4 = 0;
        int var5_int = 0;
        pg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (q.field_i == rf.field_b) {
            L0: {
              var2_long = ue.a(false);
              if (0 == ue.field_d) {
                break L0;
              } else {
                if (ob.field_I >= 0) {
                  break L0;
                } else {
                  var4_ref_pg = (pg) (Object) al.field_m.d(-124);
                  if (var4_ref_pg == null) {
                    break L0;
                  } else {
                    if (~var2_long >= ~var4_ref_pg.field_j) {
                      break L0;
                    } else {
                      var4_ref_pg.b((byte) 111);
                      ga.field_j = var4_ref_pg.field_l.length;
                      jl.field_e.field_l = 0;
                      var5_int = 0;
                      L1: while (true) {
                        if (ga.field_j <= var5_int) {
                          r.field_z = we.field_a;
                          we.field_a = mh.field_gb;
                          mh.field_gb = si.field_a;
                          si.field_a = var4_ref_pg.field_r;
                          stackOut_11_0 = 1;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        } else {
                          jl.field_e.field_k[var5_int] = var4_ref_pg.field_l[var5_int];
                          var5_int++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            L2: while (true) {
              L3: {
                if (0 <= ob.field_I) {
                  break L3;
                } else {
                  jl.field_e.field_l = 0;
                  if (!vd.a(20, 1)) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0 != 0;
                  } else {
                    ob.field_I = jl.field_e.d(true);
                    jl.field_e.field_l = 0;
                    ga.field_j = param0[ob.field_I];
                    break L3;
                  }
                }
              }
              if (!um.b((byte) -104)) {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                return stackIn_23_0 != 0;
              } else {
                if (ue.field_d != 0) {
                  L4: {
                    var4 = ue.field_d;
                    if (0.0 == ej.field_J) {
                      break L4;
                    } else {
                      var4 = (int)((double)var4 + ji.field_e.nextGaussian() * ej.field_J);
                      if (0 <= var4) {
                        break L4;
                      } else {
                        var4 = 0;
                        break L4;
                      }
                    }
                  }
                  var5 = new pg(var2_long + (long)var4, ob.field_I, new byte[ga.field_j]);
                  var6 = 0;
                  L5: while (true) {
                    if (ga.field_j <= var6) {
                      al.field_m.a((nm) (Object) var5, (byte) 3);
                      ob.field_I = -1;
                      continue L2;
                    } else {
                      var5.field_l[var6] = jl.field_e.field_k[var6];
                      var6++;
                      continue L5;
                    }
                  }
                } else {
                  r.field_z = we.field_a;
                  we.field_a = mh.field_gb;
                  mh.field_gb = si.field_a;
                  si.field_a = ob.field_I;
                  ob.field_I = -1;
                  stackOut_25_0 = 1;
                  stackIn_26_0 = stackOut_25_0;
                  return stackIn_26_0 != 0;
                }
              }
            }
          } else {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var2;
            stackOut_34_1 = new StringBuilder().append("nl.A(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L6;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + 64 + ')');
        }
    }

    final static String a(boolean param0, boolean param1, int param2, long param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = BrickABrac.field_J ? 1 : 0;
          var6 = 44;
          var7 = 46;
          if (0 == param4) {
            var6 = 46;
            var7 = 44;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param4 != 2) {
            break L1;
          } else {
            var7 = 160;
            break L1;
          }
        }
        L2: {
          var8 = 0;
          if (param3 < 0L) {
            param3 = -param3;
            var8 = 1;
            break L2;
          } else {
            break L2;
          }
        }
        var9 = new StringBuilder(26);
        var10 = 0;
        L3: while (true) {
          var11 = (int)param3;
          param3 = param3 / 10L;
          StringBuilder discarded$3 = var9.append((char)(-(10 * (int)param3) + var11 + 48));
          if (param3 == 0L) {
            if (var8 != 0) {
              StringBuilder discarded$4 = var9.append('-');
              return var9.reverse().toString();
            } else {
              return var9.reverse().toString();
            }
          } else {
            var10++;
            if (var10 % 3 != 0) {
              continue L3;
            } else {
              StringBuilder discarded$5 = var9.append((char) var7);
              continue L3;
            }
          }
        }
    }

    static {
    }
}
