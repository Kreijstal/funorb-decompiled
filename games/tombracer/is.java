/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class is extends jea {
    private jea field_tb;
    private StringBuilder field_vb;
    private int field_ub;
    private jea field_zb;
    static hra field_wb;
    static pea field_xb;
    static float field_Ab;
    static jea field_yb;

    public static void f(int param0) {
        if (param0 != 2) {
          field_wb = (hra) null;
          field_xb = null;
          field_wb = null;
          field_yb = null;
          return;
        } else {
          field_xb = null;
          field_wb = null;
          field_yb = null;
          return;
        }
    }

    final boolean a(boolean param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var2;
        if (this.field_ub == 0) {
          if (fna.field_h == 85) {
            L0: {
              if (0 < this.field_vb.length()) {
                ana.a(-1 + this.field_vb.length(), ' ', -11, this.field_vb);
                break L0;
              } else {
                break L0;
              }
            }
            if (-13 < (this.field_vb.length() ^ -1)) {
              L1: {
                var2 = Character.toLowerCase(kda.field_td);
                if (var2 == 32) {
                  var2 = 95;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (95 != var2) {
                  break L2;
                } else {
                  if ((this.field_vb.length() ^ -1) < -1) {
                    discarded$0 = this.field_vb.append((char) var2);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (dja.a((byte) -17, (char) var2)) {
                L3: {
                  discarded$1 = this.field_vb.append((char) var2);
                  if (-85 == (fna.field_h ^ -1)) {
                    if (-1 <= (this.field_vb.length() ^ -1)) {
                      this.field_ub = 1;
                      break L3;
                    } else {
                      this.field_r = this.field_vb.toString();
                      this.field_ub = 2;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((fna.field_h ^ -1) == -14) {
                    this.field_ub = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (!param0) {
                  return true;
                } else {
                  field_Ab = -0.0745474174618721f;
                  return true;
                }
              } else {
                if (!dp.a(125, (char) var2)) {
                  if (-85 == (fna.field_h ^ -1)) {
                    if (-1 <= (this.field_vb.length() ^ -1)) {
                      L5: {
                        this.field_ub = 1;
                        if ((fna.field_h ^ -1) == -14) {
                          this.field_ub = 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        field_Ab = -0.0745474174618721f;
                        return true;
                      }
                    } else {
                      L6: {
                        this.field_r = this.field_vb.toString();
                        this.field_ub = 2;
                        if ((fna.field_h ^ -1) == -14) {
                          this.field_ub = 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        field_Ab = -0.0745474174618721f;
                        return true;
                      }
                    }
                  } else {
                    L7: {
                      if ((fna.field_h ^ -1) == -14) {
                        this.field_ub = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (param0) {
                      field_Ab = -0.0745474174618721f;
                      return true;
                    } else {
                      return true;
                    }
                  }
                } else {
                  discarded$2 = this.field_vb.append((char) var2);
                  if (-85 == (fna.field_h ^ -1)) {
                    if (-1 > (this.field_vb.length() ^ -1)) {
                      L8: {
                        this.field_r = this.field_vb.toString();
                        this.field_ub = 2;
                        if ((fna.field_h ^ -1) == -14) {
                          this.field_ub = 1;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        field_Ab = -0.0745474174618721f;
                        return true;
                      }
                    } else {
                      L9: {
                        this.field_ub = 1;
                        if ((fna.field_h ^ -1) == -14) {
                          this.field_ub = 1;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (!param0) {
                          break L10;
                        } else {
                          field_Ab = -0.0745474174618721f;
                          break L10;
                        }
                      }
                      return true;
                    }
                  } else {
                    L11: {
                      if ((fna.field_h ^ -1) == -14) {
                        this.field_ub = 1;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    if (param0) {
                      field_Ab = -0.0745474174618721f;
                      return true;
                    } else {
                      return true;
                    }
                  }
                }
              }
            } else {
              if (-85 == (fna.field_h ^ -1)) {
                if (-1 > (this.field_vb.length() ^ -1)) {
                  L12: {
                    this.field_r = this.field_vb.toString();
                    this.field_ub = 2;
                    if ((fna.field_h ^ -1) == -14) {
                      this.field_ub = 1;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (!param0) {
                      break L13;
                    } else {
                      field_Ab = -0.0745474174618721f;
                      break L13;
                    }
                  }
                  return true;
                } else {
                  L14: {
                    this.field_ub = 1;
                    if ((fna.field_h ^ -1) == -14) {
                      this.field_ub = 1;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (!param0) {
                      break L15;
                    } else {
                      field_Ab = -0.0745474174618721f;
                      break L15;
                    }
                  }
                  return true;
                }
              } else {
                L16: {
                  if ((fna.field_h ^ -1) == -14) {
                    this.field_ub = 1;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (!param0) {
                    break L17;
                  } else {
                    field_Ab = -0.0745474174618721f;
                    break L17;
                  }
                }
                return true;
              }
            }
          } else {
            L18: {
              if (-13 >= (this.field_vb.length() ^ -1)) {
                break L18;
              } else {
                L19: {
                  var2 = Character.toLowerCase(kda.field_td);
                  if (var2 == 32) {
                    var2 = 95;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (95 != var2) {
                    break L20;
                  } else {
                    if ((this.field_vb.length() ^ -1) < -1) {
                      discarded$3 = this.field_vb.append((char) var2);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
                if (dja.a((byte) -17, (char) var2)) {
                  L21: {
                    discarded$4 = this.field_vb.append((char) var2);
                    if (-85 == (fna.field_h ^ -1)) {
                      if (-1 <= (this.field_vb.length() ^ -1)) {
                        this.field_ub = 1;
                        break L21;
                      } else {
                        this.field_r = this.field_vb.toString();
                        this.field_ub = 2;
                        break L21;
                      }
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if ((fna.field_h ^ -1) == -14) {
                      this.field_ub = 1;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  if (param0) {
                    field_Ab = -0.0745474174618721f;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  if (!dp.a(125, (char) var2)) {
                    break L18;
                  } else {
                    L23: {
                      discarded$5 = this.field_vb.append((char) var2);
                      if (-85 == (fna.field_h ^ -1)) {
                        if (-1 <= (this.field_vb.length() ^ -1)) {
                          this.field_ub = 1;
                          break L23;
                        } else {
                          this.field_r = this.field_vb.toString();
                          this.field_ub = 2;
                          break L23;
                        }
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if ((fna.field_h ^ -1) == -14) {
                        this.field_ub = 1;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      if (!param0) {
                        break L25;
                      } else {
                        field_Ab = -0.0745474174618721f;
                        break L25;
                      }
                    }
                    return true;
                  }
                }
              }
            }
            if (-85 == (fna.field_h ^ -1)) {
              if (-1 > (this.field_vb.length() ^ -1)) {
                L26: {
                  this.field_r = this.field_vb.toString();
                  this.field_ub = 2;
                  if ((fna.field_h ^ -1) == -14) {
                    this.field_ub = 1;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (!param0) {
                    break L27;
                  } else {
                    field_Ab = -0.0745474174618721f;
                    break L27;
                  }
                }
                return true;
              } else {
                L28: {
                  this.field_ub = 1;
                  if ((fna.field_h ^ -1) == -14) {
                    this.field_ub = 1;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (!param0) {
                    break L29;
                  } else {
                    field_Ab = -0.0745474174618721f;
                    break L29;
                  }
                }
                return true;
              }
            } else {
              L30: {
                if ((fna.field_h ^ -1) == -14) {
                  this.field_ub = 1;
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                if (!param0) {
                  break L31;
                } else {
                  field_Ab = -0.0745474174618721f;
                  break L31;
                }
              }
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final int a(boolean param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (param1 == 1513) {
            break L0;
          } else {
            field_wb = (hra) null;
            break L0;
          }
        }
        this.c(-57, param0);
        if (param0) {
          L1: while (true) {
            if (!es.a(true)) {
              this.field_tb.field_r = this.field_vb.toString();
              if (param0) {
                if (-1 != (hf.field_b ^ -1)) {
                  if (0 != this.field_y) {
                    return this.field_ub;
                  } else {
                    this.field_ub = 1;
                    return this.field_ub;
                  }
                } else {
                  return this.field_ub;
                }
              } else {
                return this.field_ub;
              }
            } else {
              L2: {
                if (-86 != (fna.field_h ^ -1)) {
                  break L2;
                } else {
                  if (this.field_vb.length() > 0) {
                    ana.a(-1 + this.field_vb.length(), ' ', -11, this.field_vb);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (ih.a((CharSequence) ((Object) this.field_vb), true, kda.field_td)) {
                  discarded$0 = this.field_vb.append(kda.field_td);
                  break L3;
                } else {
                  L4: {
                    if (this.field_vb.length() != 0) {
                      break L4;
                    } else {
                      if (91 == kda.field_td) {
                        discarded$1 = this.field_vb.append(kda.field_td);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (1 != this.field_vb.length()) {
                      break L5;
                    } else {
                      if (kda.field_td == 35) {
                        discarded$2 = this.field_vb.append(kda.field_td);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (kda.field_td != 93) {
                    break L3;
                  } else {
                    discarded$3 = this.field_vb.append(kda.field_td);
                    break L3;
                  }
                }
              }
              if (fna.field_h == 84) {
                if (-1 > (this.field_vb.length() ^ -1)) {
                  this.field_r = this.field_vb.toString();
                  return 2;
                } else {
                  return 1;
                }
              } else {
                if (13 == fna.field_h) {
                  return 1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } else {
          L6: {
            this.field_tb.field_r = this.field_vb.toString();
            if (!param0) {
              break L6;
            } else {
              if (-1 == (hf.field_b ^ -1)) {
                break L6;
              } else {
                if (0 != this.field_y) {
                  break L6;
                } else {
                  this.field_ub = 1;
                  break L6;
                }
              }
            }
          }
          return this.field_ub;
        }
    }

    is(int param0, int param1, int param2, int param3, String param4, jea param5, jea param6, jea param7) {
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
        this.field_ub = 0;
        try {
          L0: {
            this.field_zb = new jea(0L, param6, param4);
            this.b(-125, this.field_zb);
            this.field_tb = new jea(0L, param7);
            this.field_tb.field_ib = 16764006;
            this.b(-128, this.field_tb);
            this.field_tb.field_sb = "|";
            this.field_vb = new StringBuilder(12);
            var9_int = this.field_zb.b((byte) 69);
            this.field_zb.a(var9_int, di.field_a, -23776, 3, 5);
            this.field_tb.a(var9_int, di.field_a, -23776, 3 + di.field_a, 5);
            var10 = 5 + (var9_int - -5);
            var11 = di.field_a * 2 + 6;
            var12 = bt.a((byte) -8, var10, param2, param0);
            var13 = hsa.a(param3, var11, param1, (byte) 69);
            this.a(var10, var11, -23776, var13, var12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var9);

            stackIn_5_1 = new StringBuilder().append("is.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_wb = new hra();
        field_xb = new pea(16);
    }
}
