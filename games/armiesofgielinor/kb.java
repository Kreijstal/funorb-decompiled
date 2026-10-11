/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kb extends IntrusiveNode {
    static int field_A;
    static int[] field_o;
    int field_p;
    qo field_x;
    static me field_y;
    boolean field_t;
    int field_l;
    int field_z;
    kh field_k;
    int field_w;
    int field_q;
    int field_B;
    ju field_u;
    String field_s;
    String field_v;
    int field_r;
    static int field_n;
    static int[] field_m;

    boolean b(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param0 != 1) {
          this.a(27, 29, 59, (kb) null);
          if (param1 + this.field_B > param3) {
            return false;
          }
          if (param2 < param4 + this.field_p) {
            return false;
          }
          if (this.field_l + (param1 + this.field_B) <= param3) {
            return false;
          }
          if (this.field_p + param4 + this.field_w <= param2) {
            return false;
          }
          return true;
        }
        if (param1 + this.field_B > param3) {
          return false;
        }
        if (param2 < param4 + this.field_p) {
          return false;
        }
        stackIn_18_0 = (this.field_l + (param1 + this.field_B) > param3) && (this.field_p + param4 + this.field_w > param2);
        return stackIn_18_0;
    }

    void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        try {
          this.field_q = 0;
          int var7_int = 122 / ((param3 + 58) / 53);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "kb.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(boolean param0) {
        if (param0) {
          this.a((Hashtable) null, 105, (byte) 68, (StringBuilder) null);
          return false;
        }
        return false;
    }

    final void a(int param0, Hashtable param1, boolean param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_B).append(",").append(this.field_p).append(" ").append(this.field_l).append("x").append(this.field_w);
          if (this.field_v != null) {
            discarded$1 = param3.append(" text=\"").append(this.field_v).append('"');
          }
          if (this.field_t) {
            discarded$2 = param3.append(" mouseover");
          }
          if (!param2) {
            return;
          }
          if (this.a(false)) {
            discarded$3 = param3.append(" focused");
          }
          if (this.field_k != null) {
            discarded$4 = param3.append(" renderer=");
            if (this.field_k instanceof kb) {
              param3 = this.a(1 + param0, param3, 26477, param1);
              if (var6 != 0) {
                discarded$5 = param3.append(this.field_k);
              }
            } else {
              discarded$5 = param3.append(this.field_k);
            }
          }
          if (null != this.field_x) {
            discarded$6 = param3.append(" listener=");
            if (this.field_x instanceof kb) {
              param3 = this.a(1 + param0, param3, 26477, param1);
              if (var6 == 0) {
                return;
              }
            }
            discarded$7 = param3.append(this.field_x);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("kb.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    int g(int param0) {
        if (param0 != -31989) {
          return 112;
        }
        return 0;
    }

    boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 103) {
            field_A = -35;
          }
          if (!this.b(1, param1, param5, param0, param2)) {
            return false;
          }
          this.field_q = param6;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("kb.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 >= 93) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("kb.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_m = null;
        int var1 = 53 / ((-78 - param0) / 43);
        field_y = null;
    }

    final void e(int param0) {
        if (param0 != 0) {
          return;
        }
        this.a(this.field_B, this.field_l, this.field_p, 8192, this.field_w);
    }

    kb(String param0, qo param1) {
        this(param0, t.field_c.field_t, param1);
    }

    final boolean a(int param0, char param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (!this.a(false)) {
          var4 = param0;
          if (var4 == 80) {
            return this.a(param2 ^ 91, this);
          }
          if (param2 == 80) {
            return false;
          }
          field_y = (me) null;
          return false;
        }
        if (this.a(this, param0, param1, param2 - 12295)) {
          return true;
        }
        var4Lifetime1 = param0;
        if (var4Lifetime1 == 80) {
          return this.a(param2 ^ 91, this);
        }
        if (param2 == 80) {
          return false;
        }
        field_y = (me) null;
        return false;
    }

    String h(int param0) {
        if (param0 == 21384) {
          return !this.field_t ? null : this.field_s;
        }
        this.field_l = 36;
        return !this.field_t ? null : this.field_s;
    }

    StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param0, (byte) 74, param1)) {
            this.a(param0, param3, true, param1);
          }
          if (param2 != 26477) {
            this.field_B = -116;
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("kb.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3) {
        int var5;
        wc var6;
        int var7;
        wc var8;
        wc var10;
        wc var15;
        wc var18;
        wc var21;
        wc var23;
        wc var27;
        wc var28;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.a(32722, param2, param3, this);
        if (param1 == -6226) {
          regionExit1: {
            var5 = this.a(false) ? 1 : 0;
            if (param0) {
              if (el.field_d != 0) {
                if (var5 == 0) {
                  if (DeployEvent.field_A != 0) {
                    if (!this.a(iu.field_t, param2, param3, 113, this, ur.field_z, DeployEvent.field_A)) {
                      if (ro.field_ub != 0) {
                        au.field_Ob = ro.field_ub;
                        OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                        return param0;
                      }
                      if (au.field_Ob == 0) {
                        au.field_Ob = ro.field_ub;
                        OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                        return param0;
                      }
                      this.a(param3, this, sm.field_d, (byte) -127, ko.field_b, param2);
                      var21 = bn.field_f;
                      if (var21 != null) {
                        if (var21.field_x instanceof ch) {
                          ((ch) (var21.field_x)).a(var21, -14486, (ku) null);
                        }
                        bn.field_f = null;
                      }
                      if (var7 != 0 &&
                        var5 != 0 &&
                        DeployEvent.field_A != 0) {
                        this.f(1);
                      }
                      au.field_Ob = ro.field_ub;
                      OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                      return param0;
                    }
                    param0 = false;
                  }
                  if (ro.field_ub != 0) {
                    au.field_Ob = ro.field_ub;
                    OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                    return param0;
                  }
                  if (au.field_Ob == 0) {
                    au.field_Ob = ro.field_ub;
                    OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                    return param0;
                  }
                  this.a(param3, this, sm.field_d, (byte) -127, ko.field_b, param2);
                  var23 = bn.field_f;
                  if (var23 != null) {
                    if (var23.field_x instanceof ch) {
                      ((ch) (var23.field_x)).a(var23, -14486, (ku) null);
                    }
                    bn.field_f = null;
                  }
                  if (var7 == 0) {
                    au.field_Ob = ro.field_ub;
                    OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                    return param0;
                  }
                  if (var5 == 0) {
                    au.field_Ob = ro.field_ub;
                    OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                    return param0;
                  }
                  if (DeployEvent.field_A == 0) {
                    au.field_Ob = ro.field_ub;
                    OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                    return param0;
                  }
                  this.f(1);
                  au.field_Ob = ro.field_ub;
                  OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                  return param0;
                }
                this.a(sm.field_d, param2, param3, ko.field_b, el.field_d, param1 + 6327, this);
              }
              if (DeployEvent.field_A != 0) {
                if (!this.a(iu.field_t, param2, param3, 113, this, ur.field_z, DeployEvent.field_A)) {
                  if (var5 == 0) {
                    if (ro.field_ub == 0) {
                      if (au.field_Ob == 0) {
                        au.field_Ob = ro.field_ub;
                        OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                        return param0;
                      }
                      this.a(param3, this, sm.field_d, (byte) -127, ko.field_b, param2);
                      var27 = bn.field_f;
                      var6 = var27;
                      if (var27 != null) {
                        if (var27.field_x instanceof ch) {
                          ((ch) (var27.field_x)).a(var27, -14486, (ku) null);
                        }
                        bn.field_f = null;
                      }
                      if (var7 != 0 &&
                        var5 != 0 &&
                        DeployEvent.field_A != 0) {
                        this.f(1);
                        au.field_Ob = ro.field_ub;
                        OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                        return param0;
                      }
                    }
                    au.field_Ob = ro.field_ub;
                    OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                    return param0;
                  }
                  this.f(1);
                  if (var7 != 0) {
                    param0 = false;
                  }
                } else {
                  param0 = false;
                }
              }
              if (ro.field_ub != 0) {
                break regionExit1;
              }
              if (au.field_Ob == 0) {
                au.field_Ob = ro.field_ub;
                OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                return param0;
              }
              this.a(param3, this, sm.field_d, (byte) -127, ko.field_b, param2);
              var28 = bn.field_f;
              if (var28 != null) {
                if (var28.field_x instanceof ch) {
                  ((ch) (var28.field_x)).a(var28, -14486, (ku) null);
                }
                bn.field_f = null;
              }
              if (var7 == 0) {
                break regionExit1;
              }
            }
            if (var5 != 0 &&
              DeployEvent.field_A != 0) {
              this.f(1);
              au.field_Ob = ro.field_ub;
              OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
              return param0;
            }
          }
        } else {
          field_n = 69;
          var5 = this.a(false) ? 1 : 0;
          if (param0) {
            if (el.field_d == 0) {
              if (DeployEvent.field_A != 0) {
                if (!this.a(iu.field_t, param2, param3, 113, this, ur.field_z, DeployEvent.field_A)) {
                  if (var5 != 0) {
                    this.f(1);
                    if (var7 != 0) {
                      param0 = false;
                    }
                  }
                } else {
                  param0 = false;
                }
              }
              if (ro.field_ub != 0) {
                au.field_Ob = ro.field_ub;
                OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                return param0;
              }
              if (au.field_Ob == 0) {
                au.field_Ob = ro.field_ub;
                OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                return param0;
              }
              this.a(param3, this, sm.field_d, (byte) -127, ko.field_b, param2);
              var8 = bn.field_f;
              var6 = var8;
              if (var8 != null) {
                if (var8.field_x instanceof ch) {
                  ((ch) (var8.field_x)).a(var8, -14486, (ku) null);
                }
                bn.field_f = null;
              }
              if (var7 != 0 &&
                var5 != 0 &&
                DeployEvent.field_A != 0) {
                this.f(1);
              }
              au.field_Ob = ro.field_ub;
              OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
              return param0;
            }
            if (var5 != 0) {
              this.a(sm.field_d, param2, param3, ko.field_b, el.field_d, param1 + 6327, this);
            }
            if (DeployEvent.field_A == 0) {
              if (ro.field_ub != 0) {
                au.field_Ob = ro.field_ub;
                OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                return param0;
              }
              if (au.field_Ob == 0) {
                au.field_Ob = ro.field_ub;
                OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                return param0;
              }
              this.a(param3, this, sm.field_d, (byte) -127, ko.field_b, param2);
              var10 = bn.field_f;
              var6 = var10;
              if (var10 != null) {
                if (var10.field_x instanceof ch) {
                  ((ch) (var10.field_x)).a(var10, -14486, (ku) null);
                }
                bn.field_f = null;
              }
              if (var7 != 0 &&
                var5 != 0 &&
                DeployEvent.field_A != 0) {
                this.f(1);
              }
              au.field_Ob = ro.field_ub;
              OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
              return param0;
            }
            if (!this.a(iu.field_t, param2, param3, 113, this, ur.field_z, DeployEvent.field_A)) {
              if (var5 == 0) {
                if (ro.field_ub != 0) {
                  au.field_Ob = ro.field_ub;
                  OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                  return param0;
                }
                if (au.field_Ob == 0) {
                  au.field_Ob = ro.field_ub;
                  OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                  return param0;
                }
                this.a(param3, this, sm.field_d, (byte) -127, ko.field_b, param2);
                var15 = bn.field_f;
                if (var15 != null) {
                  if (var15.field_x instanceof ch) {
                    ((ch) (var15.field_x)).a(var15, -14486, (ku) null);
                  }
                  bn.field_f = null;
                }
                if (var7 != 0 &&
                  var5 != 0 &&
                  DeployEvent.field_A != 0) {
                  this.f(1);
                }
                au.field_Ob = ro.field_ub;
                OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
                return param0;
              }
              this.f(1);
              if (var7 != 0) {
                param0 = false;
              }
            } else {
              param0 = false;
            }
            if (ro.field_ub != 0) {
              au.field_Ob = ro.field_ub;
              OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
              return param0;
            }
            if (au.field_Ob == 0) {
              au.field_Ob = ro.field_ub;
              OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
              return param0;
            }
            this.a(param3, this, sm.field_d, (byte) -127, ko.field_b, param2);
            var18 = bn.field_f;
            if (var18 != null) {
              if (var18.field_x instanceof ch) {
                ((ch) (var18.field_x)).a(var18, -14486, (ku) null);
              }
              bn.field_f = null;
            }
            if (var7 == 0) {
              au.field_Ob = ro.field_ub;
              OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
              return param0;
            }
          }
          if (var5 != 0 &&
            DeployEvent.field_A != 0) {
            this.f(1);
          }
        }
        au.field_Ob = ro.field_ub;
        OwnerChangeEvent.a(param1 ^ 6225, this.h(21384));
        return param0;
    }

    void f(int param0) {
        if (param0 != 1) {
          this.h(93);
        }
    }

    final boolean a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 29) {
            return true;
          }
          if (param0.containsKey(this)) {
            discarded$1 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param0.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("kb.FB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final String toString() {
        return this.a(0, new StringBuilder(), 26477, new Hashtable()).toString();
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_B = param0;
        if (param3 != 8192) {
          return;
        }
        this.field_p = param2;
        this.field_l = param1;
        this.field_w = param4;
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (0 == param3) {
          if (this.field_k == null) {
            if (param2 > -82) {
              this.field_t = false;
              return;
            }
            return;
          }
          this.field_k.a(this, param0, -89, true, param1);
        }
        if (param2 <= -82) {
          return;
        }
        this.field_t = false;
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == -12215) {
            return false;
          }
          this.field_z = -5;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("kb.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, kb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 11) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kb.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, kb param3) {
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != 32722) {
            return;
          }
          var5_int = this.b(param0 - 32721, param1, ko.field_b, sm.field_d, param2) ? 1 : 0;
          stackIn_4_0 = var5_int;
          if (this.field_t) {
            stackIn_5_1 = 0;
          } else {
            stackIn_5_1 = 1;
          }
          if (stackIn_4_0 == stackIn_5_1) {
            stackIn_9_1 = (var5_int != 0);
            this.field_t = stackIn_9_1;
            if (null != this.field_x &&
              this.field_x instanceof o) {
              ((o) (this.field_x)).a(var5_int != 0, false, this);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("kb.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        String var7;
        String var9;
        String var12;
        String var9Lifetime1;
        String var12Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 <= -117) {
          var4 = this.g(-31989);
          var5_int = 0;
          while (var5_int <= var4) {
            this.a(param0, param2, (byte) -115, var5_int);
            var5_int++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          var5 = bl.b(2);
          var7 = var5;
          var9 = var7;
          var5 = var9;
          var9Lifetime1 = var5;
          var5 = var9Lifetime1;
        } else {
          field_A = 34;
          var4 = this.g(-31989);
          var5_int = 0;
          while (var5_int <= var4) {
            this.a(param0, param2, (byte) -115, var5_int);
            var5_int++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          var5 = bl.b(2);
          var12 = var5;
          var5 = var12;
          var12Lifetime1 = var5;
          var5 = var12Lifetime1;
        }
        if (var5 == null) {
          return;
        }
        t.field_c.a(cc.field_b, -127, var5, lq.field_e);
    }

    protected kb() {
        this.field_z = 0;
        this.field_r = 0;
    }

    kb(String param0, kh param1, qo param2) {
        RuntimeException runtimeException = null;
        pm var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_z = 0;
        this.field_r = 0;
        try {
          this.field_k = param1;
          this.field_v = param0;
          this.field_x = param2;
          if (this.field_k instanceof pm) {
            var4 = (pm) ((Object) this.field_k);
            this.field_l = var4.a(this, (byte) -120);
            this.field_w = var4.a(this, -2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("kb.<init>(");
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
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    kb(int param0, int param1, int param2, int param3, kh param4, qo param5) {
        this.field_z = 0;
        this.field_r = 0;
        try {
          this.field_B = param0;
          this.field_p = param1;
          this.field_l = param2;
          this.field_w = param3;
          this.field_x = param5;
          this.field_k = param4;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "kb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_y = new me(11, 0, 1, 2);
        field_n = 0;
        field_m = new int[8192];
    }
}
