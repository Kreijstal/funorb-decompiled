/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class vg extends gi {
    em field_s;
    int field_t;
    int field_y;
    int field_k;
    String field_v;
    int field_m;
    static int field_i;
    fd field_u;
    int field_w;
    static String field_x;
    int field_o;
    int field_q;
    static int[] field_r;
    cg field_l;
    String field_p;
    static hm field_j;
    static he[] field_h;
    boolean field_n;

    final boolean a(Hashtable param0, StringBuilder param1, int param2, int param3) {
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
            var5_int = -8 % ((param3 - -11) / 48);
            if (!param0.containsKey(this)) {
              param0.put(this, this);
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$1 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("vg.QB(");

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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    boolean a(int param0, char param1, vg param2, int param3) {
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
            if (param3 > 63) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.a(false);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("vg.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(int param0, int param1, byte param2, int param3, vg param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 >= 43) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_u = (fd) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("vg.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var4 = this.d(3);
        var5_int = param1;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              this.a(param0, var5_int, (byte) -21, param2);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var5 = hf.g(param1 ^ -1);
          if (var5 == null) {
            return;
          } else {
            ja.field_Q.a(pi.field_Q, var5, -126, oh.field_e);
            return;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        vg var7;
        this.field_o = param2;
        this.field_w = param4;
        this.field_k = param1;
        this.field_m = param0;
        if (param3 == 16535) {
          return;
        } else {
          var7 = (vg) null;
          this.a(125, -80, 21, (vg) null, -78, false);
          return;
        }
    }

    final static void d(byte param0) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 103) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_x = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = of.field_w;
                        var1 = var5;
                        var2 = 0;
                        var3 = var5.length;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 <= var2) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        incrementValue$8 = var2;
                        var2++;
                        var5[incrementValue$8] = 0;
                        incrementValue$9 = var2;
                        var2++;
                        var5[incrementValue$9] = 0;
                        incrementValue$10 = var2;
                        var2++;
                        var5[incrementValue$10] = 0;
                        incrementValue$11 = var2;
                        var2++;
                        var5[incrementValue$11] = 0;
                        incrementValue$12 = var2;
                        var2++;
                        var5[incrementValue$12] = 0;
                        incrementValue$13 = var2;
                        var2++;
                        var5[incrementValue$13] = 0;
                        incrementValue$14 = var2;
                        var2++;
                        var5[incrementValue$14] = 0;
                        incrementValue$15 = var2;
                        var2++;
                        var5[incrementValue$15] = 0;
                        if (var4 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw ie.a((Throwable) ((Object) var1_ref), "vg.OB(" + param0 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    boolean a(boolean param0, vg param1) {
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
            if (!param0) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_v = (String) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vg.M(").append(param0).append(',');

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
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static vi a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        vi stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -97) {
                break L1;
              } else {
                field_x = (String) null;
                break L1;
              }
            }
            var2_int = param1.length();
            var3 = 0;
            L2: while (true) {
              L3: {
                if (var3 >= var2_int) {
                  break L3;
                } else {
                  var4 = param1.charAt(var3);
                  if (48 <= var4) {
                    if (var4 <= 57) {
                      var3++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    } else {
                      stackIn_9_0 = null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              stackIn_12_0 = dh.field_H;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("vg.IB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vi) ((Object) stackIn_9_0);
        } else {
          return stackIn_12_0;
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5;
        pi var6;
        int var7;
        pi var8;
        pi var9;
        pi var10;
        pi var11;
        pi var12;
        pi var14;
        pi var15;
        pi var16;
        pi var17;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.a((vg) (this), param0, param1, (byte) -128);
        var5 = this.a(true) ? 1 : 0;
        if (!param2) {
          if (var5 != 0) {
            if (-1 == (mh.field_f ^ -1)) {
              i.field_a = db.field_a;
              g.a(this.e(param3 ^ -125), param3 ^ param3);
              return param2;
            } else {
              this.c((byte) 61);
              i.field_a = db.field_a;
              g.a(this.e(param3 ^ -125), param3 ^ param3);
              return param2;
            }
          } else {
            i.field_a = db.field_a;
            g.a(this.e(param3 ^ -125), param3 ^ param3);
            return param2;
          }
        } else {
          if (ma.field_sb != 0) {
            if (var5 != 0) {
              this.a(ck.field_c, ob.field_g, (byte) 89, ma.field_sb, (vg) (this), param1, param0);
              if (0 != mh.field_f) {
                L0: {
                  L1: {
                    if (!this.a(ih.field_R, (vg) (this), mh.field_f, (byte) 115, ae.field_gb, param0, param1)) {
                      break L1;
                    } else {
                      param2 = false;
                      if (var7 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (var5 == 0) {
                    break L0;
                  } else {
                    L2: {
                      this.c((byte) 117);
                      if (-1 != (db.field_a ^ -1)) {
                        break L2;
                      } else {
                        if (i.field_a == 0) {
                          break L2;
                        } else {
                          L3: {
                            this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                            var16 = oh.field_b;
                            var6 = var16;
                            if (var16 == null) {
                              break L3;
                            } else {
                              L4: {
                                if (var16.field_u instanceof hk) {
                                  ((hk) ((Object) var16.field_u)).a((byte) 70, var16, (jk) null);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                              oh.field_b = null;
                              break L3;
                            }
                          }
                          if (var7 == 0) {
                            break L2;
                          } else {
                            if (var5 == 0) {
                              break L2;
                            } else {
                              if (-1 != (mh.field_f ^ -1)) {
                                this.c((byte) 61);
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                    i.field_a = db.field_a;
                    g.a(this.e(param3 ^ -125), param3 ^ param3);
                    return param2;
                  }
                }
                if (-1 == (db.field_a ^ -1)) {
                  if (i.field_a != 0) {
                    L5: {
                      this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                      var17 = oh.field_b;
                      var6 = var17;
                      if (var17 == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var17.field_u instanceof hk) {
                            ((hk) ((Object) var17.field_u)).a((byte) 70, var17, (jk) null);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        oh.field_b = null;
                        break L5;
                      }
                    }
                    if (var7 != 0) {
                      if (var5 != 0) {
                        if (-1 == (mh.field_f ^ -1)) {
                          i.field_a = db.field_a;
                          g.a(this.e(param3 ^ -125), param3 ^ param3);
                          return param2;
                        } else {
                          this.c((byte) 61);
                          i.field_a = db.field_a;
                          g.a(this.e(param3 ^ -125), param3 ^ param3);
                          return param2;
                        }
                      } else {
                        i.field_a = db.field_a;
                        g.a(this.e(param3 ^ -125), param3 ^ param3);
                        return param2;
                      }
                    } else {
                      i.field_a = db.field_a;
                      g.a(this.e(param3 ^ -125), param3 ^ param3);
                      return param2;
                    }
                  } else {
                    i.field_a = db.field_a;
                    g.a(this.e(param3 ^ -125), param3 ^ param3);
                    return param2;
                  }
                } else {
                  i.field_a = db.field_a;
                  g.a(this.e(param3 ^ -125), param3 ^ param3);
                  return param2;
                }
              } else {
                L7: {
                  if (-1 != (db.field_a ^ -1)) {
                    break L7;
                  } else {
                    if (i.field_a == 0) {
                      break L7;
                    } else {
                      L8: {
                        this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                        var15 = oh.field_b;
                        var6 = var15;
                        if (var15 == null) {
                          break L8;
                        } else {
                          L9: {
                            if (var15.field_u instanceof hk) {
                              ((hk) ((Object) var15.field_u)).a((byte) 70, var15, (jk) null);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          oh.field_b = null;
                          break L8;
                        }
                      }
                      if (var7 == 0) {
                        break L7;
                      } else {
                        if (var5 == 0) {
                          break L7;
                        } else {
                          if (-1 != (mh.field_f ^ -1)) {
                            this.c((byte) 61);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                }
                i.field_a = db.field_a;
                g.a(this.e(param3 ^ -125), param3 ^ param3);
                return param2;
              }
            } else {
              if (0 != mh.field_f) {
                L10: {
                  if (!this.a(ih.field_R, (vg) (this), mh.field_f, (byte) 115, ae.field_gb, param0, param1)) {
                    break L10;
                  } else {
                    param2 = false;
                    if (var7 == 0) {
                      if (-1 == (db.field_a ^ -1)) {
                        if (i.field_a != 0) {
                          L11: {
                            this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                            var14 = oh.field_b;
                            if (var14 == null) {
                              break L11;
                            } else {
                              L12: {
                                if (var14.field_u instanceof hk) {
                                  ((hk) ((Object) var14.field_u)).a((byte) 70, var14, (jk) null);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              oh.field_b = null;
                              break L11;
                            }
                          }
                          if (var7 != 0) {
                            if (var5 != 0) {
                              if (-1 != (mh.field_f ^ -1)) {
                                this.c((byte) 61);
                                i.field_a = db.field_a;
                                g.a(this.e(param3 ^ -125), param3 ^ param3);
                                return param2;
                              } else {
                                i.field_a = db.field_a;
                                g.a(this.e(param3 ^ -125), param3 ^ param3);
                                return param2;
                              }
                            } else {
                              i.field_a = db.field_a;
                              g.a(this.e(param3 ^ -125), param3 ^ param3);
                              return param2;
                            }
                          } else {
                            i.field_a = db.field_a;
                            g.a(this.e(param3 ^ -125), param3 ^ param3);
                            return param2;
                          }
                        } else {
                          i.field_a = db.field_a;
                          g.a(this.e(param3 ^ -125), param3 ^ param3);
                          return param2;
                        }
                      } else {
                        i.field_a = db.field_a;
                        g.a(this.e(param3 ^ -125), param3 ^ param3);
                        return param2;
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                L13: {
                  if (var5 == 0) {
                    break L13;
                  } else {
                    this.c((byte) 117);
                    break L13;
                  }
                }
                if (-1 == (db.field_a ^ -1)) {
                  if (i.field_a != 0) {
                    L14: {
                      this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                      var12 = oh.field_b;
                      if (var12 == null) {
                        break L14;
                      } else {
                        L15: {
                          if (var12.field_u instanceof hk) {
                            ((hk) ((Object) var12.field_u)).a((byte) 70, var12, (jk) null);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        oh.field_b = null;
                        break L14;
                      }
                    }
                    if (var7 != 0) {
                      if (var5 != 0) {
                        if (-1 != (mh.field_f ^ -1)) {
                          this.c((byte) 61);
                          i.field_a = db.field_a;
                          g.a(this.e(param3 ^ -125), param3 ^ param3);
                          return param2;
                        } else {
                          i.field_a = db.field_a;
                          g.a(this.e(param3 ^ -125), param3 ^ param3);
                          return param2;
                        }
                      } else {
                        i.field_a = db.field_a;
                        g.a(this.e(param3 ^ -125), param3 ^ param3);
                        return param2;
                      }
                    } else {
                      i.field_a = db.field_a;
                      g.a(this.e(param3 ^ -125), param3 ^ param3);
                      return param2;
                    }
                  } else {
                    i.field_a = db.field_a;
                    g.a(this.e(param3 ^ -125), param3 ^ param3);
                    return param2;
                  }
                } else {
                  i.field_a = db.field_a;
                  g.a(this.e(param3 ^ -125), param3 ^ param3);
                  return param2;
                }
              } else {
                L16: {
                  if (-1 != (db.field_a ^ -1)) {
                    break L16;
                  } else {
                    if (i.field_a == 0) {
                      break L16;
                    } else {
                      L17: {
                        this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                        var11 = oh.field_b;
                        if (var11 == null) {
                          break L17;
                        } else {
                          L18: {
                            if (var11.field_u instanceof hk) {
                              ((hk) ((Object) var11.field_u)).a((byte) 70, var11, (jk) null);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          oh.field_b = null;
                          break L17;
                        }
                      }
                      if (var7 == 0) {
                        break L16;
                      } else {
                        if (var5 == 0) {
                          break L16;
                        } else {
                          if (-1 != (mh.field_f ^ -1)) {
                            this.c((byte) 61);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                  }
                }
                i.field_a = db.field_a;
                g.a(this.e(param3 ^ -125), param3 ^ param3);
                return param2;
              }
            }
          } else {
            if (0 != mh.field_f) {
              L19: {
                L20: {
                  if (!this.a(ih.field_R, (vg) (this), mh.field_f, (byte) 115, ae.field_gb, param0, param1)) {
                    break L20;
                  } else {
                    param2 = false;
                    if (var7 == 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                if (var5 == 0) {
                  break L19;
                } else {
                  L21: {
                    this.c((byte) 117);
                    if (-1 != (db.field_a ^ -1)) {
                      break L21;
                    } else {
                      if (i.field_a == 0) {
                        break L21;
                      } else {
                        L22: {
                          this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                          var9 = oh.field_b;
                          if (var9 == null) {
                            break L22;
                          } else {
                            L23: {
                              if (var9.field_u instanceof hk) {
                                ((hk) ((Object) var9.field_u)).a((byte) 70, var9, (jk) null);
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            oh.field_b = null;
                            break L22;
                          }
                        }
                        if (var7 == 0) {
                          break L21;
                        } else {
                          if (var5 == 0) {
                            break L21;
                          } else {
                            if (-1 != (mh.field_f ^ -1)) {
                              this.c((byte) 61);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                    }
                  }
                  i.field_a = db.field_a;
                  g.a(this.e(param3 ^ -125), param3 ^ param3);
                  return param2;
                }
              }
              if (-1 == (db.field_a ^ -1)) {
                if (i.field_a != 0) {
                  L24: {
                    this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                    var10 = oh.field_b;
                    if (var10 == null) {
                      break L24;
                    } else {
                      L25: {
                        if (var10.field_u instanceof hk) {
                          ((hk) ((Object) var10.field_u)).a((byte) 70, var10, (jk) null);
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      oh.field_b = null;
                      break L24;
                    }
                  }
                  if (var7 != 0) {
                    if (var5 != 0) {
                      if (-1 == (mh.field_f ^ -1)) {
                        i.field_a = db.field_a;
                        g.a(this.e(param3 ^ -125), param3 ^ param3);
                        return param2;
                      } else {
                        this.c((byte) 61);
                        i.field_a = db.field_a;
                        g.a(this.e(param3 ^ -125), param3 ^ param3);
                        return param2;
                      }
                    } else {
                      i.field_a = db.field_a;
                      g.a(this.e(param3 ^ -125), param3 ^ param3);
                      return param2;
                    }
                  } else {
                    i.field_a = db.field_a;
                    g.a(this.e(param3 ^ -125), param3 ^ param3);
                    return param2;
                  }
                } else {
                  i.field_a = db.field_a;
                  g.a(this.e(param3 ^ -125), param3 ^ param3);
                  return param2;
                }
              } else {
                i.field_a = db.field_a;
                g.a(this.e(param3 ^ -125), param3 ^ param3);
                return param2;
              }
            } else {
              L26: {
                if (-1 != (db.field_a ^ -1)) {
                  break L26;
                } else {
                  if (i.field_a == 0) {
                    break L26;
                  } else {
                    L27: {
                      this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                      var8 = oh.field_b;
                      if (var8 == null) {
                        break L27;
                      } else {
                        L28: {
                          if (var8.field_u instanceof hk) {
                            ((hk) ((Object) var8.field_u)).a((byte) 70, var8, (jk) null);
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        oh.field_b = null;
                        break L27;
                      }
                    }
                    if (var7 == 0) {
                      break L26;
                    } else {
                      if (var5 == 0) {
                        break L26;
                      } else {
                        if (-1 != (mh.field_f ^ -1)) {
                          this.c((byte) 61);
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                    }
                  }
                }
              }
              i.field_a = db.field_a;
              g.a(this.e(param3 ^ -125), param3 ^ param3);
              return param2;
            }
          }
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4) {
        if (!param2) {
          if (param1 + this.field_o <= param3) {
            if (param4 >= param0 + this.field_m) {
              if (param3 < this.field_o + param1 - -this.field_w) {
                if (this.field_k + this.field_m + param0 <= param4) {
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
          return true;
        }
    }

    boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param6, param5, false, param4, param0)) {
                break L1;
              } else {
                this.field_y = param2;
                break L1;
              }
            }
            if (param3 >= 113) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              this.field_k = -92;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("vg.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final boolean a(int param0, char param1, int param2) {
        int var4;
        if (this.a(true)) {
          if (!this.a(param0, param1, (vg) (this), 84)) {
            if (param2 > 31) {
              var4 = param0;
              if (var4 == 80) {
                return this.a(false, (vg) (this));
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (param2 > 31) {
            var4 = param0;
            if (var4 == 80) {
              return this.a(false, (vg) (this));
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static bg a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
        bg var9 = null;
        RuntimeException var9_ref = null;
        bg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_j = (hm) null;
                break L1;
              }
            }
            var9 = new bg(param8, param5, param2, param6, param1, param4, param7);
            gf.field_h.a(var9, 255);
            jc.a(param3, var9, -121);
            stackIn_3_0 = (bg) (var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var9_ref);

            stackIn_6_1 = new StringBuilder().append("vg.KB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param8 + ')');
        }
        return stackIn_3_0;
    }

    vg(String param0, fd param1) {
        this(param0, ja.field_Q.field_i, param1);
    }

    final void e(byte param0) {
        this.a(this.field_m, this.field_k, this.field_o, 16535, this.field_w);
        if (param0 > 11) {
          return;
        } else {
          this.e(37);
          return;
        }
    }

    void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        try {
            this.field_y = 0;
            if (param5) {
                this.field_q = 115;
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "vg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    String e(int param0) {
        if (param0 >= -39) {
            return (String) null;
        }
        return !this.field_n ? null : this.field_v;
    }

    final static void b(byte param0) {
        int fieldTemp$0 = 0;
        lh var1 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1 = nj.field_p;
                        if (param0 > 45) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    stackIn_5_0 = 99;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackIn_5_0 = 99;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!ck.b(stackIn_5_0)) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var1.d(8, -18392);
                        fieldTemp$0 = var1.field_j + 1;
                        var1.field_j = var1.field_j + 1;
                        var2 = fieldTemp$0;
                        nc.a((byte) -95, var1);
                        nj.field_p.b(-var2 + var1.field_j, (byte) 87);
                        if (var3 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw ie.a((Throwable) ((Object) var1_ref), "vg.JB(" + param0 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        StringBuilder var6;
        L0: {
          if (-1 != (param1 ^ -1)) {
            break L0;
          } else {
            if (this.field_l != null) {
              this.field_l.a(true, 117, (vg) (this), param3, param0);
              break L0;
            } else {
              if (param2 == -21) {
                return;
              } else {
                var6 = (StringBuilder) null;
                this.a(15, (Hashtable) null, (StringBuilder) null, 118);
                return;
              }
            }
          }
        }
        if (param2 == -21) {
          return;
        } else {
          var6 = (StringBuilder) null;
          this.a(15, (Hashtable) null, (StringBuilder) null, 118);
          return;
        }
    }

    final void a(StringBuilder param0, byte param1, int param2, Hashtable param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        vg var7 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$0 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_o).append(",").append(this.field_m).append(" ").append(this.field_w).append("x").append(this.field_k);
              if (this.field_p != null) {
                discarded$1 = param0.append(" text=\"").append(this.field_p).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_n) {
                discarded$2 = param0.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!this.a(true)) {
                break L3;
              } else {
                discarded$3 = param0.append(" focused");
                break L3;
              }
            }
            L4: {
              if (this.field_l == null) {
                break L4;
              } else {
                L5: {
                  discarded$4 = param0.append(" renderer=");
                  if (this.field_l instanceof vg) {
                    break L5;
                  } else {
                    discarded$5 = param0.append(this.field_l);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                param0 = this.a(param2 - -1, param3, param0, -10612);
                break L4;
              }
            }
            L6: {
              if (null != this.field_u) {
                L7: {
                  discarded$6 = param0.append(" listener=");
                  if (!(this.field_u instanceof vg)) {
                    break L7;
                  } else {
                    param0 = this.a(1 + param2, param3, param0, -10612);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                discarded$7 = param0.append(this.field_u);
                break L6;
              } else {
                break L6;
              }
            }
            L8: {
              if (param1 == 89) {
                break L8;
              } else {
                var7 = (vg) null;
                this.a(45, 110, 39, (vg) null, 34, true);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("vg.LB(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_25_0), stackIn_28_2 + ')');
        }
    }

    boolean a(boolean param0) {
        if (!param0) {
            this.field_k = -58;
            return false;
        }
        return false;
    }

    public final String toString() {
        return this.a(0, new Hashtable(), new StringBuilder(), -10612).toString();
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
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
              if (!this.a(param1, param2, param0, param3 + 10725)) {
                break L1;
              } else {
                this.a(param2, (byte) 89, param0, param1);
                break L1;
              }
            }
            if (param3 == -10612) {
              stackIn_6_0 = (StringBuilder) (param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("vg.WA(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    void a(vg param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        String var6 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              var5_int = this.a(param2, param1, false, ck.field_c, ob.field_g) ? 1 : 0;
              if (param3 <= -127) {
                break L1;
              } else {
                var6 = (String) null;
                vg.a((byte) -123, (String) null);
                break L1;
              }
            }
            L2: {
              if (this.field_n) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            L3: {


              if (var5_int != 0) {

                stackIn_8_1 = 0;
                break L3;
              } else {

                stackIn_8_1 = 1;
                break L3;
              }
            }
            L4: {
              if (stackIn_5_0 != stackIn_8_1) {
                L5: {
                  stackIn_12_0 = this;

                  if (var5_int == 0) {
                    stackIn_13_0 = this;
                    stackIn_13_1 = 0;
                    break L5;
                  } else {
                    stackIn_13_0 = this;
                    stackIn_13_1 = 1;
                    break L5;
                  }
                }
                L6: {
                  ((vg) (this)).field_n = stackIn_13_1 != 0;
                  if (this.field_u == null) {
                    break L6;
                  } else {
                    if (!(this.field_u instanceof wc)) {
                      break L6;
                    } else {
                      ((wc) ((Object) this.field_u)).a((vg) (this), var5_int != 0, (byte) -117);
                      break L4;
                    }
                  }
                }
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("vg.I(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    int d(int param0) {
        if (param0 != 3) {
            this.field_v = (String) null;
            return 0;
        }
        return 0;
    }

    final static void a(vj param0, boolean param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ja var5 = null;
        int[] var6 = null;
        int var7 = 0;
        lh var8 = null;
        lh var9 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var8 = new lh(param0.a("logo.fo3d", "", 24874));
                        var9 = var8;
                        var3 = var9.l(31760);
                        var9.d((byte) 65);
                        dm.field_B = m.a(103, var9);
                        q.field_b = new int[var3][];
                        r.field_c = new ja[var3];
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 <= var4) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        r.field_c[var4] = tl.a(var8, (byte) 105);
                        var4++;
                        if (var7 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var7 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9.o(-124);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 >= var3) {
                            statePc = 20;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = r.field_c[var4];
                        var5.a(6, 6, 6, (byte) -65, 1);
                        var5.b(32767);
                        var6 = new int[]{var5.field_I + var5.field_s >> 557109377, var5.field_N + var5.field_d >> 374407681, var5.field_j - -var5.field_C >> 1029924961};
                        q.field_b[var4] = var6;
                        var5.a(-var6[0], -var6[2], 0, -var6[1]);
                        var4++;
                        if (var7 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        return;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var7 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var2);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("vg.MB(");
                    stackIn_17_1 = stackIn_18_1;
                    if (param0 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw ie.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void f(byte param0) {
        field_j = null;
        field_r = null;
        field_x = null;
        field_h = null;
        int var1 = 10 % ((param0 - -2) / 56);
    }

    protected vg() {
        this.field_t = 0;
        this.field_q = 0;
    }

    void c(byte param0) {
        int var2 = -54 % ((-10 - param0) / 51);
    }

    vg(String param0, cg param1, fd param2) {
        va var4 = null;
        this.field_t = 0;
        this.field_q = 0;
        try {
            this.field_u = param2;
            this.field_p = param0;
            this.field_l = param1;
            if (this.field_l instanceof va) {
                var4 = (va) ((Object) this.field_l);
                this.field_w = var4.a((byte) 48, (vg) (this));
                this.field_k = var4.a(170, (vg) (this));
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "vg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    vg(int param0, int param1, int param2, int param3, cg param4, fd param5) {
        this.field_t = 0;
        this.field_q = 0;
        try {
            this.field_w = param2;
            this.field_m = param1;
            this.field_o = param0;
            this.field_u = param5;
            this.field_l = param4;
            this.field_k = param3;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "vg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = "This password is part of your Player Name, and would be easy to guess";
        field_r = new int[]{3, 2, 3, 3, 3, 0, -1, 0, -1, -1, -1, 8, -1, 5, 5, 5, 5, 8, 8, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, -1, -1, 2, 3, 3, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0};
    }
}
