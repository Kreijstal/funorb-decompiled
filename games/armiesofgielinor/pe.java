/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends bd {
    private int field_y;
    static int[] field_s;
    static String field_w;
    private int field_t;
    private int field_u;
    static String field_v;
    private int field_A;
    static je field_x;
    private int field_z;

    final void a(int param0, ha param1) {
        try {
          param1.field_l.a((byte) -119, (tc) (new kf(this.field_u, this.field_y, this.field_t, this.field_A, this.field_z, this.field_m)));
          if (param0 != 64) {
            pe.a(53, false, (String[][]) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "pe.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, boolean param1, String[][] param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param2[param0][0];
          if (!kq.a(var3, param1)) {
            return var3;
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("pe.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = -106 / ((param0 - 59) / 60);
        field_x = null;
        field_s = null;
        field_v = null;
        field_w = null;
    }

    final static int b(int param0, int param1) {
        double var2;
        double var4;
        double var6;
        double var8;
        double var10;
        double var12;
        double var14;
        double var16;
        int var18;
        int var19;
        int var20;
        int var21;
        var21 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = (double)(255 & param1 >> 16) / 256.0;
        var4 = (double)((param1 & 65459) >> 8) / 256.0;
        if (param0 < 22) {
          return -33;
        }
        var6 = (double)(param1 & 255) / 256.0;
        var8 = var2;
        if (var8 > var4) {
          var8 = var4;
        }
        if (var8 > var6) {
          var8 = var6;
        }
        var10 = var2;
        if (var10 < var4) {
          var10 = var4;
        }
        if (var10 < var6) {
          var10 = var6;
        }
        var12 = 0.0;
        var14 = 0.0;
        var16 = (var8 + var10) / 2.0;
        if (var8 == var10) {
          var12 = var12 / 6.0;
          var18 = (int)(256.0 * var12);
          var19 = (int)(256.0 * var14);
          var20 = (int)(var16 * 256.0);
          if (0 <= var19) {
            if (var19 > 255) {
              var19 = 255;
            }
            if (0 > var20) {
              var20 = 0;
            } else {
              if (var20 > 255) {
                var20 = 255;
              }
            }
            if (243 < var20) {
              var19 = var19 >> 4;
            } else {
              if (var20 <= 217) {
                if (192 < var20) {
                  var19 = var19 >> 2;
                } else {
                  if (var20 > 179) {
                    var19 = var19 >> 1;
                  }
                }
              } else {
                var19 = var19 >> 3;
              }
            }
            return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) - (var20 >> 1));
          }
          var19 = 0;
          if (0 > var20) {
            var20 = 0;
          } else {
            if (var20 > 255) {
              var20 = 255;
              if (243 < var20) {
                var19 = var19 >> 4;
              } else {
                if (var20 <= 217) {
                  if (192 < var20) {
                    var19 = var19 >> 2;
                  } else {
                    if (var20 > 179) {
                      var19 = var19 >> 1;
                    }
                  }
                } else {
                  var19 = var19 >> 3;
                }
              }
              return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) - (var20 >> 1));
            }
          }
        } else {
          if (var16 < 0.5) {
            var14 = (-var8 + var10) / (var10 + var8);
          }
          if (var10 != var2) {
            if (var4 == var10) {
              var12 = 2.0 + (-var2 + var6) / (-var8 + var10);
            } else {
              if (var6 != var10) {
                if (0.5 <= var16) {
                  var14 = (var10 - var8) / (2.0 - var10 - var8);
                }
                var12 = var12 / 6.0;
                var18 = (int)(256.0 * var12);
                var19 = (int)(256.0 * var14);
                var20 = (int)(var16 * 256.0);
                if (0 <= var19) {
                  if (var19 > 255) {
                    var19 = 255;
                  }
                  if (0 > var20) {
                    var20 = 0;
                  } else {
                    if (var20 > 255) {
                      var20 = 255;
                    }
                  }
                  if (243 < var20) {
                    var19 = var19 >> 4;
                  } else {
                    if (var20 <= 217) {
                      if (192 < var20) {
                        var19 = var19 >> 2;
                      } else {
                        if (var20 > 179) {
                          var19 = var19 >> 1;
                        }
                      }
                    } else {
                      var19 = var19 >> 3;
                    }
                  }
                  return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) - (var20 >> 1));
                }
                var19 = 0;
                if (0 > var20) {
                  var20 = 0;
                } else {
                  if (var20 > 255) {
                    var20 = 255;
                    if (243 < var20) {
                      var19 = var19 >> 4;
                    } else {
                      if (var20 <= 217) {
                        if (192 < var20) {
                          var19 = var19 >> 2;
                        } else {
                          if (var20 > 179) {
                            var19 = var19 >> 1;
                          }
                        }
                      } else {
                        var19 = var19 >> 3;
                      }
                    }
                    return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) - (var20 >> 1));
                  }
                }
                if (243 < var20) {
                  var19 = var19 >> 4;
                  return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) - (var20 >> 1));
                }
                if (var20 > 217) {
                  var19 = var19 >> 3;
                  return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) - (var20 >> 1));
                }
                if (192 < var20) {
                  var19 = var19 >> 2;
                  return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) - (var20 >> 1));
                }
                if (var20 <= 179) {
                  return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) - (var20 >> 1));
                }
                var19 = var19 >> 1;
                return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) - (var20 >> 1));
              }
              var12 = 4.0 + (-var4 + var2) / (-var8 + var10);
            }
          } else {
            var12 = (-var6 + var4) / (var10 - var8);
          }
          if (0.5 <= var16) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
          }
          var12 = var12 / 6.0;
          var18 = (int)(256.0 * var12);
          var19 = (int)(256.0 * var14);
          var20 = (int)(var16 * 256.0);
          if (0 > var19) {
            var19 = 0;
          } else {
            if (var19 <= 255) {
              if (0 > var20) {
                var20 = 0;
              } else {
                if (var20 > 255) {
                  var20 = 255;
                }
              }
              if (243 < var20) {
                var19 = var19 >> 4;
              } else {
                if (var20 <= 217) {
                  if (192 < var20) {
                    var19 = var19 >> 2;
                  } else {
                    if (var20 > 179) {
                      var19 = var19 >> 1;
                    }
                  }
                } else {
                  var19 = var19 >> 3;
                }
              }
              return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) - (var20 >> 1));
            }
            var19 = 255;
          }
          if (0 > var20) {
            var20 = 0;
          } else {
            if (var20 > 255) {
              var20 = 255;
            }
          }
        }
        if (243 < var20) {
          var19 = var19 >> 4;
          return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) - (var20 >> 1));
        }
        if (var20 > 217) {
          var19 = var19 >> 3;
          return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) - (var20 >> 1));
        }
        if (192 < var20) {
          var19 = var19 >> 2;
          return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) - (var20 >> 1));
        }
        if (var20 <= 179) {
          return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) - (var20 >> 1));
        }
        var19 = var19 >> 1;
        return ((var18 & 255) >> 2 << 10) - (-(var19 >> 5 << 7) - (var20 >> 1));
    }

    pe(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_u = param0;
        this.field_t = param2;
        this.field_y = param1;
        this.field_A = param3;
        this.field_z = param4;
        this.field_m = param5;
    }

    static {
        field_w = "Back";
        field_v = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
