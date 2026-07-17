/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class nk extends hf implements vg {
    private uc field_Bb;
    static String field_Lb;
    private boolean field_Mb;
    static ae field_Jb;
    static g field_Ib;
    private boolean field_Db;
    private boolean field_Gb;
    static int field_Kb;
    static boolean field_Hb;
    private se field_Cb;
    static int[] field_Fb;
    private boolean field_Eb;

    final void a(int param0, String param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        kc var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kc stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        kc stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        kc stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        String stackIn_14_3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        kc stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        kc stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        String stackOut_13_3 = null;
        kc stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        String stackOut_12_3 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            if (!((nk) this).field_Eb) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param2 != 256) {
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
                ((nk) this).field_Db = stackIn_6_1 != 0;
                if (param0 == 26889) {
                  break L2;
                } else {
                  field_Fb = null;
                  break L2;
                }
              }
              L3: {
                ((nk) this).field_Eb = true;
                ((nk) this).field_Bb.b(4210752, (byte) 94, 8405024);
                var6 = new kc((nk) this, ((nk) this).field_Cb, param1);
                if (param2 != 5) {
                  if (param2 == 256) {
                    ck discarded$2 = var6.a(kn.field_a, (pg) this, (byte) -80);
                    break L3;
                  } else {
                    L4: {
                      stackOut_11_0 = (kc) var6;
                      stackOut_11_1 = -1;
                      stackOut_11_2 = 6824;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      if (!((nk) this).field_Mb) {
                        stackOut_13_0 = (kc) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = stackIn_13_2;
                        stackOut_13_3 = gk.field_O;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        stackIn_14_3 = stackOut_13_3;
                        break L4;
                      } else {
                        stackOut_12_0 = (kc) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = stackIn_12_2;
                        stackOut_12_3 = kn.field_a;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        stackIn_14_3 = stackOut_12_3;
                        break L4;
                      }
                    }
                    ((kc) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, stackIn_14_3);
                    break L3;
                  }
                } else {
                  var6.a(11, 6824, oh.field_b);
                  var6.a(17, param0 + -20065, db.field_u);
                  break L3;
                }
              }
              L5: {
                if (param2 != 3) {
                  if (4 == param2) {
                    var6.a(8, 6824, ho.field_f);
                    break L5;
                  } else {
                    if (param2 != 6) {
                      if (9 == param2) {
                        ck discarded$3 = var6.a(df.field_a, (pg) this, (byte) -97);
                        break L5;
                      } else {
                        ((nk) this).b(1, (lm) (Object) var6);
                        return;
                      }
                    } else {
                      var6.a(9, 6824, ip.field_i);
                      break L5;
                    }
                  }
                } else {
                  var6.a(7, 6824, mo.field_d);
                  break L5;
                }
              }
              ((nk) this).b(1, (lm) (Object) var6);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("nk.M(").append(param0).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param2 + 41);
        }
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_5_0 = 0;
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
            if (param2 == 13) {
              ((nk) this).j((byte) 115);
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param3 >= 55) {
                stackOut_7_0 = super.a(param0, param1, param2, (byte) 92);
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("nk.W(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_8_0;
    }

    final void j(byte param0) {
        Object var3 = null;
        if (!((nk) this).field_T) {
          return;
        } else {
          if (param0 >= 48) {
            ((nk) this).field_T = false;
            if (!((nk) this).field_Mb) {
              if (((nk) this).field_Gb) {
                np.d((byte) 95);
                return;
              } else {
                return;
              }
            } else {
              int discarded$6 = 0;
              gg.b();
              return;
            }
          } else {
            var3 = null;
            boolean discarded$7 = ((nk) this).a((lm) null, 'ﾷ', 86, (byte) -102);
            ((nk) this).field_T = false;
            if (!((nk) this).field_Mb) {
              if (!((nk) this).field_Gb) {
                return;
              } else {
                np.d((byte) 95);
                return;
              }
            } else {
              int discarded$8 = 0;
              gg.b();
              return;
            }
          }
        }
    }

    public static void n(int param0) {
        field_Jb = null;
        field_Ib = null;
        field_Fb = null;
        field_Lb = null;
        if (param0 != 2121792) {
            nk.n(57);
        }
    }

    nk(ji param0, se param1, String param2, boolean param3, boolean param4) {
        super(param0, (lm) (Object) new kc((nk) null, param1, param2), 77, 10, 10);
        try {
            ((nk) this).field_Mb = param3 ? true : false;
            ((nk) this).field_Cb = param1;
            ((nk) this).field_Eb = false;
            ((nk) this).field_Db = false;
            ((nk) this).field_Gb = param4 ? true : false;
            ((nk) this).field_Bb = new uc(13, 50, 274, 30, 15, 2113632, 4210752);
            ((nk) this).field_Bb.field_R = true;
            ((nk) this).b((byte) -63, (lm) (Object) ((nk) this).field_Bb);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "nk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    public void a(ck param0, byte param1, int param2, int param3, int param4) {
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
          if (param1 == 98) {
            if (((nk) this).field_Db) {
              sn.a(param1 ^ 60, 3);
              ((nk) this).j((byte) 123);
              return;
            } else {
              oe.a("tochangedisplayname.ws", m.c(true), (byte) 96);
              return;
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("nk.FA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L0;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L0;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void o(int param0) {
        ((nk) this).field_Bb.b(param0, (byte) 94, 2121792);
        kc var2 = new kc((nk) this, ((nk) this).field_Cb, gd.field_J);
        var2.a(15, 6824, me.field_c);
        ((nk) this).b(param0 + -4210751, (lm) (Object) var2);
    }

    final static void a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (mm.field_q != -1) {
                break L1;
              } else {
                if (vl.field_m == -1) {
                  mm.field_q = hj.field_S;
                  vl.field_m = eh.field_h;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                no.field_a = no.field_a + 1;
                if (param0 == null) {
                  if (vj.field_c == null) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (param0.equals((Object) (Object) vj.field_c)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!ti.field_f) {
                  if (no.field_a >= lp.field_z) {
                    if (no.field_a < ga.field_p + lp.field_z) {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L4;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_18_0 = stackOut_15_0;
                      break L4;
                    }
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_18_0 = stackOut_13_0;
                    break L4;
                  }
                } else {
                  stackOut_11_0 = 0;
                  stackIn_18_0 = stackOut_11_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_18_0;
                if (param0 == null) {
                  no.field_a = 0;
                  break L5;
                } else {
                  if (ti.field_f) {
                    no.field_a = lp.field_z;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      no.field_a = 0;
                      break L5;
                    } else {
                      no.field_a = lp.field_z;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                wa.field_c = mm.field_q;
                if (param0 == null) {
                  if (var2_int != 0) {
                    ti.field_f = true;
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  ti.field_f = false;
                  break L6;
                }
              }
              fl.field_l = vl.field_m;
              break L2;
            }
            L7: {
              if (ti.field_f) {
                break L7;
              } else {
                if (no.field_a >= lp.field_z) {
                  break L7;
                } else {
                  if (cp.field_U) {
                    fl.field_l = vl.field_m;
                    no.field_a = 0;
                    wa.field_c = mm.field_q;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L8: {
              vj.field_c = param0;
              if (!ti.field_f) {
                break L8;
              } else {
                if (fg.field_i != no.field_a) {
                  break L8;
                } else {
                  no.field_a = 0;
                  ti.field_f = false;
                  break L8;
                }
              }
            }
            vl.field_m = -1;
            var2_int = 0;
            mm.field_q = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var2;
            stackOut_42_1 = new StringBuilder().append("nk.O(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L9;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L9;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 44 + 23 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = "Exit without saving";
        field_Hb = false;
        field_Fb = new int[]{18, 10, 19, 24, 25, 26, 27};
        field_Jb = new ae(field_Fb.length);
    }
}
