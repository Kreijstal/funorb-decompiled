/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo extends vh {
    private vh field_Nb;
    static vh field_Lb;
    vh field_Pb;
    static int field_Qb;
    static String field_Ob;
    static vh[] field_Mb;

    final int a(int param0, int param1, int param2) {
        if (param0 != 0) {
            return -21;
        }
        int var4 = -param1;
        int var5 = -param1;
        if (null != ((uo) this).field_Nb) {
            var4 = ((uo) this).field_Nb.b(true);
        }
        if (((uo) this).field_Pb != null) {
            var5 = ((uo) this).field_Pb.b(true);
        }
        return var5 + (param2 - -var4) + param1 - -param2;
    }

    uo(long param0, vh param1, vh param2, vh param3, dd param4, String param5) {
        super(param0, param1);
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                ((uo) this).field_Nb = new vh(0L, param2);
                ((uo) this).field_Nb.field_hb = param4;
                ((uo) this).a(-99, ((uo) this).field_Nb);
                break L1;
              }
            }
            L2: {
              if (param5 != null) {
                ((uo) this).field_Pb = new vh(0L, param3, param5);
                ((uo) this).a(92, ((uo) this).field_Pb);
                ((uo) this).d((byte) -125);
                break L2;
              } else {
                ((uo) this).d((byte) -125);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var8;
            stackOut_7_1 = new StringBuilder().append("uo.<init>(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param5 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    final static void f(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        oq var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        tq var11 = null;
        i var12 = null;
        oq var13 = null;
        tq var14 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Pool.field_O;
        try {
          L0: {
            L1: {
              var13 = kn.field_e;
              var2 = var13.g(-94);
              if (param0 < -102) {
                break L1;
              } else {
                uo.f(44);
                break L1;
              }
            }
            L2: {
              if (0 != var2) {
                if (var2 == 1) {
                  var12 = (i) (Object) ue.field_b.c((byte) -19);
                  if (var12 != null) {
                    var12.a((byte) -117);
                    break L2;
                  } else {
                    dn.c(-69);
                    return;
                  }
                } else {
                  if (2 == var2) {
                    var14 = (tq) (Object) hb.field_j.c((byte) -112);
                    if (var14 == null) {
                      dn.c(-81);
                      return;
                    } else {
                      var14.field_l = ek.a(117);
                      var14.field_s = true;
                      var14.a((byte) -117);
                      break L2;
                    }
                  } else {
                    tc.a((Throwable) null, "A1: " + t.a(99), -8555);
                    dn.c(84);
                    break L2;
                  }
                }
              } else {
                var10 = ek.a(121);
                var3 = var10;
                var9 = var10;
                var4 = var9;
                var5 = var13;
                var6 = ((ge) (Object) var5).g(-101);
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var6) {
                    var11 = (tq) (Object) hb.field_j.c((byte) 77);
                    if (var11 == null) {
                      dn.c(-107);
                      return;
                    } else {
                      var11.field_l = var3;
                      var11.field_s = true;
                      var11.a((byte) -117);
                      break L2;
                    }
                  } else {
                    var9[var7] = ((ge) (Object) var5).b(true);
                    var7++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "uo.F(" + param0 + ')');
        }
    }

    public static void f(byte param0) {
        field_Ob = null;
        if (param0 != -102) {
            uo.c(true);
        }
        field_Mb = null;
        field_Lb = null;
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        ((uo) this).b(param6, 2147483647, param0, param5, param3);
        this.a(param4, (byte) -97, param2);
        if (!param1) {
            this.a(-47, (byte) 126, 26);
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var4 = -param0;
          if (((uo) this).field_Nb == null) {
            break L0;
          } else {
            var4 = ((uo) this).field_Nb.b(true);
            break L0;
          }
        }
        L1: {
          var5 = -param0;
          if (((uo) this).field_Pb != null) {
            var5 = ((uo) this).field_Pb.a(-100, -param2 + (-param0 + ((uo) this).field_gb + (-param2 + -var4)));
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var6 = param2 + (param0 + var4 + (param2 - -var5));
          if (var6 <= ((uo) this).field_gb) {
            break L2;
          } else {
            var5 = var5 + (((uo) this).field_gb + -var6);
            var6 = ((uo) this).field_gb;
            break L2;
          }
        }
        L3: {
          if (((uo) this).field_Fb != 1) {
            break L3;
          } else {
            param2 = param2 + (-var6 + ((uo) this).field_gb) / 2;
            break L3;
          }
        }
        L4: {
          if (2 != ((uo) this).field_Fb) {
            break L4;
          } else {
            param2 = param2 + (-var6 + ((uo) this).field_gb);
            break L4;
          }
        }
        L5: {
          if (((uo) this).field_Nb == null) {
            break L5;
          } else {
            ((uo) this).field_Nb.b(0, 2147483647, param2, var4, ((uo) this).field_Db);
            ((uo) this).field_Nb.field_cb = ((uo) this).field_cb;
            break L5;
          }
        }
        L6: {
          if (((uo) this).field_Pb != null) {
            L7: {
              ((uo) this).field_Pb.b(0, 2147483647, param0 + param2 + var4, var5, ((uo) this).field_Db);
              if (((uo) this).field_Nb != null) {
                ((uo) this).field_Pb.field_Fb = 0;
                break L7;
              } else {
                ((uo) this).field_Pb.field_Fb = ((uo) this).field_Fb;
                break L7;
              }
            }
            ((uo) this).field_Pb.field_cb = ((uo) this).field_cb;
            break L6;
          } else {
            break L6;
          }
        }
        L8: {
          if (param1 <= -78) {
            break L8;
          } else {
            ((uo) this).field_Pb = null;
            break L8;
          }
        }
    }

    final static void c(boolean param0) {
        aa var1 = null;
        RuntimeException var1_ref = null;
        lk var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!ne.field_r.c(0)) {
              L1: {
                var1 = new aa(ne.field_r);
                var2 = (lk) (Object) var1.b((byte) -92);
                if (var2.field_v) {
                  var2.field_q = 16;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: while (true) {
                if (var2 == null) {
                  L3: {
                    if (!param0) {
                      break L3;
                    } else {
                      uo.f((byte) 125);
                      break L3;
                    }
                  }
                  break L0;
                } else {
                  L4: {
                    if (!var2.field_v) {
                      break L4;
                    } else {
                      if (var2.field_p >= 230) {
                        var2.a((byte) -117);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2 = (lk) (Object) var1.b(-117);
                  continue L2;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1_ref, "uo.C(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ob = "<%0>: Ball-in-hand!";
        field_Qb = -1;
    }
}
