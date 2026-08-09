/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class b extends ae implements tpa {
    static String field_v;
    vna field_u;

    final boolean a(ae param0, byte param1) {
        RuntimeException var3 = null;
        ae var4 = null;
        uja var5 = null;
        ae var6 = null;
        int var7 = 0;
        ae var8 = null;
        uja var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_u.d((byte) 14)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var9 = new uja(this.field_u);
                if (param1 == -9) {
                  break L1;
                } else {
                  var8 = (ae) null;
                  this.b((ae) null, (byte) 90);
                  break L1;
                }
              }
              var4 = (ae) ((Object) var9.a(true));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (var4.b((byte) -34)) {
                      var5 = new uja(this.field_u);
                      var5.a(0, var4);
                      var6 = (ae) ((Object) var5.a(-1));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a(param0, false)) {
                            var6 = (ae) ((Object) var5.a(param1 ^ 8));
                            continue L4;
                          } else {
                            stackIn_15_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (ae) ((Object) var9.a(-1));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("b.VA(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    void f(byte param0) {
        int var5 = TombRacer.field_G ? 1 : 0;
        uja var2 = new uja(this.field_u);
        int var4 = -96 % ((param0 - -38) / 60);
        ae var3 = (ae) ((Object) var2.a(true));
        while (var3 != null) {
            var3.f((byte) -115);
            var3 = (ae) ((Object) var2.a(-1));
        }
    }

    final boolean b(ae param0, byte param1) {
        RuntimeException var3 = null;
        ae var4 = null;
        uja var5 = null;
        ae var6 = null;
        int var7 = 0;
        ae var8 = null;
        uja var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_u.d((byte) 14)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 <= -45) {
                  break L1;
                } else {
                  var8 = (ae) null;
                  this.a((byte) 112, (ae) null, 60, 11, -7, -44);
                  break L1;
                }
              }
              var9 = new uja(this.field_u);
              var4 = (ae) ((Object) var9.a((byte) 99));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (!var4.b((byte) -34)) {
                      break L3;
                    } else {
                      var5 = new uja(this.field_u);
                      var5.a(var4, (byte) -11);
                      var6 = (ae) ((Object) var5.c(60));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(param0, false)) {
                            stackIn_15_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (ae) ((Object) var5.c(33));
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4 = (ae) ((Object) var9.c(62));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("b.AB(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    public static void h(byte param0) {
        field_v = null;
        int var1 = -18 / ((param0 - 38) / 48);
    }

    final static byte[] a(int param0, int param1, int param2, byte[] param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = new byte[param0];
            var4 = var5;
            lua.a(param3, param2, var5, param1, param0);
            stackIn_1_0 = (byte[]) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("b.CB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
              if (this.a((byte) -115, param0, param1, param2)) {
                this.a(1, param2, param1, param0);
                this.b(param0, param1, param2, 23241);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 == 0) {
                break L2;
              } else {
                field_v = (String) null;
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("b.R(").append(param0).append(',');

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = TombRacer.field_G ? 1 : 0;
        if (-1 == (param3 ^ -1) && null != this.field_r) {
            this.field_r.a((ae) (this), param0, param2 + 16777215, param1, true);
        }
        uja var5 = new uja(this.field_u);
        if (param2 != 0) {
            return;
        }
        ae var6 = (ae) ((Object) var5.a((byte) 120));
        while (var6 != null) {
            var6.a(param0 - -this.field_i, this.field_n + param1, 0, param3);
            var6 = (ae) ((Object) var5.c(param2 ^ 46));
        }
    }

    final static lu a(String param0, int param1, String param2, boolean param3, long param4) {
        RuntimeException var6 = null;
        hda stackIn_6_0 = null;
        wc stackIn_8_0 = null;
        tc stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 != (long)param1) {
                break L1;
              } else {
                if (param2 != null) {
                  stackIn_8_0 = new wc(param2, param0);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param3) {
              stackIn_6_0 = new hda(param4, param0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_10_0 = new tc(param4, param0);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("b.DB(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (lu) ((Object) stackIn_6_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (lu) ((Object) stackIn_8_0);
          } else {
            return (lu) ((Object) stackIn_10_0);
          }
        }
    }

    String d(byte param0) {
        String var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        uja var2 = new uja(this.field_u);
        ae var6 = (ae) ((Object) var2.a(true));
        while (var6 != null) {
            var4 = var6.d((byte) 127);
            if (!(var4 == null)) {
                return var4;
            }
            var6 = (ae) ((Object) var2.a(-1));
        }
        int var3 = 127 % ((param0 - -58) / 60);
        return null;
    }

    final int a(boolean param0) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        if (param0) {
            ae var7 = (ae) null;
            this.a((ae) null, -99);
        }
        uja var3 = new uja(this.field_u);
        ae var4 = (ae) ((Object) var3.a(true));
        while (var4 != null) {
            var5 = var4.a(false);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (ae) ((Object) var3.a(-1));
        }
        return var2;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        uja var8 = null;
        RuntimeException var8_ref = null;
        ae var9 = null;
        int var10 = 0;
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
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var8 = new uja(this.field_u);
            if (param0 > 70) {
              var9 = (ae) ((Object) var8.a(true));
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.l((byte) -114)) {
                      break L2;
                    } else {
                      if (!var9.a(121, param1 + this.field_i, this.field_n + param2, param3, param4, param5, param6)) {
                        var9 = (ae) ((Object) var8.a(-1));
                        continue L1;
                      } else {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
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

            stackIn_15_1 = new StringBuilder().append("b.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param6 + ')');
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

    boolean b(byte param0) {
        if (param0 != -34) {
            return true;
        }
        return this.g((byte) 52) != null ? true : false;
    }

    ae g(byte param0) {
        uja var2;
        ae var3;
        int var4;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          var2 = new uja(this.field_u);
          if (param0 == 52) {
            break L0;
          } else {
            field_v = (String) null;
            break L0;
          }
        }
        var3 = (ae) ((Object) var2.a(true));
        L1: while (true) {
          if (var3 != null) {
            if (var3.b((byte) -34)) {
              return var3;
            } else {
              var3 = (ae) ((Object) var2.a(-1));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        uja var7 = null;
        ae var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7 = new uja(this.field_u);
            var8 = (ae) ((Object) var7.a(true));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.l((byte) -107)) {
                    break L2;
                  } else {
                    var8.a((byte) 59, param1, param2, this.field_i + param3, param4 - -this.field_n, param5);
                    var8 = (ae) ((Object) var7.a(-1));
                    continue L1;
                  }
                }
              }
              L3: {
                if (param0 == 59) {
                  break L3;
                } else {
                  this.g((byte) 119);
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("b.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(ae param0, boolean param1) {
        uja var3 = null;
        RuntimeException var3_ref = null;
        ae var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3 = new uja(this.field_u);
            if (!param1) {
              var4 = (ae) ((Object) var3.a(true));
              L1: while (true) {
                if (var4 == null) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!var4.a(param0, false)) {
                    var4 = (ae) ((Object) var3.a(-1));
                    continue L1;
                  } else {
                    stackIn_8_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
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
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("b.S(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = param0 >>> -184107711;
        var2 = var2 | var2 >>> 1181399777;
        var2 = var2 | var2 >>> 494055650;
        var2 = var2 | var2 >>> 1899775908;
        var2 = var2 | var2 >>> -1703889496;
        int var3 = 126 / ((param1 - -24) / 60);
        var2 = var2 | var2 >>> 1516036816;
        return (var2 ^ -1) & param0;
    }

    b(int param0, int param1, int param2, int param3, isa param4) {
        super(param0, param1, param2, param3, param4, (qc) null);
        this.field_u = new vna();
    }

    final boolean a(int param0, int param1, int param2, int param3, ae param4, int param5, int param6) {
        uja var8 = null;
        RuntimeException var8_ref = null;
        ae var9 = null;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new uja(this.field_u);
              if (param6 == -1) {
                break L1;
              } else {
                field_v = (String) null;
                break L1;
              }
            }
            var9 = (ae) ((Object) var8.a(true));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.l((byte) 30)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.b((byte) -34)) {
                        break L4;
                      } else {
                        if (!var9.a(param0, param1, param2, param3, param4, param5, -1)) {
                          break L4;
                        } else {
                          stackIn_9_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (ae) ((Object) var8.a(-1));
                    continue L2;
                  }
                }
              }
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("b.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    boolean a(char param0, ae param1, int param2, boolean param3) {
        uja var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        ae var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5 = new uja(this.field_u);
            if (param3) {
              var8 = (ae) ((Object) var5.a(param3));
              L1: while (true) {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    if (!var8.l((byte) 35)) {
                      break L2;
                    } else {
                      L3: {
                        if (!var8.b((byte) -34)) {
                          break L3;
                        } else {
                          if (!var8.a(param0, param1, param2, true)) {
                            break L3;
                          } else {
                            stackIn_10_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                      var8 = (ae) ((Object) var5.a(-1));
                      continue L1;
                    }
                  }
                }
                var6 = param2;
                if (-81 != (var6 ^ -1)) {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L4: {
                    if (oj.field_tb[81]) {
                      stackIn_16_0 = this.b(param1, (byte) -124);
                      break L4;
                    } else {
                      stackIn_16_0 = this.a(param1, (byte) -9);
                      break L4;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5_ref);

            stackIn_21_1 = new StringBuilder().append("b.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
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
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    private final void b(int param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        uja var2 = new uja(this.field_u);
        ae var3 = (ae) ((Object) var2.a(true));
        while (var3 != null) {
            var3.c((byte) -121);
            var3 = (ae) ((Object) var2.a(-1));
        }
        if (param0 <= 110) {
            field_v = (String) null;
        }
    }

    final void a(ae param0, int param1) {
        try {
            this.field_u.b((byte) -67, param0);
            if (param1 != -1) {
                this.b(64);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "b.UA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.b(param0 ^ -112);
    }

    private final void b(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        uja var5 = null;
        ae var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = new uja(this.field_u);
              if (param3 == 23241) {
                break L1;
              } else {
                this.field_u = (vna) null;
                break L1;
              }
            }
            var6 = (ae) ((Object) var5.a(true));
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$3 = param2.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (param0 < var7) {
                    var6.a(param0 + 1, param1, param2, 0);
                    var6 = (ae) ((Object) var5.a(-1));
                    continue L2;
                  } else {
                    discarded$4 = param2.append(' ');
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("b.EB(").append(param0).append(',');

            if (param1 == null) {
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
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int param1, ae param2, int param3) {
        RuntimeException runtimeException = null;
        uja var5 = null;
        ae var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new uja(this.field_u);
            var6 = (ae) ((Object) var5.a(true));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.l((byte) 70)) {
                    break L2;
                  } else {
                    var6.a(this.field_i + param0, 2097152, param2, param3 + this.field_n);
                    var6 = (ae) ((Object) var5.a(-1));
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("b.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    static {
        field_v = "Rankings";
    }
}
