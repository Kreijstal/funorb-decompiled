/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qka extends llb {
    private StringBuilder field_yb;
    private llb field_vb;
    private int field_wb;
    private llb field_xb;

    final boolean a(boolean param0) {
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$20 = null;
        StringBuilder discarded$21 = null;
        int var2 = 0;
        if (-1 != (this.field_wb ^ -1)) {
          return false;
        } else {
          if (-86 == (pma.field_o ^ -1)) {
            L0: {
              if (this.field_yb.length() > 0) {
                discarded$11 = npa.a(this.field_yb.length() + -1, param0, this.field_yb, ' ');
                break L0;
              } else {
                break L0;
              }
            }
            if (-13 < (this.field_yb.length() ^ -1)) {
              L1: {
                var2 = Character.toLowerCase(jl.field_r);
                if (var2 != 32) {
                  break L1;
                } else {
                  var2 = 95;
                  break L1;
                }
              }
              L2: {
                if (var2 != 95) {
                  break L2;
                } else {
                  if (0 < this.field_yb.length()) {
                    discarded$12 = this.field_yb.append((char) var2);
                    break L2;
                  } else {
                    L3: {
                      if (cs.a((char) var2, 0)) {
                        discarded$13 = this.field_yb.append((char) var2);
                        break L3;
                      } else {
                        if (haa.a((char) var2, true)) {
                          discarded$14 = this.field_yb.append((char) var2);
                          break L3;
                        } else {
                          L4: {
                            if (pma.field_o == 84) {
                              if (-1 <= (this.field_yb.length() ^ -1)) {
                                this.field_wb = 1;
                                break L4;
                              } else {
                                this.field_R = this.field_yb.toString();
                                this.field_wb = 2;
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            if (pma.field_o == 13) {
                              this.field_wb = 1;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          if (param0) {
                            return false;
                          } else {
                            return true;
                          }
                        }
                      }
                    }
                    L6: {
                      if (pma.field_o == 84) {
                        if (-1 <= (this.field_yb.length() ^ -1)) {
                          this.field_wb = 1;
                          break L6;
                        } else {
                          this.field_R = this.field_yb.toString();
                          this.field_wb = 2;
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (pma.field_o == 13) {
                        this.field_wb = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (param0) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              }
              if (cs.a((char) var2, 0)) {
                discarded$15 = this.field_yb.append((char) var2);
                if (pma.field_o == 84) {
                  if (-1 <= (this.field_yb.length() ^ -1)) {
                    L8: {
                      this.field_wb = 1;
                      if (pma.field_o == 13) {
                        this.field_wb = 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (!param0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    L9: {
                      this.field_R = this.field_yb.toString();
                      this.field_wb = 2;
                      if (pma.field_o == 13) {
                        this.field_wb = 1;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (!param0) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  L10: {
                    if (pma.field_o == 13) {
                      this.field_wb = 1;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if (!param0) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                if (haa.a((char) var2, true)) {
                  discarded$16 = this.field_yb.append((char) var2);
                  if (pma.field_o == 84) {
                    if (-1 <= (this.field_yb.length() ^ -1)) {
                      L11: {
                        this.field_wb = 1;
                        if (pma.field_o == 13) {
                          this.field_wb = 1;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      L12: {
                        this.field_R = this.field_yb.toString();
                        this.field_wb = 2;
                        if (pma.field_o == 13) {
                          this.field_wb = 1;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    L13: {
                      if (pma.field_o == 13) {
                        this.field_wb = 1;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    if (!param0) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  if (pma.field_o == 84) {
                    if (-1 <= (this.field_yb.length() ^ -1)) {
                      L14: {
                        this.field_wb = 1;
                        if (pma.field_o == 13) {
                          this.field_wb = 1;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      L15: {
                        this.field_R = this.field_yb.toString();
                        this.field_wb = 2;
                        if (pma.field_o == 13) {
                          this.field_wb = 1;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    L16: {
                      if (pma.field_o == 13) {
                        this.field_wb = 1;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (!param0) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              }
            } else {
              if (pma.field_o == 84) {
                if (-1 <= (this.field_yb.length() ^ -1)) {
                  L17: {
                    this.field_wb = 1;
                    if (pma.field_o == 13) {
                      this.field_wb = 1;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  if (!param0) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  L18: {
                    this.field_R = this.field_yb.toString();
                    this.field_wb = 2;
                    if (pma.field_o == 13) {
                      this.field_wb = 1;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  if (!param0) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                L19: {
                  if (pma.field_o == 13) {
                    this.field_wb = 1;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                if (!param0) {
                  return true;
                } else {
                  return false;
                }
              }
            }
          } else {
            L20: {
              if (-13 < (this.field_yb.length() ^ -1)) {
                L21: {
                  var2 = Character.toLowerCase(jl.field_r);
                  if (var2 != 32) {
                    break L21;
                  } else {
                    var2 = 95;
                    break L21;
                  }
                }
                L22: {
                  if (var2 != 95) {
                    break L22;
                  } else {
                    if (0 < this.field_yb.length()) {
                      discarded$17 = this.field_yb.append((char) var2);
                      break L22;
                    } else {
                      L23: {
                        if (cs.a((char) var2, 0)) {
                          discarded$18 = this.field_yb.append((char) var2);
                          break L23;
                        } else {
                          if (!haa.a((char) var2, true)) {
                            break L23;
                          } else {
                            discarded$19 = this.field_yb.append((char) var2);
                            break L23;
                          }
                        }
                      }
                      L24: {
                        if (pma.field_o == 84) {
                          if (-1 <= (this.field_yb.length() ^ -1)) {
                            this.field_wb = 1;
                            break L24;
                          } else {
                            this.field_R = this.field_yb.toString();
                            this.field_wb = 2;
                            break L24;
                          }
                        } else {
                          break L24;
                        }
                      }
                      L25: {
                        if (pma.field_o == 13) {
                          this.field_wb = 1;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      if (param0) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  }
                }
                if (cs.a((char) var2, 0)) {
                  L26: {
                    discarded$20 = this.field_yb.append((char) var2);
                    if (pma.field_o == 84) {
                      if (-1 <= (this.field_yb.length() ^ -1)) {
                        this.field_wb = 1;
                        break L26;
                      } else {
                        this.field_R = this.field_yb.toString();
                        this.field_wb = 2;
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (pma.field_o == 13) {
                      this.field_wb = 1;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (param0) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  if (!haa.a((char) var2, true)) {
                    break L20;
                  } else {
                    L28: {
                      discarded$21 = this.field_yb.append((char) var2);
                      if (pma.field_o == 84) {
                        if (-1 <= (this.field_yb.length() ^ -1)) {
                          this.field_wb = 1;
                          break L28;
                        } else {
                          this.field_R = this.field_yb.toString();
                          this.field_wb = 2;
                          break L28;
                        }
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (pma.field_o == 13) {
                        this.field_wb = 1;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    if (param0) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              } else {
                break L20;
              }
            }
            if (pma.field_o == 84) {
              if (-1 <= (this.field_yb.length() ^ -1)) {
                L30: {
                  this.field_wb = 1;
                  if (pma.field_o == 13) {
                    this.field_wb = 1;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                if (param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                L31: {
                  this.field_R = this.field_yb.toString();
                  this.field_wb = 2;
                  if (pma.field_o == 13) {
                    this.field_wb = 1;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                if (param0) {
                  return false;
                } else {
                  return true;
                }
              }
            } else {
              L32: {
                if (pma.field_o == 13) {
                  this.field_wb = 1;
                  break L32;
                } else {
                  break L32;
                }
              }
              if (param0) {
                return false;
              } else {
                return true;
              }
            }
          }
        }
    }

    final int a(int param0, boolean param1) {
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (param0 == 0) {
          this.a(param1, 1332);
          if (param1) {
            L0: while (true) {
              if (!ata.e(127)) {
                L1: {
                  this.field_vb.field_R = this.field_yb.toString();
                  if (!param1) {
                    break L1;
                  } else {
                    if (pba.field_o == 0) {
                      break L1;
                    } else {
                      if (this.field_o == 0) {
                        this.field_wb = 1;
                        break L1;
                      } else {
                        return this.field_wb;
                      }
                    }
                  }
                }
                return this.field_wb;
              } else {
                L2: {
                  if (-86 != (pma.field_o ^ -1)) {
                    break L2;
                  } else {
                    if (-1 <= (this.field_yb.length() ^ -1)) {
                      break L2;
                    } else {
                      discarded$10 = npa.a(-1 + this.field_yb.length(), false, this.field_yb, ' ');
                      break L2;
                    }
                  }
                }
                L3: {
                  if (dtb.a(jl.field_r, 109, (CharSequence) ((Object) this.field_yb))) {
                    discarded$11 = this.field_yb.append(jl.field_r);
                    break L3;
                  } else {
                    L4: {
                      if (-1 != (this.field_yb.length() ^ -1)) {
                        break L4;
                      } else {
                        if (jl.field_r == 91) {
                          discarded$12 = this.field_yb.append(jl.field_r);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (-2 != (this.field_yb.length() ^ -1)) {
                        break L5;
                      } else {
                        if (35 == jl.field_r) {
                          discarded$13 = this.field_yb.append(jl.field_r);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (93 == jl.field_r) {
                      discarded$14 = this.field_yb.append(jl.field_r);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                if (pma.field_o != 84) {
                  if (-14 == (pma.field_o ^ -1)) {
                    return 1;
                  } else {
                    continue L0;
                  }
                } else {
                  if (0 < this.field_yb.length()) {
                    this.field_R = this.field_yb.toString();
                    return 2;
                  } else {
                    return 1;
                  }
                }
              }
            }
          } else {
            L6: {
              this.field_vb.field_R = this.field_yb.toString();
              if (!param1) {
                break L6;
              } else {
                if (pba.field_o == 0) {
                  break L6;
                } else {
                  if (this.field_o == 0) {
                    this.field_wb = 1;
                    break L6;
                  } else {
                    return this.field_wb;
                  }
                }
              }
            }
            return this.field_wb;
          }
        } else {
          this.field_vb = (llb) null;
          this.a(param1, 1332);
          if (!param1) {
            this.field_vb.field_R = this.field_yb.toString();
            if (param1) {
              if (pba.field_o != 0) {
                if (this.field_o == 0) {
                  this.field_wb = 1;
                  return this.field_wb;
                } else {
                  return this.field_wb;
                }
              } else {
                return this.field_wb;
              }
            } else {
              return this.field_wb;
            }
          } else {
            L7: while (true) {
              if (ata.e(127)) {
                L8: {
                  if (-86 != (pma.field_o ^ -1)) {
                    break L8;
                  } else {
                    if (-1 <= (this.field_yb.length() ^ -1)) {
                      break L8;
                    } else {
                      discarded$15 = npa.a(-1 + this.field_yb.length(), false, this.field_yb, ' ');
                      break L8;
                    }
                  }
                }
                L9: {
                  if (dtb.a(jl.field_r, 109, (CharSequence) ((Object) this.field_yb))) {
                    discarded$16 = this.field_yb.append(jl.field_r);
                    break L9;
                  } else {
                    L10: {
                      if (-1 != (this.field_yb.length() ^ -1)) {
                        break L10;
                      } else {
                        if (jl.field_r == 91) {
                          discarded$17 = this.field_yb.append(jl.field_r);
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (-2 != (this.field_yb.length() ^ -1)) {
                        break L11;
                      } else {
                        if (35 == jl.field_r) {
                          discarded$18 = this.field_yb.append(jl.field_r);
                          break L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                    if (93 == jl.field_r) {
                      discarded$19 = this.field_yb.append(jl.field_r);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                if (pma.field_o != 84) {
                  if (-14 == (pma.field_o ^ -1)) {
                    return 1;
                  } else {
                    continue L7;
                  }
                } else {
                  if (0 >= this.field_yb.length()) {
                    return 1;
                  } else {
                    this.field_R = this.field_yb.toString();
                    return 2;
                  }
                }
              } else {
                L12: {
                  this.field_vb.field_R = this.field_yb.toString();
                  if (!param1) {
                    break L12;
                  } else {
                    if (pba.field_o == 0) {
                      break L12;
                    } else {
                      if (this.field_o == 0) {
                        this.field_wb = 1;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                return this.field_wb;
              }
            }
          }
        }
    }

    qka(int param0, int param1, int param2, int param3, String param4, llb param5, llb param6, llb param7) {
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
        this.field_wb = 0;
        try {
          L0: {
            this.field_xb = new llb(0L, param6, param4);
            this.b(-561, this.field_xb);
            this.field_vb = new llb(0L, param7);
            this.field_vb.field_Y = 16764006;
            this.b(-561, this.field_vb);
            this.field_vb.field_s = "|";
            this.field_yb = new StringBuilder(12);
            var9_int = this.field_xb.e(57);
            this.field_xb.a(5, 119, var9_int, 3, nna.field_w);
            this.field_vb.a(5, 43, var9_int, 3 + nna.field_w, nna.field_w);
            var10 = 10 + var9_int;
            var11 = 3 - -(2 * nna.field_w) - -3;
            var12 = jv.a((byte) -109, param0, param2, var10);
            var13 = lma.a(param3, param1, var11, (byte) -16);
            this.a(var12, 122, var10, var13, var11);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var9);
            stackOut_3_1 = new StringBuilder().append("qka.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    static {
    }
}
