/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends tc {
    lv field_m;
    static pf field_l;
    static int[][] field_o;
    static sr field_p;
    static ru field_n;
    static int field_k;

    final static int a(int param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 94) {
                break L1;
              } else {
                u.a((byte) -104);
                break L1;
              }
            }
            stackIn_4_0 = param0 + (so.field_b.field_g + -se.field_a >> -1852537983);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "u.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_56_0 = false;
        int stackIn_63_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_55_0;
        bv var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        hl var6 = null;
        hl var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var1 = mg.field_e;
            var2 = var1.k(0);
            if (-1 != (var2 ^ -1)) {
              if (-2 != (var2 ^ -1)) {
                if (-3 == (var2 ^ -1)) {
                  L1: {
                    if ((th.field_a ^ -1) != -2) {
                      break L1;
                    } else {
                      th.field_a = 2;
                      break L1;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((var2 ^ -1) == -4) {
                    L2: {
                      if (th.field_a != 2) {
                        break L2;
                      } else {
                        th.field_a = 1;
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L3: {
                      if (param0 == 1) {
                        break L3;
                      } else {
                        u.a((byte) -118);
                        break L3;
                      }
                    }
                    if (-5 != (var2 ^ -1)) {
                      af.a((Throwable) null, -66, "F1: " + cm.b(false));
                      dj.a((byte) -125);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      th.field_a = 1;
                      var3 = var1.g(1);
                      vl.field_p = ((String) (var3)).intern();
                      var4 = var1.k(0);
                      im.b(var4, param0 + -27499);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              } else {
                L4: {
                  if (nh.field_K != null) {
                    break L4;
                  } else {
                    nh.field_K = new tp(128);
                    dj.field_a = 0;
                    break L4;
                  }
                }
                L5: {
                  var3 = var1.g(1);
                  if (!((String) (var3)).equals("")) {
                    break L5;
                  } else {
                    var3 = null;
                    break L5;
                  }
                }
                L6: {
                  var4_ref_String = var1.g(1);
                  var5 = var1.g(1);
                  var6 = lg.a(var4_ref_String, (byte) -34);
                  if (null == var6) {
                    var6 = lg.a(var5, (byte) -34);
                    if (null != var6) {
                      nh.field_K.a(-1, (long)k.a((CharSequence) ((Object) var4_ref_String), false).hashCode(), var6);
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var6 == null) {
                    var6 = new hl();
                    nh.field_K.a(-1, (long)k.a((CharSequence) ((Object) var4_ref_String), false).hashCode(), var6);
                    fieldTemp$0 = dj.field_a;
                    dj.field_a = dj.field_a + 1;
                    var6.field_Ob = fieldTemp$0;
                    wh.field_c.a((byte) -119, (tc) (var6));
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var3 == null) {
                    break L8;
                  } else {
                    var3 = ((String) (var3)).intern();
                    break L8;
                  }
                }
                var6.field_Ib = (String) (var3);
                var6.field_Nb = var5;
                var6.field_Mb = var4_ref_String;
                var6.d(-124);
                var7 = (hl) ((Object) wh.field_c.e((byte) 111));
                L9: while (true) {
                  L10: {
                    L11: {
                      L12: {
                        L13: {
                          if (null == var7) {
                            break L13;
                          } else {
                            stackOut_55_0 = wd.a(false, var6, var7);
                            stackIn_63_0 = stackOut_55_0 ? 1 : 0;
                            stackIn_56_0 = stackOut_55_0;
                            if (var9 != 0) {
                              break L12;
                            } else {
                              if (!stackIn_56_0) {
                                break L13;
                              } else {
                                var7 = (hl) ((Object) wh.field_c.a((byte) 123));
                                if (var9 == 0) {
                                  continue L9;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                        }
                        if (null == var7) {
                          break L11;
                        } else {
                          stackIn_63_0 = -123;
                          break L12;
                        }
                      }
                      fj.a((byte) stackIn_63_0, var6, var7);
                      if (var9 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                    wh.field_c.a((byte) -119, (tc) (var6));
                    break L10;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              L14: {
                if (null == bk.field_a) {
                  bk.field_a = new tp(128);
                  vg.field_p = 0;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (1 != var1.k(0)) {
                  stackIn_12_0 = 0;
                  break L15;
                } else {
                  stackIn_12_0 = 1;
                  break L15;
                }
              }
              L16: {
                L17: {
                  var3_int = stackIn_12_0;
                  var4_ref_String = var1.g(1);
                  if (var3_int != 0) {
                    break L17;
                  } else {
                    var5 = var4_ref_String;
                    if (var9 == 0) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
                var5 = var1.g(1);
                break L16;
              }
              L18: {
                var6 = db.a(var4_ref_String, -124);
                var7_ref = var1.g(1);
                var8 = k.a((CharSequence) ((Object) var4_ref_String), false);
                if (null == var8) {
                  var8 = var4_ref_String;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (null == var6) {
                  var6 = db.a(var7_ref, param0 + -47);
                  if (null != var6) {
                    bk.field_a.a(-1, (long)var8.hashCode(), var6);
                    break L19;
                  } else {
                    break L19;
                  }
                } else {
                  break L19;
                }
              }
              L20: {
                if (null == var6) {
                  var6 = new hl();
                  bk.field_a.a(-1, (long)var8.hashCode(), var6);
                  fieldTemp$1 = vg.field_p;
                  vg.field_p = vg.field_p + 1;
                  var6.field_Ob = fieldTemp$1;
                  ot.field_E.a((byte) -119, (tc) (var6));
                  break L20;
                } else {
                  break L20;
                }
              }
              var6.field_Nb = var7_ref;
              var6.field_Pb = var5;
              var6.field_Mb = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1_ref), "u.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 < -102) {
                break L1;
              } else {
                u.a(62, (byte) -42);
                break L1;
              }
            }
            field_n = null;
            field_p = null;
            field_l = null;
            field_o = (int[][]) null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "u.A(" + param0 + ')');
        }
    }

    u(lv param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_m = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("u.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_l = new pf("");
        field_o = new int[][]{new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 120}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 120}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 120}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 180}, new int[]{0, 120}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}};
    }
}
