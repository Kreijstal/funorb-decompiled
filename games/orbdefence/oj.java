/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends ca {
    private int field_i;
    private int field_n;
    private int field_h;
    static String field_o;
    private int field_f;
    private lb field_s;
    private int field_m;
    private boolean field_p;
    int field_g;
    private int field_k;
    private int field_l;
    static dh field_q;
    static fk field_j;
    static im field_r;

    final void a(byte param0) {
        if (0 <= this.field_g) {
          this.field_f = this.field_f + this.field_l;
          this.field_k = this.field_k + this.field_h;
          if (this.field_k > 1600) {
            this.field_h = this.field_h - 1;
            this.field_l = this.field_l + 1;
            if (param0 == 44) {
              if (!this.field_p) {
                L0: {
                  this.field_g = this.field_g + 1;
                  if ((this.field_g ^ -1) != -101) {
                    break L0;
                  } else {
                    if (!this.field_p) {
                      this.field_s.a((byte) -6, this.field_i);
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                L1: {
                  this.field_g = this.field_g + 2;
                  this.field_g = this.field_g + 1;
                  if ((this.field_g ^ -1) != -101) {
                    break L1;
                  } else {
                    if (!this.field_p) {
                      this.field_s.a((byte) -6, this.field_i);
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              this.field_f = -103;
              if (this.field_p) {
                this.field_g = this.field_g + 2;
                this.field_g = this.field_g + 1;
                if ((this.field_g ^ -1) == -101) {
                  L2: {
                    if (!this.field_p) {
                      this.field_s.a((byte) -6, this.field_i);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                this.field_g = this.field_g + 1;
                if ((this.field_g ^ -1) == -101) {
                  if (this.field_p) {
                    return;
                  } else {
                    this.field_s.a((byte) -6, this.field_i);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            this.field_h = this.field_h + 1;
            this.field_l = this.field_l + 1;
            if (param0 == 44) {
              if (!this.field_p) {
                this.field_g = this.field_g + 1;
                if ((this.field_g ^ -1) == -101) {
                  if (!this.field_p) {
                    this.field_s.a((byte) -6, this.field_i);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                this.field_g = this.field_g + 2;
                this.field_g = this.field_g + 1;
                if ((this.field_g ^ -1) == -101) {
                  if (!this.field_p) {
                    this.field_s.a((byte) -6, this.field_i);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              this.field_f = -103;
              if (!this.field_p) {
                this.field_g = this.field_g + 1;
                if ((this.field_g ^ -1) == -101) {
                  if (this.field_p) {
                    return;
                  } else {
                    this.field_s.a((byte) -6, this.field_i);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                this.field_g = this.field_g + 2;
                this.field_g = this.field_g + 1;
                if ((this.field_g ^ -1) == -101) {
                  if (this.field_p) {
                    return;
                  } else {
                    this.field_s.a((byte) -6, this.field_i);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (param0 != 44) {
            this.field_f = -103;
            if (this.field_p) {
              this.field_g = this.field_g + 2;
              this.field_g = this.field_g + 1;
              if ((this.field_g ^ -1) == -101) {
                if (this.field_p) {
                  return;
                } else {
                  this.field_s.a((byte) -6, this.field_i);
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_g = this.field_g + 1;
              if ((this.field_g ^ -1) == -101) {
                if (this.field_p) {
                  return;
                } else {
                  this.field_s.a((byte) -6, this.field_i);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L3: {
              if (!this.field_p) {
                break L3;
              } else {
                this.field_g = this.field_g + 2;
                break L3;
              }
            }
            L4: {
              this.field_g = this.field_g + 1;
              if ((this.field_g ^ -1) != -101) {
                break L4;
              } else {
                if (!this.field_p) {
                  this.field_s.a((byte) -6, this.field_i);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            return;
          }
        }
    }

    final static int a(byte param0, int param1) {
        int var2;
        if (param0 == 47) {
          var2 = 1;
          if (-2 != (param1 ^ -1)) {
            if (-3 != (param1 ^ -1)) {
              if (param1 == 5) {
                L0: {
                  var2 = 2;
                  if ((param1 ^ -1) != -5) {
                    break L0;
                  } else {
                    var2 = 3;
                    break L0;
                  }
                }
                return var2;
              } else {
                L1: {
                  if ((param1 ^ -1) != -5) {
                    break L1;
                  } else {
                    var2 = 3;
                    break L1;
                  }
                }
                return var2;
              }
            } else {
              L2: {
                var2 = 2;
                if ((param1 ^ -1) != -5) {
                  break L2;
                } else {
                  var2 = 3;
                  break L2;
                }
              }
              return var2;
            }
          } else {
            L3: {
              var2 = 2;
              if ((param1 ^ -1) != -5) {
                break L3;
              } else {
                var2 = 3;
                break L3;
              }
            }
            return var2;
          }
        } else {
          return 15;
        }
    }

    final static boolean a(ti param0, int param1, ti param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var3_int = param0.field_ab + -param2.field_ab;
            if (param1 == 100) {
              L1: {
                if (param0.field_Z == uc.field_r) {
                  var3_int -= 200;
                  break L1;
                } else {
                  if (null == param0.field_Z) {
                    var3_int += 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (param2.field_Z != uc.field_r) {
                  if (param2.field_Z == null) {
                    var3_int -= 200;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var3_int += 200;
                  break L2;
                }
              }
              L3: {
                if (var3_int <= 0) {
                  stackIn_17_0 = 0;
                  break L3;
                } else {
                  stackIn_17_0 = 1;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("oj.C(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_17_0 != 0;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var11 = OrbDefence.field_D ? 1 : 0;
          var4 = -param1 + ((this.field_f >> 1036800260) + 320);
          var5 = 240 + ((this.field_k >> 1292743844) + -param2);
          if (!this.field_p) {
            break L0;
          } else {
            var4 = (this.field_f >> 813333188) + 363;
            var5 = 24 - -(this.field_k >> 1942111140);
            break L0;
          }
        }
        L1: {
          var6 = 255;
          if (param0 == 54) {
            break L1;
          } else {
            this.a((byte) 2, -56, 109);
            break L1;
          }
        }
        L2: {
          var7 = this.field_i + 3 << 498524868;
          var8 = this.field_g;
          var9 = 363;
          var10 = 24;
          if (this.field_p) {
            var9 = -param1 + (this.field_n >> -1355637692) + 320;
            var10 = (this.field_m >> 741293284) - param2 + 240;
            break L2;
          } else {
            break L2;
          }
        }
        if (100 >= var8) {
          if (0 <= var8) {
            var4 = (var8 * var9 + var4 * (-var8 + 100)) / 100;
            var5 = (var8 * var10 + var5 * (-var8 + 100)) / 100;
            if (var8 < 0) {
              if (!this.field_p) {
                return;
              } else {
                ul.a(5808, 384, 320, 200, em.field_s);
                return;
              }
            } else {
              ul.a(var4 << -1244787388, var5 << -1297325724, var7, var6, ki.field_f);
              return;
            }
          } else {
            if (var8 < 0) {
              if (!this.field_p) {
                return;
              } else {
                ul.a(5808, 384, 320, 200, em.field_s);
                return;
              }
            } else {
              ul.a(var4 << -1244787388, var5 << -1297325724, var7, var6, ki.field_f);
              return;
            }
          }
        } else {
          var5 = var10;
          var4 = var9;
          if (!this.field_p) {
            var6 = 200 - var8;
            var7 = 320;
            if (var8 < 0) {
              if (!this.field_p) {
                return;
              } else {
                ul.a(5808, 384, 320, 200, em.field_s);
                return;
              }
            } else {
              ul.a(var4 << -1244787388, var5 << -1297325724, var7, var6, ki.field_f);
              return;
            }
          } else {
            return;
          }
        }
    }

    oj(int param0, int param1, lb param2, int param3) {
        try {
            this.field_k = param1 * ol.field_e << -16368572;
            this.field_f = ol.field_e * param0 << -506286044;
            this.field_l = (int)(-80.0 + Math.random() * 161.0);
            this.field_h = (int)(Math.random() * 161.0 - 80.0);
            this.field_i = 1;
            this.field_g = -param3;
            this.field_s = param2;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "oj.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void c(int param0) {
        field_o = null;
        field_j = null;
        if (param0 != 384) {
          oj.c(100);
          field_q = null;
          field_r = null;
          return;
        } else {
          field_q = null;
          field_r = null;
          return;
        }
    }

    oj(int param0, int param1, lb param2, int param3, int param4) {
        try {
            this.field_k = param1 * ol.field_e << 1397294020;
            this.field_f = param0 * ol.field_e << -402839292;
            this.field_l = (int)(-80.0 + Math.random() * 161.0);
            this.field_h = (int)(-80.0 + Math.random() * 161.0);
            this.field_g = -param3;
            this.field_s = param2;
            this.field_i = param4;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "oj.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_o = "BIG SHOT";
        field_j = new fk(2);
        field_r = new im();
    }
}
