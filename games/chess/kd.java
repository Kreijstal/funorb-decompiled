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
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var4;
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
                      rb.a(' ', this.field_Jb, this.field_Jb.length() - 1, (byte) -105);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (p.a((CharSequence) ((Object) this.field_Jb), d.field_Ib, -13)) {
                    discarded$1 = this.field_Jb.append(d.field_Ib);
                    break L3;
                  } else {
                    L4: {
                      if (0 != this.field_Jb.length()) {
                        break L4;
                      } else {
                        if (d.field_Ib == 91) {
                          discarded$2 = this.field_Jb.append(d.field_Ib);
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
                          discarded$3 = this.field_Jb.append(d.field_Ib);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (93 != d.field_Ib) {
                      break L3;
                    } else {
                      discarded$4 = this.field_Jb.append(d.field_Ib);
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
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        int var2;
        if ((this.field_Gb ^ -1) == param0) {
          if (85 == vg.field_a) {
            L0: {
              if (-1 > (this.field_Jb.length() ^ -1)) {
                rb.a(' ', this.field_Jb, this.field_Jb.length() + -1, (byte) 116);
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
                    discarded$0 = this.field_Jb.append((char) var2);
                    break L2;
                  }
                }
                if (b.a((char) var2, (byte) 104)) {
                  L3: {
                    discarded$1 = this.field_Jb.append((char) var2);
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
                    discarded$2 = this.field_Jb.append((char) var2);
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
                  discarded$3 = this.field_Jb.append((char) var2);
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
                      discarded$4 = this.field_Jb.append((char) var2);
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
                    discarded$5 = this.field_Jb.append((char) var2);
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
                    discarded$6 = this.field_Jb.append((char) var2);
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
                  discarded$7 = this.field_Jb.append((char) var2);
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
        try {
            cg.field_c = param1;
            if (param0 != -90) {
                sn var3 = (sn) null;
                kd.a((byte) 123, (sn) null);
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "kd.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    kd(int param0, int param1, int param2, int param3, String param4, ci param5, ci param6, ci param7) {
        super(0L, param5);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
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
            stackIn_5_0 = (RuntimeException) (var9);

            stackIn_5_1 = new StringBuilder().append("kd.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_Eb = "If you are not, please change your password to something more obscure!";
    }
}
