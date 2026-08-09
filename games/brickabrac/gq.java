/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends mh {
    static jp field_Sb;
    static String field_Wb;
    private mh field_Qb;
    static mi field_Xb;
    private StringBuilder field_Vb;
    private mh field_Pb;
    private int field_Tb;
    static int field_Yb;
    static jp[] field_Ub;
    static mf field_Rb;

    final int a(boolean param0, byte param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param1 >= 88) {
          this.a(param0, -15211);
          if (param0) {
            L0: while (true) {
              if (!jl.a((byte) 5)) {
                this.field_Qb.field_Mb = this.field_Vb.toString();
                if (param0) {
                  if (ki.field_e != 0) {
                    if (this.field_L != 0) {
                      return this.field_Tb;
                    } else {
                      this.field_Tb = 1;
                      return this.field_Tb;
                    }
                  } else {
                    return this.field_Tb;
                  }
                } else {
                  return this.field_Tb;
                }
              } else {
                L1: {
                  if ((dc.field_b ^ -1) != -86) {
                    break L1;
                  } else {
                    if (this.field_Vb.length() > 0) {
                      uk.a(' ', this.field_Vb, -1 + this.field_Vb.length(), false);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (nk.a(go.field_b, (CharSequence) ((Object) this.field_Vb), false)) {
                    discarded$0 = this.field_Vb.append(go.field_b);
                    break L2;
                  } else {
                    L3: {
                      if (this.field_Vb.length() != 0) {
                        break L3;
                      } else {
                        if (go.field_b == 91) {
                          discarded$1 = this.field_Vb.append(go.field_b);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (-2 != (this.field_Vb.length() ^ -1)) {
                        break L4;
                      } else {
                        if (go.field_b == 35) {
                          discarded$2 = this.field_Vb.append(go.field_b);
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (go.field_b != 93) {
                      break L2;
                    } else {
                      discarded$3 = this.field_Vb.append(go.field_b);
                      break L2;
                    }
                  }
                }
                if (dc.field_b != 84) {
                  if (-14 == (dc.field_b ^ -1)) {
                    return 1;
                  } else {
                    continue L0;
                  }
                } else {
                  if (0 >= this.field_Vb.length()) {
                    return 1;
                  } else {
                    this.field_Mb = this.field_Vb.toString();
                    return 2;
                  }
                }
              }
            }
          } else {
            L5: {
              this.field_Qb.field_Mb = this.field_Vb.toString();
              if (!param0) {
                break L5;
              } else {
                if (ki.field_e == 0) {
                  break L5;
                } else {
                  if (this.field_L == 0) {
                    this.field_Tb = 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            return this.field_Tb;
          }
        } else {
          return 77;
        }
    }

    final boolean h(int param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        int var2;
        if (this.field_Tb != 0) {
          return false;
        } else {
          if ((dc.field_b ^ -1) == -86) {
            if (this.field_Vb.length() > 0) {
              uk.a(' ', this.field_Vb, -1 + this.field_Vb.length(), false);
              if (12 > this.field_Vb.length()) {
                L0: {
                  var2 = Character.toLowerCase(go.field_b);
                  if (var2 == 32) {
                    var2 = 95;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (95 != var2) {
                    break L1;
                  } else {
                    if (0 < this.field_Vb.length()) {
                      discarded$0 = this.field_Vb.append((char) var2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                if (!ni.b(true, (char) var2)) {
                  if (eh.a((char) var2, (byte) 83)) {
                    discarded$1 = this.field_Vb.append((char) var2);
                    if (-85 == (dc.field_b ^ -1)) {
                      if (-1 > (this.field_Vb.length() ^ -1)) {
                        this.field_Mb = this.field_Vb.toString();
                        this.field_Tb = 2;
                        if (dc.field_b != param0) {
                          return true;
                        } else {
                          this.field_Tb = 1;
                          return true;
                        }
                      } else {
                        L2: {
                          this.field_Tb = 1;
                          if (dc.field_b != param0) {
                            break L2;
                          } else {
                            this.field_Tb = 1;
                            break L2;
                          }
                        }
                        return true;
                      }
                    } else {
                      if (dc.field_b != param0) {
                        return true;
                      } else {
                        this.field_Tb = 1;
                        return true;
                      }
                    }
                  } else {
                    if (-85 == (dc.field_b ^ -1)) {
                      if (-1 > (this.field_Vb.length() ^ -1)) {
                        this.field_Mb = this.field_Vb.toString();
                        this.field_Tb = 2;
                        if (dc.field_b != param0) {
                          return true;
                        } else {
                          this.field_Tb = 1;
                          return true;
                        }
                      } else {
                        this.field_Tb = 1;
                        if (dc.field_b != param0) {
                          return true;
                        } else {
                          this.field_Tb = 1;
                          return true;
                        }
                      }
                    } else {
                      if (dc.field_b == param0) {
                        this.field_Tb = 1;
                        return true;
                      } else {
                        return true;
                      }
                    }
                  }
                } else {
                  L3: {
                    discarded$2 = this.field_Vb.append((char) var2);
                    if (-85 == (dc.field_b ^ -1)) {
                      if (-1 > (this.field_Vb.length() ^ -1)) {
                        this.field_Mb = this.field_Vb.toString();
                        this.field_Tb = 2;
                        break L3;
                      } else {
                        this.field_Tb = 1;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (dc.field_b != param0) {
                      break L4;
                    } else {
                      this.field_Tb = 1;
                      break L4;
                    }
                  }
                  return true;
                }
              } else {
                if (-85 == (dc.field_b ^ -1)) {
                  if (-1 > (this.field_Vb.length() ^ -1)) {
                    this.field_Mb = this.field_Vb.toString();
                    this.field_Tb = 2;
                    if (dc.field_b != param0) {
                      return true;
                    } else {
                      this.field_Tb = 1;
                      return true;
                    }
                  } else {
                    this.field_Tb = 1;
                    if (dc.field_b != param0) {
                      return true;
                    } else {
                      this.field_Tb = 1;
                      return true;
                    }
                  }
                } else {
                  if (dc.field_b != param0) {
                    return true;
                  } else {
                    this.field_Tb = 1;
                    return true;
                  }
                }
              }
            } else {
              if (12 > this.field_Vb.length()) {
                L5: {
                  var2 = Character.toLowerCase(go.field_b);
                  if (var2 == 32) {
                    var2 = 95;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (95 != var2) {
                    break L6;
                  } else {
                    if (0 < this.field_Vb.length()) {
                      discarded$3 = this.field_Vb.append((char) var2);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                if (ni.b(true, (char) var2)) {
                  L7: {
                    discarded$4 = this.field_Vb.append((char) var2);
                    if (-85 == (dc.field_b ^ -1)) {
                      if (-1 > (this.field_Vb.length() ^ -1)) {
                        this.field_Mb = this.field_Vb.toString();
                        this.field_Tb = 2;
                        break L7;
                      } else {
                        this.field_Tb = 1;
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  if (dc.field_b != param0) {
                    return true;
                  } else {
                    this.field_Tb = 1;
                    return true;
                  }
                } else {
                  if (!eh.a((char) var2, (byte) 83)) {
                    if (-85 == (dc.field_b ^ -1)) {
                      if (-1 <= (this.field_Vb.length() ^ -1)) {
                        L8: {
                          this.field_Tb = 1;
                          if (dc.field_b != param0) {
                            break L8;
                          } else {
                            this.field_Tb = 1;
                            break L8;
                          }
                        }
                        return true;
                      } else {
                        L9: {
                          this.field_Mb = this.field_Vb.toString();
                          this.field_Tb = 2;
                          if (dc.field_b != param0) {
                            break L9;
                          } else {
                            this.field_Tb = 1;
                            break L9;
                          }
                        }
                        return true;
                      }
                    } else {
                      L10: {
                        if (dc.field_b != param0) {
                          break L10;
                        } else {
                          this.field_Tb = 1;
                          break L10;
                        }
                      }
                      return true;
                    }
                  } else {
                    L11: {
                      discarded$5 = this.field_Vb.append((char) var2);
                      if (-85 == (dc.field_b ^ -1)) {
                        if (-1 > (this.field_Vb.length() ^ -1)) {
                          this.field_Mb = this.field_Vb.toString();
                          this.field_Tb = 2;
                          break L11;
                        } else {
                          this.field_Tb = 1;
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (dc.field_b != param0) {
                        break L12;
                      } else {
                        this.field_Tb = 1;
                        break L12;
                      }
                    }
                    return true;
                  }
                }
              } else {
                if (-85 == (dc.field_b ^ -1)) {
                  if (-1 <= (this.field_Vb.length() ^ -1)) {
                    L13: {
                      this.field_Tb = 1;
                      if (dc.field_b != param0) {
                        break L13;
                      } else {
                        this.field_Tb = 1;
                        break L13;
                      }
                    }
                    return true;
                  } else {
                    L14: {
                      this.field_Mb = this.field_Vb.toString();
                      this.field_Tb = 2;
                      if (dc.field_b != param0) {
                        break L14;
                      } else {
                        this.field_Tb = 1;
                        break L14;
                      }
                    }
                    return true;
                  }
                } else {
                  L15: {
                    if (dc.field_b != param0) {
                      break L15;
                    } else {
                      this.field_Tb = 1;
                      break L15;
                    }
                  }
                  return true;
                }
              }
            }
          } else {
            L16: {
              if (12 > this.field_Vb.length()) {
                L17: {
                  var2 = Character.toLowerCase(go.field_b);
                  if (var2 == 32) {
                    var2 = 95;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (95 != var2) {
                    break L18;
                  } else {
                    if (0 < this.field_Vb.length()) {
                      discarded$6 = this.field_Vb.append((char) var2);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                }
                if (ni.b(true, (char) var2)) {
                  L19: {
                    discarded$7 = this.field_Vb.append((char) var2);
                    if (-85 == (dc.field_b ^ -1)) {
                      if (-1 > (this.field_Vb.length() ^ -1)) {
                        this.field_Mb = this.field_Vb.toString();
                        this.field_Tb = 2;
                        break L19;
                      } else {
                        this.field_Tb = 1;
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                  if (dc.field_b == param0) {
                    this.field_Tb = 1;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  if (!eh.a((char) var2, (byte) 83)) {
                    break L16;
                  } else {
                    L20: {
                      discarded$8 = this.field_Vb.append((char) var2);
                      if (-85 == (dc.field_b ^ -1)) {
                        if (-1 > (this.field_Vb.length() ^ -1)) {
                          this.field_Mb = this.field_Vb.toString();
                          this.field_Tb = 2;
                          break L20;
                        } else {
                          this.field_Tb = 1;
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if (dc.field_b != param0) {
                        break L21;
                      } else {
                        this.field_Tb = 1;
                        break L21;
                      }
                    }
                    return true;
                  }
                }
              } else {
                break L16;
              }
            }
            if (-85 == (dc.field_b ^ -1)) {
              if (-1 <= (this.field_Vb.length() ^ -1)) {
                L22: {
                  this.field_Tb = 1;
                  if (dc.field_b != param0) {
                    break L22;
                  } else {
                    this.field_Tb = 1;
                    break L22;
                  }
                }
                return true;
              } else {
                L23: {
                  this.field_Mb = this.field_Vb.toString();
                  this.field_Tb = 2;
                  if (dc.field_b != param0) {
                    break L23;
                  } else {
                    this.field_Tb = 1;
                    break L23;
                  }
                }
                return true;
              }
            } else {
              L24: {
                if (dc.field_b != param0) {
                  break L24;
                } else {
                  this.field_Tb = 1;
                  break L24;
                }
              }
              return true;
            }
          }
        }
    }

    public static void d(boolean param0) {
        if (param0) {
          gq.d((byte) -20);
          field_Rb = null;
          field_Sb = null;
          field_Wb = null;
          field_Xb = null;
          field_Ub = null;
          return;
        } else {
          field_Rb = null;
          field_Sb = null;
          field_Wb = null;
          field_Xb = null;
          field_Ub = null;
          return;
        }
    }

    final static boolean d(byte param0) {
        int[] var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (bd.field_b != null) {
                break L1;
              } else {
                bd.field_b = mq.a((byte) 107, 4);
                break L1;
              }
            }
            if (!bd.field_b.field_i) {
              var1_int = -62 / ((param0 - -18) / 47);
              stackIn_13_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var12 = mk.field_b;
              var10 = var12;
              var5 = var10;
              var1 = var5;
              var16 = bd.field_b.field_k;
              var3 = 0;
              L2: while (true) {
                if (8 <= var3) {
                  var13 = pl.field_b;
                  var11 = var13;
                  var7 = var11;
                  var1 = var7;
                  var17 = bd.field_b.field_k;
                  var9 = 0;
                  var3 = var9;
                  L3: while (true) {
                    if (-9 >= (var9 ^ -1)) {
                      bd.field_b = null;
                      stackIn_11_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var7[var9] = ik.a(var13[var9], var17[var9] ^ -1);
                      var9++;
                      continue L3;
                    }
                  }
                } else {
                  var5[var3] = ud.d(var12[var3], var16[var3]);
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1_ref), "gq.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    final static boolean b(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        if ((param0 ^ -1) <= param1) {
          if ((param0 ^ -1) > -1583) {
            L0: {
              if (-1 != (param0 % 4 ^ -1)) {
                stackIn_10_0 = 0;
                break L0;
              } else {
                stackIn_10_0 = 1;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            if (param0 % 4 != 0) {
              return false;
            } else {
              if (0 == param0 % 100) {
                if (param0 % 400 != 0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          L1: {
            if ((1 + param0) % 4 != 0) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    gq(int param0, int param1, int param2, int param3, String param4, mh param5, mh param6, mh param7) {
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
        this.field_Tb = 0;
        try {
          L0: {
            this.field_Pb = new mh(0L, param6, param4);
            this.a(this.field_Pb, 0);
            this.field_Qb = new mh(0L, param7);
            this.field_Qb.field_X = 16764006;
            this.a(this.field_Qb, 0);
            this.field_Qb.field_Cb = "|";
            this.field_Vb = new StringBuilder(12);
            var9_int = this.field_Pb.g(81);
            this.field_Pb.a(np.field_a, 3, 5, var9_int, (byte) 64);
            this.field_Qb.a(np.field_a, np.field_a + 3, 5, var9_int, (byte) 64);
            var10 = 10 - -var9_int;
            var11 = 3 + np.field_a * 2 + 3;
            var12 = fp.a(-1, var10, param0, param2);
            var13 = br.a(var11, param1, param3, 121);
            this.a(var11, var13, var12, var10, (byte) 64);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var9);

            stackIn_5_1 = new StringBuilder().append("gq.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw qb.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_Wb = "Reject";
        field_Xb = new mi();
    }
}
