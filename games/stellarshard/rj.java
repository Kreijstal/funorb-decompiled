/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rj extends gg {
    vk field_r;
    lf field_v;
    uk field_u;
    int field_l;
    int field_p;
    boolean field_q;
    String field_m;
    String field_x;
    int field_k;
    int field_o;
    int field_t;
    int field_n;
    static pb field_s;
    int field_w;

    public static void b(boolean param0) {
        field_s = null;
        if (!param0) {
          rj.c((byte) -1);
        }
    }

    void a(int param0, boolean param1, int param2, rj param3) {
        int var5_int = 0;
        boolean stackIn_4_0 = false;
        int stackIn_5_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1) {
            return;
          }
          var5_int = this.a((byte) 126, param0, eb.field_a, ni.field_e, param2) ? 1 : 0;
          stackIn_4_0 = this.field_q;
          if (var5_int != 0) {
            stackIn_5_1 = 0;
          } else {
            stackIn_5_1 = 1;
          }
          if ((stackIn_4_0 ? 1 : 0) == stackIn_5_1) {
            stackIn_10_1 = (var5_int != 0);
            this.field_q = stackIn_10_1;
            if (null != this.field_v &&
              this.field_v instanceof da) {
              ((da) (this.field_v)).a((byte) 76, var5_int != 0, this);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("rj.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    String d(int param0) {
        if (param0 != 3690) {
          this.field_m = (String) null;
          if (this.field_q) {
            return this.field_x;
          }
          return null;
        }
        if (this.field_q) {
          return this.field_x;
        }
        return null;
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 74 % ((param0 + 52) / 33);
        if ((7 & param1) != 0) {
          var2 = -(param1 & 7) + 8;
        }
        int var4 = param1 + var2;
        return var4;
    }

    boolean a(int param0, int param1, rj param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 >= 30) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("rj.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) 126, param6, param3, param1, param4)) {
            this.field_o = param2;
          }
          if (param5 >= 24) {
            return false;
          }
          this.field_m = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("rj.P(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(int param0, rj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -2147483648) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("rj.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final String toString() {
        return this.a(0, false, new StringBuilder(), new Hashtable()).toString();
    }

    rj(String param0, lf param1) {
        this(param0, n.field_i.field_r, param1);
    }

    int a(boolean param0) {
        if (param0) {
          this.a(-18, -25, 118);
          return 0;
        }
        return 0;
    }

    final boolean a(boolean param0, byte param1, int param2, int param3) {
        int var5;
        dl var6;
        int var7;
        dl var8;
        dl var9;
        dl var11;
        dl var13;
        dl var15;
        dl var17;
        dl var19;
        dl var20;
        var7 = stellarshard.field_B;
        if (param1 < -116) {
          L0: {
            this.a(param2, false, param3, this);
            var5 = this.e(0) ? 1 : 0;
            if (param0) {
              if (ke.field_b != 0 &&
                var5 != 0) {
                this.a(param2, eb.field_a, this, ni.field_e, 63, ke.field_b, param3);
                if (gh.field_c != 0) {
                  if (this.a(this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                    param0 = false;
                  } else {
                    this.c(true);
                    if (var7 != 0) {
                      param0 = false;
                      if (0 != fb.field_n) {
                        nb.field_H = fb.field_n;
                        cl.a(this.d(3690), (byte) 96);
                        return param0;
                      }
                      if (nb.field_H == 0) {
                        nb.field_H = fb.field_n;
                        cl.a(this.d(3690), (byte) 96);
                        return param0;
                      }
                      this.a(eb.field_a, -109, this, param3, param2, ni.field_e);
                      var15 = lk.field_e;
                      var6 = var15;
                      if (var15 != null) {
                        if (var15.field_v instanceof jh) {
                          ((jh) (var15.field_v)).a((of) null, (byte) 106, var15);
                        }
                        lk.field_e = null;
                      }
                      if (var5 != 0 &&
                        gh.field_c != 0) {
                        this.c(true);
                      }
                      nb.field_H = fb.field_n;
                      cl.a(this.d(3690), (byte) 96);
                      return param0;
                    }
                  }
                }
                if (0 != fb.field_n) {
                  nb.field_H = fb.field_n;
                  cl.a(this.d(3690), (byte) 96);
                  return param0;
                }
                if (nb.field_H == 0) {
                  nb.field_H = fb.field_n;
                  cl.a(this.d(3690), (byte) 96);
                  return param0;
                }
                this.a(eb.field_a, -109, this, param3, param2, ni.field_e);
                var17 = lk.field_e;
                var6 = var17;
                if (var17 != null) {
                  if (var17.field_v instanceof jh) {
                    ((jh) (var17.field_v)).a((of) null, (byte) 106, var17);
                  }
                  lk.field_e = null;
                }
                if (var7 == 0) {
                  nb.field_H = fb.field_n;
                  cl.a(this.d(3690), (byte) 96);
                  return param0;
                }
                if (var5 == 0) {
                  nb.field_H = fb.field_n;
                  cl.a(this.d(3690), (byte) 96);
                  return param0;
                }
                if (gh.field_c == 0) {
                  nb.field_H = fb.field_n;
                  cl.a(this.d(3690), (byte) 96);
                  return param0;
                }
                this.c(true);
                nb.field_H = fb.field_n;
                cl.a(this.d(3690), (byte) 96);
                return param0;
              }
              if (gh.field_c != 0) {
                if (this.a(this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                  param0 = false;
                } else {
                  if (var5 != 0) {
                    this.c(true);
                    if (var7 != 0) {
                      param0 = false;
                      if (0 == fb.field_n) {
                        if (nb.field_H == 0) {
                          nb.field_H = fb.field_n;
                          cl.a(this.d(3690), (byte) 96);
                          return param0;
                        }
                        this.a(eb.field_a, -109, this, param3, param2, ni.field_e);
                        var19 = lk.field_e;
                        var6 = var19;
                        if (var19 != null) {
                          if (var19.field_v instanceof jh) {
                            ((jh) (var19.field_v)).a((of) null, (byte) 106, var19);
                          }
                          lk.field_e = null;
                        }
                        if (var5 != 0 &&
                          gh.field_c != 0) {
                          this.c(true);
                          nb.field_H = fb.field_n;
                          cl.a(this.d(3690), (byte) 96);
                          return param0;
                        }
                      }
                      nb.field_H = fb.field_n;
                      cl.a(this.d(3690), (byte) 96);
                      return param0;
                    }
                  }
                }
              }
              if (0 != fb.field_n) {
                break L0;
              }
              if (nb.field_H == 0) {
                nb.field_H = fb.field_n;
                cl.a(this.d(3690), (byte) 96);
                return param0;
              }
              this.a(eb.field_a, -109, this, param3, param2, ni.field_e);
              var20 = lk.field_e;
              if (var20 != null) {
                if (var20.field_v instanceof jh) {
                  ((jh) (var20.field_v)).a((of) null, (byte) 106, var20);
                }
                lk.field_e = null;
              }
              if (var7 == 0) {
                break L0;
              }
            }
            if (var5 != 0 &&
              gh.field_c != 0) {
              this.c(true);
              nb.field_H = fb.field_n;
              cl.a(this.d(3690), (byte) 96);
              return param0;
            }
          }
        } else {
          this.field_p = 21;
          this.a(param2, false, param3, this);
          var5 = this.e(0) ? 1 : 0;
          if (param0) {
            if (ke.field_b == 0) {
              if (gh.field_c != 0) {
                if (!this.a(this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                  if (var5 != 0) {
                    this.c(true);
                    if (var7 != 0) {
                      param0 = false;
                    }
                  }
                } else {
                  param0 = false;
                }
              }
              if (0 != fb.field_n) {
                nb.field_H = fb.field_n;
                cl.a(this.d(3690), (byte) 96);
                return param0;
              }
              if (nb.field_H == 0) {
                nb.field_H = fb.field_n;
                cl.a(this.d(3690), (byte) 96);
                return param0;
              }
              this.a(eb.field_a, -109, this, param3, param2, ni.field_e);
              var8 = lk.field_e;
              var6 = var8;
              if (var8 != null) {
                if (var8.field_v instanceof jh) {
                  ((jh) (var8.field_v)).a((of) null, (byte) 106, var8);
                }
                lk.field_e = null;
              }
              if (var7 != 0 &&
                var5 != 0 &&
                gh.field_c != 0) {
                this.c(true);
              }
              nb.field_H = fb.field_n;
              cl.a(this.d(3690), (byte) 96);
              return param0;
            }
            if (var5 == 0) {
              if (gh.field_c != 0 &&
                this.a(this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                param0 = false;
              }
              if (0 != fb.field_n) {
                nb.field_H = fb.field_n;
                cl.a(this.d(3690), (byte) 96);
                return param0;
              }
              if (nb.field_H == 0) {
                nb.field_H = fb.field_n;
                cl.a(this.d(3690), (byte) 96);
                return param0;
              }
              this.a(eb.field_a, -109, this, param3, param2, ni.field_e);
              var9 = lk.field_e;
              var6 = var9;
              if (var9 != null) {
                if (var9.field_v instanceof jh) {
                  ((jh) (var9.field_v)).a((of) null, (byte) 106, var9);
                }
                lk.field_e = null;
              }
              if (var7 != 0 &&
                var5 != 0 &&
                gh.field_c != 0) {
                this.c(true);
              }
              nb.field_H = fb.field_n;
              cl.a(this.d(3690), (byte) 96);
              return param0;
            }
            this.a(param2, eb.field_a, this, ni.field_e, 63, ke.field_b, param3);
            if (gh.field_c != 0) {
              if (this.a(this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                param0 = false;
              } else {
                this.c(true);
                if (var7 != 0) {
                  param0 = false;
                  if (0 != fb.field_n) {
                    nb.field_H = fb.field_n;
                    cl.a(this.d(3690), (byte) 96);
                    return param0;
                  }
                  if (nb.field_H == 0) {
                    nb.field_H = fb.field_n;
                    cl.a(this.d(3690), (byte) 96);
                    return param0;
                  }
                  this.a(eb.field_a, -109, this, param3, param2, ni.field_e);
                  var11 = lk.field_e;
                  var6 = var11;
                  if (var11 != null) {
                    if (var11.field_v instanceof jh) {
                      ((jh) (var11.field_v)).a((of) null, (byte) 106, var11);
                    }
                    lk.field_e = null;
                  }
                  if (var5 != 0 &&
                    gh.field_c != 0) {
                    this.c(true);
                  }
                  nb.field_H = fb.field_n;
                  cl.a(this.d(3690), (byte) 96);
                  return param0;
                }
              }
            }
            if (0 != fb.field_n) {
              nb.field_H = fb.field_n;
              cl.a(this.d(3690), (byte) 96);
              return param0;
            }
            if (nb.field_H == 0) {
              nb.field_H = fb.field_n;
              cl.a(this.d(3690), (byte) 96);
              return param0;
            }
            this.a(eb.field_a, -109, this, param3, param2, ni.field_e);
            var13 = lk.field_e;
            var6 = var13;
            if (var13 != null) {
              if (var13.field_v instanceof jh) {
                ((jh) (var13.field_v)).a((of) null, (byte) 106, var13);
              }
              lk.field_e = null;
            }
            if (var7 == 0) {
              nb.field_H = fb.field_n;
              cl.a(this.d(3690), (byte) 96);
              return param0;
            }
          }
          if (var5 != 0 &&
            gh.field_c != 0) {
            this.c(true);
          }
        }
        nb.field_H = fb.field_n;
        cl.a(this.d(3690), (byte) 96);
        return param0;
    }

    final void f(int param0) {
        if (param0 == 0) {
          this.b(this.field_p, this.field_w, this.field_k, this.field_t, 23987);
          return;
        }
        this.field_r = (vk) null;
        this.b(this.field_p, this.field_w, this.field_k, this.field_t, 23987);
    }

    final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param0 <= 123) {
          this.a((byte) -24, 123, -112, 102, -44);
          if (param3 < param4 + this.field_w) {
            return false;
          }
          if (param1 + this.field_k > param2) {
            return false;
          }
          if (this.field_w + (param4 + this.field_p) <= param3) {
            return false;
          }
          if (param1 + (this.field_k + this.field_t) <= param2) {
            return false;
          }
          return true;
        }
        if (param3 < param4 + this.field_w) {
          return false;
        }
        if (param1 + this.field_k > param2) {
          return false;
        }
        stackIn_18_0 = (this.field_w + (param4 + this.field_p) > param3) && (param1 + (this.field_k + this.field_t) > param2);
        return stackIn_18_0;
    }

    void c(boolean param0) {
        if (!param0) {
          field_s = (pb) null;
        }
    }

    final boolean a(int param0, char param1, boolean param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (!this.e(0)) {
          if (!param2) {
            return false;
          }
          var4 = param0;
          if (var4 == 80) {
            return this.a(-2147483648, this);
          }
          return false;
        }
        if (this.a(29657, param0, param1, this)) {
          return true;
        }
        if (!param2) {
          return false;
        }
        var4Lifetime1 = param0;
        if (var4Lifetime1 == 80) {
          return this.a(-2147483648, this);
        }
        return false;
    }

    final static void c(byte param0) {
        if (param0 != -94) {
          field_s = (pb) null;
          if (cg.field_a) {
            qh.field_d = true;
            va.a(true, -844);
            eg.field_d = 0;
            return;
          }
          throw new IllegalStateException();
        }
        if (cg.field_a) {
          qh.field_d = true;
          va.a(true, -844);
          eg.field_d = 0;
          return;
        }
        throw new IllegalStateException();
    }

    final boolean a(byte param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 44 / ((param0 - 15) / 38);
          if (!param1.containsKey(this)) {
            param1.put(this, this);
            return true;
          }
          discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("rj.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, int param1, char param2, rj param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 29657) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("rj.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        this.field_w = param1;
        if (param4 == 23987) {
          this.field_p = param0;
          this.field_k = param2;
          this.field_t = param3;
          return;
        }
        this.a(50, (rj) null);
        this.field_p = param0;
        this.field_k = param2;
        this.field_t = param3;
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (param1 != -57) {
          this.a(-120, -51, 'ﾁ', (rj) null);
          if (param0 != 0) {
            return;
          }
          if (this.field_u != null) {
            this.field_u.a(true, param3, param2, this, 4549);
            return;
          }
          return;
        }
        if (param0 != 0) {
          return;
        }
        if (this.field_u != null) {
          this.field_u.a(true, param3, param2, this, 4549);
          return;
        }
    }

    void a(int param0, int param1, rj param2, int param3, int param4, int param5) {
        try {
          int var7_int = -122 / ((-50 - param1) / 57);
          this.field_o = 0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "rj.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = stellarshard.field_B;
        var4 = this.a(false);
        var5_int = param1;
        while (var4 >= var5_int) {
          this.a(var5_int, (byte) -57, param2, param0);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = e.b(-1);
        if (var5 == null) {
          return;
        }
        n.field_i.a(var5, h.field_c, am.field_f, (byte) 127);
    }

    StringBuilder a(int param0, boolean param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            rj.b(false);
          }
          if (this.a((byte) 55, param3, param2, param0)) {
            this.a((byte) 126, param0, param2, param3);
          }
          stackIn_6_0 = (StringBuilder) (param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("rj.T(").append(param0).append(',').append(param1).append(',');
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
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = stellarshard.field_B;
        try {
          discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_w).append(",").append(this.field_k).append(" ").append(this.field_p).append("x").append(this.field_t);
          if (this.field_m != null) {
            discarded$1 = param2.append(" text=\"").append(this.field_m).append('"');
          }
          if (param0 <= 76) {
            this.field_q = false;
          }
          if (this.field_q) {
            discarded$2 = param2.append(" mouseover");
          }
          if (this.e(0)) {
            discarded$3 = param2.append(" focused");
          }
          if (null != this.field_u) {
            discarded$4 = param2.append(" renderer=");
            if (!(this.field_u instanceof rj)) {
              discarded$5 = param2.append(this.field_u);
              if (var6 != 0) {
                param2 = this.a(param1 + 1, false, param2, param3);
              }
            } else {
              param2 = this.a(param1 + 1, false, param2, param3);
            }
          }
          if (null != this.field_v) {
            discarded$6 = param2.append(" listener=");
            if (!(this.field_v instanceof rj)) {
              discarded$7 = param2.append(this.field_v);
              if (var6 != 0) {
                param2 = this.a(1 + param1, false, param2, param3);
              }
            } else {
              param2 = this.a(1 + param1, false, param2, param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("rj.IA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    boolean e(int param0) {
        if (param0 != 0) {
          this.a(-83, false, (StringBuilder) null, (Hashtable) null);
          return false;
        }
        return false;
    }

    protected rj() {
        this.field_l = 0;
        this.field_n = 0;
    }

    rj(String param0, uk param1, lf param2) {
        RuntimeException runtimeException = null;
        pj var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_l = 0;
        this.field_n = 0;
        try {
          this.field_u = param1;
          this.field_m = param0;
          this.field_v = param2;
          if (this.field_u instanceof pj) {
            var4 = (pj) ((Object) this.field_u);
            this.field_p = var4.a(this, (byte) 124);
            this.field_t = var4.a(this, 28361);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("rj.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
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
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2) {
        if (ge.field_n != null &&
          ge.field_n.length >= param1) {
          if (null == se.field_B) {
            se.field_B = new int[2 * param1];
            if (null == qf.field_g ||
              !(qf.field_g.length >= param1)) {
              qf.field_g = new int[2 * param1];
            }
            if (null == wb.field_e) {
              wb.field_e = new int[param1 * 2];
              if (null == vc.field_f ||
                !(param1 <= vc.field_f.length)) {
                vc.field_f = new int[param1 * 2];
              }
              if (null == vh.field_h ||
                !(param1 <= vh.field_h.length)) {
                vh.field_h = new int[param1 * 2];
              }
              if (fj.field_b == null ||
                !(fj.field_b.length >= param1 + param2)) {
                fj.field_b = new int[2 * (param1 + param2)];
              }
              if (null == vl.field_s ||
                !(param1 <= vl.field_s.length)) {
                vl.field_s = new boolean[param1 * 2];
              }
            } else {
              if (param1 <= wb.field_e.length) {
                if (null == vc.field_f ||
                  !(param1 <= vc.field_f.length)) {
                  vc.field_f = new int[param1 * 2];
                }
                if (null == vh.field_h ||
                  !(param1 <= vh.field_h.length)) {
                  vh.field_h = new int[param1 * 2];
                }
                if (fj.field_b == null ||
                  !(fj.field_b.length >= param1 + param2)) {
                  fj.field_b = new int[2 * (param1 + param2)];
                }
                if (null == vl.field_s ||
                  !(param1 <= vl.field_s.length)) {
                  vl.field_s = new boolean[param1 * 2];
                }
              } else {
                wb.field_e = new int[param1 * 2];
                if (null == vc.field_f ||
                  !(param1 <= vc.field_f.length)) {
                  vc.field_f = new int[param1 * 2];
                }
                if (null == vh.field_h ||
                  !(param1 <= vh.field_h.length)) {
                  vh.field_h = new int[param1 * 2];
                }
                if (fj.field_b == null ||
                  !(fj.field_b.length >= param1 + param2)) {
                  fj.field_b = new int[2 * (param1 + param2)];
                }
                if (null == vl.field_s ||
                  !(param1 <= vl.field_s.length)) {
                  vl.field_s = new boolean[param1 * 2];
                }
              }
            }
          } else {
            if (param1 <= se.field_B.length) {
              if (null == qf.field_g ||
                !(qf.field_g.length >= param1)) {
                qf.field_g = new int[2 * param1];
              }
              if (null == wb.field_e ||
                !(param1 <= wb.field_e.length)) {
                wb.field_e = new int[param1 * 2];
              }
              if (null == vc.field_f ||
                !(param1 <= vc.field_f.length)) {
                vc.field_f = new int[param1 * 2];
              }
              if (null == vh.field_h ||
                !(param1 <= vh.field_h.length)) {
                vh.field_h = new int[param1 * 2];
              }
              if (fj.field_b == null ||
                !(fj.field_b.length >= param1 + param2)) {
                fj.field_b = new int[2 * (param1 + param2)];
              }
              if (null == vl.field_s ||
                !(param1 <= vl.field_s.length)) {
                vl.field_s = new boolean[param1 * 2];
              }
            } else {
              se.field_B = new int[2 * param1];
              if (null == qf.field_g ||
                !(qf.field_g.length >= param1)) {
                qf.field_g = new int[2 * param1];
              }
              if (null == wb.field_e) {
                wb.field_e = new int[param1 * 2];
                if (null == vc.field_f ||
                  !(param1 <= vc.field_f.length)) {
                  vc.field_f = new int[param1 * 2];
                }
                if (null == vh.field_h ||
                  !(param1 <= vh.field_h.length)) {
                  vh.field_h = new int[param1 * 2];
                }
                if (fj.field_b == null ||
                  !(fj.field_b.length >= param1 + param2)) {
                  fj.field_b = new int[2 * (param1 + param2)];
                }
                if (null == vl.field_s ||
                  !(param1 <= vl.field_s.length)) {
                  vl.field_s = new boolean[param1 * 2];
                }
              } else {
                if (param1 <= wb.field_e.length) {
                  if (null == vc.field_f ||
                    !(param1 <= vc.field_f.length)) {
                    vc.field_f = new int[param1 * 2];
                  }
                  if (null == vh.field_h ||
                    !(param1 <= vh.field_h.length)) {
                    vh.field_h = new int[param1 * 2];
                  }
                  if (fj.field_b == null ||
                    !(fj.field_b.length >= param1 + param2)) {
                    fj.field_b = new int[2 * (param1 + param2)];
                  }
                  if (null == vl.field_s ||
                    !(param1 <= vl.field_s.length)) {
                    vl.field_s = new boolean[param1 * 2];
                  }
                } else {
                  wb.field_e = new int[param1 * 2];
                  if (null == vc.field_f ||
                    !(param1 <= vc.field_f.length)) {
                    vc.field_f = new int[param1 * 2];
                  }
                  if (null == vh.field_h ||
                    !(param1 <= vh.field_h.length)) {
                    vh.field_h = new int[param1 * 2];
                  }
                  if (fj.field_b == null ||
                    !(fj.field_b.length >= param1 + param2)) {
                    fj.field_b = new int[2 * (param1 + param2)];
                  }
                  if (null == vl.field_s ||
                    !(param1 <= vl.field_s.length)) {
                    vl.field_s = new boolean[param1 * 2];
                  }
                }
              }
            }
          }
          ta.field_q = 2147483647;
          ce.field_b = -2147483648;
          fh.field_b = 0;
          if (param0 > -13) {
            rj.a((byte) 107, 88);
          }
          af.field_k = 2147483647;
          oe.field_c = -2147483648;
          return;
        }
        ge.field_n = new int[param1 * 2];
        if (null == se.field_B ||
          !(param1 <= se.field_B.length)) {
          se.field_B = new int[2 * param1];
        }
        if (null == qf.field_g ||
          !(qf.field_g.length >= param1)) {
          qf.field_g = new int[2 * param1];
        }
        if (null == wb.field_e ||
          !(param1 <= wb.field_e.length)) {
          wb.field_e = new int[param1 * 2];
        }
        if (null == vc.field_f ||
          !(param1 <= vc.field_f.length)) {
          vc.field_f = new int[param1 * 2];
        }
        if (null == vh.field_h ||
          !(param1 <= vh.field_h.length)) {
          vh.field_h = new int[param1 * 2];
        }
        if (fj.field_b == null ||
          !(fj.field_b.length >= param1 + param2)) {
          fj.field_b = new int[2 * (param1 + param2)];
        }
        if (null == vl.field_s ||
          !(param1 <= vl.field_s.length)) {
          vl.field_s = new boolean[param1 * 2];
        }
        ta.field_q = 2147483647;
        ce.field_b = -2147483648;
        fh.field_b = 0;
        if (param0 > -13) {
          rj.a((byte) 107, 88);
        }
        af.field_k = 2147483647;
        oe.field_c = -2147483648;
    }

    rj(int param0, int param1, int param2, int param3, uk param4, lf param5) {
        this.field_l = 0;
        this.field_n = 0;
        try {
          this.field_k = param1;
          this.field_w = param0;
          this.field_t = param3;
          this.field_v = param5;
          this.field_u = param4;
          this.field_p = param2;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "rj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
