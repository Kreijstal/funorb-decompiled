/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class wj extends bw {
    int field_v;
    static String field_x;
    static String field_r;
    int field_s;
    int field_q;
    String field_h;
    boolean field_t;
    int field_p;
    int field_m;
    static int[] field_n;
    static boolean field_g;
    String field_w;
    static String field_i;
    int field_u;
    qda field_f;
    vv field_j;
    int field_o;
    static int[] field_l;
    pl field_k;

    String c(byte param0) {
        if (param0 == 16) {
          if (!this.field_t) {
            return null;
          } else {
            return this.field_h;
          }
        } else {
          field_r = (String) null;
          if (!this.field_t) {
            return null;
          } else {
            return this.field_h;
          }
        }
    }

    public final String toString() {
        return this.a(new Hashtable(), 0, (byte) 117, new StringBuilder()).toString();
    }

    StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
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
              if (param2 > 20) {
                break L1;
              } else {
                this.field_m = 90;
                break L1;
              }
            }
            L2: {
              if (this.a(param0, param1, param3, (byte) -104)) {
                this.a(9, param0, param3, param1);
                break L2;
              } else {
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

            stackIn_9_1 = new StringBuilder().append("wj.V(");

            if (param0 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    void a(int param0, int param1, wj param2, int param3) {
        int var5_int = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              var5_int = this.a(gd.field_m, mk.field_p, 0, param0, param1) ? 1 : 0;
              if ((this.field_t ? 1 : 0) == var5_int) {
                break L1;
              } else {
                L2: {
                  stackIn_3_0 = this;

                  if (var5_int == 0) {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 0;
                    break L2;
                  } else {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 1;
                    break L2;
                  }
                }
                ((wj) (this)).field_t = stackIn_4_1 != 0;
                if (this.field_k == null) {
                  break L1;
                } else {
                  if (!(this.field_k instanceof aaa)) {
                    break L1;
                  } else {
                    ((aaa) ((Object) this.field_k)).a(-14301, var5_int != 0, (wj) (this));
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (param3 == 20) {
                break L3;
              } else {
                field_x = (String) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("wj.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
    }

    wj(String param0, pl param1) {
        this(param0, fda.field_i.field_i, param1);
    }

    final boolean a(boolean param0, int param1, int param2, int param3) {
        int var5;
        int var7;
        raa var8;
        raa var9;
        raa var10;
        raa var11;
        L0: {
          var7 = BachelorFridge.field_y;
          this.a(param1, param2, (wj) (this), param3 ^ 6393);
          var5 = this.e(1023) ? 1 : 0;
          if (!param0) {
            if (var5 != 0) {
              if (lf.field_c != 0) {
                this.f(31);
                if (var7 == 0) {
                  uga.field_y = fia.field_t;
                  if (param3 != 6381) {
                    this.a((byte) -90, -84, 109, 31);
                    ji.a(param3 + -6496, this.c((byte) 16));
                    return param0;
                  } else {
                    ji.a(param3 + -6496, this.c((byte) 16));
                    return param0;
                  }
                } else {
                  if (0 == vc.field_a) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      break L0;
                    } else {
                      this.a(gd.field_m, 13, mk.field_p, vc.field_a, param2, (wj) (this), param1);
                      break L0;
                    }
                  }
                }
              } else {
                uga.field_y = fia.field_t;
                if (param3 == 6381) {
                  ji.a(param3 + -6496, this.c((byte) 16));
                  return param0;
                } else {
                  this.a((byte) -90, -84, 109, 31);
                  ji.a(param3 + -6496, this.c((byte) 16));
                  return param0;
                }
              }
            } else {
              uga.field_y = fia.field_t;
              if (param3 != 6381) {
                this.a((byte) -90, -84, 109, 31);
                ji.a(param3 + -6496, this.c((byte) 16));
                return param0;
              } else {
                ji.a(param3 + -6496, this.c((byte) 16));
                return param0;
              }
            }
          } else {
            if (0 == vc.field_a) {
              break L0;
            } else {
              if (var5 == 0) {
                break L0;
              } else {
                this.a(gd.field_m, 13, mk.field_p, vc.field_a, param2, (wj) (this), param1);
                break L0;
              }
            }
          }
        }
        if (0 != lf.field_c) {
          L1: {
            if (!this.b(nfa.field_a, -7375, param1, lf.field_c, param2, (wj) (this), jc.field_r)) {
              break L1;
            } else {
              param0 = false;
              if (var7 != 0) {
                break L1;
              } else {
                L2: {
                  if (fia.field_t != 0) {
                    break L2;
                  } else {
                    if (uga.field_y != 0) {
                      this.a(param1, mk.field_p, (byte) -101, (wj) (this), gd.field_m, param2);
                      var9 = cea.field_b;
                      if (var9 == null) {
                        break L2;
                      } else {
                        if (!(var9.field_k instanceof mo)) {
                          cea.field_b = null;
                          uga.field_y = fia.field_t;
                          if (param3 != 6381) {
                            this.a((byte) -90, -84, 109, 31);
                            ji.a(param3 + -6496, this.c((byte) 16));
                            return param0;
                          } else {
                            ji.a(param3 + -6496, this.c((byte) 16));
                            return param0;
                          }
                        } else {
                          ((mo) ((Object) var9.field_k)).a((re) null, var9, (byte) 88);
                          cea.field_b = null;
                          uga.field_y = fia.field_t;
                          if (param3 != 6381) {
                            this.a((byte) -90, -84, 109, 31);
                            ji.a(param3 + -6496, this.c((byte) 16));
                            return param0;
                          } else {
                            ji.a(param3 + -6496, this.c((byte) 16));
                            return param0;
                          }
                        }
                      }
                    } else {
                      uga.field_y = fia.field_t;
                      if (param3 != 6381) {
                        this.a((byte) -90, -84, 109, 31);
                        ji.a(param3 + -6496, this.c((byte) 16));
                        return param0;
                      } else {
                        ji.a(param3 + -6496, this.c((byte) 16));
                        return param0;
                      }
                    }
                  }
                }
                uga.field_y = fia.field_t;
                if (param3 != 6381) {
                  this.a((byte) -90, -84, 109, 31);
                  ji.a(param3 + -6496, this.c((byte) 16));
                  return param0;
                } else {
                  ji.a(param3 + -6496, this.c((byte) 16));
                  return param0;
                }
              }
            }
          }
          if (var5 != 0) {
            L3: {
              this.f(param3 + -6350);
              if (fia.field_t != 0) {
                break L3;
              } else {
                if (uga.field_y != 0) {
                  this.a(param1, mk.field_p, (byte) -101, (wj) (this), gd.field_m, param2);
                  var11 = cea.field_b;
                  if (var11 == null) {
                    break L3;
                  } else {
                    if (!(var11.field_k instanceof mo)) {
                      L4: {
                        cea.field_b = null;
                        uga.field_y = fia.field_t;
                        if (param3 == 6381) {
                          break L4;
                        } else {
                          this.a((byte) -90, -84, 109, 31);
                          break L4;
                        }
                      }
                      ji.a(param3 + -6496, this.c((byte) 16));
                      return param0;
                    } else {
                      ((mo) ((Object) var11.field_k)).a((re) null, var11, (byte) 88);
                      L5: {
                        cea.field_b = null;
                        uga.field_y = fia.field_t;
                        if (param3 == 6381) {
                          break L5;
                        } else {
                          this.a((byte) -90, -84, 109, 31);
                          break L5;
                        }
                      }
                      ji.a(param3 + -6496, this.c((byte) 16));
                      return param0;
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            uga.field_y = fia.field_t;
            if (param3 == 6381) {
              ji.a(param3 + -6496, this.c((byte) 16));
              return param0;
            } else {
              this.a((byte) -90, -84, 109, 31);
              ji.a(param3 + -6496, this.c((byte) 16));
              return param0;
            }
          } else {
            L6: {
              if (fia.field_t != 0) {
                break L6;
              } else {
                if (uga.field_y != 0) {
                  this.a(param1, mk.field_p, (byte) -101, (wj) (this), gd.field_m, param2);
                  var10 = cea.field_b;
                  if (var10 == null) {
                    break L6;
                  } else {
                    if (!(var10.field_k instanceof mo)) {
                      cea.field_b = null;
                      uga.field_y = fia.field_t;
                      if (param3 != 6381) {
                        this.a((byte) -90, -84, 109, 31);
                        ji.a(param3 + -6496, this.c((byte) 16));
                        return param0;
                      } else {
                        ji.a(param3 + -6496, this.c((byte) 16));
                        return param0;
                      }
                    } else {
                      ((mo) ((Object) var10.field_k)).a((re) null, var10, (byte) 88);
                      cea.field_b = null;
                      uga.field_y = fia.field_t;
                      if (param3 == 6381) {
                        ji.a(param3 + -6496, this.c((byte) 16));
                        return param0;
                      } else {
                        this.a((byte) -90, -84, 109, 31);
                        ji.a(param3 + -6496, this.c((byte) 16));
                        return param0;
                      }
                    }
                  }
                } else {
                  uga.field_y = fia.field_t;
                  if (param3 != 6381) {
                    this.a((byte) -90, -84, 109, 31);
                    ji.a(param3 + -6496, this.c((byte) 16));
                    return param0;
                  } else {
                    ji.a(param3 + -6496, this.c((byte) 16));
                    return param0;
                  }
                }
              }
            }
            uga.field_y = fia.field_t;
            if (param3 == 6381) {
              ji.a(param3 + -6496, this.c((byte) 16));
              return param0;
            } else {
              this.a((byte) -90, -84, 109, 31);
              ji.a(param3 + -6496, this.c((byte) 16));
              return param0;
            }
          }
        } else {
          L7: {
            if (fia.field_t != 0) {
              break L7;
            } else {
              if (uga.field_y != 0) {
                this.a(param1, mk.field_p, (byte) -101, (wj) (this), gd.field_m, param2);
                var8 = cea.field_b;
                if (var8 == null) {
                  break L7;
                } else {
                  if (!(var8.field_k instanceof mo)) {
                    cea.field_b = null;
                    break L7;
                  } else {
                    ((mo) ((Object) var8.field_k)).a((re) null, var8, (byte) 88);
                    cea.field_b = null;
                    break L7;
                  }
                }
              } else {
                break L7;
              }
            }
          }
          L8: {
            uga.field_y = fia.field_t;
            if (param3 == 6381) {
              break L8;
            } else {
              this.a((byte) -90, -84, 109, 31);
              break L8;
            }
          }
          ji.a(param3 + -6496, this.c((byte) 16));
          return param0;
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var5;
        if (param2 == 0) {
          if (this.field_f == null) {
            var5 = -22 % ((param0 - -20) / 54);
            return;
          } else {
            this.field_f.a(param3, (wj) (this), 32679, param1, true);
            var5 = -22 % ((param0 - -20) / 54);
            return;
          }
        } else {
          var5 = -22 % ((param0 - -20) / 54);
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
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_s).append(",").append(this.field_v).append(" ").append(this.field_p).append("x").append(this.field_q);
              if (null != this.field_w) {
                discarded$1 = param2.append(" text=\"").append(this.field_w).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_t) {
                discarded$2 = param2.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!this.e(1023)) {
                break L3;
              } else {
                discarded$3 = param2.append(" focused");
                break L3;
              }
            }
            L4: {
              if (this.field_f != null) {
                L5: {
                  discarded$4 = param2.append(" renderer=");
                  if (this.field_f instanceof wj) {
                    break L5;
                  } else {
                    discarded$5 = param2.append(this.field_f);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                param2 = this.a(param1, 1 + param3, (byte) 22, param2);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (null != this.field_k) {
                L7: {
                  discarded$6 = param2.append(" listener=");
                  if (!(this.field_k instanceof wj)) {
                    break L7;
                  } else {
                    param2 = this.a(param1, param3 - -1, (byte) 80, param2);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                discarded$7 = param2.append(this.field_k);
                break L6;
              } else {
                break L6;
              }
            }
            L8: {
              if (param0 == 9) {
                break L8;
              } else {
                this.a((Hashtable) null, 66, (byte) -12, (StringBuilder) null);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5);

            stackIn_25_1 = new StringBuilder().append("wj.LB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ',' + param3 + ')');
        }
    }

    final static eka a(vr param0, boolean param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        eka stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = param0.b(param2, 0);
            var3 = var4;
            if (var4 != null) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  wj.a((vr) null, false, -62);
                  break L1;
                }
              }
              stackIn_6_0 = new eka(var4);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("wj.IB(");

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
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    int b(int param0) {
        if (param0 > -3) {
            this.a(-50, -110, (byte) 54, 56, -56);
            return 0;
        }
        return 0;
    }

    void f(int param0) {
        if (param0 != 31) {
            this.field_f = (qda) null;
        }
    }

    final static kv[] a(int param0, int[] param1) {
        kv[] var2 = null;
        RuntimeException var2_ref = null;
        kv[] var3 = null;
        kv[] stackIn_2_0 = null;
        kv[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new kv[14];
            var2 = var3;
            var3[1] = qs.field_l[1][param1[1]];
            var3[0] = qs.field_l[0][param1[0]];
            var3[2] = qs.field_l[2][param1[2]];
            var3[3] = qs.field_l[3][param1[3]];
            var3[5] = qs.field_l[5][param1[5]];
            if (param0 == -863) {
              var3[8] = qs.field_l[8][param1[8]];
              var3[4] = qs.field_l[4][param1[4]];
              var3[9] = qs.field_l[9][param1[9]];
              var3[10] = qs.field_l[10][param1[10]];
              var3[7] = qs.field_l[7][param1[7]];
              var3[6] = qs.field_l[6][param1[6]];
              var3[11] = qs.field_l[11][param1[8]];
              var3[12] = qs.field_l[12][param1[9]];
              var3[13] = qs.field_l[13][param1[10]];
              stackIn_4_0 = (kv[]) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (kv[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2_ref);

            stackIn_7_1 = new StringBuilder().append("wj.DB(").append(param0).append(',');

            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
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
            if (param1 == 13) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var8);

            stackIn_7_1 = new StringBuilder().append("wj.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final void d(int param0) {
        this.a(this.field_s, this.field_q, (byte) 59, this.field_p, this.field_v);
        if (param0 != 6) {
            this.a('ﾚ', (byte) -65, 19);
        }
    }

    boolean a(int param0, int param1, char param2, wj param3) {
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
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                this.f(-104);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("wj.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean e(int param0) {
        if (param0 != 1023) {
            this.field_t = true;
            return false;
        }
        return false;
    }

    final boolean a(Hashtable param0, int param1, StringBuilder param2, byte param3) {
        StringBuilder discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 64 / ((param3 - -39) / 34);
            if (param0.containsKey(this)) {
              discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param0.put(this, this);
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("wj.FB(");

            if (param0 == null) {
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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(char param0, byte param1, int param2) {
        int var4;
        if (this.e(1023)) {
          if (!this.a(param1 + 3, param2, param0, (wj) (this))) {
            var4 = param2;
            if (80 != var4) {
              if (param1 != 7) {
                field_g = true;
                return false;
              } else {
                return false;
              }
            } else {
              return this.a((wj) (this), -117);
            }
          } else {
            return true;
          }
        } else {
          var4 = param2;
          if (80 != var4) {
            if (param1 != 7) {
              field_g = true;
              return false;
            } else {
              return false;
            }
          } else {
            return this.a((wj) (this), -117);
          }
        }
    }

    void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_u = 0;
              if (param2 == -101) {
                break L1;
              } else {
                this.a(49, -90, 17, 95, -112, (wj) null, -44);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wj.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        if (param2 == 0) {
          if (param3 - -this.field_s <= param1) {
            if (param4 + this.field_v > param0) {
              return false;
            } else {
              L0: {
                L1: {
                  if (this.field_p + param3 - -this.field_s <= param1) {
                    break L1;
                  } else {
                    if (param0 >= param4 - (-this.field_v + -this.field_q)) {
                      break L1;
                    } else {
                      stackIn_18_0 = 1;
                      break L0;
                    }
                  }
                }
                stackIn_18_0 = 0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          this.toString();
          if (param3 - -this.field_s <= param1) {
            if (param4 + this.field_v <= param0) {
              if (this.field_p + param3 - -this.field_s > param1) {
                if (param0 >= param4 - (-this.field_v + -this.field_q)) {
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
        }
    }

    public static void c(int param0) {
        field_n = null;
        field_l = null;
        field_r = null;
        field_x = null;
        field_i = null;
        if (param0 != 1023) {
            wj.a((vr) null, true, -12);
        }
    }

    boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
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
              if (this.a(param6, param0, 0, param2, param4)) {
                this.field_u = param3;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 == -7375) {
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

            stackIn_10_1 = new StringBuilder().append("wj.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = BachelorFridge.field_y;
        var4 = this.b(param2 + -20156);
        if (param2 == 20077) {
          var5_int = 0;
          L0: while (true) {
            L1: {
              if (var5_int > var4) {
                break L1;
              } else {
                this.a((byte) 106, param1, var5_int, param0);
                var5_int++;
                if (var6 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            var5 = er.f(75);
            if (var5 != null) {
              fda.field_i.a((byte) -49, jl.field_s, eaa.field_b, var5);
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    boolean a(wj param0, int param1) {
        RuntimeException var3 = null;
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
            if (param1 < -78) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("wj.W(");

            if (param0 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    void a(int param0, int param1, byte param2, int param3, int param4) {
        this.field_q = param1;
        this.field_v = param4;
        this.field_p = param3;
        this.field_s = param0;
        if (param2 != 59) {
            this.b(-45);
        }
    }

    protected wj() {
        this.field_m = 0;
        this.field_o = 0;
    }

    wj(String param0, qda param1, pl param2) {
        RuntimeException runtimeException = null;
        qka var4 = null;
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
        this.field_m = 0;
        this.field_o = 0;
        try {
          L0: {
            L1: {
              this.field_w = param0;
              this.field_k = param2;
              this.field_f = param1;
              if (!(this.field_f instanceof qka)) {
                break L1;
              } else {
                var4 = (qka) ((Object) this.field_f);
                this.field_p = var4.a(-21928, (wj) (this));
                this.field_q = var4.c((wj) (this), false);
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

            stackIn_6_1 = new StringBuilder().append("wj.<init>(");

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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
    }

    wj(int param0, int param1, int param2, int param3, qda param4, pl param5) {
        this.field_m = 0;
        this.field_o = 0;
        try {
            this.field_k = param5;
            this.field_q = param3;
            this.field_f = param4;
            this.field_v = param1;
            this.field_s = param0;
            this.field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "wj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = "On";
        field_g = true;
        field_n = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_l = new int[]{65, 85, 85, 0, 75, 85};
        field_r = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
