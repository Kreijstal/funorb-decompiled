/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static String field_g;
    static int[][] field_e;
    static lg[][] field_a;
    static String field_b;
    String field_i;
    boolean field_m;
    static int field_k;
    static String field_h;
    static int field_c;
    static boolean[] field_j;
    String field_l;
    static String field_f;
    static String field_d;

    final static void b(int param0) {
        if (param0 != 2147483647) {
          vl.a((byte) 56);
        }
    }

    final static u a(int param0, String param1, r param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        u stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a((byte) 123, param1);
          if (param0 != 0) {
            field_b = (String) null;
          }
          var5 = param2.a(var4_int, param3, 126);
          stackIn_3_0 = wh.a(param2, 4080, var5, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("vl.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (aj.field_f == null ||
          !(param1 <= aj.field_f.length)) {
          aj.field_f = new int[param1 * 2];
        }
        if (param2 != -26418) {
          field_h = (String) null;
        }
        if (on.field_e == null) {
          on.field_e = new int[param1 * 2];
          if (li.field_g == null ||
            !(param1 <= li.field_g.length)) {
            li.field_g = new int[2 * param1];
          }
          if (null != ub.field_p &&
            param1 <= ub.field_p.length) {
            if (null == jf.field_N) {
              jf.field_N = new int[param1 * 2];
              if (null == hm.field_A ||
                !(hm.field_A.length >= param1)) {
                hm.field_A = new int[param1 * 2];
              }
              if (null == ac.field_I ||
                !(param1 + param0 <= ac.field_I.length)) {
                ac.field_I = new int[2 * (param0 + param1)];
              }
              if (null == sl.field_m ||
                !(param1 <= sl.field_m.length)) {
                sl.field_m = new boolean[2 * param1];
              }
            } else {
              if (jf.field_N.length < param1) {
                jf.field_N = new int[param1 * 2];
                if (null == hm.field_A ||
                  !(hm.field_A.length >= param1)) {
                  hm.field_A = new int[param1 * 2];
                }
                if (null == ac.field_I ||
                  !(param1 + param0 <= ac.field_I.length)) {
                  ac.field_I = new int[2 * (param0 + param1)];
                }
                if (null == sl.field_m ||
                  !(param1 <= sl.field_m.length)) {
                  sl.field_m = new boolean[2 * param1];
                }
              } else {
                if (null == hm.field_A) {
                  hm.field_A = new int[param1 * 2];
                  if (null == ac.field_I ||
                    !(param1 + param0 <= ac.field_I.length)) {
                    ac.field_I = new int[2 * (param0 + param1)];
                  }
                  if (null == sl.field_m ||
                    !(param1 <= sl.field_m.length)) {
                    sl.field_m = new boolean[2 * param1];
                  }
                } else {
                  if (hm.field_A.length < param1) {
                    hm.field_A = new int[param1 * 2];
                    if (null == ac.field_I ||
                      !(param1 + param0 <= ac.field_I.length)) {
                      ac.field_I = new int[2 * (param0 + param1)];
                    }
                    if (null == sl.field_m ||
                      !(param1 <= sl.field_m.length)) {
                      sl.field_m = new boolean[2 * param1];
                    }
                  } else {
                    if (null == ac.field_I ||
                      !(param1 + param0 <= ac.field_I.length)) {
                      ac.field_I = new int[2 * (param0 + param1)];
                    }
                    if (null == sl.field_m) {
                      sl.field_m = new boolean[2 * param1];
                    } else {
                      if (param1 > sl.field_m.length) {
                        sl.field_m = new boolean[2 * param1];
                      }
                    }
                  }
                }
              }
            }
            id.field_d = -2147483648;
            ug.field_b = -2147483648;
            cq.field_i = 0;
            q.field_x = 2147483647;
            f.field_y = 2147483647;
            return;
          }
          ub.field_p = new int[2 * param1];
          if (null == jf.field_N ||
            !(jf.field_N.length >= param1)) {
            jf.field_N = new int[param1 * 2];
          }
          if (null == hm.field_A ||
            !(hm.field_A.length >= param1)) {
            hm.field_A = new int[param1 * 2];
          }
          if (null == ac.field_I ||
            !(param1 + param0 <= ac.field_I.length)) {
            ac.field_I = new int[2 * (param0 + param1)];
          }
          if (null == sl.field_m ||
            !(param1 <= sl.field_m.length)) {
            sl.field_m = new boolean[2 * param1];
          }
        } else {
          if (param1 <= on.field_e.length) {
            if (li.field_g == null ||
              !(param1 <= li.field_g.length)) {
              li.field_g = new int[2 * param1];
            }
            if (null != ub.field_p &&
              param1 <= ub.field_p.length) {
              if (null == jf.field_N) {
                jf.field_N = new int[param1 * 2];
                if (null == hm.field_A ||
                  !(hm.field_A.length >= param1)) {
                  hm.field_A = new int[param1 * 2];
                }
                if (null == ac.field_I ||
                  !(param1 + param0 <= ac.field_I.length)) {
                  ac.field_I = new int[2 * (param0 + param1)];
                }
                if (null == sl.field_m ||
                  !(param1 <= sl.field_m.length)) {
                  sl.field_m = new boolean[2 * param1];
                }
              } else {
                if (jf.field_N.length < param1) {
                  jf.field_N = new int[param1 * 2];
                  if (null == hm.field_A ||
                    !(hm.field_A.length >= param1)) {
                    hm.field_A = new int[param1 * 2];
                  }
                  if (null == ac.field_I ||
                    !(param1 + param0 <= ac.field_I.length)) {
                    ac.field_I = new int[2 * (param0 + param1)];
                  }
                  if (null == sl.field_m ||
                    !(param1 <= sl.field_m.length)) {
                    sl.field_m = new boolean[2 * param1];
                  }
                } else {
                  if (null == hm.field_A) {
                    hm.field_A = new int[param1 * 2];
                    if (null == ac.field_I ||
                      !(param1 + param0 <= ac.field_I.length)) {
                      ac.field_I = new int[2 * (param0 + param1)];
                    }
                    if (null == sl.field_m ||
                      !(param1 <= sl.field_m.length)) {
                      sl.field_m = new boolean[2 * param1];
                    }
                  } else {
                    if (hm.field_A.length < param1) {
                      hm.field_A = new int[param1 * 2];
                      if (null == ac.field_I ||
                        !(param1 + param0 <= ac.field_I.length)) {
                        ac.field_I = new int[2 * (param0 + param1)];
                      }
                      if (null == sl.field_m ||
                        !(param1 <= sl.field_m.length)) {
                        sl.field_m = new boolean[2 * param1];
                      }
                    } else {
                      if (null == ac.field_I ||
                        !(param1 + param0 <= ac.field_I.length)) {
                        ac.field_I = new int[2 * (param0 + param1)];
                      }
                      if (null == sl.field_m) {
                        sl.field_m = new boolean[2 * param1];
                      } else {
                        if (param1 > sl.field_m.length) {
                          sl.field_m = new boolean[2 * param1];
                        }
                      }
                    }
                  }
                }
              }
              id.field_d = -2147483648;
              ug.field_b = -2147483648;
              cq.field_i = 0;
              q.field_x = 2147483647;
              f.field_y = 2147483647;
              return;
            }
            ub.field_p = new int[2 * param1];
            if (null == jf.field_N ||
              !(jf.field_N.length >= param1)) {
              jf.field_N = new int[param1 * 2];
            }
            if (null == hm.field_A ||
              !(hm.field_A.length >= param1)) {
              hm.field_A = new int[param1 * 2];
            }
            if (null == ac.field_I ||
              !(param1 + param0 <= ac.field_I.length)) {
              ac.field_I = new int[2 * (param0 + param1)];
            }
            if (null == sl.field_m ||
              !(param1 <= sl.field_m.length)) {
              sl.field_m = new boolean[2 * param1];
            }
          } else {
            on.field_e = new int[param1 * 2];
            if (li.field_g == null ||
              !(param1 <= li.field_g.length)) {
              li.field_g = new int[2 * param1];
            }
            if (null != ub.field_p &&
              param1 <= ub.field_p.length) {
              if (null == jf.field_N) {
                jf.field_N = new int[param1 * 2];
                if (null == hm.field_A) {
                  hm.field_A = new int[param1 * 2];
                  if (null == ac.field_I ||
                    !(param1 + param0 <= ac.field_I.length)) {
                    ac.field_I = new int[2 * (param0 + param1)];
                  }
                  if (null == sl.field_m ||
                    !(param1 <= sl.field_m.length)) {
                    sl.field_m = new boolean[2 * param1];
                  }
                } else {
                  if (hm.field_A.length < param1) {
                    hm.field_A = new int[param1 * 2];
                    if (null == ac.field_I ||
                      !(param1 + param0 <= ac.field_I.length)) {
                      ac.field_I = new int[2 * (param0 + param1)];
                    }
                    if (null == sl.field_m ||
                      !(param1 <= sl.field_m.length)) {
                      sl.field_m = new boolean[2 * param1];
                    }
                  } else {
                    if (null == ac.field_I ||
                      !(param1 + param0 <= ac.field_I.length)) {
                      ac.field_I = new int[2 * (param0 + param1)];
                    }
                    if (null == sl.field_m) {
                      sl.field_m = new boolean[2 * param1];
                    } else {
                      if (param1 > sl.field_m.length) {
                        sl.field_m = new boolean[2 * param1];
                      }
                    }
                  }
                }
              } else {
                if (jf.field_N.length < param1) {
                  jf.field_N = new int[param1 * 2];
                  if (null == hm.field_A ||
                    !(hm.field_A.length >= param1)) {
                    hm.field_A = new int[param1 * 2];
                  }
                  if (null == ac.field_I ||
                    !(param1 + param0 <= ac.field_I.length)) {
                    ac.field_I = new int[2 * (param0 + param1)];
                  }
                } else {
                  if (null == hm.field_A) {
                    hm.field_A = new int[param1 * 2];
                    if (null == ac.field_I ||
                      !(param1 + param0 <= ac.field_I.length)) {
                      ac.field_I = new int[2 * (param0 + param1)];
                    }
                  } else {
                    if (hm.field_A.length >= param1) {
                      if (null == ac.field_I ||
                        !(param1 + param0 <= ac.field_I.length)) {
                        ac.field_I = new int[2 * (param0 + param1)];
                      }
                    } else {
                      hm.field_A = new int[param1 * 2];
                      if (null == ac.field_I ||
                        !(param1 + param0 <= ac.field_I.length)) {
                        ac.field_I = new int[2 * (param0 + param1)];
                      }
                    }
                  }
                }
                if (null == sl.field_m) {
                  sl.field_m = new boolean[2 * param1];
                } else {
                  if (param1 > sl.field_m.length) {
                    sl.field_m = new boolean[2 * param1];
                  }
                }
              }
              id.field_d = -2147483648;
              ug.field_b = -2147483648;
              cq.field_i = 0;
              q.field_x = 2147483647;
              f.field_y = 2147483647;
              return;
            }
            ub.field_p = new int[2 * param1];
            if (null == jf.field_N ||
              !(jf.field_N.length >= param1)) {
              jf.field_N = new int[param1 * 2];
            }
            if (null == hm.field_A ||
              !(hm.field_A.length >= param1)) {
              hm.field_A = new int[param1 * 2];
            }
            if (null == ac.field_I ||
              !(param1 + param0 <= ac.field_I.length)) {
              ac.field_I = new int[2 * (param0 + param1)];
            }
            if (null != sl.field_m &&
              param1 <= sl.field_m.length) {
              id.field_d = -2147483648;
              ug.field_b = -2147483648;
              cq.field_i = 0;
              q.field_x = 2147483647;
              f.field_y = 2147483647;
              return;
            }
            sl.field_m = new boolean[2 * param1];
          }
        }
        id.field_d = -2147483648;
        ug.field_b = -2147483648;
        cq.field_i = 0;
        q.field_x = 2147483647;
        f.field_y = 2147483647;
    }

    public static void a(byte param0) {
        field_j = null;
        field_b = null;
        field_a = (lg[][]) null;
        field_f = null;
        field_e = (int[][]) null;
        field_d = null;
        field_h = null;
        if (param0 <= -10) {
          field_g = null;
          return;
        }
    }

    final static void a(int param0) {
        if (param0 > -101) {
          field_b = (String) null;
          ti.c(-95);
          return;
        }
        ti.c(-95);
    }

    final static er[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        er var16 = null;
        int[] var18 = bi.field_l;
        int[] var17 = var18;
        int[] var15 = var17;
        int[] var6 = var15;
        int var7 = bi.field_e;
        int var8 = bi.field_j;
        er var9 = new er(param1, param0 - param1 * 2);
        var9.d();
        bi.e(0, param2, param1, -(param1 * 2) + param0, param4, param5);
        er var10 = new er(param1, param1);
        var10.d();
        bi.b(0, 0, param1, param1, param4);
        er var11 = new er(16, param1);
        var11.d();
        bi.b(0, 0, 16, param1, param4);
        er var12 = new er(param1, param1);
        var12.d();
        bi.b(0, 0, param1, param1, param5);
        er var13 = new er(16, param1);
        var13.d();
        bi.b(0, 0, 16, param1, param5);
        Object var14 = null;
        if (param3 > 0) {
          var16 = new er(16, 16);
          var14 = var16;
          var16.d();
          bi.b(0, 0, 16, 16, param3);
        }
        bi.a(var18, var7, var8);
        return new er[]{var10, var11, var10, var9, (er) (var14), var9, var12, var13, var12};
    }

    static {
        field_b = "Email address is unavailable";
        field_f = "Orb coins: ";
        field_g = "<img=2> / <img=10><br><img=1> / <img=12><br><img=3> / <img=11><br><img=4> / <img=9><br><img=5> / <img=7><br><img=15> / <img=17><br><img=14> / <img=16><br><img=8>";
        field_a = new lg[13][2];
        field_h = "Password is valid";
        field_d = "Create unrated game";
    }
}
