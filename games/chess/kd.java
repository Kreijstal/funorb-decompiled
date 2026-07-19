/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends ci {
    private ci field_Fb;
    private StringBuilder field_Jb;
    private int field_Gb;
    static String field_Eb;
    static int field_Hb;
    private ci field_Ib;

    public static void l(int param0) {
        if (param0 != -4403) {
            return;
        }
        field_Eb = null;
    }

    final int a(int param0, boolean param1) {
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        int var4 = 0;
        var4 = Chess.field_G;
        this.a(param1, (byte) 88);
        if (param0 == 3) {
          if (!param1) {
            this.field_Fb.field_db = this.field_Jb.toString();
            if (param1) {
              L0: {
                if (th.field_d == 0) {
                  break L0;
                } else {
                  if (this.field_L == 0) {
                    this.field_Gb = 1;
                    break L0;
                  } else {
                    return this.field_Gb;
                  }
                }
              }
              return this.field_Gb;
            } else {
              return this.field_Gb;
            }
          } else {
            L1: while (true) {
              if (!kf.d(18954)) {
                this.field_Fb.field_db = this.field_Jb.toString();
                if (param1) {
                  if (th.field_d != 0) {
                    if (this.field_L == 0) {
                      this.field_Gb = 1;
                      return this.field_Gb;
                    } else {
                      return this.field_Gb;
                    }
                  } else {
                    return this.field_Gb;
                  }
                } else {
                  return this.field_Gb;
                }
              } else {
                L2: {
                  if (85 != vg.field_a) {
                    break L2;
                  } else {
                    if (this.field_Jb.length() > 0) {
                      discarded$5 = rb.a(' ', this.field_Jb, this.field_Jb.length() - 1, (byte) -105);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (p.a((CharSequence) ((Object) this.field_Jb), d.field_Ib, -13)) {
                    discarded$6 = this.field_Jb.append(d.field_Ib);
                    break L3;
                  } else {
                    L4: {
                      if (0 != this.field_Jb.length()) {
                        break L4;
                      } else {
                        if (d.field_Ib == 91) {
                          discarded$7 = this.field_Jb.append(d.field_Ib);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (-2 != (this.field_Jb.length() ^ -1)) {
                        break L5;
                      } else {
                        if (35 == d.field_Ib) {
                          discarded$8 = this.field_Jb.append(d.field_Ib);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (93 != d.field_Ib) {
                      break L3;
                    } else {
                      discarded$9 = this.field_Jb.append(d.field_Ib);
                      break L3;
                    }
                  }
                }
                if (-85 != (vg.field_a ^ -1)) {
                  if (vg.field_a != 13) {
                    continue L1;
                  } else {
                    return 1;
                  }
                } else {
                  if ((this.field_Jb.length() ^ -1) >= -1) {
                    return 1;
                  } else {
                    this.field_db = this.field_Jb.toString();
                    return 2;
                  }
                }
              }
            }
          }
        } else {
          return -12;
        }
    }

    final boolean k(int param0) {
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        int var2 = 0;
        if ((this.field_Gb ^ -1) == param0) {
          if (85 == vg.field_a) {
            L0: {
              if (-1 > (this.field_Jb.length() ^ -1)) {
                discarded$9 = rb.a(' ', this.field_Jb, this.field_Jb.length() + -1, (byte) 116);
                break L0;
              } else {
                break L0;
              }
            }
            if (12 <= this.field_Jb.length()) {
              if (84 != vg.field_a) {
                if (13 != vg.field_a) {
                  return true;
                } else {
                  this.field_Gb = 1;
                  return true;
                }
              } else {
                if (0 >= this.field_Jb.length()) {
                  this.field_Gb = 1;
                  if (13 != vg.field_a) {
                    return true;
                  } else {
                    this.field_Gb = 1;
                    return true;
                  }
                } else {
                  this.field_db = this.field_Jb.toString();
                  this.field_Gb = 2;
                  if (13 != vg.field_a) {
                    return true;
                  } else {
                    this.field_Gb = 1;
                    return true;
                  }
                }
              }
            } else {
              L1: {
                var2 = Character.toLowerCase(d.field_Ib);
                if (var2 == 32) {
                  var2 = 95;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (var2 == 95) {
                L2: {
                  if (this.field_Jb.length() <= 0) {
                    break L2;
                  } else {
                    discarded$10 = this.field_Jb.append((char) var2);
                    break L2;
                  }
                }
                if (b.a((char) var2, (byte) 104)) {
                  L3: {
                    discarded$11 = this.field_Jb.append((char) var2);
                    if (84 != vg.field_a) {
                      break L3;
                    } else {
                      if (0 >= this.field_Jb.length()) {
                        this.field_Gb = 1;
                        break L3;
                      } else {
                        this.field_db = this.field_Jb.toString();
                        this.field_Gb = 2;
                        break L3;
                      }
                    }
                  }
                  if (13 == vg.field_a) {
                    this.field_Gb = 1;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  if (di.a(param0 ^ 48, (char) var2)) {
                    discarded$12 = this.field_Jb.append((char) var2);
                    if (84 != vg.field_a) {
                      if (13 != vg.field_a) {
                        return true;
                      } else {
                        this.field_Gb = 1;
                        return true;
                      }
                    } else {
                      if (0 >= this.field_Jb.length()) {
                        this.field_Gb = 1;
                        if (13 != vg.field_a) {
                          return true;
                        } else {
                          this.field_Gb = 1;
                          return true;
                        }
                      } else {
                        this.field_db = this.field_Jb.toString();
                        this.field_Gb = 2;
                        if (13 != vg.field_a) {
                          return true;
                        } else {
                          this.field_Gb = 1;
                          return true;
                        }
                      }
                    }
                  } else {
                    L4: {
                      if (84 != vg.field_a) {
                        break L4;
                      } else {
                        if (0 >= this.field_Jb.length()) {
                          this.field_Gb = 1;
                          break L4;
                        } else {
                          this.field_db = this.field_Jb.toString();
                          this.field_Gb = 2;
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (13 != vg.field_a) {
                        break L5;
                      } else {
                        this.field_Gb = 1;
                        break L5;
                      }
                    }
                    return true;
                  }
                }
              } else {
                if (b.a((char) var2, (byte) 104)) {
                  discarded$13 = this.field_Jb.append((char) var2);
                  if (84 == vg.field_a) {
                    L6: {
                      if (0 >= this.field_Jb.length()) {
                        this.field_Gb = 1;
                        break L6;
                      } else {
                        this.field_db = this.field_Jb.toString();
                        this.field_Gb = 2;
                        break L6;
                      }
                    }
                    if (13 != vg.field_a) {
                      return true;
                    } else {
                      this.field_Gb = 1;
                      return true;
                    }
                  } else {
                    L7: {
                      if (13 != vg.field_a) {
                        break L7;
                      } else {
                        this.field_Gb = 1;
                        break L7;
                      }
                    }
                    return true;
                  }
                } else {
                  if (!di.a(param0 ^ 48, (char) var2)) {
                    L8: {
                      if (84 != vg.field_a) {
                        break L8;
                      } else {
                        if (0 >= this.field_Jb.length()) {
                          this.field_Gb = 1;
                          break L8;
                        } else {
                          this.field_db = this.field_Jb.toString();
                          this.field_Gb = 2;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (13 != vg.field_a) {
                        break L9;
                      } else {
                        this.field_Gb = 1;
                        break L9;
                      }
                    }
                    return true;
                  } else {
                    L10: {
                      discarded$14 = this.field_Jb.append((char) var2);
                      if (84 != vg.field_a) {
                        break L10;
                      } else {
                        if (0 >= this.field_Jb.length()) {
                          this.field_Gb = 1;
                          break L10;
                        } else {
                          this.field_db = this.field_Jb.toString();
                          this.field_Gb = 2;
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (13 != vg.field_a) {
                        break L11;
                      } else {
                        this.field_Gb = 1;
                        break L11;
                      }
                    }
                    return true;
                  }
                }
              }
            }
          } else {
            if (12 <= this.field_Jb.length()) {
              if (84 != vg.field_a) {
                if (13 == vg.field_a) {
                  this.field_Gb = 1;
                  return true;
                } else {
                  return true;
                }
              } else {
                if (0 < this.field_Jb.length()) {
                  L12: {
                    this.field_db = this.field_Jb.toString();
                    this.field_Gb = 2;
                    if (13 != vg.field_a) {
                      break L12;
                    } else {
                      this.field_Gb = 1;
                      break L12;
                    }
                  }
                  return true;
                } else {
                  L13: {
                    this.field_Gb = 1;
                    if (13 != vg.field_a) {
                      break L13;
                    } else {
                      this.field_Gb = 1;
                      break L13;
                    }
                  }
                  return true;
                }
              }
            } else {
              L14: {
                var2 = Character.toLowerCase(d.field_Ib);
                if (var2 == 32) {
                  var2 = 95;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (var2 != 95) {
                  break L15;
                } else {
                  if (this.field_Jb.length() <= 0) {
                    break L15;
                  } else {
                    discarded$15 = this.field_Jb.append((char) var2);
                    break L15;
                  }
                }
              }
              if (!b.a((char) var2, (byte) 104)) {
                if (!di.a(param0 ^ 48, (char) var2)) {
                  L16: {
                    if (84 != vg.field_a) {
                      break L16;
                    } else {
                      if (0 >= this.field_Jb.length()) {
                        this.field_Gb = 1;
                        break L16;
                      } else {
                        this.field_db = this.field_Jb.toString();
                        this.field_Gb = 2;
                        break L16;
                      }
                    }
                  }
                  if (13 == vg.field_a) {
                    this.field_Gb = 1;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  L17: {
                    discarded$16 = this.field_Jb.append((char) var2);
                    if (84 != vg.field_a) {
                      break L17;
                    } else {
                      if (0 >= this.field_Jb.length()) {
                        this.field_Gb = 1;
                        break L17;
                      } else {
                        this.field_db = this.field_Jb.toString();
                        this.field_Gb = 2;
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if (13 != vg.field_a) {
                      break L18;
                    } else {
                      this.field_Gb = 1;
                      break L18;
                    }
                  }
                  return true;
                }
              } else {
                L19: {
                  discarded$17 = this.field_Jb.append((char) var2);
                  if (84 != vg.field_a) {
                    break L19;
                  } else {
                    if (0 >= this.field_Jb.length()) {
                      this.field_Gb = 1;
                      break L19;
                    } else {
                      this.field_db = this.field_Jb.toString();
                      this.field_Gb = 2;
                      break L19;
                    }
                  }
                }
                L20: {
                  if (13 != vg.field_a) {
                    break L20;
                  } else {
                    this.field_Gb = 1;
                    break L20;
                  }
                }
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static void a(byte param0, sn param1) {
        RuntimeException runtimeException = null;
        sn var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              cg.field_c = param1;
              if (param0 == -90) {
                break L1;
              } else {
                var3 = (sn) null;
                kd.a((byte) 123, (sn) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("kd.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    kd(int param0, int param1, int param2, int param3, String param4, ci param5, ci param6, ci param7) {
        super(0L, param5);
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        this.field_Gb = 0;
        try {
          L0: {
            this.field_Ib = new ci(0L, param6, param4);
            this.a((byte) 125, this.field_Ib);
            this.field_Fb = new ci(0L, param7);
            this.field_Fb.field_ib = 16764006;
            this.a((byte) 126, this.field_Fb);
            this.field_Fb.field_S = "|";
            this.field_Jb = new StringBuilder(12);
            var9_int = this.field_Ib.e((byte) 94);
            this.field_Ib.a(5, var9_int, -2147483648, fe.field_g, 3);
            this.field_Fb.a(5, var9_int, -2147483648, fe.field_g, 3 - -fe.field_g);
            var10 = 5 - -var9_int + 5;
            var11 = 3 + fe.field_g * 2 + 3;
            var12 = ao.a(var10, true, param0, param2);
            var13 = sg.a(param1, var11, param3, 0);
            this.a(var12, var10, -2147483648, var11, var13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var9);
            stackOut_3_1 = new StringBuilder().append("kd.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param7 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_Eb = "If you are not, please change your password to something more obscure!";
    }
}
