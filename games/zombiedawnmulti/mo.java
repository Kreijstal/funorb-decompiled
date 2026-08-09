/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo extends cj {
    static long field_Gb;
    private cj field_Pb;
    static ao field_Lb;
    cj field_Mb;
    static th field_Fb;
    static cj field_Hb;
    static ri[] field_Ob;
    static int field_Kb;
    static String field_Nb;
    static int field_Ib;
    static hh field_Jb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param2, param5, param3, param4, -3344);
        if (param1 != 2) {
            return;
        }
        this.a(param0, -17369, param6);
    }

    public static void h(int param0) {
        field_Nb = null;
        field_Hb = null;
        field_Lb = null;
        if (param0 != 2) {
          field_Hb = (cj) null;
          field_Ob = null;
          field_Jb = null;
          field_Fb = null;
          return;
        } else {
          field_Ob = null;
          field_Jb = null;
          field_Fb = null;
          return;
        }
    }

    final int a(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        if (param1) {
          L0: {
            field_Ob = (ri[]) null;
            var4 = -param2;
            if (this.field_Pb != null) {
              var4 = this.field_Pb.e(0);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var5 = -param2;
            if (null == this.field_Mb) {
              break L1;
            } else {
              var5 = this.field_Mb.e(0);
              break L1;
            }
          }
          return param0 + param2 + param0 - (-var4 + -var5);
        } else {
          L2: {
            var4 = -param2;
            if (this.field_Pb != null) {
              var4 = this.field_Pb.e(0);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var5 = -param2;
            if (null == this.field_Mb) {
              break L3;
            } else {
              var5 = this.field_Mb.e(0);
              break L3;
            }
          }
          return param0 + param2 + param0 - (-var4 + -var5);
        }
    }

    final static String a(String param0, int param1, int param2, String param3, ul param4) {
        RuntimeException var5 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param4.a((byte) -119)) {
              stackIn_3_0 = (String) (param3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 == -3) {
                  break L1;
                } else {
                  field_Kb = -26;
                  break L1;
                }
              }
              stackIn_7_0 = param0 + " - " + param4.a(param1, (byte) 121) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("mo.HA(");

            if (param0 == null) {
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
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(int param0, k param1, int param2, int param3, byte param4) {
        try {
            param1.a(-120, 12);
            param1.a(17, (byte) -56);
            if (param4 != -124) {
                field_Gb = 73L;
            }
            param1.a(param0, (byte) -70);
            param1.a(param3, (byte) -42);
            param1.a(-118, param2);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "mo.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void i(int param0) {
        jg.field_a = false;
        if (param0 > -2) {
            mo.i(-59);
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        L0: {
          var4 = -param0;
          var5 = -param0;
          if (null != this.field_Pb) {
            var4 = this.field_Pb.e(param1 + 17369);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == -17369) {
          L1: {
            if (null == this.field_Mb) {
              break L1;
            } else {
              var5 = this.field_Mb.a(-1, -param2 + -param0 + (-var4 + this.field_zb + -param2));
              break L1;
            }
          }
          L2: {
            var6 = var5 + (var4 + (param2 + param0 - -param2));
            if (this.field_zb < var6) {
              var5 = var5 + (this.field_zb + -var6);
              var6 = this.field_zb;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if ((this.field_R ^ -1) == -2) {
              param2 = param2 + (this.field_zb + -var6) / 2;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if ((this.field_R ^ -1) != -3) {
              break L4;
            } else {
              param2 = param2 + (-var6 + this.field_zb);
              break L4;
            }
          }
          L5: {
            if (this.field_Pb != null) {
              this.field_Pb.a(this.field_z, 0, var4, param2, param1 ^ 20183);
              this.field_Pb.field_lb = this.field_lb;
              break L5;
            } else {
              break L5;
            }
          }
          if (this.field_Mb != null) {
            this.field_Mb.a(this.field_z, 0, var5, param2 - (-var4 + -param0), -3344);
            if (null != this.field_Pb) {
              this.field_Mb.field_R = 0;
              this.field_Mb.field_lb = this.field_lb;
              return;
            } else {
              this.field_Mb.field_R = this.field_R;
              if (!ZombieDawnMulti.field_E) {
                this.field_Mb.field_lb = this.field_lb;
                return;
              } else {
                this.field_Mb.field_R = 0;
                this.field_Mb.field_lb = this.field_lb;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          L6: {
            field_Gb = -30L;
            if (null == this.field_Mb) {
              break L6;
            } else {
              var5 = this.field_Mb.a(-1, -param2 + -param0 + (-var4 + this.field_zb + -param2));
              break L6;
            }
          }
          L7: {
            var6 = var5 + (var4 + (param2 + param0 - -param2));
            if (this.field_zb < var6) {
              var5 = var5 + (this.field_zb + -var6);
              var6 = this.field_zb;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if ((this.field_R ^ -1) == -2) {
              param2 = param2 + (this.field_zb + -var6) / 2;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if ((this.field_R ^ -1) != -3) {
              break L9;
            } else {
              param2 = param2 + (-var6 + this.field_zb);
              break L9;
            }
          }
          L10: {
            if (this.field_Pb != null) {
              this.field_Pb.a(this.field_z, 0, var4, param2, param1 ^ 20183);
              this.field_Pb.field_lb = this.field_lb;
              break L10;
            } else {
              break L10;
            }
          }
          if (this.field_Mb != null) {
            this.field_Mb.a(this.field_z, 0, var5, param2 - (-var4 + -param0), -3344);
            if (null != this.field_Pb) {
              this.field_Mb.field_R = 0;
              this.field_Mb.field_lb = this.field_lb;
              return;
            } else {
              this.field_Mb.field_R = this.field_R;
              if (!ZombieDawnMulti.field_E) {
                this.field_Mb.field_lb = this.field_lb;
                return;
              } else {
                this.field_Mb.field_R = 0;
                this.field_Mb.field_lb = this.field_lb;
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        int var9;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param4 <= param2) {
          if (param2 < param6) {
            ld.a(-12628, param6, param2, param5, param3, param4, param0, oo.field_i, param1);
            if (param7 > 30) {
              return;
            } else {
              mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
              return;
            }
          } else {
            if (param4 < param6) {
              ld.a(-12628, param2, param6, param0, param3, param4, param5, oo.field_i, param1);
              if (var9 == 0) {
                if (param7 > 30) {
                  return;
                } else {
                  mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                  return;
                }
              } else {
                ld.a(-12628, param6, param2, param5, param3, param4, param0, oo.field_i, param1);
                if (param7 > 30) {
                  return;
                } else {
                  mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                  return;
                }
              }
            } else {
              ld.a(-12628, param2, param4, param0, param5, param6, param3, oo.field_i, param1);
              if (var9 != 0) {
                ld.a(-12628, param2, param6, param0, param3, param4, param5, oo.field_i, param1);
                if (var9 == 0) {
                  if (param7 > 30) {
                    return;
                  } else {
                    mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                    return;
                  }
                } else {
                  ld.a(-12628, param6, param2, param5, param3, param4, param0, oo.field_i, param1);
                  if (param7 <= 30) {
                    mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param7 <= 30) {
                  mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (param4 < param6) {
            ld.a(-12628, param6, param4, param5, param0, param2, param3, oo.field_i, param1);
            if (var9 != 0) {
              if (param6 > param2) {
                ld.a(-12628, param4, param6, param3, param0, param2, param5, oo.field_i, param1);
                if (var9 != 0) {
                  L0: {
                    if (param2 < param6) {
                      ld.a(-12628, param6, param2, param5, param3, param4, param0, oo.field_i, param1);
                      break L0;
                    } else {
                      L1: {
                        if (param4 < param6) {
                          break L1;
                        } else {
                          ld.a(-12628, param2, param4, param0, param5, param6, param3, oo.field_i, param1);
                          if (var9 == 0) {
                            break L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                      ld.a(-12628, param2, param6, param0, param3, param4, param5, oo.field_i, param1);
                      if (var9 == 0) {
                        break L0;
                      } else {
                        L2: {
                          ld.a(-12628, param6, param2, param5, param3, param4, param0, oo.field_i, param1);
                          if (param7 > 30) {
                            break L2;
                          } else {
                            mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                            break L2;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (param7 <= 30) {
                    mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param7 <= 30) {
                    mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                ld.a(-12628, param4, param2, param3, param5, param6, param0, oo.field_i, param1);
                if (var9 == 0) {
                  if (param7 <= 30) {
                    mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L3: {
                    ld.a(-12628, param4, param6, param3, param0, param2, param5, oo.field_i, param1);
                    if (param2 < param6) {
                      ld.a(-12628, param6, param2, param5, param3, param4, param0, oo.field_i, param1);
                      break L3;
                    } else {
                      L4: {
                        if (param4 < param6) {
                          break L4;
                        } else {
                          ld.a(-12628, param2, param4, param0, param5, param6, param3, oo.field_i, param1);
                          break L4;
                        }
                      }
                      ld.a(-12628, param2, param6, param0, param3, param4, param5, oo.field_i, param1);
                      if (var9 == 0) {
                        break L3;
                      } else {
                        ld.a(-12628, param6, param2, param5, param3, param4, param0, oo.field_i, param1);
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param7 > 30) {
                      break L5;
                    } else {
                      mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                      break L5;
                    }
                  }
                  return;
                }
              }
            } else {
              if (param7 <= 30) {
                mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                return;
              } else {
                return;
              }
            }
          } else {
            L6: {
              if (param6 > param2) {
                ld.a(-12628, param4, param6, param3, param0, param2, param5, oo.field_i, param1);
                if (var9 == 0) {
                  break L6;
                } else {
                  L7: {
                    if (param2 < param6) {
                      ld.a(-12628, param6, param2, param5, param3, param4, param0, oo.field_i, param1);
                      break L7;
                    } else {
                      L8: {
                        if (param4 < param6) {
                          break L8;
                        } else {
                          ld.a(-12628, param2, param4, param0, param5, param6, param3, oo.field_i, param1);
                          break L8;
                        }
                      }
                      ld.a(-12628, param2, param6, param0, param3, param4, param5, oo.field_i, param1);
                      if (var9 == 0) {
                        break L7;
                      } else {
                        ld.a(-12628, param6, param2, param5, param3, param4, param0, oo.field_i, param1);
                        break L7;
                      }
                    }
                  }
                  L9: {
                    if (param7 > 30) {
                      break L9;
                    } else {
                      mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                ld.a(-12628, param4, param2, param3, param5, param6, param0, oo.field_i, param1);
                if (var9 == 0) {
                  break L6;
                } else {
                  L10: {
                    ld.a(-12628, param4, param6, param3, param0, param2, param5, oo.field_i, param1);
                    if (param2 < param6) {
                      ld.a(-12628, param6, param2, param5, param3, param4, param0, oo.field_i, param1);
                      break L10;
                    } else {
                      L11: {
                        if (param4 < param6) {
                          break L11;
                        } else {
                          ld.a(-12628, param2, param4, param0, param5, param6, param3, oo.field_i, param1);
                          break L11;
                        }
                      }
                      ld.a(-12628, param2, param6, param0, param3, param4, param5, oo.field_i, param1);
                      if (var9 == 0) {
                        break L10;
                      } else {
                        ld.a(-12628, param6, param2, param5, param3, param4, param0, oo.field_i, param1);
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (param7 > 30) {
                      break L12;
                    } else {
                      mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                      break L12;
                    }
                  }
                  return;
                }
              }
            }
            if (param7 <= 30) {
              mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
              return;
            } else {
              return;
            }
          }
        }
    }

    mo(long param0, cj param1, cj param2, cj param3, ja param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                this.field_Pb = new cj(0L, param2);
                this.field_Pb.field_rb = param4;
                this.a((byte) 50, this.field_Pb);
                break L1;
              }
            }
            L2: {
              if (param5 != null) {
                this.field_Mb = new cj(0L, param3, param5);
                this.a((byte) 50, this.field_Mb);
                this.f(-128);
                break L2;
              } else {
                this.f(-128);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("mo.<init>(").append(param0).append(',');

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
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_22_2 + ')');
        }
    }

    static {
        field_Lb = new ao(10, 2, 2, 0);
        field_Kb = 22;
        field_Nb = "Your email address is used to identify this account";
        field_Fb = new th();
        field_Jb = new hh(1);
    }
}
