/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class vd {
    private int field_h;
    static String[] field_i;
    private BitSet field_b;
    static String field_c;
    static ed[] field_f;
    static String[] field_d;
    private boolean field_k;
    private ei field_a;
    private BitSet field_e;
    static hh field_g;
    private int field_j;

    final boolean a(int param0, int param1) {
        if (param0 != 1) {
            this.field_e = (BitSet) null;
        }
        return this.a(param1, this.field_h, -32, this.field_e);
    }

    private final BitSet a(int param0, BitSet param1, int param2, BitSet param3) {
        BitSet var5 = null;
        RuntimeException var5_ref = null;
        BitSet stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.a(44, 44, true);
                break L1;
              }
            }
            L2: {
              var5 = param1;
              if (param1 == null) {
                break L2;
              } else {
                if (param3 != null) {
                  var5.or(param3);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param1 != null) {
                break L3;
              } else {
                if (param3 != null) {
                  var5 = param3;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param1 != null) {
                break L4;
              } else {
                if (param3 == null) {
                  var5 = new BitSet(param2);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            stackIn_15_0 = (BitSet) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5_ref);

            stackIn_18_1 = new StringBuilder().append("vd.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        return stackIn_15_0;
    }

    private final void e(byte param0) {
        if (param0 > -33) {
            field_d = (String[]) null;
        }
        byte[] var4 = this.a(false);
        byte[] var2 = var4;
        if (var4 == null) {
            return;
        }
        bd var3 = new bd(var4);
        ca.a(1, 6, var3);
    }

    public static void c(byte param0) {
        field_g = null;
        field_d = null;
        field_f = null;
        field_c = null;
        field_i = null;
        if (param0 < 5) {
            field_d = (String[]) null;
        }
    }

    private final BitSet a(DataInputStream param0, int param1, BitSet param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        BitSet var7 = null;
        BitSet var8 = null;
        BitSet stackIn_2_0 = null;
        BitSet stackIn_6_0 = null;
        BitSet stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 3) {
              var5_int = param0.readUnsignedByte();
              var6 = 8 * var5_int;
              if (param3 < var6) {
                stackIn_6_0 = (BitSet) (param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = this.a(param3, param0, var5_int, 0);
                var8 = this.a(0, param2, param3, var7);
                stackIn_8_0 = (BitSet) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = (BitSet) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("vd.O(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final static ed[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 1317) {
            return (ed[]) null;
        }
        return ge.a(1, param0, 1, 1, param1, (byte) 33, param2, param3, 3);
    }

    private final BitSet a(int param0, DataInputStream param1, int param2, int param3) throws IOException {
        BitSet var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        BitSet stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            var5 = new BitSet(param0);
            var6 = param3;
            L1: while (true) {
              if (var6 >= param2) {
                stackIn_5_0 = (BitSet) (var5);
                break L0;
              } else {
                var7 = param1.readByte();
                var8 = var6 * 8;
                var5 = this.a((byte) var7, param3 ^ -98, var5, param0, var8);
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("vd.G(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    private final void b(byte param0) {
        if (param0 != -106) {
            return;
        }
        this.field_j = pc.a(2513, 2);
        this.field_b = new BitSet(this.field_j);
    }

    final void a(int param0, int param1, boolean param2) {
        if (-2 == (param0 ^ -1)) {
            this.a(-1, param1, this.field_e, this.field_h);
        }
        if (!param2) {
            this.field_k = false;
        }
        if (!(-1 != (param0 ^ -1))) {
            this.a(-1, param1, this.field_b, this.field_j);
        }
    }

    private final boolean a(int param0, int param1, int param2, BitSet param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_k) {
              if (param3 != null) {
                if (param2 < -22) {
                  if (0 <= param0) {
                    if (param1 > param0) {
                      if (param0 < param3.size()) {
                        stackIn_19_0 = param3.get(param0);
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        stackIn_17_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_11_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("vd.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L1;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_14_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_17_0 != 0;
                  } else {
                    return stackIn_19_0;
                  }
                }
              }
            }
          }
        }
    }

    private final byte a(boolean param0, int param1, int param2, BitSet param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        byte stackIn_7_0 = 0;
        byte stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var5_int = param3.size();
              var6 = 0;
              var7 = 0;
              if (param0) {
                break L1;
              } else {
                this.field_j = 35;
                break L1;
              }
            }
            L2: while (true) {
              if (8 <= var7) {
                stackIn_13_0 = (byte)var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var8 = param1 - -var7;
                if (var5_int <= var8) {
                  stackIn_7_0 = (byte)var6;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L3: {
                    if (param3.get(var8)) {
                      var10 = 1 << var7;
                      var6 = var6 | var10;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var7++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("vd.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_13_0;
        }
    }

    final static void a(byte param0) {
        int var1 = -124 % ((param0 - -86) / 37);
        dl.field_a = false;
        om.field_g.e(0);
    }

    private final BitSet a(byte param0, int param1, BitSet param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        BitSet stackIn_5_0 = null;
        int stackIn_11_0 = 0;
        BitSet stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param2 != null) {
                break L1;
              } else {
                param2 = new BitSet(param3);
                break L1;
              }
            }
            var6_int = param0;
            if (param1 <= -14) {
              var7 = 0;
              L2: while (true) {
                if (-9 >= (var7 ^ -1)) {
                  stackIn_16_0 = (BitSet) (param2);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var8 = 1 << var7;
                    if (-1 == (var6_int & var8 ^ -1)) {
                      stackIn_11_0 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    var9 = stackIn_11_0;
                    var10 = param4 - -var7;
                    if (var9 == 0) {
                      param2.clear(var10);
                      break L4;
                    } else {
                      param2.set(var10);
                      break L4;
                    }
                  }
                  var7++;
                  continue L2;
                }
              }
            } else {
              stackIn_5_0 = (BitSet) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var6);

            stackIn_19_1 = new StringBuilder().append("vd.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_16_0;
        }
    }

    private final byte[] a(int param0, int param1, BitSet param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_14_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                var4_int = this.a(-106, param2);
                if (param0 > 21) {
                  break L1;
                } else {
                  this.field_e = (BitSet) null;
                  break L1;
                }
              }
              if (var4_int < param1) {
                var5 = 1 + var4_int;
                if (-1 >= (var5 ^ -1)) {
                  var6 = this.b(-1, var5);
                  var7 = new byte[var6 - -1];
                  var7[0] = (byte)var6;
                  if (-1 > (var6 ^ -1)) {
                    var8 = 0;
                    L2: while (true) {
                      if (var6 <= var8) {
                        stackIn_19_0 = (byte[]) (var7);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var9 = 8 * var8;
                        var10 = this.a(true, var9, param1, param2);
                        var7[var8 - -1] = (byte)var10;
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackIn_14_0 = (byte[]) (var7);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("vd.V(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_19_0;
          }
        }
    }

    private final byte[] a(boolean param0) {
        byte[] var4 = this.a(49, this.field_j, this.field_b);
        byte[] var2 = var4;
        if (var4 == null) {
            return this.a(1, (byte[]) null, (byte[]) null);
        }
        byte[] var3 = this.a(64, this.field_h, this.field_e);
        if (var3 == null) {
            return this.a(1, (byte[]) null, (byte[]) null);
        }
        if (param0) {
            return (byte[]) null;
        }
        return this.a(1, var4, var3);
    }

    private final void a(int param0, int param1, BitSet param2, int param3) {
        if (!(this.field_k)) {
            return;
        }
        if (!(param0 >= (param1 ^ -1))) {
            return;
        }
        if (!(param1 < param3)) {
            return;
        }
        if (!(param2 != null)) {
            return;
        }
        try {
            param2.set(param1);
            this.e((byte) -61);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "vd.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean d(byte param0) {
        if (param0 != -83) {
            this.field_k = true;
        }
        return this.field_k;
    }

    private final int a(int param0, BitSet param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            if (param1 == null) {
              stackIn_4_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 <= -22) {
                  break L1;
                } else {
                  this.field_j = -38;
                  break L1;
                }
              }
              var3_int = param1.size();
              if (-1 > (var3_int ^ -1)) {
                var4 = -1 + var3_int;
                L2: while (true) {
                  if (-1 < (var4 ^ -1)) {
                    stackIn_18_0 = -1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var5 = param1.get(var4) ? 1 : 0;
                    if (var5 != 0) {
                      stackIn_15_0 = var4;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var4--;
                      continue L2;
                    }
                  }
                }
              } else {
                stackIn_9_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("vd.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              return stackIn_18_0;
            }
          }
        }
    }

    final void b(int param0) {
        try {
            if (this.field_k) {
                return;
            }
            int var2 = -98 % ((-61 - param0) / 62);
            if (!(bj.e((byte) 112))) {
                this.field_k = true;
                return;
            }
            if (!(this.field_a != null)) {
                this.field_a = bc.a(6, 86);
            }
            this.field_k = this.field_a.field_g;
            if (this.field_k) {
                try {
                    this.a(-16331, this.field_a.field_h);
                } catch (IOException iOException) {
                    System.out.println("Error reading game data");
                }
                this.field_a = null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, byte[] param1) throws IOException {
        if (param1 == null) {
            return;
        }
        DataInputStream var3 = new DataInputStream((InputStream) ((Object) new ByteArrayInputStream(param1)));
        if (param0 != -16331) {
            field_g = (hh) null;
        }
        int var4 = var3.readUnsignedByte();
        if (-2 != (var4 ^ -1)) {
            return;
        }
        try {
            this.field_b = this.a(var3, param0 ^ -16330, this.field_b, this.field_j);
            this.field_e = this.a(var3, 3, this.field_e, this.field_h);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "vd.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0) {
        if (param0 < 103) {
            this.field_h = -109;
        }
        this.field_h = pc.a(2513, 3);
        this.field_e = new BitSet(this.field_h);
    }

    private final byte[] a(int param0, byte[] param1, byte[] param2) {
        int incrementValue$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        byte[] var5 = null;
        int var6 = 0;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (param1 != null) {
                var4_int = var4_int + param1.length;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == null) {
                break L2;
              } else {
                var4_int = var4_int + param2.length;
                break L2;
              }
            }
            L3: {
              var5 = new byte[var4_int];
              var6 = 0;
              incrementValue$1 = var6;
              var6++;
              var5[incrementValue$1] = (byte) 1;
              if (param1 != null) {
                qg.a(param1, 0, var5, var6, param1.length);
                var6 = var6 + param1.length;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2 != null) {
                qg.a(param2, 0, var5, var6, param2.length);
                var6 = var6 + param2.length;
                break L4;
              } else {
                break L4;
              }
            }
            stackIn_12_0 = (byte[]) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("vd.U(").append(param0).append(',');

            if (param1 == null) {
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
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        return stackIn_12_0;
    }

    final boolean a(int param0, byte param1) {
        int var3 = 55 / ((-51 - param1) / 61);
        return this.a(param0, this.field_j, -107, this.field_b);
    }

    vd() {
        this.b((byte) -106);
        this.a(127);
        this.field_k = false;
    }

    private final int b(int param0, int param1) {
        if (!((param1 ^ -1) < param0)) {
            return 0;
        }
        int var3 = param1 / 8;
        if (0 != param1 % 8) {
            var3++;
        }
        return var3;
    }

    static {
        field_d = new String[]{"Fuel Storage Unit 531", "Outlying Fuel Depot", "Fuel Production Caverns", "Cannister Elimination Run", "Mine Shafts", "Fortified Mine", "Mine Field", "Auto Destruct", "Drive Research Facility", "Engine Research Station", "Cold Fusion Laboratory", "High-security Research Cavern", "Growth Pod Caverns", "Mined Cloning Facility", "Genetic Research Laboratory", "Secluded Cloning Pods"};
        field_c = "Lives: ";
        field_i = new String[]{"The President sends his highest regards. Given your success so far we have one final mission for you. Your ultimate battle lies ahead, with the ultimate prize for the victor.", "The aliens have perfected cloning technology and are busy growing an unstoppable army of genetically enhanced soldiers. Destroy their growth pods before they can breed their army."};
    }
}
