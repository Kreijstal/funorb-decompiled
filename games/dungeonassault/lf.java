/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends kl {
    private String field_r;
    static cn field_x;
    static u[] field_y;
    private pp field_o;
    static String field_v;
    private pp field_s;
    static String field_p;
    static wh field_w;
    boolean field_u;
    static cn field_n;
    private String field_t;
    static String field_m;
    static String field_q;

    final void a(boolean param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        try {
          L0: {
            L1: {
              super.a(param0);
              if (hh.field_s == null) {
                break L1;
              } else {
                L2: {
                  stackOut_1_0 = this;
                  stackIn_6_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if ((Object) (Object) hh.field_s != (Object) (Object) ((lf) this).field_o) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L2;
                  } else {
                    stackOut_2_0 = this;
                    stackIn_4_0 = stackOut_2_0;
                    stackOut_4_0 = this;
                    stackOut_4_1 = 1;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_7_1 = stackOut_4_1;
                    break L2;
                  }
                }
                ((lf) this).field_u = stackIn_7_1 != 0;
                ((lf) this).field_d = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "lf.A(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        try {
            field_w = null;
            int var1_int = 36 / ((-82 - param0) / 35);
            field_v = null;
            field_p = null;
            field_q = null;
            field_y = null;
            field_m = null;
            field_n = null;
            field_x = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "lf.C(" + param0 + ')');
        }
    }

    lf(String param0, String param1) {
        this(param0, param1, 300);
    }

    final void b(int param0) {
        int var3 = 0;
        int var4 = 0;
        try {
            int var2_int = -31 / ((param0 - 41) / 63);
            super.b(-91);
            var3 = ((lf) this).field_k - -(((lf) this).field_a >> 1);
            var4 = ((lf) this).field_j + 10;
            ne.field_c.c(((lf) this).field_t, var3, ne.field_c.field_H + var4, 16777215, -1);
            var4 = var4 + ne.field_c.field_H;
            int discarded$0 = la.field_b.a(((lf) this).field_r, 20 + ((lf) this).field_k, var4, ((lf) this).field_a - 40, -(jm.field_i.field_v * 2) + (-24 + -var4) + (((lf) this).field_i + ((lf) this).field_j), 16777215, -1, 1, 1, la.field_b.field_H);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "lf.F(" + param0 + ')');
        }
    }

    private lf(String param0, String param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            ((lf) this).field_t = param0;
            ((lf) this).field_r = param1;
            var4_int = 88 - (-(2 * jm.field_i.field_v) + -(oj.a(((lf) this).field_r, -1, new int[1], (se) (Object) la.field_b) * la.field_b.field_H));
            ((lf) this).a(param2, 0, var4_int);
            ((lf) this).field_d = false;
            ((lf) this).field_o = tn.a(((lf) this).field_k + (-jm.field_i.field_y + ((lf) this).field_a >> 1), ((lf) this).field_i + (((lf) this).field_j - 24 + -(jm.field_i.field_v * 2)), (se) (Object) ne.field_c, jm.field_i, -81, mp.field_e);
            ((lf) this).field_s = tn.a(((lf) this).field_k - -(-jm.field_i.field_y + ((lf) this).field_a >> 1), -16 + ((lf) this).field_j - (-((lf) this).field_i + jm.field_i.field_v), (se) (Object) ne.field_c, jm.field_i, -111, um.field_d);
            ((lf) this).field_f.a((ne) (Object) ((lf) this).field_o, false);
            ((lf) this).field_f.a((ne) (Object) ((lf) this).field_s, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var4;
            stackOut_3_1 = new StringBuilder().append("lf.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final static void d(byte param0) {
        RuntimeException var1 = null;
        wj var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        bo var5 = null;
        String var5_ref = null;
        String var6 = null;
        bo var6_ref = null;
        String var7 = null;
        bo var7_ref = null;
        int var8 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_57_0 = false;
        int stackIn_67_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_56_0 = false;
        int stackOut_65_0 = 0;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            var1_ref = ra.field_c;
            var2 = var1_ref.c(true);
            if (var2 == 0) {
              L1: {
                if (null != lh.field_p) {
                  break L1;
                } else {
                  lh.field_p = new tb(128);
                  kp.field_e = 0;
                  break L1;
                }
              }
              L2: {
                if (var1_ref.c(true) != 1) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var3_int = stackIn_11_0;
                var4_ref_String = var1_ref.d(-119);
                if (var3_int != 0) {
                  String discarded$3 = var1_ref.d(-103);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var5 = vj.a(var4_ref_String, 49);
                var6 = var1_ref.d(-99);
                var7 = jm.a((byte) 59, (CharSequence) (Object) var4_ref_String);
                if (var7 == null) {
                  var7 = var4_ref_String;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var5 == null) {
                  var5 = vj.a(var6, 116);
                  if (var5 != null) {
                    lh.field_p.a((ll) (Object) var5, (long)var7.hashCode(), -106);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (var5 == null) {
                  var5 = new bo();
                  lh.field_p.a((ll) (Object) var5, (long)var7.hashCode(), param0 ^ -59);
                  int fieldTemp$4 = kp.field_e;
                  kp.field_e = kp.field_e + 1;
                  var5.field_Ib = fieldTemp$4;
                  fm.field_b.a((ne) (Object) var5, false);
                  break L6;
                } else {
                  break L6;
                }
              }
              var5.field_Hb = var4_ref_String;
              return;
            } else {
              if (var2 == 1) {
                L7: {
                  if (fk.field_v == null) {
                    fk.field_v = new tb(128);
                    o.field_m = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var3 = var1_ref.d(-127);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  var4_ref_String = var1_ref.d(param0 + -230);
                  var5_ref = var1_ref.d(-117);
                  var6_ref = ll.a(var4_ref_String, (byte) -47);
                  if (null != var6_ref) {
                    break L9;
                  } else {
                    var6_ref = ll.a(var5_ref, (byte) -47);
                    if (null != var6_ref) {
                      fk.field_v.a((ll) (Object) var6_ref, (long)jm.a((byte) 59, (CharSequence) (Object) var4_ref_String).hashCode(), -86);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (null != var6_ref) {
                    break L10;
                  } else {
                    var6_ref = new bo();
                    fk.field_v.a((ll) (Object) var6_ref, (long)jm.a((byte) 59, (CharSequence) (Object) var4_ref_String).hashCode(), param0 ^ -69);
                    int fieldTemp$5 = o.field_m;
                    o.field_m = o.field_m + 1;
                    var6_ref.field_Ib = fieldTemp$5;
                    jm.field_f.a((ne) (Object) var6_ref, false);
                    break L10;
                  }
                }
                L11: {
                  if (var3 != null) {
                    var3 = var3.intern();
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var6_ref.field_Nb = var3;
                var6_ref.field_Hb = var4_ref_String;
                var6_ref.a(false);
                var7_ref = (bo) (Object) jm.field_f.e(-24172);
                L12: while (true) {
                  L13: {
                    L14: {
                      L15: {
                        if (var7_ref == null) {
                          break L15;
                        } else {
                          stackOut_56_0 = eg.a(var6_ref, param0 + 77, var7_ref);
                          stackIn_67_0 = stackOut_56_0 ? 1 : 0;
                          stackIn_57_0 = stackOut_56_0;
                          if (var8 != 0) {
                            break L14;
                          } else {
                            if (!stackIn_57_0) {
                              break L15;
                            } else {
                              var7_ref = (bo) (Object) jm.field_f.a(param0 + -119);
                              if (var8 == 0) {
                                continue L12;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                      L16: {
                        if (var7_ref != null) {
                          break L16;
                        } else {
                          jm.field_f.a((ne) (Object) var6_ref, false);
                          if (var8 == 0) {
                            break L13;
                          } else {
                            break L16;
                          }
                        }
                      }
                      stackOut_65_0 = 55;
                      stackIn_67_0 = stackOut_65_0;
                      break L14;
                    }
                    so.a((byte) stackIn_67_0, (ne) (Object) var7_ref, (ne) (Object) var6_ref);
                    break L13;
                  }
                  return;
                }
              } else {
                L17: {
                  if (param0 == 123) {
                    break L17;
                  } else {
                    lf.d((byte) 37);
                    break L17;
                  }
                }
                if (var2 != 2) {
                  if (var2 != 3) {
                    if (4 == var2) {
                      ke.field_d = 1;
                      var3 = var1_ref.d(param0 + -247);
                      gm.field_b = var3.intern();
                      var4 = var1_ref.c(true);
                      r.a((byte) -112, var4);
                      return;
                    } else {
                      sm.a((Throwable) null, 1, "F1: " + sj.l(param0 + 69));
                      tl.a(param0 ^ -61);
                      break L0;
                    }
                  } else {
                    L18: {
                      if (ke.field_d != 2) {
                        break L18;
                      } else {
                        ke.field_d = 1;
                        break L18;
                      }
                    }
                    return;
                  }
                } else {
                  L19: {
                    if (ke.field_d == 1) {
                      ke.field_d = 2;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "lf.D(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Ogre Thug";
        field_p = "Berserker";
        field_q = "Please send me news and updates (I can unsubscribe at any time)";
        field_m = "This guardian is lethal.";
    }
}
