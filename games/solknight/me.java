/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static ff field_f;
    private qd field_j;
    private da field_a;
    private da field_c;
    static da field_e;
    static boolean field_g;
    private qd field_i;
    static String field_h;
    static int field_d;
    static int field_b;

    private final sh a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sh var8 = null;
        ra var9 = null;
        sh var10 = null;
        sh stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        sh stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param3 ^ (param2 >>> -225487636 | 65533 & param2 << 1936877700);
            var5_int = var5_int | param2 << 1264444880;
            var6 = (long)var5_int;
            var8 = (sh) ((Object) this.field_i.a(true, var6));
            if (var8 == null) {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (-1 > (param0[0] ^ -1)) {
                    break L1;
                  } else {
                    stackIn_6_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (param1 == 1264444880) {
                  break L2;
                } else {
                  this.field_c = (da) null;
                  break L2;
                }
              }
              var9 = ra.a(this.field_a, param2, param3);
              if (var9 != null) {
                L3: {
                  var10 = var9.b();
                  var8 = var10;
                  this.field_i.a((byte) 76, var8, var6);
                  if (param0 == null) {
                    break L3;
                  } else {
                    param0[0] = param0[0] - var10.field_i.length;
                    break L3;
                  }
                }
                stackIn_15_0 = (sh) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (sh) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("me.C(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (sh) ((Object) stackIn_6_0);
          } else {
            return stackIn_15_0;
          }
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != 56) {
            return;
        }
        field_e = null;
        field_f = null;
    }

    final sh a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        sh stackIn_2_0 = null;
        sh stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_c.a((byte) 89) ^ -1) != param1) {
              if ((this.field_c.b(126, param2) ^ -1) == -2) {
                stackIn_6_0 = this.a(param2, 0, param0, (byte) -107);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new RuntimeException();
              }
            } else {
              stackIn_2_0 = this.a(0, param2, param0, (byte) -77);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("me.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final sh a(int param0, int param1, int[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sh var8 = null;
        sl var9 = null;
        sh stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        sh stackIn_17_0 = null;
        sh stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param1 ^ (65524 & param0 << 1829117700 | param0 >>> 1496353484);
            var5_int = var5_int | param0 << -1126249680;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (sh) ((Object) this.field_i.a(true, var6));
            if (var8 == null) {
              L1: {
                if (param2 == null) {
                  break L1;
                } else {
                  if ((param2[0] ^ -1) < -1) {
                    break L1;
                  } else {
                    stackIn_6_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                var9 = (sl) ((Object) this.field_j.a(true, var6));
                if (var9 != null) {
                  break L2;
                } else {
                  var9 = sl.a(this.field_c, param0, param1);
                  if (var9 != null) {
                    this.field_j.a((byte) 113, var9, var6);
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              var8 = var9.a(param2);
              if (var8 != null) {
                var9.c(10);
                if (param3 <= -52) {
                  this.field_i.a((byte) 40, var8, var6);
                  stackIn_19_0 = (sh) (var8);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_17_0 = (sh) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (sh) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("me.F(").append(param0).append(',').append(param1).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (sh) ((Object) stackIn_6_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              return stackIn_19_0;
            }
          }
        }
    }

    final static void a(boolean param0) {
        L0: {
          if (-10001 >= (lk.field_e ^ -1)) {
            vk.a(255, (byte) 89, 0);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          if (-20001 < (lk.field_e ^ -1)) {
            L1: {
              if (-30001 >= (lk.field_e ^ -1)) {
                vk.a(253, (byte) 89, 2);
                break L1;
              } else {
                break L1;
              }
            }
            if ((lk.field_e ^ -1) <= -40001) {
              L2: {
                vk.a(252, (byte) 89, 3);
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          } else {
            L4: {
              vk.a(254, (byte) 89, 1);
              if (-30001 >= (lk.field_e ^ -1)) {
                vk.a(253, (byte) 89, 2);
                break L4;
              } else {
                break L4;
              }
            }
            if ((lk.field_e ^ -1) <= -40001) {
              L5: {
                vk.a(252, (byte) 89, 3);
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            } else {
              L6: {
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            }
          }
        } else {
          field_g = true;
          if (-20001 >= (lk.field_e ^ -1)) {
            L7: {
              vk.a(254, (byte) 89, 1);
              if (-30001 >= (lk.field_e ^ -1)) {
                vk.a(253, (byte) 89, 2);
                break L7;
              } else {
                break L7;
              }
            }
            if ((lk.field_e ^ -1) > -40001) {
              L8: {
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L8;
                } else {
                  break L8;
                }
              }
              return;
            } else {
              L9: {
                vk.a(252, (byte) 89, 3);
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L9;
                } else {
                  break L9;
                }
              }
              return;
            }
          } else {
            L10: {
              if (-30001 >= (lk.field_e ^ -1)) {
                vk.a(253, (byte) 89, 2);
                break L10;
              } else {
                break L10;
              }
            }
            if ((lk.field_e ^ -1) <= -40001) {
              L11: {
                vk.a(252, (byte) 89, 3);
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L11;
                } else {
                  break L11;
                }
              }
              return;
            } else {
              L12: {
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L12;
                } else {
                  break L12;
                }
              }
              return;
            }
          }
        }
    }

    final sh a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        sh stackIn_5_0 = null;
        sh stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_b = 6;
                break L1;
              }
            }
            if (1 == this.field_a.a((byte) 105)) {
              stackIn_5_0 = this.a(param2, 1264444880, 0, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((this.field_a.b(12, param1) ^ -1) != -2) {
                throw new RuntimeException();
              } else {
                stackIn_8_0 = this.a(param2, 1264444880, param1, 0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("me.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_8_0;
        }
    }

    me(da param0, da param1) {
        this.field_j = new qd(256);
        this.field_i = new qd(256);
        try {
            this.field_c = param1;
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new ff(9, 0, 4, 1);
    }
}
