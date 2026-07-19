/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn {
    private int[] field_i;
    sk field_k;
    private wk[] field_f;
    private int field_c;
    static pf field_j;
    private ia field_d;
    private ia field_a;
    private r[] field_l;
    private tu field_m;
    private ia field_h;
    static String field_g;
    static String field_e;
    private wk[] field_b;

    private final void b(byte param0) {
        this.field_d = new ia(this.field_b, this.field_m, this.field_i, "Attacker", 0, 0);
        this.field_h = new ia(this.field_b, this.field_m, this.field_i, "Defender", 0, 0);
        this.field_a = new ia(this.field_b, this.field_m, this.field_i, "Run Attack", 0, 0);
        this.field_l = new r[6];
        this.field_l[0] = new r(this.field_b, this.field_f, this.field_m, this.field_i, af.field_a, 0, 0);
        this.field_l[1] = new r(this.field_b, this.field_f, this.field_m, this.field_i, af.field_a, 0, 0);
        this.field_l[2] = new r(this.field_b, this.field_f, this.field_m, this.field_i, ts.field_d, 0, 0);
        this.field_l[3] = new r(this.field_b, this.field_f, this.field_m, this.field_i, ts.field_d, 0, 0);
        this.field_l[4] = new r(this.field_b, this.field_f, this.field_m, this.field_i, hm.field_i, 0, 0);
        if (param0 != -49) {
          this.field_a = (ia) null;
          this.field_l[5] = new r(this.field_b, this.field_f, this.field_m, this.field_i, hm.field_i, 0, 0);
          return;
        } else {
          this.field_l[5] = new r(this.field_b, this.field_f, this.field_m, this.field_i, hm.field_i, 0, 0);
          return;
        }
    }

    private final int a(int param0, byte param1) {
        if (-1 != (param0 ^ -1)) {
          if (param1 == -42) {
            if (-2 == (param0 ^ -1)) {
              return this.field_l[0].n(-18332);
            } else {
              if (-3 == (param0 ^ -1)) {
                return this.field_l[2].n(-18332);
              } else {
                if (param0 == 3) {
                  return this.field_h.c(-29408);
                } else {
                  if (4 == param0) {
                    return this.field_l[1].n(-18332);
                  } else {
                    if (-6 == (param0 ^ -1)) {
                      return this.field_l[3].n(-18332);
                    } else {
                      if (6 == param0) {
                        return this.field_a.c(-29408);
                      } else {
                        if (-8 != (param0 ^ -1)) {
                          if (param0 != 8) {
                            return 0;
                          } else {
                            return this.field_l[5].n(-18332);
                          }
                        } else {
                          return this.field_l[4].n(-18332);
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            field_j = (pf) null;
            if (-2 == (param0 ^ -1)) {
              return this.field_l[0].n(-18332);
            } else {
              if (-3 == (param0 ^ -1)) {
                return this.field_l[2].n(-18332);
              } else {
                if (param0 == 3) {
                  return this.field_h.c(-29408);
                } else {
                  if (4 == param0) {
                    return this.field_l[1].n(-18332);
                  } else {
                    if (-6 == (param0 ^ -1)) {
                      return this.field_l[3].n(-18332);
                    } else {
                      if (6 == param0) {
                        return this.field_a.c(-29408);
                      } else {
                        if (-8 != (param0 ^ -1)) {
                          if (param0 != 8) {
                            return 0;
                          } else {
                            return this.field_l[5].n(-18332);
                          }
                        } else {
                          return this.field_l[4].n(-18332);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          return this.field_d.c(-29408);
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        boolean stackIn_3_0 = false;
        int stackIn_8_0 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_7_0 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_l.length <= var2) {
                break L2;
              } else {
                stackOut_2_0 = this.field_l[var2].g((byte) 97);
                stackIn_8_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var3 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (!stackIn_3_0) {
                      this.field_l[var2].f((byte) 124);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var2++;
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          }
          var2 = stackIn_8_0;
          L4: while (true) {
            L5: {
              if (var2 >= this.field_l.length) {
                break L5;
              } else {
                L6: {
                  if (this.field_l[var2].g((byte) 97)) {
                    this.field_l[var2].f((byte) -55);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var2++;
                if (var3 == 0) {
                  continue L4;
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (-1 == (param2 ^ -1)) {
            this.field_d.a(param3, (byte) 55, param0);
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 != 1) {
          L1: {
            if (param2 == 2) {
              this.field_l[2].e(-71, param0, param3);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param2 == 3) {
              this.field_h.a(param3, (byte) 127, param0);
              break L2;
            } else {
              break L2;
            }
          }
          if (param2 != 4) {
            if (param1 <= -41) {
              if ((param2 ^ -1) != -6) {
                if ((param2 ^ -1) == -7) {
                  L3: {
                    this.field_a.a(param3, (byte) 107, param0);
                    if ((param2 ^ -1) == -8) {
                      this.field_l[4].e(-57, param0, param3);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (param2 == 8) {
                      this.field_l[5].e(-87, param0, param3);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                } else {
                  L5: {
                    if ((param2 ^ -1) == -8) {
                      this.field_l[4].e(-57, param0, param3);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (param2 == 8) {
                      this.field_l[5].e(-87, param0, param3);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  return;
                }
              } else {
                this.field_l[3].e(87, param0, param3);
                if ((param2 ^ -1) == -7) {
                  L7: {
                    this.field_a.a(param3, (byte) 107, param0);
                    if ((param2 ^ -1) == -8) {
                      this.field_l[4].e(-57, param0, param3);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (param2 == 8) {
                      this.field_l[5].e(-87, param0, param3);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return;
                } else {
                  L9: {
                    if ((param2 ^ -1) == -8) {
                      this.field_l[4].e(-57, param0, param3);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (param2 == 8) {
                      this.field_l[5].e(-87, param0, param3);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  return;
                }
              }
            } else {
              this.a(-21);
              if ((param2 ^ -1) != -6) {
                if ((param2 ^ -1) == -7) {
                  L11: {
                    this.field_a.a(param3, (byte) 107, param0);
                    if ((param2 ^ -1) == -8) {
                      this.field_l[4].e(-57, param0, param3);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (param2 == 8) {
                      this.field_l[5].e(-87, param0, param3);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  return;
                } else {
                  L13: {
                    if ((param2 ^ -1) == -8) {
                      this.field_l[4].e(-57, param0, param3);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (param2 == 8) {
                      this.field_l[5].e(-87, param0, param3);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  return;
                }
              } else {
                L15: {
                  this.field_l[3].e(87, param0, param3);
                  if ((param2 ^ -1) != -7) {
                    break L15;
                  } else {
                    this.field_a.a(param3, (byte) 107, param0);
                    break L15;
                  }
                }
                L16: {
                  if ((param2 ^ -1) == -8) {
                    this.field_l[4].e(-57, param0, param3);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (param2 == 8) {
                    this.field_l[5].e(-87, param0, param3);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                return;
              }
            }
          } else {
            this.field_l[1].e(-59, param0, param3);
            if (param1 <= -41) {
              if ((param2 ^ -1) != -6) {
                if ((param2 ^ -1) == -7) {
                  L18: {
                    this.field_a.a(param3, (byte) 107, param0);
                    if ((param2 ^ -1) == -8) {
                      this.field_l[4].e(-57, param0, param3);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (param2 == 8) {
                      this.field_l[5].e(-87, param0, param3);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  return;
                } else {
                  L20: {
                    if ((param2 ^ -1) == -8) {
                      this.field_l[4].e(-57, param0, param3);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (param2 == 8) {
                      this.field_l[5].e(-87, param0, param3);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  return;
                }
              } else {
                L22: {
                  this.field_l[3].e(87, param0, param3);
                  if ((param2 ^ -1) != -7) {
                    break L22;
                  } else {
                    this.field_a.a(param3, (byte) 107, param0);
                    break L22;
                  }
                }
                L23: {
                  if ((param2 ^ -1) == -8) {
                    this.field_l[4].e(-57, param0, param3);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (param2 == 8) {
                    this.field_l[5].e(-87, param0, param3);
                    break L24;
                  } else {
                    break L24;
                  }
                }
                return;
              }
            } else {
              L25: {
                this.a(-21);
                if ((param2 ^ -1) != -6) {
                  break L25;
                } else {
                  this.field_l[3].e(87, param0, param3);
                  break L25;
                }
              }
              L26: {
                if ((param2 ^ -1) != -7) {
                  break L26;
                } else {
                  this.field_a.a(param3, (byte) 107, param0);
                  break L26;
                }
              }
              L27: {
                if ((param2 ^ -1) == -8) {
                  this.field_l[4].e(-57, param0, param3);
                  break L27;
                } else {
                  break L27;
                }
              }
              L28: {
                if (param2 == 8) {
                  this.field_l[5].e(-87, param0, param3);
                  break L28;
                } else {
                  break L28;
                }
              }
              return;
            }
          }
        } else {
          L29: {
            this.field_l[0].e(-84, param0, param3);
            if (param2 == 2) {
              this.field_l[2].e(-71, param0, param3);
              break L29;
            } else {
              break L29;
            }
          }
          L30: {
            if (param2 == 3) {
              this.field_h.a(param3, (byte) 127, param0);
              break L30;
            } else {
              break L30;
            }
          }
          if (param2 == 4) {
            this.field_l[1].e(-59, param0, param3);
            if (param1 <= -41) {
              L31: {
                if ((param2 ^ -1) != -6) {
                  break L31;
                } else {
                  this.field_l[3].e(87, param0, param3);
                  break L31;
                }
              }
              L32: {
                if ((param2 ^ -1) != -7) {
                  break L32;
                } else {
                  this.field_a.a(param3, (byte) 107, param0);
                  break L32;
                }
              }
              L33: {
                if ((param2 ^ -1) == -8) {
                  this.field_l[4].e(-57, param0, param3);
                  break L33;
                } else {
                  break L33;
                }
              }
              L34: {
                if (param2 == 8) {
                  this.field_l[5].e(-87, param0, param3);
                  break L34;
                } else {
                  break L34;
                }
              }
              return;
            } else {
              L35: {
                this.a(-21);
                if ((param2 ^ -1) != -6) {
                  break L35;
                } else {
                  this.field_l[3].e(87, param0, param3);
                  break L35;
                }
              }
              L36: {
                if ((param2 ^ -1) != -7) {
                  break L36;
                } else {
                  this.field_a.a(param3, (byte) 107, param0);
                  break L36;
                }
              }
              L37: {
                if ((param2 ^ -1) == -8) {
                  this.field_l[4].e(-57, param0, param3);
                  break L37;
                } else {
                  break L37;
                }
              }
              L38: {
                if (param2 == 8) {
                  this.field_l[5].e(-87, param0, param3);
                  break L38;
                } else {
                  break L38;
                }
              }
              return;
            }
          } else {
            L39: {
              if (param1 <= -41) {
                break L39;
              } else {
                this.a(-21);
                break L39;
              }
            }
            L40: {
              if ((param2 ^ -1) != -6) {
                break L40;
              } else {
                this.field_l[3].e(87, param0, param3);
                break L40;
              }
            }
            L41: {
              if ((param2 ^ -1) != -7) {
                break L41;
              } else {
                this.field_a.a(param3, (byte) 107, param0);
                break L41;
              }
            }
            L42: {
              if ((param2 ^ -1) == -8) {
                this.field_l[4].e(-57, param0, param3);
                break L42;
              } else {
                break L42;
              }
            }
            L43: {
              if (param2 == 8) {
                this.field_l[5].e(-87, param0, param3);
                break L43;
              } else {
                break L43;
              }
            }
            return;
          }
        }
    }

    private final void a(boolean param0, int param1, int param2, boolean param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        jd var25 = null;
        jd var26 = null;
        jd var27 = null;
        jd var28 = null;
        jd var29 = null;
        jd var30 = null;
        jd var31 = null;
        jd var32 = null;
        jd var33 = null;
        jd var34 = null;
        jd var43 = null;
        jd var44 = null;
        jd var49 = null;
        jd var50 = null;
        jd stackIn_22_0 = null;
        jd stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
        int stackIn_22_7 = 0;
        jd stackIn_23_0 = null;
        jd stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        int stackIn_23_7 = 0;
        jd stackIn_24_0 = null;
        jd stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        int stackIn_24_8 = 0;
        jd stackIn_25_0 = null;
        jd stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        jd stackIn_26_0 = null;
        jd stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        jd stackIn_27_0 = null;
        jd stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        int stackIn_27_8 = 0;
        jd stackIn_32_0 = null;
        jd stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        int stackIn_32_5 = 0;
        int stackIn_32_6 = 0;
        int stackIn_32_7 = 0;
        jd stackIn_33_0 = null;
        jd stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        int stackIn_33_5 = 0;
        int stackIn_33_6 = 0;
        int stackIn_33_7 = 0;
        jd stackIn_34_0 = null;
        jd stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        int stackIn_34_5 = 0;
        int stackIn_34_6 = 0;
        int stackIn_34_7 = 0;
        int stackIn_34_8 = 0;
        jd stackIn_35_0 = null;
        jd stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        int stackIn_35_5 = 0;
        int stackIn_35_6 = 0;
        int stackIn_35_7 = 0;
        jd stackIn_36_0 = null;
        jd stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_36_5 = 0;
        int stackIn_36_6 = 0;
        int stackIn_36_7 = 0;
        jd stackIn_37_0 = null;
        jd stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        int stackIn_37_5 = 0;
        int stackIn_37_6 = 0;
        int stackIn_37_7 = 0;
        int stackIn_37_8 = 0;
        jd stackIn_63_0 = null;
        jd stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        int stackIn_63_4 = 0;
        int stackIn_63_5 = 0;
        int stackIn_63_6 = 0;
        int stackIn_63_7 = 0;
        jd stackIn_64_0 = null;
        jd stackIn_64_1 = null;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_64_4 = 0;
        int stackIn_64_5 = 0;
        int stackIn_64_6 = 0;
        int stackIn_64_7 = 0;
        jd stackIn_65_0 = null;
        jd stackIn_65_1 = null;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        int stackIn_65_4 = 0;
        int stackIn_65_5 = 0;
        int stackIn_65_6 = 0;
        int stackIn_65_7 = 0;
        int stackIn_65_8 = 0;
        jd stackIn_66_0 = null;
        jd stackIn_66_1 = null;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        int stackIn_66_5 = 0;
        int stackIn_66_6 = 0;
        int stackIn_66_7 = 0;
        jd stackIn_67_0 = null;
        jd stackIn_67_1 = null;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        int stackIn_67_4 = 0;
        int stackIn_67_5 = 0;
        int stackIn_67_6 = 0;
        int stackIn_67_7 = 0;
        jd stackIn_68_0 = null;
        jd stackIn_68_1 = null;
        int stackIn_68_2 = 0;
        int stackIn_68_3 = 0;
        int stackIn_68_4 = 0;
        int stackIn_68_5 = 0;
        int stackIn_68_6 = 0;
        int stackIn_68_7 = 0;
        int stackIn_68_8 = 0;
        jd stackIn_93_0 = null;
        jd stackIn_93_1 = null;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        int stackIn_93_4 = 0;
        int stackIn_93_5 = 0;
        int stackIn_93_6 = 0;
        int stackIn_93_7 = 0;
        jd stackIn_94_0 = null;
        jd stackIn_94_1 = null;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        int stackIn_94_4 = 0;
        int stackIn_94_5 = 0;
        int stackIn_94_6 = 0;
        int stackIn_94_7 = 0;
        jd stackIn_95_0 = null;
        jd stackIn_95_1 = null;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        int stackIn_95_4 = 0;
        int stackIn_95_5 = 0;
        int stackIn_95_6 = 0;
        int stackIn_95_7 = 0;
        int stackIn_95_8 = 0;
        jd stackIn_96_0 = null;
        jd stackIn_96_1 = null;
        int stackIn_96_2 = 0;
        int stackIn_96_3 = 0;
        int stackIn_96_4 = 0;
        int stackIn_96_5 = 0;
        int stackIn_96_6 = 0;
        int stackIn_96_7 = 0;
        jd stackIn_97_0 = null;
        jd stackIn_97_1 = null;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        int stackIn_97_4 = 0;
        int stackIn_97_5 = 0;
        int stackIn_97_6 = 0;
        int stackIn_97_7 = 0;
        jd stackIn_98_0 = null;
        jd stackIn_98_1 = null;
        int stackIn_98_2 = 0;
        int stackIn_98_3 = 0;
        int stackIn_98_4 = 0;
        int stackIn_98_5 = 0;
        int stackIn_98_6 = 0;
        int stackIn_98_7 = 0;
        int stackIn_98_8 = 0;
        jd stackIn_103_0 = null;
        jd stackIn_103_1 = null;
        int stackIn_103_2 = 0;
        int stackIn_103_3 = 0;
        int stackIn_103_4 = 0;
        int stackIn_103_5 = 0;
        int stackIn_103_6 = 0;
        int stackIn_103_7 = 0;
        jd stackIn_104_0 = null;
        jd stackIn_104_1 = null;
        int stackIn_104_2 = 0;
        int stackIn_104_3 = 0;
        int stackIn_104_4 = 0;
        int stackIn_104_5 = 0;
        int stackIn_104_6 = 0;
        int stackIn_104_7 = 0;
        jd stackIn_105_0 = null;
        jd stackIn_105_1 = null;
        int stackIn_105_2 = 0;
        int stackIn_105_3 = 0;
        int stackIn_105_4 = 0;
        int stackIn_105_5 = 0;
        int stackIn_105_6 = 0;
        int stackIn_105_7 = 0;
        int stackIn_105_8 = 0;
        jd stackIn_106_0 = null;
        jd stackIn_106_1 = null;
        int stackIn_106_2 = 0;
        int stackIn_106_3 = 0;
        int stackIn_106_4 = 0;
        int stackIn_106_5 = 0;
        int stackIn_106_6 = 0;
        int stackIn_106_7 = 0;
        jd stackIn_107_0 = null;
        jd stackIn_107_1 = null;
        int stackIn_107_2 = 0;
        int stackIn_107_3 = 0;
        int stackIn_107_4 = 0;
        int stackIn_107_5 = 0;
        int stackIn_107_6 = 0;
        int stackIn_107_7 = 0;
        jd stackIn_108_0 = null;
        jd stackIn_108_1 = null;
        int stackIn_108_2 = 0;
        int stackIn_108_3 = 0;
        int stackIn_108_4 = 0;
        int stackIn_108_5 = 0;
        int stackIn_108_6 = 0;
        int stackIn_108_7 = 0;
        int stackIn_108_8 = 0;
        jd stackIn_134_0 = null;
        jd stackIn_134_1 = null;
        int stackIn_134_2 = 0;
        int stackIn_134_3 = 0;
        int stackIn_134_4 = 0;
        int stackIn_134_5 = 0;
        int stackIn_134_6 = 0;
        int stackIn_134_7 = 0;
        jd stackIn_135_0 = null;
        jd stackIn_135_1 = null;
        int stackIn_135_2 = 0;
        int stackIn_135_3 = 0;
        int stackIn_135_4 = 0;
        int stackIn_135_5 = 0;
        int stackIn_135_6 = 0;
        int stackIn_135_7 = 0;
        jd stackIn_136_0 = null;
        jd stackIn_136_1 = null;
        int stackIn_136_2 = 0;
        int stackIn_136_3 = 0;
        int stackIn_136_4 = 0;
        int stackIn_136_5 = 0;
        int stackIn_136_6 = 0;
        int stackIn_136_7 = 0;
        int stackIn_136_8 = 0;
        jd stackIn_137_0 = null;
        jd stackIn_137_1 = null;
        int stackIn_137_2 = 0;
        int stackIn_137_3 = 0;
        int stackIn_137_4 = 0;
        int stackIn_137_5 = 0;
        int stackIn_137_6 = 0;
        int stackIn_137_7 = 0;
        jd stackIn_138_0 = null;
        jd stackIn_138_1 = null;
        int stackIn_138_2 = 0;
        int stackIn_138_3 = 0;
        int stackIn_138_4 = 0;
        int stackIn_138_5 = 0;
        int stackIn_138_6 = 0;
        int stackIn_138_7 = 0;
        jd stackIn_139_0 = null;
        jd stackIn_139_1 = null;
        int stackIn_139_2 = 0;
        int stackIn_139_3 = 0;
        int stackIn_139_4 = 0;
        int stackIn_139_5 = 0;
        int stackIn_139_6 = 0;
        int stackIn_139_7 = 0;
        int stackIn_139_8 = 0;
        jd stackIn_144_0 = null;
        jd stackIn_144_1 = null;
        int stackIn_144_2 = 0;
        int stackIn_144_3 = 0;
        int stackIn_144_4 = 0;
        int stackIn_144_5 = 0;
        int stackIn_144_6 = 0;
        int stackIn_144_7 = 0;
        jd stackIn_145_0 = null;
        jd stackIn_145_1 = null;
        int stackIn_145_2 = 0;
        int stackIn_145_3 = 0;
        int stackIn_145_4 = 0;
        int stackIn_145_5 = 0;
        int stackIn_145_6 = 0;
        int stackIn_145_7 = 0;
        jd stackIn_146_0 = null;
        jd stackIn_146_1 = null;
        int stackIn_146_2 = 0;
        int stackIn_146_3 = 0;
        int stackIn_146_4 = 0;
        int stackIn_146_5 = 0;
        int stackIn_146_6 = 0;
        int stackIn_146_7 = 0;
        int stackIn_146_8 = 0;
        jd stackIn_147_0 = null;
        jd stackIn_147_1 = null;
        int stackIn_147_2 = 0;
        int stackIn_147_3 = 0;
        int stackIn_147_4 = 0;
        int stackIn_147_5 = 0;
        int stackIn_147_6 = 0;
        int stackIn_147_7 = 0;
        jd stackIn_148_0 = null;
        jd stackIn_148_1 = null;
        int stackIn_148_2 = 0;
        int stackIn_148_3 = 0;
        int stackIn_148_4 = 0;
        int stackIn_148_5 = 0;
        int stackIn_148_6 = 0;
        int stackIn_148_7 = 0;
        jd stackIn_149_0 = null;
        jd stackIn_149_1 = null;
        int stackIn_149_2 = 0;
        int stackIn_149_3 = 0;
        int stackIn_149_4 = 0;
        int stackIn_149_5 = 0;
        int stackIn_149_6 = 0;
        int stackIn_149_7 = 0;
        int stackIn_149_8 = 0;
        jd stackOut_143_0 = null;
        jd stackOut_143_1 = null;
        int stackOut_143_2 = 0;
        int stackOut_143_3 = 0;
        int stackOut_143_4 = 0;
        int stackOut_143_5 = 0;
        int stackOut_143_6 = 0;
        int stackOut_143_7 = 0;
        jd stackOut_145_0 = null;
        jd stackOut_145_1 = null;
        int stackOut_145_2 = 0;
        int stackOut_145_3 = 0;
        int stackOut_145_4 = 0;
        int stackOut_145_5 = 0;
        int stackOut_145_6 = 0;
        int stackOut_145_7 = 0;
        int stackOut_145_8 = 0;
        jd stackOut_144_0 = null;
        jd stackOut_144_1 = null;
        int stackOut_144_2 = 0;
        int stackOut_144_3 = 0;
        int stackOut_144_4 = 0;
        int stackOut_144_5 = 0;
        int stackOut_144_6 = 0;
        int stackOut_144_7 = 0;
        int stackOut_144_8 = 0;
        jd stackOut_146_0 = null;
        jd stackOut_146_1 = null;
        int stackOut_146_2 = 0;
        int stackOut_146_3 = 0;
        int stackOut_146_4 = 0;
        int stackOut_146_5 = 0;
        int stackOut_146_6 = 0;
        int stackOut_146_7 = 0;
        jd stackOut_148_0 = null;
        jd stackOut_148_1 = null;
        int stackOut_148_2 = 0;
        int stackOut_148_3 = 0;
        int stackOut_148_4 = 0;
        int stackOut_148_5 = 0;
        int stackOut_148_6 = 0;
        int stackOut_148_7 = 0;
        int stackOut_148_8 = 0;
        jd stackOut_147_0 = null;
        jd stackOut_147_1 = null;
        int stackOut_147_2 = 0;
        int stackOut_147_3 = 0;
        int stackOut_147_4 = 0;
        int stackOut_147_5 = 0;
        int stackOut_147_6 = 0;
        int stackOut_147_7 = 0;
        int stackOut_147_8 = 0;
        jd stackOut_133_0 = null;
        jd stackOut_133_1 = null;
        int stackOut_133_2 = 0;
        int stackOut_133_3 = 0;
        int stackOut_133_4 = 0;
        int stackOut_133_5 = 0;
        int stackOut_133_6 = 0;
        int stackOut_133_7 = 0;
        jd stackOut_135_0 = null;
        jd stackOut_135_1 = null;
        int stackOut_135_2 = 0;
        int stackOut_135_3 = 0;
        int stackOut_135_4 = 0;
        int stackOut_135_5 = 0;
        int stackOut_135_6 = 0;
        int stackOut_135_7 = 0;
        int stackOut_135_8 = 0;
        jd stackOut_134_0 = null;
        jd stackOut_134_1 = null;
        int stackOut_134_2 = 0;
        int stackOut_134_3 = 0;
        int stackOut_134_4 = 0;
        int stackOut_134_5 = 0;
        int stackOut_134_6 = 0;
        int stackOut_134_7 = 0;
        int stackOut_134_8 = 0;
        jd stackOut_136_0 = null;
        jd stackOut_136_1 = null;
        int stackOut_136_2 = 0;
        int stackOut_136_3 = 0;
        int stackOut_136_4 = 0;
        int stackOut_136_5 = 0;
        int stackOut_136_6 = 0;
        int stackOut_136_7 = 0;
        jd stackOut_138_0 = null;
        jd stackOut_138_1 = null;
        int stackOut_138_2 = 0;
        int stackOut_138_3 = 0;
        int stackOut_138_4 = 0;
        int stackOut_138_5 = 0;
        int stackOut_138_6 = 0;
        int stackOut_138_7 = 0;
        int stackOut_138_8 = 0;
        jd stackOut_137_0 = null;
        jd stackOut_137_1 = null;
        int stackOut_137_2 = 0;
        int stackOut_137_3 = 0;
        int stackOut_137_4 = 0;
        int stackOut_137_5 = 0;
        int stackOut_137_6 = 0;
        int stackOut_137_7 = 0;
        int stackOut_137_8 = 0;
        jd stackOut_102_0 = null;
        jd stackOut_102_1 = null;
        int stackOut_102_2 = 0;
        int stackOut_102_3 = 0;
        int stackOut_102_4 = 0;
        int stackOut_102_5 = 0;
        int stackOut_102_6 = 0;
        int stackOut_102_7 = 0;
        jd stackOut_104_0 = null;
        jd stackOut_104_1 = null;
        int stackOut_104_2 = 0;
        int stackOut_104_3 = 0;
        int stackOut_104_4 = 0;
        int stackOut_104_5 = 0;
        int stackOut_104_6 = 0;
        int stackOut_104_7 = 0;
        int stackOut_104_8 = 0;
        jd stackOut_103_0 = null;
        jd stackOut_103_1 = null;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        int stackOut_103_4 = 0;
        int stackOut_103_5 = 0;
        int stackOut_103_6 = 0;
        int stackOut_103_7 = 0;
        int stackOut_103_8 = 0;
        jd stackOut_105_0 = null;
        jd stackOut_105_1 = null;
        int stackOut_105_2 = 0;
        int stackOut_105_3 = 0;
        int stackOut_105_4 = 0;
        int stackOut_105_5 = 0;
        int stackOut_105_6 = 0;
        int stackOut_105_7 = 0;
        jd stackOut_107_0 = null;
        jd stackOut_107_1 = null;
        int stackOut_107_2 = 0;
        int stackOut_107_3 = 0;
        int stackOut_107_4 = 0;
        int stackOut_107_5 = 0;
        int stackOut_107_6 = 0;
        int stackOut_107_7 = 0;
        int stackOut_107_8 = 0;
        jd stackOut_106_0 = null;
        jd stackOut_106_1 = null;
        int stackOut_106_2 = 0;
        int stackOut_106_3 = 0;
        int stackOut_106_4 = 0;
        int stackOut_106_5 = 0;
        int stackOut_106_6 = 0;
        int stackOut_106_7 = 0;
        int stackOut_106_8 = 0;
        jd stackOut_92_0 = null;
        jd stackOut_92_1 = null;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        int stackOut_92_4 = 0;
        int stackOut_92_5 = 0;
        int stackOut_92_6 = 0;
        int stackOut_92_7 = 0;
        jd stackOut_94_0 = null;
        jd stackOut_94_1 = null;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        int stackOut_94_4 = 0;
        int stackOut_94_5 = 0;
        int stackOut_94_6 = 0;
        int stackOut_94_7 = 0;
        int stackOut_94_8 = 0;
        jd stackOut_93_0 = null;
        jd stackOut_93_1 = null;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        int stackOut_93_4 = 0;
        int stackOut_93_5 = 0;
        int stackOut_93_6 = 0;
        int stackOut_93_7 = 0;
        int stackOut_93_8 = 0;
        jd stackOut_95_0 = null;
        jd stackOut_95_1 = null;
        int stackOut_95_2 = 0;
        int stackOut_95_3 = 0;
        int stackOut_95_4 = 0;
        int stackOut_95_5 = 0;
        int stackOut_95_6 = 0;
        int stackOut_95_7 = 0;
        jd stackOut_97_0 = null;
        jd stackOut_97_1 = null;
        int stackOut_97_2 = 0;
        int stackOut_97_3 = 0;
        int stackOut_97_4 = 0;
        int stackOut_97_5 = 0;
        int stackOut_97_6 = 0;
        int stackOut_97_7 = 0;
        int stackOut_97_8 = 0;
        jd stackOut_96_0 = null;
        jd stackOut_96_1 = null;
        int stackOut_96_2 = 0;
        int stackOut_96_3 = 0;
        int stackOut_96_4 = 0;
        int stackOut_96_5 = 0;
        int stackOut_96_6 = 0;
        int stackOut_96_7 = 0;
        int stackOut_96_8 = 0;
        jd stackOut_62_0 = null;
        jd stackOut_62_1 = null;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        int stackOut_62_4 = 0;
        int stackOut_62_5 = 0;
        int stackOut_62_6 = 0;
        int stackOut_62_7 = 0;
        jd stackOut_64_0 = null;
        jd stackOut_64_1 = null;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        int stackOut_64_4 = 0;
        int stackOut_64_5 = 0;
        int stackOut_64_6 = 0;
        int stackOut_64_7 = 0;
        int stackOut_64_8 = 0;
        jd stackOut_63_0 = null;
        jd stackOut_63_1 = null;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        int stackOut_63_4 = 0;
        int stackOut_63_5 = 0;
        int stackOut_63_6 = 0;
        int stackOut_63_7 = 0;
        int stackOut_63_8 = 0;
        jd stackOut_65_0 = null;
        jd stackOut_65_1 = null;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        int stackOut_65_5 = 0;
        int stackOut_65_6 = 0;
        int stackOut_65_7 = 0;
        jd stackOut_67_0 = null;
        jd stackOut_67_1 = null;
        int stackOut_67_2 = 0;
        int stackOut_67_3 = 0;
        int stackOut_67_4 = 0;
        int stackOut_67_5 = 0;
        int stackOut_67_6 = 0;
        int stackOut_67_7 = 0;
        int stackOut_67_8 = 0;
        jd stackOut_66_0 = null;
        jd stackOut_66_1 = null;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        int stackOut_66_4 = 0;
        int stackOut_66_5 = 0;
        int stackOut_66_6 = 0;
        int stackOut_66_7 = 0;
        int stackOut_66_8 = 0;
        jd stackOut_31_0 = null;
        jd stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int stackOut_31_5 = 0;
        int stackOut_31_6 = 0;
        int stackOut_31_7 = 0;
        jd stackOut_33_0 = null;
        jd stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        int stackOut_33_5 = 0;
        int stackOut_33_6 = 0;
        int stackOut_33_7 = 0;
        int stackOut_33_8 = 0;
        jd stackOut_32_0 = null;
        jd stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        int stackOut_32_5 = 0;
        int stackOut_32_6 = 0;
        int stackOut_32_7 = 0;
        int stackOut_32_8 = 0;
        jd stackOut_34_0 = null;
        jd stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_34_5 = 0;
        int stackOut_34_6 = 0;
        int stackOut_34_7 = 0;
        jd stackOut_36_0 = null;
        jd stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        int stackOut_36_5 = 0;
        int stackOut_36_6 = 0;
        int stackOut_36_7 = 0;
        int stackOut_36_8 = 0;
        jd stackOut_35_0 = null;
        jd stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        int stackOut_35_5 = 0;
        int stackOut_35_6 = 0;
        int stackOut_35_7 = 0;
        int stackOut_35_8 = 0;
        jd stackOut_21_0 = null;
        jd stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        int stackOut_21_6 = 0;
        int stackOut_21_7 = 0;
        jd stackOut_23_0 = null;
        jd stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        int stackOut_23_8 = 0;
        jd stackOut_22_0 = null;
        jd stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        int stackOut_22_8 = 0;
        jd stackOut_24_0 = null;
        jd stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        jd stackOut_26_0 = null;
        jd stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        jd stackOut_25_0 = null;
        jd stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        var24 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.a((byte) -121, param2, param4);
        var7 = param5 ? 1 : 0;
        var8 = 0;
        L0: while (true) {
          if (var8 >= this.field_l.length) {
            if (var7 != 0) {
              this.c((byte) -95);
              if (this.field_a.a(param4, 0, param2)) {
                if (param0) {
                  L1: {
                    var8 = this.field_l[0].h(5);
                    var9 = this.field_l[1].h(5);
                    var10 = this.field_l[2].h(5);
                    var11 = this.field_l[3].h(5);
                    var12 = 0;
                    var13 = 0;
                    if (75 != var9) {
                      break L1;
                    } else {
                      var9 = 34;
                      var12 = 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (-77 == (var9 ^ -1)) {
                      var12 = 1;
                      var9 = 7;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if ((var8 ^ -1) == -76) {
                      var8 = 34;
                      var13 = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (-77 != (var8 ^ -1)) {
                      break L4;
                    } else {
                      var13 = 1;
                      var8 = 7;
                      break L4;
                    }
                  }
                  L5: {
                    var14 = bw.field_m[var8][4];
                    var15 = var14 / (1 + this.field_l[4].h(5));
                    var16 = bw.field_m[var9][4];
                    var17 = var16 / (1 + this.field_l[5].h(5));
                    if (var15 == 0) {
                      var15++;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (var17 != 0) {
                    L6: {
                      stackOut_143_0 = null;
                      stackOut_143_1 = null;
                      stackOut_143_2 = 0;
                      stackOut_143_3 = 0;
                      stackOut_143_4 = var8;
                      stackOut_143_5 = 0;
                      stackOut_143_6 = var14;
                      stackOut_143_7 = var15;
                      stackIn_145_0 = stackOut_143_0;
                      stackIn_145_1 = stackOut_143_1;
                      stackIn_145_2 = stackOut_143_2;
                      stackIn_145_3 = stackOut_143_3;
                      stackIn_145_4 = stackOut_143_4;
                      stackIn_145_5 = stackOut_143_5;
                      stackIn_145_6 = stackOut_143_6;
                      stackIn_145_7 = stackOut_143_7;
                      stackIn_144_0 = stackOut_143_0;
                      stackIn_144_1 = stackOut_143_1;
                      stackIn_144_2 = stackOut_143_2;
                      stackIn_144_3 = stackOut_143_3;
                      stackIn_144_4 = stackOut_143_4;
                      stackIn_144_5 = stackOut_143_5;
                      stackIn_144_6 = stackOut_143_6;
                      stackIn_144_7 = stackOut_143_7;
                      if (var13 == 0) {
                        stackOut_145_0 = null;
                        stackOut_145_1 = null;
                        stackOut_145_2 = stackIn_145_2;
                        stackOut_145_3 = stackIn_145_3;
                        stackOut_145_4 = stackIn_145_4;
                        stackOut_145_5 = stackIn_145_5;
                        stackOut_145_6 = stackIn_145_6;
                        stackOut_145_7 = stackIn_145_7;
                        stackOut_145_8 = 0;
                        stackIn_146_0 = stackOut_145_0;
                        stackIn_146_1 = stackOut_145_1;
                        stackIn_146_2 = stackOut_145_2;
                        stackIn_146_3 = stackOut_145_3;
                        stackIn_146_4 = stackOut_145_4;
                        stackIn_146_5 = stackOut_145_5;
                        stackIn_146_6 = stackOut_145_6;
                        stackIn_146_7 = stackOut_145_7;
                        stackIn_146_8 = stackOut_145_8;
                        break L6;
                      } else {
                        stackOut_144_0 = null;
                        stackOut_144_1 = null;
                        stackOut_144_2 = stackIn_144_2;
                        stackOut_144_3 = stackIn_144_3;
                        stackOut_144_4 = stackIn_144_4;
                        stackOut_144_5 = stackIn_144_5;
                        stackOut_144_6 = stackIn_144_6;
                        stackOut_144_7 = stackIn_144_7;
                        stackOut_144_8 = 8;
                        stackIn_146_0 = stackOut_144_0;
                        stackIn_146_1 = stackOut_144_1;
                        stackIn_146_2 = stackOut_144_2;
                        stackIn_146_3 = stackOut_144_3;
                        stackIn_146_4 = stackOut_144_4;
                        stackIn_146_5 = stackOut_144_5;
                        stackIn_146_6 = stackOut_144_6;
                        stackIn_146_7 = stackOut_144_7;
                        stackIn_146_8 = stackOut_144_8;
                        break L6;
                      }
                    }
                    L7: {
                      var50 = new jd(stackIn_146_2, stackIn_146_3, stackIn_146_4, stackIn_146_5, stackIn_146_6, stackIn_146_7, stackIn_146_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                      stackOut_146_0 = null;
                      stackOut_146_1 = null;
                      stackOut_146_2 = 0;
                      stackOut_146_3 = 0;
                      stackOut_146_4 = var9;
                      stackOut_146_5 = 0;
                      stackOut_146_6 = var16;
                      stackOut_146_7 = var17;
                      stackIn_148_0 = stackOut_146_0;
                      stackIn_148_1 = stackOut_146_1;
                      stackIn_148_2 = stackOut_146_2;
                      stackIn_148_3 = stackOut_146_3;
                      stackIn_148_4 = stackOut_146_4;
                      stackIn_148_5 = stackOut_146_5;
                      stackIn_148_6 = stackOut_146_6;
                      stackIn_148_7 = stackOut_146_7;
                      stackIn_147_0 = stackOut_146_0;
                      stackIn_147_1 = stackOut_146_1;
                      stackIn_147_2 = stackOut_146_2;
                      stackIn_147_3 = stackOut_146_3;
                      stackIn_147_4 = stackOut_146_4;
                      stackIn_147_5 = stackOut_146_5;
                      stackIn_147_6 = stackOut_146_6;
                      stackIn_147_7 = stackOut_146_7;
                      if (var12 == 0) {
                        stackOut_148_0 = null;
                        stackOut_148_1 = null;
                        stackOut_148_2 = stackIn_148_2;
                        stackOut_148_3 = stackIn_148_3;
                        stackOut_148_4 = stackIn_148_4;
                        stackOut_148_5 = stackIn_148_5;
                        stackOut_148_6 = stackIn_148_6;
                        stackOut_148_7 = stackIn_148_7;
                        stackOut_148_8 = 0;
                        stackIn_149_0 = stackOut_148_0;
                        stackIn_149_1 = stackOut_148_1;
                        stackIn_149_2 = stackOut_148_2;
                        stackIn_149_3 = stackOut_148_3;
                        stackIn_149_4 = stackOut_148_4;
                        stackIn_149_5 = stackOut_148_5;
                        stackIn_149_6 = stackOut_148_6;
                        stackIn_149_7 = stackOut_148_7;
                        stackIn_149_8 = stackOut_148_8;
                        break L7;
                      } else {
                        stackOut_147_0 = null;
                        stackOut_147_1 = null;
                        stackOut_147_2 = stackIn_147_2;
                        stackOut_147_3 = stackIn_147_3;
                        stackOut_147_4 = stackIn_147_4;
                        stackOut_147_5 = stackIn_147_5;
                        stackOut_147_6 = stackIn_147_6;
                        stackOut_147_7 = stackIn_147_7;
                        stackOut_147_8 = 8;
                        stackIn_149_0 = stackOut_147_0;
                        stackIn_149_1 = stackOut_147_1;
                        stackIn_149_2 = stackOut_147_2;
                        stackIn_149_3 = stackOut_147_3;
                        stackIn_149_4 = stackOut_147_4;
                        stackIn_149_5 = stackOut_147_5;
                        stackIn_149_6 = stackOut_147_6;
                        stackIn_149_7 = stackOut_147_7;
                        stackIn_149_8 = stackOut_147_8;
                        break L7;
                      }
                    }
                    L8: {
                      var49 = new jd(stackIn_149_2, stackIn_149_3, stackIn_149_4, stackIn_149_5, stackIn_149_6, stackIn_149_7, stackIn_149_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                      var20 = bw.field_m[var8][0];
                      var21 = bw.field_m[var9][0];
                      var22 = ri.field_c[var11] * (var15 * fk.field_d[var20][var21]) / 10000;
                      if (var22 > var17) {
                        var22 = var17;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var23 = (var17 + -var22) * (fk.field_d[var21][var20] * ri.field_c[var10]) / 10000;
                    this.field_k = new sk((ha) null, (v) null, (vb) null);
                    this.field_k.a(var22, var49, var23, true, var50);
                    le.field_b = new cg();
                    return;
                  } else {
                    L9: {
                      var17++;
                      stackOut_133_0 = null;
                      stackOut_133_1 = null;
                      stackOut_133_2 = 0;
                      stackOut_133_3 = 0;
                      stackOut_133_4 = var8;
                      stackOut_133_5 = 0;
                      stackOut_133_6 = var14;
                      stackOut_133_7 = var15;
                      stackIn_135_0 = stackOut_133_0;
                      stackIn_135_1 = stackOut_133_1;
                      stackIn_135_2 = stackOut_133_2;
                      stackIn_135_3 = stackOut_133_3;
                      stackIn_135_4 = stackOut_133_4;
                      stackIn_135_5 = stackOut_133_5;
                      stackIn_135_6 = stackOut_133_6;
                      stackIn_135_7 = stackOut_133_7;
                      stackIn_134_0 = stackOut_133_0;
                      stackIn_134_1 = stackOut_133_1;
                      stackIn_134_2 = stackOut_133_2;
                      stackIn_134_3 = stackOut_133_3;
                      stackIn_134_4 = stackOut_133_4;
                      stackIn_134_5 = stackOut_133_5;
                      stackIn_134_6 = stackOut_133_6;
                      stackIn_134_7 = stackOut_133_7;
                      if (var13 == 0) {
                        stackOut_135_0 = null;
                        stackOut_135_1 = null;
                        stackOut_135_2 = stackIn_135_2;
                        stackOut_135_3 = stackIn_135_3;
                        stackOut_135_4 = stackIn_135_4;
                        stackOut_135_5 = stackIn_135_5;
                        stackOut_135_6 = stackIn_135_6;
                        stackOut_135_7 = stackIn_135_7;
                        stackOut_135_8 = 0;
                        stackIn_136_0 = stackOut_135_0;
                        stackIn_136_1 = stackOut_135_1;
                        stackIn_136_2 = stackOut_135_2;
                        stackIn_136_3 = stackOut_135_3;
                        stackIn_136_4 = stackOut_135_4;
                        stackIn_136_5 = stackOut_135_5;
                        stackIn_136_6 = stackOut_135_6;
                        stackIn_136_7 = stackOut_135_7;
                        stackIn_136_8 = stackOut_135_8;
                        break L9;
                      } else {
                        stackOut_134_0 = null;
                        stackOut_134_1 = null;
                        stackOut_134_2 = stackIn_134_2;
                        stackOut_134_3 = stackIn_134_3;
                        stackOut_134_4 = stackIn_134_4;
                        stackOut_134_5 = stackIn_134_5;
                        stackOut_134_6 = stackIn_134_6;
                        stackOut_134_7 = stackIn_134_7;
                        stackOut_134_8 = 8;
                        stackIn_136_0 = stackOut_134_0;
                        stackIn_136_1 = stackOut_134_1;
                        stackIn_136_2 = stackOut_134_2;
                        stackIn_136_3 = stackOut_134_3;
                        stackIn_136_4 = stackOut_134_4;
                        stackIn_136_5 = stackOut_134_5;
                        stackIn_136_6 = stackOut_134_6;
                        stackIn_136_7 = stackOut_134_7;
                        stackIn_136_8 = stackOut_134_8;
                        break L9;
                      }
                    }
                    L10: {
                      var44 = new jd(stackIn_136_2, stackIn_136_3, stackIn_136_4, stackIn_136_5, stackIn_136_6, stackIn_136_7, stackIn_136_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                      stackOut_136_0 = null;
                      stackOut_136_1 = null;
                      stackOut_136_2 = 0;
                      stackOut_136_3 = 0;
                      stackOut_136_4 = var9;
                      stackOut_136_5 = 0;
                      stackOut_136_6 = var16;
                      stackOut_136_7 = var17;
                      stackIn_138_0 = stackOut_136_0;
                      stackIn_138_1 = stackOut_136_1;
                      stackIn_138_2 = stackOut_136_2;
                      stackIn_138_3 = stackOut_136_3;
                      stackIn_138_4 = stackOut_136_4;
                      stackIn_138_5 = stackOut_136_5;
                      stackIn_138_6 = stackOut_136_6;
                      stackIn_138_7 = stackOut_136_7;
                      stackIn_137_0 = stackOut_136_0;
                      stackIn_137_1 = stackOut_136_1;
                      stackIn_137_2 = stackOut_136_2;
                      stackIn_137_3 = stackOut_136_3;
                      stackIn_137_4 = stackOut_136_4;
                      stackIn_137_5 = stackOut_136_5;
                      stackIn_137_6 = stackOut_136_6;
                      stackIn_137_7 = stackOut_136_7;
                      if (var12 == 0) {
                        stackOut_138_0 = null;
                        stackOut_138_1 = null;
                        stackOut_138_2 = stackIn_138_2;
                        stackOut_138_3 = stackIn_138_3;
                        stackOut_138_4 = stackIn_138_4;
                        stackOut_138_5 = stackIn_138_5;
                        stackOut_138_6 = stackIn_138_6;
                        stackOut_138_7 = stackIn_138_7;
                        stackOut_138_8 = 0;
                        stackIn_139_0 = stackOut_138_0;
                        stackIn_139_1 = stackOut_138_1;
                        stackIn_139_2 = stackOut_138_2;
                        stackIn_139_3 = stackOut_138_3;
                        stackIn_139_4 = stackOut_138_4;
                        stackIn_139_5 = stackOut_138_5;
                        stackIn_139_6 = stackOut_138_6;
                        stackIn_139_7 = stackOut_138_7;
                        stackIn_139_8 = stackOut_138_8;
                        break L10;
                      } else {
                        stackOut_137_0 = null;
                        stackOut_137_1 = null;
                        stackOut_137_2 = stackIn_137_2;
                        stackOut_137_3 = stackIn_137_3;
                        stackOut_137_4 = stackIn_137_4;
                        stackOut_137_5 = stackIn_137_5;
                        stackOut_137_6 = stackIn_137_6;
                        stackOut_137_7 = stackIn_137_7;
                        stackOut_137_8 = 8;
                        stackIn_139_0 = stackOut_137_0;
                        stackIn_139_1 = stackOut_137_1;
                        stackIn_139_2 = stackOut_137_2;
                        stackIn_139_3 = stackOut_137_3;
                        stackIn_139_4 = stackOut_137_4;
                        stackIn_139_5 = stackOut_137_5;
                        stackIn_139_6 = stackOut_137_6;
                        stackIn_139_7 = stackOut_137_7;
                        stackIn_139_8 = stackOut_137_8;
                        break L10;
                      }
                    }
                    L11: {
                      var43 = new jd(stackIn_139_2, stackIn_139_3, stackIn_139_4, stackIn_139_5, stackIn_139_6, stackIn_139_7, stackIn_139_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                      var20 = bw.field_m[var8][0];
                      var21 = bw.field_m[var9][0];
                      var22 = ri.field_c[var11] * (var15 * fk.field_d[var20][var21]) / 10000;
                      if (var22 > var17) {
                        var22 = var17;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    var23 = (var17 + -var22) * (fk.field_d[var21][var20] * ri.field_c[var10]) / 10000;
                    this.field_k = new sk((ha) null, (v) null, (vb) null);
                    this.field_k.a(var22, var43, var23, true, var44);
                    le.field_b = new cg();
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (this.field_a.a(param4, 0, param2)) {
                if (param0) {
                  L12: {
                    var8 = this.field_l[0].h(5);
                    var9 = this.field_l[1].h(5);
                    var10 = this.field_l[2].h(5);
                    var11 = this.field_l[3].h(5);
                    var12 = 0;
                    var13 = 0;
                    if (75 != var9) {
                      break L12;
                    } else {
                      var9 = 34;
                      var12 = 1;
                      break L12;
                    }
                  }
                  L13: {
                    if (-77 == (var9 ^ -1)) {
                      var12 = 1;
                      var9 = 7;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if ((var8 ^ -1) == -76) {
                      var8 = 34;
                      var13 = 1;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (-77 != (var8 ^ -1)) {
                      break L15;
                    } else {
                      var13 = 1;
                      var8 = 7;
                      break L15;
                    }
                  }
                  L16: {
                    var14 = bw.field_m[var8][4];
                    var15 = var14 / (1 + this.field_l[4].h(5));
                    var16 = bw.field_m[var9][4];
                    var17 = var16 / (1 + this.field_l[5].h(5));
                    if (var15 == 0) {
                      var15++;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  if (var17 == 0) {
                    L17: {
                      var17++;
                      stackOut_102_0 = null;
                      stackOut_102_1 = null;
                      stackOut_102_2 = 0;
                      stackOut_102_3 = 0;
                      stackOut_102_4 = var8;
                      stackOut_102_5 = 0;
                      stackOut_102_6 = var14;
                      stackOut_102_7 = var15;
                      stackIn_104_0 = stackOut_102_0;
                      stackIn_104_1 = stackOut_102_1;
                      stackIn_104_2 = stackOut_102_2;
                      stackIn_104_3 = stackOut_102_3;
                      stackIn_104_4 = stackOut_102_4;
                      stackIn_104_5 = stackOut_102_5;
                      stackIn_104_6 = stackOut_102_6;
                      stackIn_104_7 = stackOut_102_7;
                      stackIn_103_0 = stackOut_102_0;
                      stackIn_103_1 = stackOut_102_1;
                      stackIn_103_2 = stackOut_102_2;
                      stackIn_103_3 = stackOut_102_3;
                      stackIn_103_4 = stackOut_102_4;
                      stackIn_103_5 = stackOut_102_5;
                      stackIn_103_6 = stackOut_102_6;
                      stackIn_103_7 = stackOut_102_7;
                      if (var13 == 0) {
                        stackOut_104_0 = null;
                        stackOut_104_1 = null;
                        stackOut_104_2 = stackIn_104_2;
                        stackOut_104_3 = stackIn_104_3;
                        stackOut_104_4 = stackIn_104_4;
                        stackOut_104_5 = stackIn_104_5;
                        stackOut_104_6 = stackIn_104_6;
                        stackOut_104_7 = stackIn_104_7;
                        stackOut_104_8 = 0;
                        stackIn_105_0 = stackOut_104_0;
                        stackIn_105_1 = stackOut_104_1;
                        stackIn_105_2 = stackOut_104_2;
                        stackIn_105_3 = stackOut_104_3;
                        stackIn_105_4 = stackOut_104_4;
                        stackIn_105_5 = stackOut_104_5;
                        stackIn_105_6 = stackOut_104_6;
                        stackIn_105_7 = stackOut_104_7;
                        stackIn_105_8 = stackOut_104_8;
                        break L17;
                      } else {
                        stackOut_103_0 = null;
                        stackOut_103_1 = null;
                        stackOut_103_2 = stackIn_103_2;
                        stackOut_103_3 = stackIn_103_3;
                        stackOut_103_4 = stackIn_103_4;
                        stackOut_103_5 = stackIn_103_5;
                        stackOut_103_6 = stackIn_103_6;
                        stackOut_103_7 = stackIn_103_7;
                        stackOut_103_8 = 8;
                        stackIn_105_0 = stackOut_103_0;
                        stackIn_105_1 = stackOut_103_1;
                        stackIn_105_2 = stackOut_103_2;
                        stackIn_105_3 = stackOut_103_3;
                        stackIn_105_4 = stackOut_103_4;
                        stackIn_105_5 = stackOut_103_5;
                        stackIn_105_6 = stackOut_103_6;
                        stackIn_105_7 = stackOut_103_7;
                        stackIn_105_8 = stackOut_103_8;
                        break L17;
                      }
                    }
                    L18: {
                      var32 = new jd(stackIn_105_2, stackIn_105_3, stackIn_105_4, stackIn_105_5, stackIn_105_6, stackIn_105_7, stackIn_105_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                      stackOut_105_0 = null;
                      stackOut_105_1 = null;
                      stackOut_105_2 = 0;
                      stackOut_105_3 = 0;
                      stackOut_105_4 = var9;
                      stackOut_105_5 = 0;
                      stackOut_105_6 = var16;
                      stackOut_105_7 = var17;
                      stackIn_107_0 = stackOut_105_0;
                      stackIn_107_1 = stackOut_105_1;
                      stackIn_107_2 = stackOut_105_2;
                      stackIn_107_3 = stackOut_105_3;
                      stackIn_107_4 = stackOut_105_4;
                      stackIn_107_5 = stackOut_105_5;
                      stackIn_107_6 = stackOut_105_6;
                      stackIn_107_7 = stackOut_105_7;
                      stackIn_106_0 = stackOut_105_0;
                      stackIn_106_1 = stackOut_105_1;
                      stackIn_106_2 = stackOut_105_2;
                      stackIn_106_3 = stackOut_105_3;
                      stackIn_106_4 = stackOut_105_4;
                      stackIn_106_5 = stackOut_105_5;
                      stackIn_106_6 = stackOut_105_6;
                      stackIn_106_7 = stackOut_105_7;
                      if (var12 == 0) {
                        stackOut_107_0 = null;
                        stackOut_107_1 = null;
                        stackOut_107_2 = stackIn_107_2;
                        stackOut_107_3 = stackIn_107_3;
                        stackOut_107_4 = stackIn_107_4;
                        stackOut_107_5 = stackIn_107_5;
                        stackOut_107_6 = stackIn_107_6;
                        stackOut_107_7 = stackIn_107_7;
                        stackOut_107_8 = 0;
                        stackIn_108_0 = stackOut_107_0;
                        stackIn_108_1 = stackOut_107_1;
                        stackIn_108_2 = stackOut_107_2;
                        stackIn_108_3 = stackOut_107_3;
                        stackIn_108_4 = stackOut_107_4;
                        stackIn_108_5 = stackOut_107_5;
                        stackIn_108_6 = stackOut_107_6;
                        stackIn_108_7 = stackOut_107_7;
                        stackIn_108_8 = stackOut_107_8;
                        break L18;
                      } else {
                        stackOut_106_0 = null;
                        stackOut_106_1 = null;
                        stackOut_106_2 = stackIn_106_2;
                        stackOut_106_3 = stackIn_106_3;
                        stackOut_106_4 = stackIn_106_4;
                        stackOut_106_5 = stackIn_106_5;
                        stackOut_106_6 = stackIn_106_6;
                        stackOut_106_7 = stackIn_106_7;
                        stackOut_106_8 = 8;
                        stackIn_108_0 = stackOut_106_0;
                        stackIn_108_1 = stackOut_106_1;
                        stackIn_108_2 = stackOut_106_2;
                        stackIn_108_3 = stackOut_106_3;
                        stackIn_108_4 = stackOut_106_4;
                        stackIn_108_5 = stackOut_106_5;
                        stackIn_108_6 = stackOut_106_6;
                        stackIn_108_7 = stackOut_106_7;
                        stackIn_108_8 = stackOut_106_8;
                        break L18;
                      }
                    }
                    L19: {
                      var31 = new jd(stackIn_108_2, stackIn_108_3, stackIn_108_4, stackIn_108_5, stackIn_108_6, stackIn_108_7, stackIn_108_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                      var20 = bw.field_m[var8][0];
                      var21 = bw.field_m[var9][0];
                      var22 = ri.field_c[var11] * (var15 * fk.field_d[var20][var21]) / 10000;
                      if (var22 > var17) {
                        var22 = var17;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    var23 = (var17 + -var22) * (fk.field_d[var21][var20] * ri.field_c[var10]) / 10000;
                    this.field_k = new sk((ha) null, (v) null, (vb) null);
                    this.field_k.a(var22, var31, var23, true, var32);
                    le.field_b = new cg();
                    return;
                  } else {
                    L20: {
                      stackOut_92_0 = null;
                      stackOut_92_1 = null;
                      stackOut_92_2 = 0;
                      stackOut_92_3 = 0;
                      stackOut_92_4 = var8;
                      stackOut_92_5 = 0;
                      stackOut_92_6 = var14;
                      stackOut_92_7 = var15;
                      stackIn_94_0 = stackOut_92_0;
                      stackIn_94_1 = stackOut_92_1;
                      stackIn_94_2 = stackOut_92_2;
                      stackIn_94_3 = stackOut_92_3;
                      stackIn_94_4 = stackOut_92_4;
                      stackIn_94_5 = stackOut_92_5;
                      stackIn_94_6 = stackOut_92_6;
                      stackIn_94_7 = stackOut_92_7;
                      stackIn_93_0 = stackOut_92_0;
                      stackIn_93_1 = stackOut_92_1;
                      stackIn_93_2 = stackOut_92_2;
                      stackIn_93_3 = stackOut_92_3;
                      stackIn_93_4 = stackOut_92_4;
                      stackIn_93_5 = stackOut_92_5;
                      stackIn_93_6 = stackOut_92_6;
                      stackIn_93_7 = stackOut_92_7;
                      if (var13 == 0) {
                        stackOut_94_0 = null;
                        stackOut_94_1 = null;
                        stackOut_94_2 = stackIn_94_2;
                        stackOut_94_3 = stackIn_94_3;
                        stackOut_94_4 = stackIn_94_4;
                        stackOut_94_5 = stackIn_94_5;
                        stackOut_94_6 = stackIn_94_6;
                        stackOut_94_7 = stackIn_94_7;
                        stackOut_94_8 = 0;
                        stackIn_95_0 = stackOut_94_0;
                        stackIn_95_1 = stackOut_94_1;
                        stackIn_95_2 = stackOut_94_2;
                        stackIn_95_3 = stackOut_94_3;
                        stackIn_95_4 = stackOut_94_4;
                        stackIn_95_5 = stackOut_94_5;
                        stackIn_95_6 = stackOut_94_6;
                        stackIn_95_7 = stackOut_94_7;
                        stackIn_95_8 = stackOut_94_8;
                        break L20;
                      } else {
                        stackOut_93_0 = null;
                        stackOut_93_1 = null;
                        stackOut_93_2 = stackIn_93_2;
                        stackOut_93_3 = stackIn_93_3;
                        stackOut_93_4 = stackIn_93_4;
                        stackOut_93_5 = stackIn_93_5;
                        stackOut_93_6 = stackIn_93_6;
                        stackOut_93_7 = stackIn_93_7;
                        stackOut_93_8 = 8;
                        stackIn_95_0 = stackOut_93_0;
                        stackIn_95_1 = stackOut_93_1;
                        stackIn_95_2 = stackOut_93_2;
                        stackIn_95_3 = stackOut_93_3;
                        stackIn_95_4 = stackOut_93_4;
                        stackIn_95_5 = stackOut_93_5;
                        stackIn_95_6 = stackOut_93_6;
                        stackIn_95_7 = stackOut_93_7;
                        stackIn_95_8 = stackOut_93_8;
                        break L20;
                      }
                    }
                    L21: {
                      var34 = new jd(stackIn_95_2, stackIn_95_3, stackIn_95_4, stackIn_95_5, stackIn_95_6, stackIn_95_7, stackIn_95_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                      stackOut_95_0 = null;
                      stackOut_95_1 = null;
                      stackOut_95_2 = 0;
                      stackOut_95_3 = 0;
                      stackOut_95_4 = var9;
                      stackOut_95_5 = 0;
                      stackOut_95_6 = var16;
                      stackOut_95_7 = var17;
                      stackIn_97_0 = stackOut_95_0;
                      stackIn_97_1 = stackOut_95_1;
                      stackIn_97_2 = stackOut_95_2;
                      stackIn_97_3 = stackOut_95_3;
                      stackIn_97_4 = stackOut_95_4;
                      stackIn_97_5 = stackOut_95_5;
                      stackIn_97_6 = stackOut_95_6;
                      stackIn_97_7 = stackOut_95_7;
                      stackIn_96_0 = stackOut_95_0;
                      stackIn_96_1 = stackOut_95_1;
                      stackIn_96_2 = stackOut_95_2;
                      stackIn_96_3 = stackOut_95_3;
                      stackIn_96_4 = stackOut_95_4;
                      stackIn_96_5 = stackOut_95_5;
                      stackIn_96_6 = stackOut_95_6;
                      stackIn_96_7 = stackOut_95_7;
                      if (var12 == 0) {
                        stackOut_97_0 = null;
                        stackOut_97_1 = null;
                        stackOut_97_2 = stackIn_97_2;
                        stackOut_97_3 = stackIn_97_3;
                        stackOut_97_4 = stackIn_97_4;
                        stackOut_97_5 = stackIn_97_5;
                        stackOut_97_6 = stackIn_97_6;
                        stackOut_97_7 = stackIn_97_7;
                        stackOut_97_8 = 0;
                        stackIn_98_0 = stackOut_97_0;
                        stackIn_98_1 = stackOut_97_1;
                        stackIn_98_2 = stackOut_97_2;
                        stackIn_98_3 = stackOut_97_3;
                        stackIn_98_4 = stackOut_97_4;
                        stackIn_98_5 = stackOut_97_5;
                        stackIn_98_6 = stackOut_97_6;
                        stackIn_98_7 = stackOut_97_7;
                        stackIn_98_8 = stackOut_97_8;
                        break L21;
                      } else {
                        stackOut_96_0 = null;
                        stackOut_96_1 = null;
                        stackOut_96_2 = stackIn_96_2;
                        stackOut_96_3 = stackIn_96_3;
                        stackOut_96_4 = stackIn_96_4;
                        stackOut_96_5 = stackIn_96_5;
                        stackOut_96_6 = stackIn_96_6;
                        stackOut_96_7 = stackIn_96_7;
                        stackOut_96_8 = 8;
                        stackIn_98_0 = stackOut_96_0;
                        stackIn_98_1 = stackOut_96_1;
                        stackIn_98_2 = stackOut_96_2;
                        stackIn_98_3 = stackOut_96_3;
                        stackIn_98_4 = stackOut_96_4;
                        stackIn_98_5 = stackOut_96_5;
                        stackIn_98_6 = stackOut_96_6;
                        stackIn_98_7 = stackOut_96_7;
                        stackIn_98_8 = stackOut_96_8;
                        break L21;
                      }
                    }
                    L22: {
                      var33 = new jd(stackIn_98_2, stackIn_98_3, stackIn_98_4, stackIn_98_5, stackIn_98_6, stackIn_98_7, stackIn_98_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                      var20 = bw.field_m[var8][0];
                      var21 = bw.field_m[var9][0];
                      var22 = ri.field_c[var11] * (var15 * fk.field_d[var20][var21]) / 10000;
                      if (var22 > var17) {
                        var22 = var17;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    var23 = (var17 + -var22) * (fk.field_d[var21][var20] * ri.field_c[var10]) / 10000;
                    this.field_k = new sk((ha) null, (v) null, (vb) null);
                    this.field_k.a(var22, var33, var23, true, var34);
                    le.field_b = new cg();
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            this.field_l[var8].a(param0, -18596, param4, param2, param3, param1);
            var7 = var7 != 0 | this.field_l[var8].a((byte) 122) ? 1 : 0;
            var8++;
            if (var24 == 0) {
              if (var24 == 0) {
                continue L0;
              } else {
                L23: {
                  if (var7 == 0) {
                    break L23;
                  } else {
                    this.c((byte) -95);
                    break L23;
                  }
                }
                L24: {
                  if (!this.field_a.a(param4, 0, param2)) {
                    break L24;
                  } else {
                    if (!param0) {
                      break L24;
                    } else {
                      L25: {
                        var8 = this.field_l[0].h(5);
                        var9 = this.field_l[1].h(5);
                        var10 = this.field_l[2].h(5);
                        var11 = this.field_l[3].h(5);
                        var12 = 0;
                        var13 = 0;
                        if (75 != var9) {
                          break L25;
                        } else {
                          var9 = 34;
                          var12 = 1;
                          break L25;
                        }
                      }
                      L26: {
                        if (-77 == (var9 ^ -1)) {
                          var12 = 1;
                          var9 = 7;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      L27: {
                        if ((var8 ^ -1) == -76) {
                          var8 = 34;
                          var13 = 1;
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      L28: {
                        if (-77 != (var8 ^ -1)) {
                          break L28;
                        } else {
                          var13 = 1;
                          var8 = 7;
                          break L28;
                        }
                      }
                      L29: {
                        var14 = bw.field_m[var8][4];
                        var15 = var14 / (1 + this.field_l[4].h(5));
                        var16 = bw.field_m[var9][4];
                        var17 = var16 / (1 + this.field_l[5].h(5));
                        if (var15 == 0) {
                          var15++;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      L30: {
                        if (var17 != 0) {
                          break L30;
                        } else {
                          var17++;
                          break L30;
                        }
                      }
                      L31: {
                        stackOut_62_0 = null;
                        stackOut_62_1 = null;
                        stackOut_62_2 = 0;
                        stackOut_62_3 = 0;
                        stackOut_62_4 = var8;
                        stackOut_62_5 = 0;
                        stackOut_62_6 = var14;
                        stackOut_62_7 = var15;
                        stackIn_64_0 = stackOut_62_0;
                        stackIn_64_1 = stackOut_62_1;
                        stackIn_64_2 = stackOut_62_2;
                        stackIn_64_3 = stackOut_62_3;
                        stackIn_64_4 = stackOut_62_4;
                        stackIn_64_5 = stackOut_62_5;
                        stackIn_64_6 = stackOut_62_6;
                        stackIn_64_7 = stackOut_62_7;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        stackIn_63_2 = stackOut_62_2;
                        stackIn_63_3 = stackOut_62_3;
                        stackIn_63_4 = stackOut_62_4;
                        stackIn_63_5 = stackOut_62_5;
                        stackIn_63_6 = stackOut_62_6;
                        stackIn_63_7 = stackOut_62_7;
                        if (var13 == 0) {
                          stackOut_64_0 = null;
                          stackOut_64_1 = null;
                          stackOut_64_2 = stackIn_64_2;
                          stackOut_64_3 = stackIn_64_3;
                          stackOut_64_4 = stackIn_64_4;
                          stackOut_64_5 = stackIn_64_5;
                          stackOut_64_6 = stackIn_64_6;
                          stackOut_64_7 = stackIn_64_7;
                          stackOut_64_8 = 0;
                          stackIn_65_0 = stackOut_64_0;
                          stackIn_65_1 = stackOut_64_1;
                          stackIn_65_2 = stackOut_64_2;
                          stackIn_65_3 = stackOut_64_3;
                          stackIn_65_4 = stackOut_64_4;
                          stackIn_65_5 = stackOut_64_5;
                          stackIn_65_6 = stackOut_64_6;
                          stackIn_65_7 = stackOut_64_7;
                          stackIn_65_8 = stackOut_64_8;
                          break L31;
                        } else {
                          stackOut_63_0 = null;
                          stackOut_63_1 = null;
                          stackOut_63_2 = stackIn_63_2;
                          stackOut_63_3 = stackIn_63_3;
                          stackOut_63_4 = stackIn_63_4;
                          stackOut_63_5 = stackIn_63_5;
                          stackOut_63_6 = stackIn_63_6;
                          stackOut_63_7 = stackIn_63_7;
                          stackOut_63_8 = 8;
                          stackIn_65_0 = stackOut_63_0;
                          stackIn_65_1 = stackOut_63_1;
                          stackIn_65_2 = stackOut_63_2;
                          stackIn_65_3 = stackOut_63_3;
                          stackIn_65_4 = stackOut_63_4;
                          stackIn_65_5 = stackOut_63_5;
                          stackIn_65_6 = stackOut_63_6;
                          stackIn_65_7 = stackOut_63_7;
                          stackIn_65_8 = stackOut_63_8;
                          break L31;
                        }
                      }
                      L32: {
                        var30 = new jd(stackIn_65_2, stackIn_65_3, stackIn_65_4, stackIn_65_5, stackIn_65_6, stackIn_65_7, stackIn_65_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                        stackOut_65_0 = null;
                        stackOut_65_1 = null;
                        stackOut_65_2 = 0;
                        stackOut_65_3 = 0;
                        stackOut_65_4 = var9;
                        stackOut_65_5 = 0;
                        stackOut_65_6 = var16;
                        stackOut_65_7 = var17;
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        stackIn_67_2 = stackOut_65_2;
                        stackIn_67_3 = stackOut_65_3;
                        stackIn_67_4 = stackOut_65_4;
                        stackIn_67_5 = stackOut_65_5;
                        stackIn_67_6 = stackOut_65_6;
                        stackIn_67_7 = stackOut_65_7;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        stackIn_66_2 = stackOut_65_2;
                        stackIn_66_3 = stackOut_65_3;
                        stackIn_66_4 = stackOut_65_4;
                        stackIn_66_5 = stackOut_65_5;
                        stackIn_66_6 = stackOut_65_6;
                        stackIn_66_7 = stackOut_65_7;
                        if (var12 == 0) {
                          stackOut_67_0 = null;
                          stackOut_67_1 = null;
                          stackOut_67_2 = stackIn_67_2;
                          stackOut_67_3 = stackIn_67_3;
                          stackOut_67_4 = stackIn_67_4;
                          stackOut_67_5 = stackIn_67_5;
                          stackOut_67_6 = stackIn_67_6;
                          stackOut_67_7 = stackIn_67_7;
                          stackOut_67_8 = 0;
                          stackIn_68_0 = stackOut_67_0;
                          stackIn_68_1 = stackOut_67_1;
                          stackIn_68_2 = stackOut_67_2;
                          stackIn_68_3 = stackOut_67_3;
                          stackIn_68_4 = stackOut_67_4;
                          stackIn_68_5 = stackOut_67_5;
                          stackIn_68_6 = stackOut_67_6;
                          stackIn_68_7 = stackOut_67_7;
                          stackIn_68_8 = stackOut_67_8;
                          break L32;
                        } else {
                          stackOut_66_0 = null;
                          stackOut_66_1 = null;
                          stackOut_66_2 = stackIn_66_2;
                          stackOut_66_3 = stackIn_66_3;
                          stackOut_66_4 = stackIn_66_4;
                          stackOut_66_5 = stackIn_66_5;
                          stackOut_66_6 = stackIn_66_6;
                          stackOut_66_7 = stackIn_66_7;
                          stackOut_66_8 = 8;
                          stackIn_68_0 = stackOut_66_0;
                          stackIn_68_1 = stackOut_66_1;
                          stackIn_68_2 = stackOut_66_2;
                          stackIn_68_3 = stackOut_66_3;
                          stackIn_68_4 = stackOut_66_4;
                          stackIn_68_5 = stackOut_66_5;
                          stackIn_68_6 = stackOut_66_6;
                          stackIn_68_7 = stackOut_66_7;
                          stackIn_68_8 = stackOut_66_8;
                          break L32;
                        }
                      }
                      L33: {
                        var29 = new jd(stackIn_68_2, stackIn_68_3, stackIn_68_4, stackIn_68_5, stackIn_68_6, stackIn_68_7, stackIn_68_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                        var20 = bw.field_m[var8][0];
                        var21 = bw.field_m[var9][0];
                        var22 = ri.field_c[var11] * (var15 * fk.field_d[var20][var21]) / 10000;
                        if (var22 > var17) {
                          var22 = var17;
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                      var23 = (var17 + -var22) * (fk.field_d[var21][var20] * ri.field_c[var10]) / 10000;
                      this.field_k = new sk((ha) null, (v) null, (vb) null);
                      this.field_k.a(var22, var29, var23, true, var30);
                      le.field_b = new cg();
                      break L24;
                    }
                  }
                }
                return;
              }
            } else {
              if (this.field_a.a(param4, 0, param2)) {
                if (param0) {
                  L34: {
                    var8 = this.field_l[0].h(5);
                    var9 = this.field_l[1].h(5);
                    var10 = this.field_l[2].h(5);
                    var11 = this.field_l[3].h(5);
                    var12 = 0;
                    var13 = 0;
                    if (75 != var9) {
                      break L34;
                    } else {
                      var9 = 34;
                      var12 = 1;
                      break L34;
                    }
                  }
                  L35: {
                    if (-77 == (var9 ^ -1)) {
                      var12 = 1;
                      var9 = 7;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L36: {
                    if ((var8 ^ -1) == -76) {
                      var8 = 34;
                      var13 = 1;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if (-77 != (var8 ^ -1)) {
                      break L37;
                    } else {
                      var13 = 1;
                      var8 = 7;
                      break L37;
                    }
                  }
                  L38: {
                    var14 = bw.field_m[var8][4];
                    var15 = var14 / (1 + this.field_l[4].h(5));
                    var16 = bw.field_m[var9][4];
                    var17 = var16 / (1 + this.field_l[5].h(5));
                    if (var15 == 0) {
                      var15++;
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                  if (var17 == 0) {
                    L39: {
                      var17++;
                      stackOut_31_0 = null;
                      stackOut_31_1 = null;
                      stackOut_31_2 = 0;
                      stackOut_31_3 = 0;
                      stackOut_31_4 = var8;
                      stackOut_31_5 = 0;
                      stackOut_31_6 = var14;
                      stackOut_31_7 = var15;
                      stackIn_33_0 = stackOut_31_0;
                      stackIn_33_1 = stackOut_31_1;
                      stackIn_33_2 = stackOut_31_2;
                      stackIn_33_3 = stackOut_31_3;
                      stackIn_33_4 = stackOut_31_4;
                      stackIn_33_5 = stackOut_31_5;
                      stackIn_33_6 = stackOut_31_6;
                      stackIn_33_7 = stackOut_31_7;
                      stackIn_32_0 = stackOut_31_0;
                      stackIn_32_1 = stackOut_31_1;
                      stackIn_32_2 = stackOut_31_2;
                      stackIn_32_3 = stackOut_31_3;
                      stackIn_32_4 = stackOut_31_4;
                      stackIn_32_5 = stackOut_31_5;
                      stackIn_32_6 = stackOut_31_6;
                      stackIn_32_7 = stackOut_31_7;
                      if (var13 == 0) {
                        stackOut_33_0 = null;
                        stackOut_33_1 = null;
                        stackOut_33_2 = stackIn_33_2;
                        stackOut_33_3 = stackIn_33_3;
                        stackOut_33_4 = stackIn_33_4;
                        stackOut_33_5 = stackIn_33_5;
                        stackOut_33_6 = stackIn_33_6;
                        stackOut_33_7 = stackIn_33_7;
                        stackOut_33_8 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        stackIn_34_2 = stackOut_33_2;
                        stackIn_34_3 = stackOut_33_3;
                        stackIn_34_4 = stackOut_33_4;
                        stackIn_34_5 = stackOut_33_5;
                        stackIn_34_6 = stackOut_33_6;
                        stackIn_34_7 = stackOut_33_7;
                        stackIn_34_8 = stackOut_33_8;
                        break L39;
                      } else {
                        stackOut_32_0 = null;
                        stackOut_32_1 = null;
                        stackOut_32_2 = stackIn_32_2;
                        stackOut_32_3 = stackIn_32_3;
                        stackOut_32_4 = stackIn_32_4;
                        stackOut_32_5 = stackIn_32_5;
                        stackOut_32_6 = stackIn_32_6;
                        stackOut_32_7 = stackIn_32_7;
                        stackOut_32_8 = 8;
                        stackIn_34_0 = stackOut_32_0;
                        stackIn_34_1 = stackOut_32_1;
                        stackIn_34_2 = stackOut_32_2;
                        stackIn_34_3 = stackOut_32_3;
                        stackIn_34_4 = stackOut_32_4;
                        stackIn_34_5 = stackOut_32_5;
                        stackIn_34_6 = stackOut_32_6;
                        stackIn_34_7 = stackOut_32_7;
                        stackIn_34_8 = stackOut_32_8;
                        break L39;
                      }
                    }
                    L40: {
                      var26 = new jd(stackIn_34_2, stackIn_34_3, stackIn_34_4, stackIn_34_5, stackIn_34_6, stackIn_34_7, stackIn_34_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                      stackOut_34_0 = null;
                      stackOut_34_1 = null;
                      stackOut_34_2 = 0;
                      stackOut_34_3 = 0;
                      stackOut_34_4 = var9;
                      stackOut_34_5 = 0;
                      stackOut_34_6 = var16;
                      stackOut_34_7 = var17;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_36_1 = stackOut_34_1;
                      stackIn_36_2 = stackOut_34_2;
                      stackIn_36_3 = stackOut_34_3;
                      stackIn_36_4 = stackOut_34_4;
                      stackIn_36_5 = stackOut_34_5;
                      stackIn_36_6 = stackOut_34_6;
                      stackIn_36_7 = stackOut_34_7;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      stackIn_35_2 = stackOut_34_2;
                      stackIn_35_3 = stackOut_34_3;
                      stackIn_35_4 = stackOut_34_4;
                      stackIn_35_5 = stackOut_34_5;
                      stackIn_35_6 = stackOut_34_6;
                      stackIn_35_7 = stackOut_34_7;
                      if (var12 == 0) {
                        stackOut_36_0 = null;
                        stackOut_36_1 = null;
                        stackOut_36_2 = stackIn_36_2;
                        stackOut_36_3 = stackIn_36_3;
                        stackOut_36_4 = stackIn_36_4;
                        stackOut_36_5 = stackIn_36_5;
                        stackOut_36_6 = stackIn_36_6;
                        stackOut_36_7 = stackIn_36_7;
                        stackOut_36_8 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        stackIn_37_3 = stackOut_36_3;
                        stackIn_37_4 = stackOut_36_4;
                        stackIn_37_5 = stackOut_36_5;
                        stackIn_37_6 = stackOut_36_6;
                        stackIn_37_7 = stackOut_36_7;
                        stackIn_37_8 = stackOut_36_8;
                        break L40;
                      } else {
                        stackOut_35_0 = null;
                        stackOut_35_1 = null;
                        stackOut_35_2 = stackIn_35_2;
                        stackOut_35_3 = stackIn_35_3;
                        stackOut_35_4 = stackIn_35_4;
                        stackOut_35_5 = stackIn_35_5;
                        stackOut_35_6 = stackIn_35_6;
                        stackOut_35_7 = stackIn_35_7;
                        stackOut_35_8 = 8;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        stackIn_37_2 = stackOut_35_2;
                        stackIn_37_3 = stackOut_35_3;
                        stackIn_37_4 = stackOut_35_4;
                        stackIn_37_5 = stackOut_35_5;
                        stackIn_37_6 = stackOut_35_6;
                        stackIn_37_7 = stackOut_35_7;
                        stackIn_37_8 = stackOut_35_8;
                        break L40;
                      }
                    }
                    L41: {
                      var25 = new jd(stackIn_37_2, stackIn_37_3, stackIn_37_4, stackIn_37_5, stackIn_37_6, stackIn_37_7, stackIn_37_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                      var20 = bw.field_m[var8][0];
                      var21 = bw.field_m[var9][0];
                      var22 = ri.field_c[var11] * (var15 * fk.field_d[var20][var21]) / 10000;
                      if (var22 > var17) {
                        var22 = var17;
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                    var23 = (var17 + -var22) * (fk.field_d[var21][var20] * ri.field_c[var10]) / 10000;
                    this.field_k = new sk((ha) null, (v) null, (vb) null);
                    this.field_k.a(var22, var25, var23, true, var26);
                    le.field_b = new cg();
                    return;
                  } else {
                    L42: {
                      stackOut_21_0 = null;
                      stackOut_21_1 = null;
                      stackOut_21_2 = 0;
                      stackOut_21_3 = 0;
                      stackOut_21_4 = var8;
                      stackOut_21_5 = 0;
                      stackOut_21_6 = var14;
                      stackOut_21_7 = var15;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_23_2 = stackOut_21_2;
                      stackIn_23_3 = stackOut_21_3;
                      stackIn_23_4 = stackOut_21_4;
                      stackIn_23_5 = stackOut_21_5;
                      stackIn_23_6 = stackOut_21_6;
                      stackIn_23_7 = stackOut_21_7;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      stackIn_22_3 = stackOut_21_3;
                      stackIn_22_4 = stackOut_21_4;
                      stackIn_22_5 = stackOut_21_5;
                      stackIn_22_6 = stackOut_21_6;
                      stackIn_22_7 = stackOut_21_7;
                      if (var13 == 0) {
                        stackOut_23_0 = null;
                        stackOut_23_1 = null;
                        stackOut_23_2 = stackIn_23_2;
                        stackOut_23_3 = stackIn_23_3;
                        stackOut_23_4 = stackIn_23_4;
                        stackOut_23_5 = stackIn_23_5;
                        stackOut_23_6 = stackIn_23_6;
                        stackOut_23_7 = stackIn_23_7;
                        stackOut_23_8 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        stackIn_24_3 = stackOut_23_3;
                        stackIn_24_4 = stackOut_23_4;
                        stackIn_24_5 = stackOut_23_5;
                        stackIn_24_6 = stackOut_23_6;
                        stackIn_24_7 = stackOut_23_7;
                        stackIn_24_8 = stackOut_23_8;
                        break L42;
                      } else {
                        stackOut_22_0 = null;
                        stackOut_22_1 = null;
                        stackOut_22_2 = stackIn_22_2;
                        stackOut_22_3 = stackIn_22_3;
                        stackOut_22_4 = stackIn_22_4;
                        stackOut_22_5 = stackIn_22_5;
                        stackOut_22_6 = stackIn_22_6;
                        stackOut_22_7 = stackIn_22_7;
                        stackOut_22_8 = 8;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        stackIn_24_3 = stackOut_22_3;
                        stackIn_24_4 = stackOut_22_4;
                        stackIn_24_5 = stackOut_22_5;
                        stackIn_24_6 = stackOut_22_6;
                        stackIn_24_7 = stackOut_22_7;
                        stackIn_24_8 = stackOut_22_8;
                        break L42;
                      }
                    }
                    L43: {
                      var28 = new jd(stackIn_24_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_24_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                      stackOut_24_0 = null;
                      stackOut_24_1 = null;
                      stackOut_24_2 = 0;
                      stackOut_24_3 = 0;
                      stackOut_24_4 = var9;
                      stackOut_24_5 = 0;
                      stackOut_24_6 = var16;
                      stackOut_24_7 = var17;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      stackIn_26_2 = stackOut_24_2;
                      stackIn_26_3 = stackOut_24_3;
                      stackIn_26_4 = stackOut_24_4;
                      stackIn_26_5 = stackOut_24_5;
                      stackIn_26_6 = stackOut_24_6;
                      stackIn_26_7 = stackOut_24_7;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      stackIn_25_2 = stackOut_24_2;
                      stackIn_25_3 = stackOut_24_3;
                      stackIn_25_4 = stackOut_24_4;
                      stackIn_25_5 = stackOut_24_5;
                      stackIn_25_6 = stackOut_24_6;
                      stackIn_25_7 = stackOut_24_7;
                      if (var12 == 0) {
                        stackOut_26_0 = null;
                        stackOut_26_1 = null;
                        stackOut_26_2 = stackIn_26_2;
                        stackOut_26_3 = stackIn_26_3;
                        stackOut_26_4 = stackIn_26_4;
                        stackOut_26_5 = stackIn_26_5;
                        stackOut_26_6 = stackIn_26_6;
                        stackOut_26_7 = stackIn_26_7;
                        stackOut_26_8 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        stackIn_27_2 = stackOut_26_2;
                        stackIn_27_3 = stackOut_26_3;
                        stackIn_27_4 = stackOut_26_4;
                        stackIn_27_5 = stackOut_26_5;
                        stackIn_27_6 = stackOut_26_6;
                        stackIn_27_7 = stackOut_26_7;
                        stackIn_27_8 = stackOut_26_8;
                        break L43;
                      } else {
                        stackOut_25_0 = null;
                        stackOut_25_1 = null;
                        stackOut_25_2 = stackIn_25_2;
                        stackOut_25_3 = stackIn_25_3;
                        stackOut_25_4 = stackIn_25_4;
                        stackOut_25_5 = stackIn_25_5;
                        stackOut_25_6 = stackIn_25_6;
                        stackOut_25_7 = stackIn_25_7;
                        stackOut_25_8 = 8;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        stackIn_27_2 = stackOut_25_2;
                        stackIn_27_3 = stackOut_25_3;
                        stackIn_27_4 = stackOut_25_4;
                        stackIn_27_5 = stackOut_25_5;
                        stackIn_27_6 = stackOut_25_6;
                        stackIn_27_7 = stackOut_25_7;
                        stackIn_27_8 = stackOut_25_8;
                        break L43;
                      }
                    }
                    L44: {
                      var27 = new jd(stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                      var20 = bw.field_m[var8][0];
                      var21 = bw.field_m[var9][0];
                      var22 = ri.field_c[var11] * (var15 * fk.field_d[var20][var21]) / 10000;
                      if (var22 > var17) {
                        var22 = var17;
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                    var23 = (var17 + -var22) * (fk.field_d[var21][var20] * ri.field_c[var10]) / 10000;
                    this.field_k = new sk((ha) null, (v) null, (vb) null);
                    this.field_k.a(var22, var27, var23, true, var28);
                    le.field_b = new cg();
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final static void a(wk param0, int param1) {
        if (param1 != 3) {
            return;
        }
        try {
            rq.a((byte) -56);
            qn.a(param0.field_B, param0.field_A, param0.field_x);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vn.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        int var2 = so.field_b.field_a >> -703583551;
        int var3 = -this.field_m.field_H + so.field_b.field_g + -(this.field_m.field_L << -7884543);
        int var4 = this.field_i[param0];
        this.field_m.c("Press Esc to return to the main menu", var2, var3, var4, -1);
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_19_0 = false;
        boolean stackOut_10_0 = false;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (var4 < this.field_l.length) {
            stackOut_10_0 = this.field_l[var4].b(param1, 2, param2);
            stackIn_19_0 = stackOut_10_0;
            stackIn_11_0 = stackOut_10_0;
            if (var6 == 0) {
              if (stackIn_19_0) {
                var5 = 0;
                L1: while (true) {
                  if (var5 >= this.field_l.length) {
                    return;
                  } else {
                    L2: {
                      L3: {
                        if (var4 != var5) {
                          break L3;
                        } else {
                          this.field_l[var5].j(0);
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_l[var5].e(32);
                      break L2;
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              var5 = stackIn_11_0 ? 1 : 0;
              var4 = 0;
              L4: while (true) {
                L5: {
                  if (var4 >= this.field_l.length) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        if (var4 == 0) {
                          break L7;
                        } else {
                          this.field_l[var4].e(32);
                          if (var6 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      this.field_l[var4].j(0);
                      break L6;
                    }
                    var4++;
                    if (var6 == 0) {
                      continue L4;
                    } else {
                      break L5;
                    }
                  }
                }
                return;
              }
            }
          } else {
            var5 = 67 / ((-58 - param0) / 63);
            var4 = 0;
            L8: while (true) {
              L9: {
                if (var4 >= this.field_l.length) {
                  break L9;
                } else {
                  L10: {
                    L11: {
                      if (var4 == 0) {
                        break L11;
                      } else {
                        this.field_l[var4].e(32);
                        if (var6 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    this.field_l[var4].j(0);
                    break L10;
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L8;
                  } else {
                    break L9;
                  }
                }
              }
              return;
            }
          }
        }
    }

    vn(wk[] param0, wk[] param1, tu param2, int[] param3, int param4, int param5) {
        this.field_c = 0;
        try {
            this.field_b = param0;
            this.field_m = param2;
            this.field_i = param3;
            this.field_f = param1;
            this.b((byte) -49);
            this.c((byte) -103);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void c(int param0) {
        if (null != this.field_k) {
          this.field_k.c((byte) -120);
          this.a(0);
          if (param0 != 2) {
            return;
          } else {
            L0: {
              if (null == le.field_b) {
                break L0;
              } else {
                le.field_b.a(8, this.field_c);
                break L0;
              }
            }
            return;
          }
        } else {
          this.field_d.a(113);
          this.field_h.a(71);
          this.field_a.a(53);
          this.b(0);
          if (!ArmiesOfGielinor.field_M) {
            this.a(0);
            if (param0 != 2) {
              return;
            } else {
              L1: {
                if (null == le.field_b) {
                  break L1;
                } else {
                  le.field_b.a(8, this.field_c);
                  break L1;
                }
              }
              return;
            }
          } else {
            this.field_k.c((byte) -120);
            this.a(0);
            if (param0 != 2) {
              return;
            } else {
              L2: {
                if (null == le.field_b) {
                  break L2;
                } else {
                  le.field_b.a(8, this.field_c);
                  break L2;
                }
              }
              return;
            }
          }
        }
    }

    private final int a(byte param0, int param1) {
        if (0 != param1) {
          if ((param1 ^ -1) != -2) {
            if ((param1 ^ -1) != -3) {
              if ((param1 ^ -1) != -4) {
                if (-5 == (param1 ^ -1)) {
                  return this.field_l[1].e(true);
                } else {
                  if (-6 != (param1 ^ -1)) {
                    if (6 == param1) {
                      return this.field_a.a((byte) -127);
                    } else {
                      if ((param1 ^ -1) == -8) {
                        return this.field_l[4].e(true);
                      } else {
                        if (param0 == -101) {
                          if ((param1 ^ -1) == -9) {
                            return this.field_l[5].e(true);
                          } else {
                            return 0;
                          }
                        } else {
                          this.a(true, 53, -58, false, -8, false);
                          if ((param1 ^ -1) == -9) {
                            return this.field_l[5].e(true);
                          } else {
                            return 0;
                          }
                        }
                      }
                    }
                  } else {
                    return this.field_l[3].e(true);
                  }
                }
              } else {
                return this.field_h.a((byte) -63);
              }
            } else {
              return this.field_l[2].e(true);
            }
          } else {
            return this.field_l[0].e(true);
          }
        } else {
          return this.field_d.a((byte) -25);
        }
    }

    private final void c(byte param0) {
        L0: {
          this.a(10, -50, 0, 10);
          this.a(10, -45, 1, this.a((byte) -101, 0) + 10);
          this.a(10, -44, 2, this.a((byte) -101, 0) + (10 + this.a((byte) -101, 1)));
          if (param0 <= -56) {
            break L0;
          } else {
            this.a(-9);
            break L0;
          }
        }
        this.a(10, -82, 7, this.a((byte) -101, 0) + 10 - (-this.a((byte) -101, 1) + -this.a((byte) -101, 3)));
        this.a(630 - this.a(3, (byte) -42), -64, 3, 10);
        this.a(-this.a(4, (byte) -42) + 630, -75, 4, this.a((byte) -101, 3) + 10);
        this.a(630 + -this.a(5, (byte) -42), -112, 5, 10 - (-this.a((byte) -101, 3) - this.a((byte) -101, 4)));
        this.a(630 - this.a(8, (byte) -42), -100, 8, this.a((byte) -101, 3) + 10 - -this.a((byte) -101, 4) + this.a((byte) -101, 5));
        this.a(320 + -(this.a(6, (byte) -42) / 2), -84, 6, 360);
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, boolean param5) {
        if (param1 == 5) {
          if (le.field_b != null) {
            this.field_c = this.field_c + 1;
            if (50 < this.field_c) {
              le.field_b = null;
              this.field_c = 0;
              if (null != this.field_k) {
                L0: {
                  this.field_k.b((oj) null, (byte) -121);
                  if (this.field_k.b(8865)) {
                    this.field_k = null;
                    le.field_b = new cg();
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              } else {
                this.a(param3, param0, param4, param5, param2, false);
                return;
              }
            } else {
              if (null != this.field_k) {
                L1: {
                  this.field_k.b((oj) null, (byte) -121);
                  if (this.field_k.b(8865)) {
                    this.field_k = null;
                    le.field_b = new cg();
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                this.a(param3, param0, param4, param5, param2, false);
                return;
              }
            }
          } else {
            if (null != this.field_k) {
              L2: {
                this.field_k.b((oj) null, (byte) -121);
                if (this.field_k.b(8865)) {
                  this.field_k = null;
                  le.field_b = new cg();
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              this.a(param3, param0, param4, param5, param2, false);
              return;
            }
          }
        } else {
          this.field_c = 0;
          if (le.field_b != null) {
            this.field_c = this.field_c + 1;
            if (50 < this.field_c) {
              le.field_b = null;
              this.field_c = 0;
              if (null != this.field_k) {
                L3: {
                  this.field_k.b((oj) null, (byte) -121);
                  if (this.field_k.b(8865)) {
                    this.field_k = null;
                    le.field_b = new cg();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              } else {
                this.a(param3, param0, param4, param5, param2, false);
                return;
              }
            } else {
              if (null != this.field_k) {
                L4: {
                  this.field_k.b((oj) null, (byte) -121);
                  if (this.field_k.b(8865)) {
                    this.field_k = null;
                    le.field_b = new cg();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              } else {
                this.a(param3, param0, param4, param5, param2, false);
                return;
              }
            }
          } else {
            if (null != this.field_k) {
              L5: {
                this.field_k.b((oj) null, (byte) -121);
                if (this.field_k.b(8865)) {
                  this.field_k = null;
                  le.field_b = new cg();
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            } else {
              this.a(param3, param0, param4, param5, param2, false);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_j = null;
        if (param0 != -8) {
            field_e = (String) null;
            field_e = null;
            field_g = null;
            return;
        }
        field_e = null;
        field_g = null;
    }

    static {
        field_g = "Most kills";
        field_e = "Play the game without logging in just yet";
        field_j = new pf("email");
    }
}
