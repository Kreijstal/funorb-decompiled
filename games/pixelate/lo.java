/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo extends ak {
    static int field_Mb;
    static String field_Kb;
    static int[] field_Ib;
    static int field_Jb;
    ak field_Eb;
    private ak field_Fb;
    static String field_Gb;
    static int field_Hb;
    static boolean field_Nb;
    static String field_Lb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param3, param0, param4, 256, param5);
        if (param6 == -2147483648) {
          this.b(param6 ^ 0, param2, param1);
          return;
        }
        field_Ib = (int[]) null;
        this.b(param6 ^ 0, param2, param1);
    }

    lo(long param0, ak param1, ak param2, ak param3, tf param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 != null) {
            this.field_Fb = new ak(0L, param2);
            this.field_Fb.field_H = param4;
            this.a(this.field_Fb, (byte) 26);
          }
          if (param5 != null) {
            this.field_Eb = new ak(0L, param3, param5);
            this.a(this.field_Eb, (byte) 26);
            this.h(-257);
          } else {
            this.h(-257);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("lo.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final int c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param0 == -25469) {
          var4 = -param1;
          var5 = -param1;
          if (this.field_Fb != null) {
            var4 = this.field_Fb.g(0);
          }
          if (null != this.field_Eb) {
            var5 = this.field_Eb.g(param0 + 25469);
          }
          return param2 + var4 + (param2 + param1) + var5;
        }
        lo.j(1);
        var4Lifetime1 = -param1;
        var5Lifetime1 = -param1;
        if (this.field_Fb != null) {
          var4Lifetime1 = this.field_Fb.g(0);
        }
        if (null != this.field_Eb) {
          var5Lifetime1 = this.field_Eb.g(param0 + 25469);
        }
        return param2 + var4Lifetime1 + (param2 + param1) + var5Lifetime1;
    }

    private final void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        if (param0 != -2147483648) {
          return;
        }
        var4 = -param1;
        if (this.field_Fb != null) {
          var4 = this.field_Fb.g(0);
        }
        var5 = -param1;
        if (null != this.field_Eb) {
          var5 = this.field_Eb.a((byte) 95, -param2 - var4 - param2 + (this.field_K - param1));
        }
        var6 = var5 + param1 + (param2 + (var4 + param2));
        if (var6 > this.field_K) {
          var5 = var5 + (-var6 + this.field_K);
          var6 = this.field_K;
        }
        if (this.field_Bb == 1) {
          param2 = param2 + (this.field_K - var6) / 2;
        }
        if (this.field_Bb == 2) {
          param2 = param2 + (this.field_K - var6);
        }
        if (null != this.field_Fb) {
          this.field_Fb.a(0, this.field_nb, param2, param0 - 2147483392, var4);
          this.field_Fb.field_kb = this.field_kb;
        }
        if (this.field_Eb == null) {
          return;
        }
        this.field_Eb.a(0, this.field_nb, param2 + var4 + param1, 256, var5);
        if (this.field_Fb == null) {
          this.field_Eb.field_Bb = this.field_Bb;
        } else {
          this.field_Eb.field_Bb = 0;
        }
        this.field_Eb.field_kb = this.field_kb;
        return;
    }

    public static void j(int param0) {
        field_Ib = null;
        field_Lb = null;
        if (param0 >= 34) {
          field_Kb = null;
          field_Gb = null;
          return;
        }
        field_Lb = (String) null;
        field_Kb = null;
        field_Gb = null;
    }

    final static void a(int param0, int param1, int param2) {
        if (ca.field_a == null) {
          ca.field_a = new int[2 * param2];
          if (ep.field_c == null ||
            !(ep.field_c.length >= param2)) {
            ep.field_c = new int[2 * param2];
          }
          if (null == uc.field_b ||
            !(param2 <= uc.field_b.length)) {
            uc.field_b = new int[param2 * 2];
          }
          if (vp.field_Fb == null ||
            !(param2 <= vp.field_Fb.length)) {
            vp.field_Fb = new int[2 * param2];
          }
          if (gh.field_q == null ||
            !(gh.field_q.length >= param2)) {
            gh.field_q = new int[2 * param2];
          }
          if (nb.field_c == null) {
            nb.field_c = new int[2 * param2];
            if (null == gn.field_A ||
              !(param1 + param2 <= gn.field_A.length)) {
              gn.field_A = new int[2 * (param1 + param2)];
            }
            if (dp.field_o == null ||
              !(param2 <= dp.field_o.length)) {
              dp.field_o = new boolean[2 * param2];
            }
          } else {
            if (param2 <= nb.field_c.length) {
              if (null == gn.field_A ||
                !(param1 + param2 <= gn.field_A.length)) {
                gn.field_A = new int[2 * (param1 + param2)];
              }
              if (dp.field_o == null ||
                !(param2 <= dp.field_o.length)) {
                dp.field_o = new boolean[2 * param2];
              }
            } else {
              nb.field_c = new int[2 * param2];
              if (null == gn.field_A ||
                !(param1 + param2 <= gn.field_A.length)) {
                gn.field_A = new int[2 * (param1 + param2)];
              }
              if (dp.field_o == null ||
                !(param2 <= dp.field_o.length)) {
                dp.field_o = new boolean[2 * param2];
              }
            }
          }
        } else {
          if (ca.field_a.length < param2) {
            ca.field_a = new int[2 * param2];
            if (ep.field_c == null ||
              !(ep.field_c.length >= param2)) {
              ep.field_c = new int[2 * param2];
            }
            if (null == uc.field_b ||
              !(param2 <= uc.field_b.length)) {
              uc.field_b = new int[param2 * 2];
            }
            if (vp.field_Fb == null ||
              !(param2 <= vp.field_Fb.length)) {
              vp.field_Fb = new int[2 * param2];
            }
            if (gh.field_q == null ||
              !(gh.field_q.length >= param2)) {
              gh.field_q = new int[2 * param2];
            }
            if (nb.field_c == null ||
              !(param2 <= nb.field_c.length)) {
              nb.field_c = new int[2 * param2];
            }
            if (null == gn.field_A) {
              gn.field_A = new int[2 * (param1 + param2)];
              if (dp.field_o == null ||
                !(param2 <= dp.field_o.length)) {
                dp.field_o = new boolean[2 * param2];
              }
            } else {
              if (param1 + param2 <= gn.field_A.length) {
                if (dp.field_o == null ||
                  !(param2 <= dp.field_o.length)) {
                  dp.field_o = new boolean[2 * param2];
                }
              } else {
                gn.field_A = new int[2 * (param1 + param2)];
                if (dp.field_o == null ||
                  !(param2 <= dp.field_o.length)) {
                  dp.field_o = new boolean[2 * param2];
                }
              }
            }
          } else {
            if (ep.field_c == null ||
              !(ep.field_c.length >= param2)) {
              ep.field_c = new int[2 * param2];
            }
            if (null == uc.field_b ||
              !(param2 <= uc.field_b.length)) {
              uc.field_b = new int[param2 * 2];
            }
            if (vp.field_Fb == null ||
              !(param2 <= vp.field_Fb.length)) {
              vp.field_Fb = new int[2 * param2];
            }
            if (gh.field_q == null) {
              gh.field_q = new int[2 * param2];
              if (nb.field_c == null ||
                !(param2 <= nb.field_c.length)) {
                nb.field_c = new int[2 * param2];
              }
              if (null == gn.field_A) {
                gn.field_A = new int[2 * (param1 + param2)];
                if (dp.field_o == null ||
                  !(param2 <= dp.field_o.length)) {
                  dp.field_o = new boolean[2 * param2];
                }
              } else {
                if (param1 + param2 <= gn.field_A.length) {
                  if (dp.field_o == null ||
                    !(param2 <= dp.field_o.length)) {
                    dp.field_o = new boolean[2 * param2];
                  }
                } else {
                  gn.field_A = new int[2 * (param1 + param2)];
                  if (dp.field_o == null ||
                    !(param2 <= dp.field_o.length)) {
                    dp.field_o = new boolean[2 * param2];
                  }
                }
              }
            } else {
              if (gh.field_q.length >= param2) {
                if (nb.field_c == null ||
                  !(param2 <= nb.field_c.length)) {
                  nb.field_c = new int[2 * param2];
                }
                if (null == gn.field_A) {
                  gn.field_A = new int[2 * (param1 + param2)];
                  if (dp.field_o == null ||
                    !(param2 <= dp.field_o.length)) {
                    dp.field_o = new boolean[2 * param2];
                  }
                } else {
                  if (param1 + param2 <= gn.field_A.length) {
                    if (dp.field_o == null ||
                      !(param2 <= dp.field_o.length)) {
                      dp.field_o = new boolean[2 * param2];
                    }
                  } else {
                    gn.field_A = new int[2 * (param1 + param2)];
                    if (dp.field_o == null ||
                      !(param2 <= dp.field_o.length)) {
                      dp.field_o = new boolean[2 * param2];
                    }
                  }
                }
              } else {
                gh.field_q = new int[2 * param2];
                if (nb.field_c == null ||
                  !(param2 <= nb.field_c.length)) {
                  nb.field_c = new int[2 * param2];
                }
                if (null == gn.field_A) {
                  gn.field_A = new int[2 * (param1 + param2)];
                  if (dp.field_o == null ||
                    !(param2 <= dp.field_o.length)) {
                    dp.field_o = new boolean[2 * param2];
                  }
                } else {
                  if (param1 + param2 <= gn.field_A.length) {
                    if (dp.field_o == null ||
                      !(param2 <= dp.field_o.length)) {
                      dp.field_o = new boolean[2 * param2];
                    }
                  } else {
                    gn.field_A = new int[2 * (param1 + param2)];
                    if (dp.field_o == null ||
                      !(param2 <= dp.field_o.length)) {
                      dp.field_o = new boolean[2 * param2];
                    }
                  }
                }
              }
            }
          }
        }
        aa.field_o = -2147483648;
        w.field_s = param0;
        qn.field_k = -2147483648;
        pg.field_e = 0;
        ro.field_a = 2147483647;
    }

    static {
        field_Ib = new int[8192];
        field_Kb = "Score";
        field_Gb = "There are no valid types of game that match your preferences.";
        field_Nb = true;
        field_Lb = "Total Pictures: ";
    }
}
