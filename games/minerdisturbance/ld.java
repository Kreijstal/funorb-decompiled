/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends sb {
    static int field_B;
    private mf field_v;
    static ea field_x;
    static int field_w;
    private int field_z;
    private int field_y;
    static String[] field_A;

    final void b(int[] param0, int param1) {
        try {
            ((ld) this).field_v = new mf(param0);
            int var3_int = -24 % ((param1 - 64) / 40);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ld.J(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static String a(String param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        String stackOut_6_0 = null;
        String stackOut_4_0 = null;
        String stackOut_12_0 = null;
        String stackOut_10_0 = null;
        var5 = MinerDisturbance.field_ab;
        if (param1 == -1) {
          var4 = param2.indexOf(param3);
          L0: while (true) {
            L1: {
              if (var4 == -1) {
                stackOut_6_0 = (String) param2;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                param2 = param2.substring(0, var4) + param0 + param2.substring(param3.length() + var4);
                stackOut_4_0 = (String) param2;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var5 != 0) {
                  break L1;
                } else {
                  var4 = ((String) (Object) stackIn_5_0).indexOf(param3, var4 + param0.length());
                  continue L0;
                }
              }
            }
            return stackIn_7_0;
          }
        } else {
          field_B = -32;
          var4 = param2.indexOf(param3);
          L2: while (true) {
            L3: {
              if (var4 == -1) {
                stackOut_12_0 = (String) param2;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                param2 = param2.substring(0, var4) + param0 + param2.substring(param3.length() + var4);
                stackOut_10_0 = (String) param2;
                stackIn_13_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (var5 != 0) {
                  break L3;
                } else {
                  var4 = ((String) (Object) stackIn_11_0).indexOf(param3, var4 + param0.length());
                  continue L2;
                }
              }
            }
            return stackIn_13_0;
          }
        }
    }

    final void c(boolean param0) {
        ((ld) this).field_u[((ld) this).field_o] = (byte) 0;
        if (!param0) {
          ((ld) this).f((byte) 79);
          ((ld) this).field_z = 8;
          return;
        } else {
          ((ld) this).field_z = 8;
          return;
        }
    }

    final void n(int param0) {
        if (!(8 <= ((ld) this).field_z)) {
            ((ld) this).field_z = 8;
            ((ld) this).field_o = ((ld) this).field_o + 1;
        }
        int var2 = 55 / ((param0 - -5) / 39);
    }

    ld(byte[] param0) {
        super(param0);
    }

    final int e(byte param0) {
        if (param0 != 0) {
          return -16;
        } else {
          int fieldTemp$2 = ((ld) this).field_o;
          ((ld) this).field_o = ((ld) this).field_o + 1;
          return ((ld) this).field_u[fieldTemp$2] + -((ld) this).field_v.b(4) & 255;
        }
    }

    final int c(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = MinerDisturbance.field_ab;
        if (param0 < -64) {
          var3 = ((ld) this).field_y >> 3;
          var4 = -(7 & ((ld) this).field_y) + 8;
          ((ld) this).field_y = ((ld) this).field_y + param1;
          var5 = 0;
          L0: while (true) {
            if (param1 > var4) {
              int incrementValue$2 = var3;
              var3++;
              var5 = var5 + ((((ld) this).field_u[incrementValue$2] & pl.field_b[var4]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              if (var6 == 0) {
                continue L0;
              } else {
                var5 = var5 + (((ld) this).field_u[var3] >> -param1 + var4 & pl.field_b[param1]);
                return var5;
              }
            } else {
              L1: {
                L2: {
                  if (param1 != var4) {
                    break L2;
                  } else {
                    var5 = var5 + (pl.field_b[var4] & ((ld) this).field_u[var3]);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = var5 + (((ld) this).field_u[var3] >> -param1 + var4 & pl.field_b[param1]);
                break L1;
              }
              return var5;
            }
          }
        } else {
          field_B = -20;
          var3 = ((ld) this).field_y >> 3;
          var4 = -(7 & ((ld) this).field_y) + 8;
          ((ld) this).field_y = ((ld) this).field_y + param1;
          var5 = 0;
          L3: while (true) {
            if (param1 > var4) {
              int incrementValue$3 = var3;
              var3++;
              var5 = var5 + ((((ld) this).field_u[incrementValue$3] & pl.field_b[var4]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              if (var6 == 0) {
                continue L3;
              } else {
                var5 = var5 + (((ld) this).field_u[var3] >> -param1 + var4 & pl.field_b[param1]);
                return var5;
              }
            } else {
              L4: {
                L5: {
                  if (param1 != var4) {
                    break L5;
                  } else {
                    var5 = var5 + (pl.field_b[var4] & ((ld) this).field_u[var3]);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var5 = var5 + (((ld) this).field_u[var3] >> -param1 + var4 & pl.field_b[param1]);
                break L4;
              }
              return var5;
            }
          }
        }
    }

    final void d(byte param0, int param1) {
        if (param0 >= -42) {
          field_x = null;
          int fieldTemp$4 = ((ld) this).field_o;
          ((ld) this).field_o = ((ld) this).field_o + 1;
          ((ld) this).field_u[fieldTemp$4] = (byte)(param1 + ((ld) this).field_v.b(4));
          return;
        } else {
          int fieldTemp$5 = ((ld) this).field_o;
          ((ld) this).field_o = ((ld) this).field_o + 1;
          ((ld) this).field_u[fieldTemp$5] = (byte)(param1 + ((ld) this).field_v.b(4));
          return;
        }
    }

    final void o(int param0) {
        ((ld) this).field_o = (7 + ((ld) this).field_y) / 8;
        int var2 = -128 % ((param0 - -39) / 54);
    }

    final void f(byte param0) {
        if (param0 != 16) {
          field_w = -62;
          ((ld) this).field_y = 8 * ((ld) this).field_o;
          return;
        } else {
          ((ld) this).field_y = 8 * ((ld) this).field_o;
          return;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            var5_int = 0;
            var6 = -2 / ((62 - param1) / 47);
            L1: while (true) {
              if (param2 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$5 = ((ld) this).field_o;
                ((ld) this).field_o = ((ld) this).field_o + 1;
                param0[var5_int + param3] = (byte)(((ld) this).field_u[fieldTemp$5] + -((ld) this).field_v.b(4));
                var5_int++;
                if (var7 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ld.K(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    ld(int param0) {
        super(param0);
    }

    public static void d(boolean param0) {
        if (param0) {
            return;
        }
        field_A = null;
        field_x = null;
    }

    final void a(int param0, byte param1, int param2) {
        int var5 = 0;
        var5 = MinerDisturbance.field_ab;
        if (param1 == 14) {
          param0 = param0 & pl.field_b[param2];
          L0: while (true) {
            if (((ld) this).field_z >= param2) {
              if (param2 == ((ld) this).field_z) {
                int fieldTemp$6 = ((ld) this).field_o;
                ((ld) this).field_o = ((ld) this).field_o + 1;
                ((ld) this).field_u[fieldTemp$6] = (byte)(((ld) this).field_u[fieldTemp$6] + param0);
                ((ld) this).field_u[((ld) this).field_o] = (byte) 0;
                ((ld) this).field_z = 8;
                return;
              } else {
                ((ld) this).field_z = ((ld) this).field_z - param2;
                ((ld) this).field_u[((ld) this).field_o] = (byte)(((ld) this).field_u[((ld) this).field_o] + (param0 << ((ld) this).field_z));
                if (var5 == 0) {
                  return;
                } else {
                  int fieldTemp$7 = ((ld) this).field_o;
                  ((ld) this).field_o = ((ld) this).field_o + 1;
                  ((ld) this).field_u[fieldTemp$7] = (byte)(((ld) this).field_u[fieldTemp$7] + param0);
                  ((ld) this).field_u[((ld) this).field_o] = (byte) 0;
                  ((ld) this).field_z = 8;
                  return;
                }
              }
            } else {
              param2 = param2 - ((ld) this).field_z;
              int fieldTemp$8 = ((ld) this).field_o;
              ((ld) this).field_o = ((ld) this).field_o + 1;
              ((ld) this).field_u[fieldTemp$8] = (byte)(((ld) this).field_u[fieldTemp$8] + (param0 >>> param2));
              ((ld) this).field_u[((ld) this).field_o] = (byte) 0;
              ((ld) this).field_z = 8;
              if (var5 != 0) {
                ((ld) this).field_z = 8;
                return;
              } else {
                continue L0;
              }
            }
          }
        } else {
          field_x = null;
          param0 = param0 & pl.field_b[param2];
          L1: while (true) {
            if (((ld) this).field_z < param2) {
              param2 = param2 - ((ld) this).field_z;
              int fieldTemp$9 = ((ld) this).field_o;
              ((ld) this).field_o = ((ld) this).field_o + 1;
              ((ld) this).field_u[fieldTemp$9] = (byte)(((ld) this).field_u[fieldTemp$9] + (param0 >>> param2));
              ((ld) this).field_u[((ld) this).field_o] = (byte) 0;
              ((ld) this).field_z = 8;
              if (var5 == 0) {
                continue L1;
              } else {
                ((ld) this).field_z = 8;
                return;
              }
            } else {
              if (param2 != ((ld) this).field_z) {
                ((ld) this).field_z = ((ld) this).field_z - param2;
                ((ld) this).field_u[((ld) this).field_o] = (byte)(((ld) this).field_u[((ld) this).field_o] + (param0 << ((ld) this).field_z));
                if (var5 != 0) {
                  int fieldTemp$10 = ((ld) this).field_o;
                  ((ld) this).field_o = ((ld) this).field_o + 1;
                  ((ld) this).field_u[fieldTemp$10] = (byte)(((ld) this).field_u[fieldTemp$10] + param0);
                  ((ld) this).field_u[((ld) this).field_o] = (byte) 0;
                  ((ld) this).field_z = 8;
                  return;
                } else {
                  return;
                }
              } else {
                int fieldTemp$11 = ((ld) this).field_o;
                ((ld) this).field_o = ((ld) this).field_o + 1;
                ((ld) this).field_u[fieldTemp$11] = (byte)(((ld) this).field_u[fieldTemp$11] + param0);
                ((ld) this).field_u[((ld) this).field_o] = (byte) 0;
                ((ld) this).field_z = 8;
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = 0;
        field_w = 50;
        field_A = new String[]{"Mega Miner", "Magma Miner", "Pit Lord", "6M Crew Member", "Iron Pick", "Silver Helm", "Golden Rope", "Effluvium Canary", "Diamond Boots", "Slayer of the Myth", "Volcanic Delver", "Aqua Miner", "Demolition Miner", "Minted Miner", "Arctic Explorer", "Iceman", "Polar Prince", "King of the Snowmen", "Freezium Lamp", "Oil Sheik", "Frozen Blubber", "Save the Walrus", "Found the King", "Pick Up a Penguin", "Snow Way Out", "Taking the Mick", "Size 12 Carbon Footprint", "Seen It All", "On the Rocks", "Meteoric Rise", "Just For the Thrill", "Major Disturbance", "Tremors", "Play With Fire"};
    }
}
