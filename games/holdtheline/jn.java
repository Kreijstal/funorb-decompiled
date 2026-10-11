/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    private int field_f;
    private int field_c;
    private int field_e;
    int field_b;
    int field_g;
    private int field_a;
    private boolean field_d;

    final boolean a(int param0) {
        if (param0 != -1) {
          this.field_a = 15;
          if (this.field_f != 0) {
            return true;
          }
          if (this.field_c != 84) {
            return 83 == this.field_c ? true : false;
          }
          return true;
        }
        if (this.field_f != 0) {
          return true;
        }
        if (this.field_c == 84) {
          return true;
        }
        if (83 != this.field_c) {
          return false;
        }
        return true;
    }

    final static void a(int param0, vn param1, int param2, int param3) {
        if (param3 != 0) {
          return;
        }
        try {
          bi.field_g = param0;
          em.field_j = param2;
          nc.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "jn.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1) {
        this.field_f = 0;
        if (param0 != -21) {
          return;
        }
        this.field_c = 0;
        if (this.field_a == 0) {
          this.field_c = aa.field_n;
        }
        if (this.field_a == 0 &&
          aa.field_n == 96) {
          if (this.field_g <= 0) {
            this.field_g = this.field_b;
          }
          this.field_g = this.field_g - 1;
          this.field_d = false;
        }
        if (this.field_a == 0 &&
          aa.field_n == 97) {
          this.field_g = this.field_g + 1;
          this.field_d = false;
          if (this.field_g >= this.field_b) {
            this.field_g = 0;
          }
        }
        if (this.field_a != 0) {
          return;
        }
        if (aa.field_n != 98 &&
          99 != aa.field_n) {
          return;
        }
        if (0 > this.field_g) {
          this.field_g = param1;
        }
        this.field_d = false;
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_b <= param1) {
          throw new IllegalArgumentException();
        }
        if (param0 >= this.field_b) {
          throw new IllegalArgumentException();
        }
        this.field_f = 0;
        this.field_c = 0;
        if (param2 != 4) {
          return;
        }
        if (gg.field_J != 0) {
          this.field_a = gg.field_J;
          this.field_e = fc.field_d;
          this.field_d = true;
          this.field_f = gg.field_J;
          this.field_g = param0;
        }
        if (0 != this.field_a) {
          if (rd.field_f == 0) {
            if (gg.field_J != 0) {
              if (this.field_a == 0) {
                if (!this.field_d &&
                  !na.field_k) {
                  return;
                }
                if (param1 < 0) {
                  if (this.field_d) {
                    this.field_g = -1;
                  }
                } else {
                  if (this.field_g == param1) {
                    this.field_d = true;
                    this.field_g = param1;
                  } else {
                    this.field_d = true;
                    this.field_g = param1;
                  }
                }
              }
              return;
            }
            if (rd.field_f != 0) {
              if (this.field_a == 0) {
                if (!this.field_d &&
                  !na.field_k) {
                  return;
                }
                if (param1 < 0) {
                  if (this.field_d) {
                    this.field_g = -1;
                  }
                } else {
                  if (this.field_g == param1) {
                    this.field_d = true;
                    this.field_g = param1;
                  } else {
                    this.field_d = true;
                    this.field_g = param1;
                  }
                }
              }
              return;
            }
            this.field_a = 0;
            if (this.field_a != 0) {
              return;
            }
            if (!this.field_d &&
              !na.field_k) {
              return;
            }
            if (param1 < 0) {
              if (!this.field_d) {
                return;
              }
              this.field_g = -1;
              return;
            }
            if (this.field_g != param1) {
              this.field_d = true;
              this.field_g = param1;
              return;
            }
            this.field_d = true;
            this.field_g = param1;
            return;
          }
          if (this.field_e <= 0) {
            this.field_e = tl.field_x;
          }
          this.field_e = this.field_e - 1;
        }
        if (gg.field_J == 0 &&
          rd.field_f == 0) {
          this.field_a = 0;
        }
        if (this.field_a != 0) {
          return;
        }
        if (!this.field_d &&
          !na.field_k) {
          return;
        }
        if (param1 < 0) {
          if (!this.field_d) {
            return;
          }
          this.field_g = -1;
          return;
        }
        if (this.field_g == param1) {
        }
        this.field_d = true;
        this.field_g = param1;
    }

    final static boolean a(byte param0) {
        if (param0 != -30) {
          return false;
        }
        if (10 > bk.field_w) {
          return false;
        }
        if (pf.field_d >= 13) {
          return true;
        }
        return false;
    }

    final void b(int param0) {
        this.field_f = 0;
        this.field_c = 0;
        if (param0 == ~this.field_a) {
          this.field_c = aa.field_n;
        }
        if (this.field_a == 0) {
          if (aa.field_n != 98) {
            if (0 != this.field_a) {
              return;
            }
            if (99 != aa.field_n) {
              return;
            }
            this.field_g = this.field_g + 1;
            if (this.field_g >= this.field_b) {
              this.field_g = 0;
            }
            this.field_d = false;
            return;
          }
          if (this.field_g <= 0) {
            this.field_g = this.field_b;
          }
          this.field_g = this.field_g - 1;
          this.field_d = false;
        }
        if (0 == this.field_a &&
          99 == aa.field_n) {
          this.field_g = this.field_g + 1;
          if (this.field_g >= this.field_b) {
            this.field_g = 0;
          }
          this.field_d = false;
        }
    }

    final static void a(gn param0, int param1, gn param2) {
        try {
          if (param1 > -8) {
            jn.a((byte) -64);
          }
          gh.field_n = new vi[7];
          pd.field_f = param2;
          em.field_m = new String[7];
          i.field_k = new vi[7];
          bd.field_Q = param0;
          em.field_m[0] = "holdtheline_title";
          em.field_m[5] = "holdtheline_alpine";
          em.field_m[1] = "holdtheline_victory_jingle";
          ab.field_jb = -1;
          oc.field_a = 7;
          em.field_m[4] = "holdtheline_desert";
          bi.field_e = 0;
          em.field_m[6] = "holdtheline_urban";
          em.field_m[2] = "holdtheline_lose_jingle";
          em.field_m[3] = "holdtheline_classic";
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "jn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, byte param1, da param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param2.h(param0, 7);
          if (param1 != -96) {
            stackIn_2_0 = -57;
            return stackIn_2_0;
          }
          if ((1 << param0) - 1 == var3_int) {
            var3_int = -1;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("jn.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        this.field_d = param2 ? true : false;
        this.field_a = param1;
        if (this.field_d) {
          this.field_g = param0;
          return;
        }
        this.field_g = param3;
    }

    jn(int param0) {
        this.field_g = 0;
        this.field_d = false;
        this.field_b = param0;
    }

    static {
    }
}
