/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uja {
    static int[] field_e;
    static int[] field_c;
    static fma field_a;
    private vna field_b;
    private vg field_d;

    final vg a(boolean param0) {
        vg var2;
        var2 = this.field_b.field_e.field_a;
        if (this.field_b.field_e != var2) {
          this.field_d = var2.field_a;
          if (!param0) {
            return (vg) null;
          } else {
            return var2;
          }
        } else {
          this.field_d = null;
          return null;
        }
    }

    final vg a(vg param0, byte param1) {
        vg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        vg stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = this.field_b.field_e.field_e;
                break L1;
              }
            }
            L2: {
              if (param1 == -11) {
                break L2;
              } else {
                this.field_b = (vna) null;
                break L2;
              }
            }
            if (var3 == this.field_b.field_e) {
              this.field_d = null;
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_d = var3.field_e;
              stackIn_10_0 = (vg) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("uja.G(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vg) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    final vg a(int param0) {
        vg var2;
        var2 = this.field_d;
        if (var2 != this.field_b.field_e) {
          this.field_d = var2.field_a;
          if (param0 != -1) {
            return (vg) null;
          } else {
            return var2;
          }
        } else {
          this.field_d = null;
          return null;
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_a = null;
        field_c = null;
        if (param0 != 2) {
            field_a = (fma) null;
        }
    }

    final vg a(byte param0) {
        vg var2 = this.field_b.field_e.field_e;
        if (param0 < 37) {
            this.a((byte) -78);
            if (!(this.field_b.field_e != var2)) {
                this.field_d = null;
                return null;
            }
            this.field_d = var2.field_e;
            return var2;
        }
        if (!(this.field_b.field_e != var2)) {
            this.field_d = null;
            return null;
        }
        this.field_d = var2.field_e;
        return var2;
    }

    final vg c(int param0) {
        vg var2 = this.field_d;
        if (param0 < 28) {
            return (vg) null;
        }
        if (!(var2 != this.field_b.field_e)) {
            this.field_d = null;
            return null;
        }
        this.field_d = var2.field_e;
        return var2;
    }

    final static ssa a(byte param0, ha param1) {
        wl var2 = null;
        RuntimeException var2_ref = null;
        ssa var3 = null;
        ha var4 = null;
        ssa stackIn_3_0 = null;
        ssa stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (he.field_c == param1) {
              stackIn_3_0 = sda.field_g;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  var2 = (wl) ((Object) hla.field_ub.a((byte) -96, (long)param1.field_a));
                  if (var2 == null) {
                    break L2;
                  } else {
                    if (var2.field_g != param1) {
                      break L2;
                    } else {
                      var3 = var2.field_j;
                      break L1;
                    }
                  }
                }
                L3: {
                  if (var2 != null) {
                    var2.p(68);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = new ssa(param1);
                hla.field_ub.a((long)param1.field_a, 109, new wl(param1, var3));
                break L1;
              }
              L4: {
                if (param0 == 65) {
                  break L4;
                } else {
                  var4 = (ha) null;
                  uja.a((byte) -102, (ha) null);
                  break L4;
                }
              }
              he.field_c = param1;
              sda.field_g = var3;
              stackIn_14_0 = (ssa) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2_ref);

            stackIn_17_1 = new StringBuilder().append("uja.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_14_0;
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_98_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        L0: {
          if ((1 & param1) == 0) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (-1 == (2 & param1 ^ -1)) {
            stackIn_6_0 = 0;
            break L1;
          } else {
            stackIn_6_0 = 1;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_6_0;
          if (-1 == (param1 & 4 ^ -1)) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = 1;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          if (-1 == (8 & param1 ^ -1)) {
            stackIn_12_0 = 0;
            break L3;
          } else {
            stackIn_12_0 = 1;
            break L3;
          }
        }
        L4: {
          var5 = stackIn_12_0;
          if (0 == (16 & param1)) {
            stackIn_15_0 = 0;
            break L4;
          } else {
            stackIn_15_0 = 1;
            break L4;
          }
        }
        L5: {
          var6 = stackIn_15_0;
          if ((param1 & 32) == 0) {
            stackIn_18_0 = 0;
            break L5;
          } else {
            stackIn_18_0 = 1;
            break L5;
          }
        }
        L6: {
          var7 = stackIn_18_0;
          var9 = 31 / ((param0 - 65) / 61);
          if ((128 & param1) == 0) {
            stackIn_21_0 = 0;
            break L6;
          } else {
            stackIn_21_0 = 1;
            break L6;
          }
        }
        L7: {
          var8 = stackIn_21_0;
          if (0 == (256 & param1)) {
            stackIn_24_0 = 0;
            break L7;
          } else {
            stackIn_24_0 = 1;
            break L7;
          }
        }
        L8: {
          var10 = stackIn_24_0;
          if (var4 == 0) {
            break L8;
          } else {
            if (var5 != 0) {
              var4 = 0;
              var5 = 0;
              break L8;
            } else {
              L9: {
                if (var2 == 0) {
                  break L9;
                } else {
                  if (var3 == 0) {
                    break L9;
                  } else {
                    var3 = 0;
                    var2 = 0;
                    break L9;
                  }
                }
              }
              L10: {
                if (0 == (param1 & 64)) {
                  stackIn_32_0 = 0;
                  break L10;
                } else {
                  stackIn_32_0 = 1;
                  break L10;
                }
              }
              var11 = stackIn_32_0;
              if (var8 == 0) {
                if (var10 != 0) {
                  L11: {
                    var15 = 1;
                    var18 = 0;
                    var13 = 1;
                    var12 = 1;
                    var16 = var8;
                    var14 = 1;
                    var17 = var10;
                    var19 = 0;
                    if (var12 != 0) {
                      var19 = var19 | 1;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var13 != 0) {
                      var19 = var19 | 2;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var14 != 0) {
                      var19 = var19 | 4;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (var15 == 0) {
                      break L14;
                    } else {
                      var19 = var19 | 8;
                      break L14;
                    }
                  }
                  L15: {
                    if (var16 == 0) {
                      break L15;
                    } else {
                      var19 = var19 | 16;
                      break L15;
                    }
                  }
                  L16: {
                    if (var17 == 0) {
                      break L16;
                    } else {
                      var19 = var19 | 32;
                      break L16;
                    }
                  }
                  L17: {
                    if (var18 == 0) {
                      break L17;
                    } else {
                      var19 = var19 | 64;
                      break L17;
                    }
                  }
                  return var19;
                } else {
                  L18: {
                    var17 = var7;
                    var13 = var3;
                    var15 = var5;
                    var16 = var6;
                    var12 = var2;
                    var14 = var4;
                    var18 = var11;
                    var19 = 0;
                    if (var12 != 0) {
                      var19 = var19 | 1;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (var13 != 0) {
                      var19 = var19 | 2;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (var14 != 0) {
                      var19 = var19 | 4;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (var15 == 0) {
                      break L21;
                    } else {
                      var19 = var19 | 8;
                      break L21;
                    }
                  }
                  L22: {
                    if (var16 == 0) {
                      break L22;
                    } else {
                      var19 = var19 | 16;
                      break L22;
                    }
                  }
                  L23: {
                    if (var17 == 0) {
                      break L23;
                    } else {
                      var19 = var19 | 32;
                      break L23;
                    }
                  }
                  L24: {
                    if (var18 == 0) {
                      break L24;
                    } else {
                      var19 = var19 | 64;
                      break L24;
                    }
                  }
                  return var19;
                }
              } else {
                var15 = 1;
                var18 = 0;
                var13 = 1;
                var12 = 1;
                var16 = var8;
                var14 = 1;
                var17 = var10;
                L25: {
                  var19 = 0;
                  if (var12 != 0) {
                    var19 = var19 | 1;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (var13 != 0) {
                    var19 = var19 | 2;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (var14 != 0) {
                    var19 = var19 | 4;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (var15 == 0) {
                    break L28;
                  } else {
                    var19 = var19 | 8;
                    break L28;
                  }
                }
                L29: {
                  if (var16 == 0) {
                    break L29;
                  } else {
                    var19 = var19 | 16;
                    break L29;
                  }
                }
                L30: {
                  if (var17 == 0) {
                    break L30;
                  } else {
                    var19 = var19 | 32;
                    break L30;
                  }
                }
                L31: {
                  if (var18 == 0) {
                    break L31;
                  } else {
                    var19 = var19 | 64;
                    break L31;
                  }
                }
                return var19;
              }
            }
          }
        }
        L32: {
          if (var2 == 0) {
            break L32;
          } else {
            if (var3 == 0) {
              break L32;
            } else {
              var3 = 0;
              var2 = 0;
              break L32;
            }
          }
        }
        L33: {
          if (0 == (param1 & 64)) {
            stackIn_98_0 = 0;
            break L33;
          } else {
            stackIn_98_0 = 1;
            break L33;
          }
        }
        var11 = stackIn_98_0;
        if (var8 == 0) {
          if (var10 != 0) {
            L34: {
              var15 = 1;
              var18 = 0;
              var13 = 1;
              var12 = 1;
              var16 = var8;
              var14 = 1;
              var17 = var10;
              var19 = 0;
              if (var12 != 0) {
                var19 = var19 | 1;
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              if (var13 != 0) {
                var19 = var19 | 2;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (var14 != 0) {
                var19 = var19 | 4;
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              if (var15 == 0) {
                break L37;
              } else {
                var19 = var19 | 8;
                break L37;
              }
            }
            L38: {
              if (var16 == 0) {
                break L38;
              } else {
                var19 = var19 | 16;
                break L38;
              }
            }
            L39: {
              if (var17 == 0) {
                break L39;
              } else {
                var19 = var19 | 32;
                break L39;
              }
            }
            L40: {
              if (var18 == 0) {
                break L40;
              } else {
                var19 = var19 | 64;
                break L40;
              }
            }
            return var19;
          } else {
            L41: {
              var17 = var7;
              var13 = var3;
              var15 = var5;
              var16 = var6;
              var12 = var2;
              var14 = var4;
              var18 = var11;
              var19 = 0;
              if (var12 != 0) {
                var19 = var19 | 1;
                break L41;
              } else {
                break L41;
              }
            }
            L42: {
              if (var13 != 0) {
                var19 = var19 | 2;
                break L42;
              } else {
                break L42;
              }
            }
            L43: {
              if (var14 != 0) {
                var19 = var19 | 4;
                break L43;
              } else {
                break L43;
              }
            }
            L44: {
              if (var15 == 0) {
                break L44;
              } else {
                var19 = var19 | 8;
                break L44;
              }
            }
            L45: {
              if (var16 == 0) {
                break L45;
              } else {
                var19 = var19 | 16;
                break L45;
              }
            }
            L46: {
              if (var17 == 0) {
                break L46;
              } else {
                var19 = var19 | 32;
                break L46;
              }
            }
            L47: {
              if (var18 == 0) {
                break L47;
              } else {
                var19 = var19 | 64;
                break L47;
              }
            }
            return var19;
          }
        } else {
          var15 = 1;
          var18 = 0;
          var13 = 1;
          var12 = 1;
          var16 = var8;
          var14 = 1;
          var17 = var10;
          L48: {
            var19 = 0;
            if (var12 != 0) {
              var19 = var19 | 1;
              break L48;
            } else {
              break L48;
            }
          }
          L49: {
            if (var13 != 0) {
              var19 = var19 | 2;
              break L49;
            } else {
              break L49;
            }
          }
          L50: {
            if (var14 != 0) {
              var19 = var19 | 4;
              break L50;
            } else {
              break L50;
            }
          }
          L51: {
            if (var15 == 0) {
              break L51;
            } else {
              var19 = var19 | 8;
              break L51;
            }
          }
          L52: {
            if (var16 == 0) {
              break L52;
            } else {
              var19 = var19 | 16;
              break L52;
            }
          }
          L53: {
            if (var17 == 0) {
              break L53;
            } else {
              var19 = var19 | 32;
              break L53;
            }
          }
          L54: {
            if (var18 == 0) {
              break L54;
            } else {
              var19 = var19 | 64;
              break L54;
            }
          }
          return var19;
        }
    }

    final vg a(int param0, vg param1) {
        vg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        vg stackIn_9_0 = null;
        vg stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = this.field_b.field_e.field_a;
                break L1;
              }
            }
            if (this.field_b.field_e == var3) {
              this.field_d = null;
              stackIn_6_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == 0) {
                this.field_d = var3.field_a;
                stackIn_11_0 = (vg) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_9_0 = (vg) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("uja.H(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vg) ((Object) stackIn_6_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    uja(vna param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[]{15, 12, 7, 18, 41, 16};
        field_c = new int[]{0, 0};
    }
}
