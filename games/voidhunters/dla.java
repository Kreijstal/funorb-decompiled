/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dla {
    private lta field_b;
    static llb field_e;
    static int field_d;
    private int field_a;
    static int field_c;
    private pe field_f;

    final static int a(int param0) {
        int var1 = -1;
        return cd.field_c;
    }

    private final void a(boolean param0, Random param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        sg var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ib.a(-99, 0, za.c((byte) -93), param1);
              if (param0) {
                break L1;
              } else {
                L2: {
                  if (var5_int == 2) {
                    break L2;
                  } else {
                    if (var5_int == 1) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var5_int = 2 + var5_int;
                break L1;
              }
            }
            var6 = t.a(var5_int, (byte) 94);
            var6.a(new aoa(), 4);
            var6.h(17704, param3);
            if (param2 <= -26) {
              var7 = -((dla) this).field_f.g((byte) -122) / 2 + hob.a(param1, ((dla) this).field_f.g((byte) -122), 119);
              var8 = -((dla) this).field_f.m(1) / 2 - -hob.a(param1, ((dla) this).field_f.m(1), 120);
              var6.a(var7, var8, (byte) -72);
              var6.a(hob.a(param1, 8192, 126), -85);
              ((dla) this).field_f.a(var6, (byte) 125);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("dla.B(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String c() {
        if (null == kca.field_a) {
            return "";
        }
        return kca.field_a;
    }

    final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nbb[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        nbb var10_ref_nbb = null;
        int var10 = 0;
        int var11 = 0;
        ml var11_ref_ml = null;
        int var12 = 0;
        String var12_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        nbb[] var17 = null;
        nbb var18 = null;
        L0: {
          var16 = VoidHunters.field_G;
          var3 = ((dla) this).field_b.a(true, ip.field_p.width) + -((dla) this).field_b.a(true, 0);
          var4 = ((dla) this).field_b.a(0, ip.field_p.height) + -((dla) this).field_b.a(0, 0);
          if (var3 != ((dla) this).field_f.g((byte) -122)) {
            ((dla) this).field_f.a(var3, (byte) 113);
            ((dla) this).field_f.e(var4, 0);
            break L0;
          } else {
            if (((dla) this).field_f.m(1) == var4) {
              break L0;
            } else {
              ((dla) this).field_f.a(var3, (byte) 113);
              ((dla) this).field_f.e(var4, 0);
              break L0;
            }
          }
        }
        L1: {
          ((dla) this).field_b.field_e = ip.field_p.height / 2;
          ((dla) this).field_b.field_d = ip.field_p.width / 2;
          ((dla) this).field_b.a(ip.field_p.height, 0, -72, ip.field_p.width, 0);
          int discarded$1 = -59;
          hna.a(((dla) this).field_f, ((dla) this).field_b, false);
          ((dla) this).field_f.a(((dla) this).field_b, (byte) 85, ((dla) this).field_a, (sg) null);
          var5 = ((dla) this).field_b.a(true, pk.field_o);
          var6 = ((dla) this).field_b.a(0, noa.field_q);
          if (!param0) {
            break L1;
          } else {
            L2: {
              if (pk.field_o != -1) {
                break L2;
              } else {
                if (noa.field_q == -1) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            var17 = ((dla) this).field_f.h((byte) -33);
            var7 = var17;
            var8 = -66 % ((param1 - -62) / 63);
            var9_int = 0;
            L3: while (true) {
              if (var9_int >= var17.length) {
                L4: {
                  var18 = ((dla) this).field_f.a(true, var6, var5, var5, var6);
                  if (var18 != null) {
                    var8 = var18.g(-71) << 2;
                    var9 = me.a(var18.field_k, (byte) 106);
                    var10 = var18.field_k.b(true);
                    var11 = -var5 + var10;
                    var12 = var18.field_k.a((byte) 104);
                    var13 = -var6 + var12;
                    var14 = ar.a(var11, (byte) 106, var13);
                    if (var14 <= var8) {
                      var15 = ((dla) this).field_b.a(var10, (byte) 116);
                      cka.a(1, var9, 16777215, ((dla) this).field_b.b(true, -10000 + var12), -(kga.a(-51, var9) >> 1) + var15, 4266);
                      c.a(((dla) this).field_b.b(true, var12), var15, -(kga.a(-100, var9) >> 2) + var15, ((dla) this).field_b.b(true, -10000 + var12), -16777216, 16777215);
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                return;
              } else {
                var10_ref_nbb = var17[var9_int];
                var18 = var10_ref_nbb;
                var18 = var10_ref_nbb;
                if (var10_ref_nbb != null) {
                  var11_ref_ml = var10_ref_nbb.field_k.a(var6, var5, true);
                  if (var11_ref_ml != null) {
                    var12_ref_String = me.a(var11_ref_ml, (byte) 72);
                    var13 = var11_ref_ml.b(true);
                    var14 = var11_ref_ml.a((byte) 111);
                    var15 = ((dla) this).field_b.a(var13, (byte) 115);
                    cka.a(1, var12_ref_String, 16777215, ((dla) this).field_b.b(true, -10000 + var14), -(kga.a(112, var12_ref_String) >> 1) + var15, 4266);
                    c.a(((dla) this).field_b.b(true, var14), var15, -(kga.a(-77, var12_ref_String) >> 2) + var15, ((dla) this).field_b.b(true, -10000 + var14), -16777216, 16777215);
                    return;
                  } else {
                    var9_int++;
                    continue L3;
                  }
                } else {
                  var9_int++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final void b(int param0) {
        lbb var3 = null;
        nwa var4 = null;
        sg[] var5 = null;
        nbb[] var5_array = null;
        int var6 = 0;
        int var7_int = 0;
        Object var7 = null;
        sg[] var8 = null;
        int var9 = 0;
        sg var10_ref_sg = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        sg[] var14 = null;
        nbb[] var15 = null;
        tfa[] var16 = null;
        Random var17 = null;
        Random var18 = null;
        int stackIn_15_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          L1: {
            var12 = VoidHunters.field_G;
            var13 = null;
            hra.a((lta) null, -8077);
            ka.a(((dla) this).field_a, -19266);
            var16 = new tfa[]{};
            var3 = new lbb();
            var4 = new nwa();
            ((dla) this).field_f.a(1799937864, true, var4, var16, var3, ((dla) this).field_a, var16);
            ((dla) this).field_a = ((dla) this).field_a + 1;
            if (((dla) this).field_f.f(0, param0 + -13766) == -1) {
              break L1;
            } else {
              if (-1 != ((dla) this).field_f.f(1, -13766)) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var5 = ((dla) this).field_f.d(1000);
          var6 = 0;
          var7_int = 1;
          var14 = var5;
          var8 = var14;
          var9 = 0;
          L2: while (true) {
            L3: {
              if (var14.length <= var9) {
                break L3;
              } else {
                var10_ref_sg = var14[var9];
                if (var10_ref_sg != null) {
                  if (var10_ref_sg.q((byte) 78) < unb.field_p) {
                    var6 = mjb.b(param0 ^ 21957, var10_ref_sg.q((byte) 102));
                    if (1 != var10_ref_sg.field_k.k(0)) {
                      if (var10_ref_sg.field_k.k(0) != 2) {
                        stackOut_13_0 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        var7_int = stackIn_15_0;
                        break L3;
                      } else {
                        var7_int = 0;
                        break L3;
                      }
                    } else {
                      var7_int = 0;
                      break L3;
                    }
                  } else {
                    var9++;
                    continue L2;
                  }
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
            var17 = new Random();
            this.a(var7_int != 0, var17, param0 + -121, var6);
            break L0;
          }
        }
        nbb[] dupTemp$1 = ((dla) this).field_f.h((byte) -33);
        var15 = dupTemp$1;
        var5_array = dupTemp$1;
        var6 = param0;
        var7_int = 0;
        L4: while (true) {
          if (var7_int >= var15.length) {
            L5: {
              if (var6 <= 100) {
                break L5;
              } else {
                var7 = null;
                var18 = new Random();
                var9 = hob.a(var18, var6, 118);
                var10 = 0;
                var11 = 0;
                L6: while (true) {
                  L7: {
                    if (var15.length <= var11) {
                      break L7;
                    } else {
                      if (var15[var11] != null) {
                        if (var10 != var9) {
                          var10++;
                          var11++;
                          continue L6;
                        } else {
                          var7 = (Object) (Object) var15[var11];
                          break L7;
                        }
                      } else {
                        var11++;
                        continue L6;
                      }
                    }
                  }
                  if (var7 == null) {
                    break L5;
                  } else {
                    ((dla) this).field_f.a(-118, 1, (anb) var7);
                    break L5;
                  }
                }
              }
            }
            return;
          } else {
            if (null != var15[var7_int]) {
              var6++;
              var7_int++;
              continue L4;
            } else {
              var7_int++;
              continue L4;
            }
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a() {
        field_e = null;
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          if (param1) {
            if (fmb.field_o[param3] >= fmb.field_o[param2]) {
              if (fmb.field_o[param3] <= fmb.field_o[param2]) {
                if (hga.field_o[param2] > hga.field_o[param3]) {
                  return true;
                } else {
                  if (hga.field_o[param3] > hga.field_o[param2]) {
                    return false;
                  } else {
                    break L0;
                  }
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (hga.field_o[param3] < hga.field_o[param2]) {
              return true;
            } else {
              if (hga.field_o[param2] >= hga.field_o[param3]) {
                if (fmb.field_o[param2] <= fmb.field_o[param3]) {
                  if (fmb.field_o[param3] <= fmb.field_o[param2]) {
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        }
        var4 = -73 / ((param0 - 73) / 52);
        var5 = fv.field_o[param3] + hma.field_d[param3] + emb.field_o[param3];
        var6 = emb.field_o[param2] - (-hma.field_d[param2] + -fv.field_o[param2]);
        if (var6 <= var5) {
          if (var5 > var6) {
            return false;
          } else {
            L1: {
              if (param2 <= param3) {
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L1;
              } else {
                stackOut_26_0 = 1;
                stackIn_28_0 = stackOut_26_0;
                break L1;
              }
            }
            return stackIn_28_0 != 0;
          }
        } else {
          return true;
        }
    }

    dla() {
        int var1 = 0;
        int var2 = 0;
        Random var3 = null;
        Exception var4_ref_Exception = null;
        int var4 = 0;
        int var5 = 0;
        sg var5_ref_sg = null;
        int var6 = 0;
        crb var9 = null;
        int[] var12 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          L1: {
            ((dla) this).field_f = new pe(0);
            ((dla) this).field_b = new lta();
            var1 = ((dla) this).field_b.a(true, ip.field_p.width) - ((dla) this).field_b.a(true, 0);
            var2 = ((dla) this).field_b.a(0, ip.field_p.height) + -((dla) this).field_b.a(0, 0);
            ((dla) this).field_f.a(var1, (byte) -93);
            ((dla) this).field_f.e(var2, 0);
            var3 = new Random();
            if (null == es.field_b) {
              break L1;
            } else {
              if (null == es.field_b.field_f) {
                break L1;
              } else {
                try {
                  L2: {
                    var12 = es.field_b.field_f.field_c;
                    var5_ref_sg = ae.a(var12, (byte) 45);
                    var5_ref_sg.h(17704, 3);
                    var5_ref_sg.a(new aoa(), 4);
                    var5_ref_sg.a(hob.a(var3, 8192, 122), -67);
                    ((dla) this).field_f.a(var5_ref_sg, (byte) 107);
                    break L2;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var4_ref_Exception = (Exception) (Object) decompiledCaughtException;
                    es.field_b.field_f = null;
                    eg.e((byte) -111);
                    gna.a((Throwable) (Object) var4_ref_Exception, "player_gamedata version " + es.field_b.field_d + " blueprint is corrupted", 0);
                    break L3;
                  }
                }
                break L0;
              }
            }
          }
          var4 = 0;
          L4: while (true) {
            if (var4 >= 2) {
              break L0;
            } else {
              var5 = var4 % 2;
              this.a(false, var3, -99, var5);
              var4++;
              continue L4;
            }
          }
        }
        var9 = new crb(new ml(49));
        var5 = -((dla) this).field_f.g((byte) -122) / 2 - -hob.a(var3, ((dla) this).field_f.g((byte) -122), 120);
        var6 = -((dla) this).field_f.m(1) / 2 + hob.a(var3, ((dla) this).field_f.m(1), 123);
        var9.a(var5, var6, (byte) 43);
        ((dla) this).field_f.a((byte) 126, var9);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 1024;
        field_d = 4;
    }
}
