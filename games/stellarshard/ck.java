/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ck extends wl implements oi {
    static boolean field_db;
    private boolean field_eb;
    static int field_hb;
    private boolean field_fb;
    private nc field_cb;
    private bd field_jb;
    static byte[][] field_ib;
    private boolean field_kb;
    private boolean field_gb;

    ck(ei param0, bd param1, String param2, boolean param3, boolean param4) {
        super(param0, (rj) (Object) new vf((ck) null, param1, param2), 77, 10, 10);
        try {
            ((ck) this).field_jb = param1;
            ((ck) this).field_kb = false;
            ((ck) this).field_fb = false;
            ((ck) this).field_gb = param4 ? true : false;
            ((ck) this).field_eb = param3 ? true : false;
            ((ck) this).field_cb = new nc(13, 50, 274, 30, 15, 2113632, 4210752);
            ((ck) this).field_cb.field_B = true;
            ((ck) this).b(4, (rj) (Object) ((ck) this).field_cb);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ck.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        RuntimeException var4 = null;
        vf var4_ref = null;
        int var5 = 0;
        vf var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        vf stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        vf stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        vf stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        String stackIn_12_3 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        vf stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        vf stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        String stackOut_11_3 = null;
        vf stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        String stackOut_10_3 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var5 = stellarshard.field_B;
        try {
          L0: {
            if (!((ck) this).field_kb) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (256 != param1) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              L2: {
                ((ck) this).field_fb = stackIn_6_1 != 0;
                ((ck) this).field_kb = true;
                ((ck) this).field_cb.c(65280, 4210752, 8405024);
                var6 = new vf((ck) this, ((ck) this).field_jb, param0);
                var4_ref = var6;
                if (5 != param1) {
                  if (param1 == 256) {
                    ig discarded$2 = var6.a((lf) this, qb.field_l, (byte) -69);
                    break L2;
                  } else {
                    L3: {
                      stackOut_9_0 = (vf) var6;
                      stackOut_9_1 = -31805;
                      stackOut_9_2 = -1;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      if (((ck) this).field_eb) {
                        stackOut_11_0 = (vf) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = stackIn_11_2;
                        stackOut_11_3 = qb.field_l;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        stackIn_12_3 = stackOut_11_3;
                        break L3;
                      } else {
                        stackOut_10_0 = (vf) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = stackIn_10_2;
                        stackOut_10_3 = bk.field_e;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        stackIn_12_3 = stackOut_10_3;
                        break L3;
                      }
                    }
                    ((vf) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2, stackIn_12_3);
                    break L2;
                  }
                } else {
                  var6.a(-31805, 11, gj.field_s);
                  var6.a(-31805, 17, wc.field_z);
                  break L2;
                }
              }
              if (param2 == 77) {
                L4: {
                  if (param1 == 3) {
                    var6.a(-31805, 7, gh.field_a);
                    break L4;
                  } else {
                    if (param1 == 4) {
                      var6.a(param2 ^ -31858, 8, ra.field_a);
                      break L4;
                    } else {
                      if (param1 != 6) {
                        if (param1 != 9) {
                          break L4;
                        } else {
                          ig discarded$3 = var6.a((lf) this, eg.field_c, (byte) 72);
                          break L4;
                        }
                      } else {
                        var6.a(param2 + -31882, 9, a.field_d);
                        break L4;
                      }
                    }
                  }
                }
                ((ck) this).b((rj) (Object) var6, param2 + 23066);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("ck.S(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 29657) {
                break L1;
              } else {
                int discarded$2 = ck.a(-53, 99, true, false);
                break L1;
              }
            }
            if (param1 != 13) {
              stackOut_5_0 = super.a(29657, param1, param2, param3);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              ((ck) this).o(3);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ck.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void m(int param0) {
        field_ib = null;
        if (param0 > -100) {
            fe discarded$0 = ck.n(-17);
        }
    }

    final static fe n(int param0) {
        try {
            Throwable var1 = null;
            fe stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            fe stackOut_2_0 = null;
            L0: {
              if (param0 == 2113632) {
                break L0;
              } else {
                field_db = true;
                break L0;
              }
            }
            try {
              L1: {
                stackOut_2_0 = (fe) Class.forName("hb").newInstance();
                stackIn_3_0 = stackOut_2_0;
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(byte param0) {
        vf var2 = null;
        ((ck) this).field_cb.c(65280, 4210752, 2121792);
        if (param0 != 52) {
          ck.m(-107);
          var2 = new vf((ck) this, ((ck) this).field_jb, kb.field_e);
          var2.a(-31805, 15, vg.field_q);
          ((ck) this).b((rj) (Object) var2, 23143);
          return;
        } else {
          var2 = new vf((ck) this, ((ck) this).field_jb, kb.field_e);
          var2.a(-31805, 15, vg.field_q);
          ((ck) this).b((rj) (Object) var2, 23143);
          return;
        }
    }

    public void a(int param0, int param1, ig param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (!param3) {
              break L0;
            } else {
              ((ck) this).field_eb = true;
              break L0;
            }
          }
          if (!((ck) this).field_fb) {
            gf.a(hf.a((byte) -6), "tochangedisplayname.ws", 16729);
            return;
          } else {
            rh.a(3, (byte) -72);
            ((ck) this).o(3);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("ck.M(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void o(int param0) {
        Object var3 = null;
        if (!((ck) this).field_G) {
          return;
        } else {
          ((ck) this).field_G = false;
          if (!((ck) this).field_eb) {
            if (((ck) this).field_gb) {
              sb.a(91);
              if (param0 != 3) {
                var3 = null;
                ((ck) this).a(-54, 36, (ig) null, false, -76);
                return;
              } else {
                return;
              }
            } else {
              if (param0 == 3) {
                return;
              } else {
                var3 = null;
                ((ck) this).a(-54, 36, (ig) null, false, -76);
                return;
              }
            }
          } else {
            tk.a(param0 ^ -16);
            if (param0 == 3) {
              return;
            } else {
              var3 = null;
              ((ck) this).a(-54, 36, (ig) null, false, -76);
              return;
            }
          }
        }
    }

    final static int a(int param0, int param1, boolean param2, boolean param3) {
        return td.a((byte) -103);
    }

    final static fd a(boolean param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        fd var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        fd stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_16_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = stellarshard.field_B;
        try {
          if (ac.field_k != null) {
            if (param1 != null) {
              if (0 != param1.length()) {
                var6 = (CharSequence) (Object) param1;
                var2 = nh.a(var6, false);
                if (var2 != null) {
                  var3 = (fd) (Object) ac.field_k.a((long)var2.hashCode(), -119);
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_rb;
                      var4 = nh.a(var7, false);
                      if (var4.equals((Object) (Object) var2)) {
                        stackOut_16_0 = (fd) var3;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        var3 = (fd) (Object) ac.field_k.a(true);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (fd) (Object) stackIn_7_0;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2_ref;
            stackOut_20_1 = new StringBuilder().append("ck.RA(").append(true).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L1;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = false;
        field_ib = new byte[1000][];
    }
}
