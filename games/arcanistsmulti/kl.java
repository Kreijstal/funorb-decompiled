/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class kl extends qm implements a {
    static String field_x;
    static String field_C;
    static String field_F;
    qm[] field_z;
    static ll[] field_G;
    static String field_y;
    static int field_A;
    static int[] field_B;
    static qb[] field_E;
    static String field_D;

    private final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        int var6 = 0;
        qm var7 = null;
        int var8 = 0;
        int var9 = 0;
        qm[] var10 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 31115) {
                break L1;
              } else {
                this.field_z = (qm[]) null;
                break L1;
              }
            }
            if (null != this.field_z) {
              var10 = this.field_z;
              var6 = 0;
              L2: while (true) {
                if (var10.length <= var6) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var10[var6];
                  discarded$6 = param2.append('\n');
                  var8 = 0;
                  L3: while (true) {
                    if (var8 > param1) {
                      L4: {
                        if (var7 != null) {
                          var7.a(param2, param1 - -1, param3, (byte) 110);
                          break L4;
                        } else {
                          discarded$7 = param2.append("null");
                          break L4;
                        }
                      }
                      var6++;
                      continue L2;
                    } else {
                      discarded$8 = param2.append(' ');
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("kl.KA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, qm param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        qm var5 = null;
        qm var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 9) {
                break L1;
              } else {
                field_F = (String) null;
                break L1;
              }
            }
            if (this.field_z != null) {
              var4_int = this.field_z.length + -1;
              L2: while (true) {
                if ((var4_int ^ -1) > -1) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var5 = this.field_z[var4_int];
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (!var5.d(-2116)) {
                        break L3;
                      } else {
                        var4_int = var4_int - param0;
                        L4: while (true) {
                          if ((var4_int ^ -1) > -1) {
                            break L3;
                          } else {
                            L5: {
                              var6 = this.field_z[var4_int];
                              if (var6 == null) {
                                break L5;
                              } else {
                                if (!var6.a(0, param1)) {
                                  break L5;
                                } else {
                                  stackIn_15_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                            var4_int = var4_int - param0;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4_int--;
                  continue L2;
                }
              }
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("kl.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    boolean a(int param0, qm param1) {
        qm[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        qm var5 = null;
        int var6 = 0;
        qm[] var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var7 = this.field_z;
            var3 = var7;
            var4 = param0;
            L1: while (true) {
              if (var4 >= var7.length) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L2;
                  } else {
                    if (!var5.a(0, param1)) {
                      break L2;
                    } else {
                      stackIn_6_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("kl.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final boolean a(qm param0, int param1) {
        RuntimeException var3 = null;
        qm var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -8) {
                break L1;
              } else {
                var4 = (qm) null;
                this.a((qm) null, 31, -110, 42);
                break L1;
              }
            }
            stackIn_3_0 = this.a(1, param0, (byte) 9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("kl.OA(");

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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    kl(int param0, int param1, int param2, int param3, pf param4) {
        super(param0, param1, param2, param3, param4, (wc) null);
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var5;
        qm var6;
        int var7;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (0 != param2) {
            break L0;
          } else {
            if (null == this.field_r) {
              break L0;
            } else {
              this.field_r.a((qm) (this), 5592405, param1, param3, true);
              break L0;
            }
          }
        }
        L1: {
          if (null != this.field_z) {
            var5 = this.field_z.length + -1;
            L2: while (true) {
              if (0 > var5) {
                break L1;
              } else {
                var6 = this.field_z[var5];
                if (var6 != null) {
                  var6.a((byte) -112, param1 + this.field_n, param2, param3 - -this.field_j);
                  var5--;
                  continue L2;
                } else {
                  var5--;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        L3: {
          if (param0 < -52) {
            break L3;
          } else {
            field_D = (String) null;
            break L3;
          }
        }
    }

    private final qm a(int param0) {
        qm[] var2;
        int var3;
        qm var4;
        int var5;
        qm[] var6;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != this.field_z) {
          var6 = this.field_z;
          var2 = var6;
          var3 = param0;
          L0: while (true) {
            if (var3 < var6.length) {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.d(-2116)) {
                  return var4;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        qm[] var5 = null;
        int var6 = 0;
        qm var7 = null;
        int var8 = 0;
        qm[] var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            if (this.field_z != null) {
              var9 = this.field_z;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var9.length <= var6) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L2;
                    } else {
                      var7.a(param0, param1 - -this.field_n, 170, param3 - -this.field_j);
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5_ref);

            stackIn_11_1 = new StringBuilder().append("kl.E(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, qm param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        qm var5 = null;
        qm var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_z != null) {
              L1: {
                if (param0 == 29787) {
                  break L1;
                } else {
                  field_A = 123;
                  break L1;
                }
              }
              var4_int = 0;
              L2: while (true) {
                if (var4_int >= this.field_z.length) {
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var5 = this.field_z[var4_int];
                    var6 = var5;
                    var6 = var5;
                    if (null == var5) {
                      break L3;
                    } else {
                      if (var5.d(param0 + -31903)) {
                        var4_int = var4_int + param1;
                        L4: while (true) {
                          if (var4_int >= this.field_z.length) {
                            break L3;
                          } else {
                            L5: {
                              var6 = this.field_z[var4_int];
                              if (null != var6) {
                                if (!var6.a(0, param2)) {
                                  break L5;
                                } else {
                                  stackIn_17_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              } else {
                                break L5;
                              }
                            }
                            var4_int = var4_int + param1;
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4_int++;
                  continue L2;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("kl.V(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
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
              if (param1 == 1) {
                break L1;
              } else {
                var3 = (String) null;
                kl.a((String) null, -51);
                break L1;
              }
            }
            L2: {
              if (im.a(0, param0) == null) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("kl.LA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final int c(int param0) {
        int var2;
        qm[] var3;
        int var4;
        qm var5;
        int var7;
        int var6;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 0;
        var3 = this.field_z;
        var4 = param0;
        L0: while (true) {
          if (var3.length <= var4) {
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.c(0);
              if (var2 < var6) {
                var2 = var6;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
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
              if (!this.a(param0, (byte) -90, param2, param1)) {
                break L1;
              } else {
                this.a(param0, param1, param2, 1);
                this.a(31115, param1, param0, param2);
                break L1;
              }
            }
            var5_int = 76 % ((50 - param3) / 60);
            stackIn_3_0 = (StringBuilder) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("kl.FA(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, qm param6) {
        qm[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        qm var10 = null;
        int var11 = 0;
        qm[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_z == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var12 = this.field_z;
              var8 = var12;
              var9 = param5;
              L1: while (true) {
                if (var12.length <= var9) {
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L2;
                    } else {
                      if (!var10.d(-2116)) {
                        break L2;
                      } else {
                        if (!var10.a(param0, param1, param2, param3, param4, 0, param6)) {
                          break L2;
                        } else {
                          stackIn_11_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8_ref);

            stackIn_17_1 = new StringBuilder().append("kl.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    boolean a(qm param0, byte param1, char param2, int param3) {
        qm[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        qm var7 = null;
        int var8 = 0;
        qm[] var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_z != null) {
              var9 = this.field_z;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var9.length) {
                  var5_int = param3;
                  if (var5_int != 80) {
                    if (param1 < -120) {
                      stackIn_21_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      stackIn_19_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    L2: {
                      if (!ri.field_b[81]) {
                        stackIn_16_0 = this.a((byte) -127, param0);
                        break L2;
                      } else {
                        stackIn_16_0 = this.a(param0, -55);
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  L3: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L3;
                    } else {
                      if (!var7.d(-2116)) {
                        break L3;
                      } else {
                        if (!var7.a(param0, (byte) -124, param2, param3)) {
                          break L3;
                        } else {
                          stackIn_10_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5_ref);

            stackIn_24_1 = new StringBuilder().append("kl.N(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_21_0 != 0;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_D = null;
        field_F = null;
        if (param0 != -90) {
            field_C = (String) null;
        }
        field_y = null;
        field_G = null;
        field_C = null;
        field_x = null;
        field_E = null;
        field_B = null;
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        qm[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        qm var11 = null;
        int var12 = 0;
        qm[] var13 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (null != this.field_z) {
              var13 = this.field_z;
              var8 = var13;
              var9 = 0;
              var10 = -123 / ((-42 - param4) / 35);
              L1: while (true) {
                if (var9 >= var13.length) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var11 = var13[var9];
                    if (var11 == null) {
                      break L2;
                    } else {
                      if (!var11.a(param0, param1, param2, this.field_j + param3, 34, param5, this.field_n + param6)) {
                        break L2;
                      } else {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("kl.DA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final boolean a(byte param0, qm param1) {
        RuntimeException var3 = null;
        qm var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -126) {
                break L1;
              } else {
                var4 = (qm) null;
                this.a(-118, 91, 35, -86, 59, 78, (qm) null);
                break L1;
              }
            }
            stackIn_3_0 = this.a(29787, 1, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("kl.NA(").append(param0).append(',');

            if (param1 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    abstract void e(int param0);

    final void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        qm[] var7 = null;
        int var8 = 0;
        qm var9 = null;
        int var10 = 0;
        qm[] var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -20592) {
                break L1;
              } else {
                field_D = (String) null;
                break L1;
              }
            }
            if (null == this.field_z) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var11 = this.field_z;
              var7 = var11;
              var8 = 0;
              L2: while (true) {
                if (var11.length <= var8) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var9 = var11[var8];
                    if (var9 != null) {
                      var9.a(param0, -20592, param2, this.field_j + param3, param4 + this.field_n, param5);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var8++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7_ref);

            stackIn_15_1 = new StringBuilder().append("kl.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String b(boolean param0) {
        qm[] var2;
        int var3;
        qm var4;
        int var6;
        String var5;
        String var7;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != this.field_z) {
          var2 = this.field_z;
          var3 = 0;
          L0: while (true) {
            if (var2.length <= var3) {
              if (param0) {
                var7 = (String) null;
                kl.a((String) null, 33);
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var2[var3];
              if (var4 != null) {
                var5 = var4.b(param0);
                if (var5 != null) {
                  return var5;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 >= -49) {
            return;
        }
        super.a(param0, param1, param2, param3, -57);
        this.e(106);
    }

    final boolean d(int param0) {
        if (param0 != -2116) {
            field_D = (String) null;
        }
        return null != this.a(0) ? true : false;
    }

    final void d(byte param0) {
        qm[] var2;
        int var3;
        qm var4;
        int var5;
        qm[] var7;
        qm var6;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        var7 = this.field_z;
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          if (var7.length <= var3) {
            L1: {
              if (param0 == 29) {
                break L1;
              } else {
                var6 = (qm) null;
                this.a(-1, (qm) null, (byte) -103);
                break L1;
              }
            }
            return;
          } else {
            var4 = var7[var3];
            if (var4 != null) {
              var4.d((byte) 29);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    static {
        field_x = "Playing";
        field_y = "You require the '<%0>' Achievement to select this item";
        field_F = "  When summoning or increasing the power of your familiar you channel 20 of your health into it. The more life the familiar has the more powerful are the effects it provides. You can channel as much life as you wish each turn into it up to a maximum of 100 health.";
        field_B = new int[1024];
        field_D = "This game option is not available in rated games.";
    }
}
