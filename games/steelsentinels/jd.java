/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends ac implements ae {
    static String[] field_nb;
    private oa field_ob;
    static pm field_kb;
    static rf field_sb;
    static java.lang.reflect.Method field_rb;
    static String field_jb;
    static gk[] field_qb;
    static java.math.BigInteger field_ib;
    static String field_pb;
    static int[] field_lb;
    static String[] field_mb;

    final static void m(int param0) {
        qf.field_e = new ol(an.field_a, od.field_g, hg.field_e, bd.field_f, ol.field_Tb, qb.field_K);
        if (param0 != -6) {
            jd.a('{', -67);
        }
    }

    private final void c(boolean param0) {
        if (!param0) {
            field_lb = (int[]) null;
            if (!(this.field_Q)) {
                return;
            }
            this.field_Q = false;
            return;
        }
        if (!(this.field_Q)) {
            return;
        }
        this.field_Q = false;
    }

    jd(ka param0, hm param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        lh var4 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param1 == ra.field_a) {
                var3 = r.field_p;
                break L1;
              } else {
                if (wh.field_b == param1) {
                  var3 = ff.field_gb;
                  this.field_E = this.field_E + 10;
                  if (!ph.b(12412)) {
                    break L1;
                  } else {
                    this.field_E = this.field_E + 20;
                    var3 = tm.field_a;
                    break L1;
                  }
                } else {
                  if (im.field_a != param1) {
                    break L1;
                  } else {
                    this.field_E = this.field_E + 30;
                    var3 = sl.field_q;
                    break L1;
                  }
                }
              }
            }
            var4 = new lh((String) (var3), (tn) null);
            var4.field_o = 0;
            var4.field_z = 50;
            var4.field_E = 80;
            var4.field_x = this.field_x;
            var4.field_p = (qk) ((Object) new cn(rc.field_m, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a(var4, -107);
            this.field_ob = this.a((tn) (this), jf.field_cb, 104);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("jd.<init>(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    private final oa a(tn param0, String param1, int param2) {
        oa var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        oa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new oa(param1, param0);
              var4.field_p = (qk) ((Object) new kh());
              var5 = this.field_E + -6;
              this.field_E = this.field_E + 38;
              var4.a(15, (byte) -127, var5, -14 + (this.field_x + -16), 30);
              this.a(var4, -113);
              if (param2 >= 86) {
                break L1;
              } else {
                this.c(true);
                break L1;
              }
            }
            this.e((byte) 82);
            stackIn_3_0 = (oa) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("jd.M(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6_int = -73 / ((param1 - -85) / 36);
            if (param3 == this.field_ob) {
              this.c(true);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("jd.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param4 + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_9_0 = 0;
        if (param1 == -33) {
          if (param0 != 160) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_9_0 = 1;
                return stackIn_9_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_32_0 = null;
        String stackIn_37_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            if (param0 == null) {
              stackIn_4_0 = lk.field_Y;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param0.length();
                if ((var3_int ^ -1) > -2) {
                  break L1;
                } else {
                  if (-13 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      var4 = ui.a(1, param0);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
                          L3: {
                            if (jd.a(var4.charAt(0), -33)) {
                              break L3;
                            } else {
                              if (jd.a(var4.charAt(var4.length() + -1), -33)) {
                                break L3;
                              } else {
                                var5 = 0;
                                if (param2 >= 81) {
                                  var6 = 0;
                                  L4: while (true) {
                                    if (param0.length() <= var6) {
                                      if (0 < var5) {
                                        stackIn_37_0 = ad.field_g;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param0.charAt(var6);
                                        if (!jd.a((char) var7, -33)) {
                                          var5 = 0;
                                          break L5;
                                        } else {
                                          var5++;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (-3 < (var5 ^ -1)) {
                                          break L6;
                                        } else {
                                          if (!param1) {
                                            stackIn_32_0 = jb.field_Q;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  stackIn_22_0 = (String) null;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                          }
                          stackIn_19_0 = ad.field_g;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_14_0 = lk.field_Y;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_9_0 = lk.field_Y;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var3);

            stackIn_41_1 = new StringBuilder().append("jd.Q(");

            if (param0 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L7;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L7;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0;
                  } else {
                    return stackIn_37_0;
                  }
                }
              }
            }
          }
        }
    }

    public static void l(int param0) {
        field_pb = null;
        field_kb = null;
        field_sb = null;
        field_lb = null;
        field_qb = null;
        field_ib = null;
        field_rb = null;
        field_jb = null;
        field_mb = null;
        field_nb = null;
        if (param0 != 0) {
            CharSequence var2 = (CharSequence) null;
            jd.a((CharSequence) null, true, -55);
        }
    }

    static {
        field_nb = new String[]{"Fusion<nbsp>reaver", "EMP<nbsp>laceration", "Hammer<nbsp>strike"};
        field_sb = new rf();
        field_pb = "Options";
        field_lb = new int[8192];
        field_jb = "Save favourite";
        field_ib = new java.math.BigInteger("65537");
        field_mb = new String[]{"DESTINY!", "ROSEBUD!", "NOT YET!", "IS THIS ALL THERE IS?", "I THIRST!", "WHY?", "IT IS ALL TRUE!"};
    }
}
