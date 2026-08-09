/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ag extends am {
    static int field_k;
    int field_v;
    int field_r;
    static float field_w;
    String field_i;
    int field_o;
    static String field_j;
    String field_n;
    mh field_p;
    static td field_t;
    int field_s;
    int field_m;
    ce field_l;
    boolean field_u;
    int field_q;
    nn field_h;
    int field_x;

    boolean g(int param0) {
        if (param0 != -9015) {
            this.a(118, 53, false, -73);
            return false;
        }
        return false;
    }

    final static bd d(byte param0) {
        int var1;
        Object var3;
        int[] var5_ref_int__;
        int var5;
        int var6;
        int var7;
        int[] var9;
        byte[] var14;
        byte[] var15;
        byte[] var16;
        byte[] var17;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var1 = hd.field_r[0] * sf.field_X[0];
        if (param0 < 36) {
          L0: {
            L1: {
              field_k = 78;
              var15 = ja.field_e[0];
              if (!qj.field_k[0]) {
                break L1;
              } else {
                var14 = vh.field_a[0];
                var5_ref_int__ = new int[var1];
                var6 = 0;
                L2: while (true) {
                  L3: {
                    if (var6 >= var1) {
                      break L3;
                    } else {
                      var5_ref_int__[var6] = ll.a(ua.a(255, (int) var14[var6]) << -110041192, bf.field_d[ua.a((int) var15[var6], 255)]);
                      var6++;
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var3 = new gk(ra.field_a, vc.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], var5_ref_int__);
                  if (var7 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var9 = new int[var1];
            var5 = 0;
            L4: while (true) {
              L5: {
                if (var1 <= var5) {
                  break L5;
                } else {
                  var9[var5] = bf.field_d[ua.a((int) var15[var5], 255)];
                  var5++;
                  if (var7 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              var3 = new bd(ra.field_a, vc.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], var9);
              break L0;
            }
          }
          uj.d(121);
          return (bd) (var3);
        } else {
          L6: {
            L7: {
              var17 = ja.field_e[0];
              if (!qj.field_k[0]) {
                break L7;
              } else {
                var16 = vh.field_a[0];
                var5_ref_int__ = new int[var1];
                var6 = 0;
                L8: while (true) {
                  L9: {
                    if (var6 >= var1) {
                      break L9;
                    } else {
                      var5_ref_int__[var6] = ll.a(ua.a(255, (int) var16[var6]) << -110041192, bf.field_d[ua.a((int) var17[var6], 255)]);
                      var6++;
                      if (var7 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var3 = new gk(ra.field_a, vc.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], var5_ref_int__);
                  if (var7 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
            }
            var9 = new int[var1];
            var5 = 0;
            L10: while (true) {
              L11: {
                if (var1 <= var5) {
                  break L11;
                } else {
                  var9[var5] = bf.field_d[ua.a((int) var17[var5], 255)];
                  var5++;
                  if (var7 == 0) {
                    continue L10;
                  } else {
                    break L11;
                  }
                }
              }
              var3 = new bd(ra.field_a, vc.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], var9);
              break L6;
            }
          }
          uj.d(121);
          return (bd) (var3);
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5;
        int var7;
        rj var8;
        rj var9;
        rj var10;
        rj var11;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          this.a((ag) (this), param0, 0, param3);
          var5 = this.g(-9015) ? 1 : 0;
          if (!param2) {
            if (var5 != 0) {
              if (pf.field_o != 0) {
                this.c((byte) -82);
                if (var7 == 0) {
                  mn.field_c = ig.field_L;
                  am.a(this.e(34), (byte) -82);
                  if (param1 != 8799) {
                    ag.d((byte) 54);
                    return param2;
                  } else {
                    return param2;
                  }
                } else {
                  if (ll.field_c == 0) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      break L0;
                    } else {
                      this.a(rb.field_m, param0, param3, 0, (ag) (this), j.field_c, ll.field_c);
                      break L0;
                    }
                  }
                }
              } else {
                mn.field_c = ig.field_L;
                am.a(this.e(34), (byte) -82);
                if (param1 == 8799) {
                  return param2;
                } else {
                  ag.d((byte) 54);
                  return param2;
                }
              }
            } else {
              mn.field_c = ig.field_L;
              am.a(this.e(34), (byte) -82);
              if (param1 != 8799) {
                ag.d((byte) 54);
                return param2;
              } else {
                return param2;
              }
            }
          } else {
            if (ll.field_c == 0) {
              break L0;
            } else {
              if (var5 == 0) {
                break L0;
              } else {
                this.a(rb.field_m, param0, param3, 0, (ag) (this), j.field_c, ll.field_c);
                break L0;
              }
            }
          }
        }
        if (-1 != (pf.field_o ^ -1)) {
          L1: {
            if (!this.a(ec.field_a, param3, param0, rc.field_b, (byte) 110, (ag) (this), pf.field_o)) {
              break L1;
            } else {
              param2 = false;
              if (var7 != 0) {
                break L1;
              } else {
                if (ig.field_L != 0) {
                  mn.field_c = ig.field_L;
                  am.a(this.e(34), (byte) -82);
                  if (param1 != 8799) {
                    ag.d((byte) 54);
                    return param2;
                  } else {
                    return param2;
                  }
                } else {
                  if (mn.field_c != 0) {
                    this.a(j.field_c, param0, param3, rb.field_m, (ag) (this), param1 + -8799);
                    var8 = rh.field_D;
                    if (var8 != null) {
                      if (!(var8.field_p instanceof k)) {
                        rh.field_D = null;
                        mn.field_c = ig.field_L;
                        am.a(this.e(34), (byte) -82);
                        if (param1 != 8799) {
                          ag.d((byte) 54);
                          return param2;
                        } else {
                          return param2;
                        }
                      } else {
                        ((k) ((Object) var8.field_p)).a(var8, false, (od) null);
                        rh.field_D = null;
                        mn.field_c = ig.field_L;
                        am.a(this.e(34), (byte) -82);
                        if (param1 != 8799) {
                          ag.d((byte) 54);
                          return param2;
                        } else {
                          return param2;
                        }
                      }
                    } else {
                      mn.field_c = ig.field_L;
                      am.a(this.e(34), (byte) -82);
                      if (param1 != 8799) {
                        ag.d((byte) 54);
                        return param2;
                      } else {
                        return param2;
                      }
                    }
                  } else {
                    mn.field_c = ig.field_L;
                    am.a(this.e(34), (byte) -82);
                    if (param1 != 8799) {
                      ag.d((byte) 54);
                      return param2;
                    } else {
                      return param2;
                    }
                  }
                }
              }
            }
          }
          if (var5 != 0) {
            L2: {
              this.c((byte) 47);
              if (ig.field_L != 0) {
                break L2;
              } else {
                if (mn.field_c != 0) {
                  this.a(j.field_c, param0, param3, rb.field_m, (ag) (this), param1 + -8799);
                  var10 = rh.field_D;
                  if (var10 != null) {
                    if (!(var10.field_p instanceof k)) {
                      rh.field_D = null;
                      break L2;
                    } else {
                      ((k) ((Object) var10.field_p)).a(var10, false, (od) null);
                      L3: {
                        rh.field_D = null;
                        mn.field_c = ig.field_L;
                        am.a(this.e(34), (byte) -82);
                        if (param1 == 8799) {
                          break L3;
                        } else {
                          ag.d((byte) 54);
                          break L3;
                        }
                      }
                      return param2;
                    }
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            mn.field_c = ig.field_L;
            am.a(this.e(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            } else {
              ag.d((byte) 54);
              return param2;
            }
          } else {
            if (ig.field_L != 0) {
              mn.field_c = ig.field_L;
              am.a(this.e(34), (byte) -82);
              if (param1 == 8799) {
                return param2;
              } else {
                ag.d((byte) 54);
                return param2;
              }
            } else {
              if (mn.field_c != 0) {
                this.a(j.field_c, param0, param3, rb.field_m, (ag) (this), param1 + -8799);
                var9 = rh.field_D;
                if (var9 != null) {
                  if (!(var9.field_p instanceof k)) {
                    rh.field_D = null;
                    mn.field_c = ig.field_L;
                    am.a(this.e(34), (byte) -82);
                    if (param1 == 8799) {
                      return param2;
                    } else {
                      ag.d((byte) 54);
                      return param2;
                    }
                  } else {
                    ((k) ((Object) var9.field_p)).a(var9, false, (od) null);
                    rh.field_D = null;
                    mn.field_c = ig.field_L;
                    am.a(this.e(34), (byte) -82);
                    if (param1 == 8799) {
                      return param2;
                    } else {
                      ag.d((byte) 54);
                      return param2;
                    }
                  }
                } else {
                  mn.field_c = ig.field_L;
                  am.a(this.e(34), (byte) -82);
                  if (param1 == 8799) {
                    return param2;
                  } else {
                    ag.d((byte) 54);
                    return param2;
                  }
                }
              } else {
                mn.field_c = ig.field_L;
                am.a(this.e(34), (byte) -82);
                if (param1 != 8799) {
                  ag.d((byte) 54);
                  return param2;
                } else {
                  return param2;
                }
              }
            }
          }
        } else {
          if (ig.field_L == 0) {
            if (mn.field_c != 0) {
              this.a(j.field_c, param0, param3, rb.field_m, (ag) (this), param1 + -8799);
              var11 = rh.field_D;
              if (var11 != null) {
                if (!(var11.field_p instanceof k)) {
                  rh.field_D = null;
                  mn.field_c = ig.field_L;
                  am.a(this.e(34), (byte) -82);
                  if (param1 == 8799) {
                    return param2;
                  } else {
                    ag.d((byte) 54);
                    return param2;
                  }
                } else {
                  ((k) ((Object) var11.field_p)).a(var11, false, (od) null);
                  rh.field_D = null;
                  mn.field_c = ig.field_L;
                  am.a(this.e(34), (byte) -82);
                  if (param1 == 8799) {
                    return param2;
                  } else {
                    ag.d((byte) 54);
                    return param2;
                  }
                }
              } else {
                mn.field_c = ig.field_L;
                am.a(this.e(34), (byte) -82);
                if (param1 == 8799) {
                  return param2;
                } else {
                  ag.d((byte) 54);
                  return param2;
                }
              }
            } else {
              mn.field_c = ig.field_L;
              am.a(this.e(34), (byte) -82);
              if (param1 == 8799) {
                return param2;
              } else {
                ag.d((byte) 54);
                return param2;
              }
            }
          } else {
            mn.field_c = ig.field_L;
            am.a(this.e(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            } else {
              ag.d((byte) 54);
              return param2;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        int var7;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var4 = this.f(0);
        var5_int = 0;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              this.a(param1, param0, (byte) 116, var5_int);
              var5_int++;
              if (var7 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var6 = 55 % ((87 - param2) / 35);
            var5 = ii.c((byte) 72);
            if (var5 != null) {
              gf.field_e.a(qh.field_q, var5, l.field_d, 94);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    public final String toString() {
        return this.a(122, new Hashtable(), 0, new StringBuilder()).toString();
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param2 > 42) {
          if (param3 == 0) {
            if (null == this.field_h) {
              return;
            } else {
              this.field_h.a(param0, param1, 15430, (ag) (this), true);
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_x = 49;
          if (param3 != 0) {
            return;
          } else {
            L0: {
              if (null != this.field_h) {
                this.field_h.a(param0, param1, 15430, (ag) (this), true);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    public static void d(int param0) {
        field_t = null;
        if (param0 != 5956) {
            ag.d((byte) -93);
            field_j = null;
            return;
        }
        field_j = null;
    }

    ag(String param0, mh param1) {
        this(param0, gf.field_e.field_h, param1);
    }

    final boolean a(StringBuilder param0, int param1, boolean param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                this.field_v = -27;
                break L1;
              }
            }
            if (param3.containsKey(this)) {
              discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param3.put(this, this);
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ag.RA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.b(param3, param0, 255, param2, param1)) {
                this.field_r = param6;
                break L1;
              } else {
                break L1;
              }
            }
            if (param4 == 110) {
              stackIn_7_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var8);

            stackIn_10_1 = new StringBuilder().append("ag.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 == 255) {
          if (param1 >= param4 + this.field_v) {
            if (this.field_m + param3 <= param0) {
              if (this.field_s + (this.field_v + param4) > param1) {
                if (param0 >= this.field_x + (this.field_m + param3)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    void c(byte param0) {
        int var2 = -78 % ((param0 - -27) / 39);
    }

    final void c(int param0) {
        this.a(this.field_s, this.field_m, param0 ^ param0, this.field_v, this.field_x);
    }

    String e(int param0) {
        if (param0 == 34) {
          if (!this.field_u) {
            return null;
          } else {
            return this.field_i;
          }
        } else {
          this.field_s = 88;
          if (!this.field_u) {
            return null;
          } else {
            return this.field_i;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3, ag param4, int param5) {
        try {
            this.field_r = param5;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ag.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    int f(int param0) {
        if (param0 != 0) {
            return -69;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 0) {
          this.field_m = -30;
          this.field_m = param1;
          this.field_v = param3;
          this.field_s = param0;
          this.field_x = param4;
          return;
        } else {
          this.field_m = param1;
          this.field_v = param3;
          this.field_s = param0;
          this.field_x = param4;
          return;
        }
    }

    StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param3, param2, false, param1)) {
                this.a(param2, param1, param3, 116);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 > 73) {
                break L2;
              } else {
                this.b(66, -8, -116, 93, -80);
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ag.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    boolean a(byte param0, ag param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= 0) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_l = (ce) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ag.LA(").append(param0).append(',');

            if (param1 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void a(ag param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param2 == 0) {
              L1: {
                var5_int = this.b(rb.field_m, j.field_c, 255, param1, param3) ? 1 : 0;
                if (this.field_u) {
                  stackIn_5_0 = 0;
                  break L1;
                } else {
                  stackIn_5_0 = 1;
                  break L1;
                }
              }
              L2: {


                if (var5_int != 0) {

                  stackIn_8_1 = 0;
                  break L2;
                } else {

                  stackIn_8_1 = 1;
                  break L2;
                }
              }
              L3: {
                if (stackIn_5_0 != stackIn_8_1) {
                  L4: {
                    stackIn_12_0 = this;

                    if (var5_int == 0) {
                      stackIn_13_0 = this;
                      stackIn_13_1 = 0;
                      break L4;
                    } else {
                      stackIn_13_0 = this;
                      stackIn_13_1 = 1;
                      break L4;
                    }
                  }
                  L5: {
                    ((ag) (this)).field_u = stackIn_13_1 != 0;
                    if (null == this.field_p) {
                      break L5;
                    } else {
                      if (!(this.field_p instanceof kg)) {
                        break L5;
                      } else {
                        ((kg) ((Object) this.field_p)).a(var5_int != 0, (byte) 98, (ag) (this));
                        break L3;
                      }
                    }
                  }
                  break L3;
                } else {
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("ag.W(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_v).append(",").append(this.field_m).append(" ").append(this.field_s).append("x").append(this.field_x);
              if (this.field_n == null) {
                break L1;
              } else {
                discarded$1 = param2.append(" text=\"").append(this.field_n).append('"');
                break L1;
              }
            }
            L2: {
              if (this.field_u) {
                discarded$2 = param2.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.g(-9015)) {
                discarded$3 = param2.append(" focused");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var5_int = 99 % ((-49 - param3) / 58);
              if (null != this.field_h) {
                L5: {
                  discarded$4 = param2.append(" renderer=");
                  if (this.field_h instanceof ag) {
                    break L5;
                  } else {
                    discarded$5 = param2.append(this.field_h);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                param2 = this.a(123, param1, 1 + param0, param2);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (this.field_p == null) {
                break L6;
              } else {
                L7: {
                  discarded$6 = param2.append(" listener=");
                  if (this.field_p instanceof ag) {
                    break L7;
                  } else {
                    discarded$7 = param2.append(this.field_p);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                param2 = this.a(97, param1, 1 + param0, param2);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("ag.UA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ',' + param3 + ')');
        }
    }

    boolean a(int param0, int param1, int param2, int param3, ag param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var8);

            stackIn_7_1 = new StringBuilder().append("ag.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    protected ag() {
        this.field_o = 0;
        this.field_q = 0;
    }

    ag(String param0, nn param1, mh param2) {
        RuntimeException runtimeException = null;
        mi var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_o = 0;
        this.field_q = 0;
        try {
          L0: {
            L1: {
              this.field_h = param1;
              this.field_p = param2;
              this.field_n = param0;
              if (!(this.field_h instanceof mi)) {
                break L1;
              } else {
                var4 = (mi) ((Object) this.field_h);
                this.field_s = var4.a(false, (ag) (this));
                this.field_x = var4.b((ag) (this), (byte) -79);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ag.<init>(");

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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
    }

    ag(int param0, int param1, int param2, int param3, nn param4, mh param5) {
        this.field_o = 0;
        this.field_q = 0;
        try {
            this.field_m = param1;
            this.field_v = param0;
            this.field_x = param3;
            this.field_s = param2;
            this.field_p = param5;
            this.field_h = param4;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ag.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 274) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_u = false;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("ag.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final boolean a(int param0, char param1, int param2) {
        int var4;
        if (this.g(-9015)) {
          if (!this.a(274, (ag) (this), param0, param1)) {
            if (param2 == 80) {
              var4 = param0;
              if (var4 == 80) {
                return this.a((byte) -93, (ag) (this));
              } else {
                return false;
              }
            } else {
              field_t = (td) null;
              var4 = param0;
              if (var4 == 80) {
                return this.a((byte) -93, (ag) (this));
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          if (param2 == 80) {
            var4 = param0;
            if (var4 == 80) {
              return this.a((byte) -93, (ag) (this));
            } else {
              return false;
            }
          } else {
            field_t = (td) null;
            var4 = param0;
            if (var4 != 80) {
              return false;
            } else {
              return this.a((byte) -93, (ag) (this));
            }
          }
        }
    }

    static {
        field_k = -1;
        field_j = "Rating: <col=ffffff><%0>";
        field_w = 0.0f;
    }
}
