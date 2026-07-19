/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh implements fo {
    int field_f;
    int field_i;
    private boolean field_c;
    int field_p;
    private boolean field_j;
    private boolean field_h;
    private boolean field_n;
    private boolean field_e;
    private int field_b;
    int field_d;
    int field_a;
    private boolean field_m;
    int field_l;
    private boolean field_k;
    int field_o;
    lma field_g;
    private boolean field_q;

    final static void b(int param0, int param1) {
        kh var2 = null;
        var2 = ql.field_k;
        var2.k(param0, -2988);
        var2.i(1, param1 + 22243);
        if (param1 != -22243) {
          return;
        } else {
          var2.i(0, 0);
          return;
        }
    }

    public final void a(int param0, iq param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        ka var6 = null;
        ka var7 = null;
        ka var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = this.b((byte) -113);
            var4 = this.c((byte) 115);
            var5 = this.e((byte) -108);
            gqa.a(dfa.a(this.field_o, 2048, 87), -83584144, var4, var3_int, this.field_g.a((fh) (this), (byte) 76), var5);
            if (!nk.c(-115)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 >= 103) {
                L1: {
                  var6 = gca.field_g[21];
                  var7 = gca.field_g[23];
                  var8 = gca.field_g[22];
                  var9 = 0;
                  if (this.field_g.o((byte) 111)) {
                    var9 = var9 + 4 * this.field_b % 32;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (this.field_m) {
                    L3: {
                      if (!this.field_k) {
                        break L3;
                      } else {
                        gqa.a(1024, -83584144, 2097152 + var4, var3_int, var8, var9);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (!this.field_h) {
                      gqa.a(512, -83584144, var4 - -2097152, var3_int, var6, var9);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (!this.field_c) {
                    break L4;
                  } else {
                    L5: {
                      if (this.field_j) {
                        break L5;
                      } else {
                        if (!this.field_k) {
                          gqa.a(0, -83584144, var4, var3_int - -2097152, var6, var9);
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    gqa.a(512, -83584144, var4, var3_int + 2097152, var8, var9);
                    break L4;
                  }
                }
                L6: {
                  if (this.field_e) {
                    if (this.field_q) {
                      break L6;
                    } else {
                      L7: {
                        if (!this.field_h) {
                          break L7;
                        } else {
                          gqa.a(-512, -83584144, var4, -2097152 + var3_int, var8, var9);
                          if (var10 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      gqa.a(1024, -83584144, var4, var3_int - 2097152, var6, var9);
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L8: {
                  if (this.field_n) {
                    if (this.field_j) {
                      break L8;
                    } else {
                      L9: {
                        if (this.field_q) {
                          break L9;
                        } else {
                          gqa.a(-512, -83584144, var4 + -2097152, var3_int, var6, var9);
                          if (var10 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      gqa.a(0, -83584144, -2097152 + var4, var3_int, var8, var9);
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
                L10: {
                  if (!this.field_m) {
                    break L10;
                  } else {
                    if (!this.field_c) {
                      break L10;
                    } else {
                      gqa.a(0, -83584144, 2097152 + var4, var3_int + 2097152, var7, var9);
                      break L10;
                    }
                  }
                }
                L11: {
                  if (!this.field_m) {
                    break L11;
                  } else {
                    if (this.field_e) {
                      gqa.a(512, -83584144, var4 + 2097152, -2097152 + var3_int, var7, var9);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                L12: {
                  if (!this.field_n) {
                    break L12;
                  } else {
                    if (!this.field_c) {
                      break L12;
                    } else {
                      gqa.a(-512, -83584144, -2097152 + var4, var3_int - -2097152, var7, var9);
                      break L12;
                    }
                  }
                }
                L13: {
                  if (!this.field_n) {
                    break L13;
                  } else {
                    if (this.field_e) {
                      gqa.a(1024, -83584144, var4 + -2097152, -2097152 + var3_int, var7, var9);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) (var3);
            stackOut_52_1 = new StringBuilder().append("fh.DB(").append(param0).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L14;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        this.field_n = false;
        this.field_e = false;
        this.field_c = false;
        this.field_m = false;
        if (0 != this.field_a) {
          if (1 != this.field_a) {
            L0: {
              L1: {
                if (2 == this.field_a) {
                  break L1;
                } else {
                  L2: {
                    if (-4 == (this.field_a ^ -1)) {
                      break L2;
                    } else {
                      if ((this.field_a ^ -1) == -5) {
                        L3: {
                          L4: {
                            L5: {
                              L6: {
                                var6 = this.field_i;
                                if (1 != var6) {
                                  break L6;
                                } else {
                                  if (var7 == 0) {
                                    this.field_n = true;
                                    this.field_c = true;
                                    if (var7 == 0) {
                                      break L0;
                                    } else {
                                      break L5;
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              L7: {
                                if (3 != var6) {
                                  break L7;
                                } else {
                                  if (var7 == 0) {
                                    break L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              if (7 == var6) {
                                break L4;
                              } else {
                                if (5 == var6) {
                                  break L3;
                                } else {
                                  break L0;
                                }
                              }
                            }
                            this.field_m = true;
                            this.field_c = true;
                            if (var7 == 0) {
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                          this.field_n = true;
                          this.field_e = true;
                          if (var7 == 0) {
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                        this.field_e = true;
                        this.field_m = true;
                        if (var7 == 0) {
                          break L0;
                        } else {
                          break L2;
                        }
                      } else {
                        break L0;
                      }
                    }
                  }
                  this.field_m = true;
                  this.field_c = true;
                  this.field_n = true;
                  this.field_e = true;
                  if (var7 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L8: {
                L9: {
                  L10: {
                    L11: {
                      var6 = this.field_i;
                      if (var6 != 0) {
                        break L11;
                      } else {
                        if (var7 == 0) {
                          this.field_c = true;
                          this.field_e = true;
                          this.field_n = true;
                          if (var7 == 0) {
                            break L0;
                          } else {
                            break L10;
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                    if ((var6 ^ -1) == -3) {
                      break L10;
                    } else {
                      if (var6 == 4) {
                        break L9;
                      } else {
                        if (6 == var6) {
                          break L8;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                  this.field_n = true;
                  this.field_m = true;
                  this.field_c = true;
                  if (var7 == 0) {
                    break L0;
                  } else {
                    break L9;
                  }
                }
                this.field_e = true;
                this.field_m = true;
                this.field_c = true;
                if (var7 == 0) {
                  break L0;
                } else {
                  break L8;
                }
              }
              this.field_e = true;
              this.field_n = true;
              this.field_m = true;
              if (var7 == 0) {
                break L0;
              } else {
                L12: {
                  var6 = this.field_i;
                  if (0 != var6) {
                    break L12;
                  } else {
                    break L12;
                  }
                }
                if (var6 == 2) {
                  this.field_e = true;
                  this.field_c = true;
                  if (var7 == 0) {
                    break L0;
                  } else {
                    L13: {
                      var6 = this.field_i;
                      if (0 == var6) {
                        this.field_n = true;
                        if (var7 == 0) {
                          break L0;
                        } else {
                          this.field_c = true;
                          break L13;
                        }
                      } else {
                        L14: {
                          if (2 != var6) {
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          if ((var6 ^ -1) != -5) {
                            break L15;
                          } else {
                            if (var7 == 0) {
                              break L13;
                            } else {
                              break L15;
                            }
                          }
                        }
                        if (var6 == 6) {
                          this.field_e = true;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                    this.field_m = true;
                    if (var7 == 0) {
                      break L0;
                    } else {
                      this.field_e = true;
                      break L0;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            L16: {
              if (!param0) {
                break L16;
              } else {
                if (this.field_n) {
                  this.field_q = true;
                  break L16;
                } else {
                  if (!this.field_e) {
                    break L16;
                  } else {
                    this.field_q = true;
                    break L16;
                  }
                }
              }
            }
            if (!param4) {
              L17: {
                if (!param3) {
                  break L17;
                } else {
                  L18: {
                    if (this.field_m) {
                      break L18;
                    } else {
                      if (this.field_c) {
                        break L18;
                      } else {
                        if (param1 == 24) {
                          L19: {
                            if (!param2) {
                              break L19;
                            } else {
                              L20: {
                                if (this.field_n) {
                                  break L20;
                                } else {
                                  if (this.field_c) {
                                    break L20;
                                  } else {
                                    L21: {
                                      if (0 == this.field_g.i(-77)) {
                                        break L21;
                                      } else {
                                        if (this.field_a == 6) {
                                          this.field_o = 0;
                                          break L21;
                                        } else {
                                          return;
                                        }
                                      }
                                    }
                                    return;
                                  }
                                }
                              }
                              this.field_j = true;
                              break L19;
                            }
                          }
                          L22: {
                            if (0 == this.field_g.i(-77)) {
                              break L22;
                            } else {
                              if (this.field_a == 6) {
                                this.field_o = 0;
                                break L22;
                              } else {
                                return;
                              }
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  this.field_k = true;
                  break L17;
                }
              }
              if (param1 == 24) {
                L23: {
                  if (!param2) {
                    break L23;
                  } else {
                    L24: {
                      if (this.field_n) {
                        break L24;
                      } else {
                        if (this.field_c) {
                          break L24;
                        } else {
                          L25: {
                            if (0 == this.field_g.i(-77)) {
                              break L25;
                            } else {
                              if (this.field_a == 6) {
                                this.field_o = 0;
                                break L25;
                              } else {
                                return;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    this.field_j = true;
                    break L23;
                  }
                }
                L26: {
                  if (0 == this.field_g.i(-77)) {
                    break L26;
                  } else {
                    if (this.field_a == 6) {
                      this.field_o = 0;
                      break L26;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              if (this.field_m) {
                L27: {
                  this.field_h = true;
                  if (!param3) {
                    break L27;
                  } else {
                    L28: {
                      if (this.field_m) {
                        break L28;
                      } else {
                        if (this.field_c) {
                          break L28;
                        } else {
                          break L27;
                        }
                      }
                    }
                    this.field_k = true;
                    break L27;
                  }
                }
                if (param1 == 24) {
                  L29: {
                    if (!param2) {
                      break L29;
                    } else {
                      L30: {
                        if (this.field_n) {
                          break L30;
                        } else {
                          if (this.field_c) {
                            break L30;
                          } else {
                            break L29;
                          }
                        }
                      }
                      this.field_j = true;
                      break L29;
                    }
                  }
                  L31: {
                    if (0 == this.field_g.i(-77)) {
                      break L31;
                    } else {
                      if (this.field_a == 6) {
                        this.field_o = 0;
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                if (this.field_e) {
                  this.field_h = true;
                  if (!param3) {
                    if (param1 == 24) {
                      L32: {
                        if (!param2) {
                          break L32;
                        } else {
                          L33: {
                            if (this.field_n) {
                              break L33;
                            } else {
                              if (this.field_c) {
                                break L33;
                              } else {
                                L34: {
                                  if (0 == this.field_g.i(-77)) {
                                    break L34;
                                  } else {
                                    if (this.field_a == 6) {
                                      this.field_o = 0;
                                      break L34;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                return;
                              }
                            }
                          }
                          this.field_j = true;
                          break L32;
                        }
                      }
                      L35: {
                        if (0 == this.field_g.i(-77)) {
                          break L35;
                        } else {
                          if (this.field_a == 6) {
                            this.field_o = 0;
                            break L35;
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (!this.field_m) {
                      if (!this.field_c) {
                        if (param1 == 24) {
                          L36: {
                            if (!param2) {
                              break L36;
                            } else {
                              L37: {
                                if (this.field_n) {
                                  break L37;
                                } else {
                                  if (this.field_c) {
                                    break L37;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              this.field_j = true;
                              break L36;
                            }
                          }
                          L38: {
                            if (0 == this.field_g.i(-77)) {
                              break L38;
                            } else {
                              if (this.field_a == 6) {
                                this.field_o = 0;
                                break L38;
                              } else {
                                break L38;
                              }
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      } else {
                        this.field_k = true;
                        if (param1 == 24) {
                          L39: {
                            if (!param2) {
                              break L39;
                            } else {
                              L40: {
                                if (this.field_n) {
                                  break L40;
                                } else {
                                  if (this.field_c) {
                                    break L40;
                                  } else {
                                    L41: {
                                      if (0 == this.field_g.i(-77)) {
                                        break L41;
                                      } else {
                                        if (this.field_a == 6) {
                                          this.field_o = 0;
                                          break L41;
                                        } else {
                                          break L41;
                                        }
                                      }
                                    }
                                    return;
                                  }
                                }
                              }
                              this.field_j = true;
                              break L39;
                            }
                          }
                          L42: {
                            if (0 == this.field_g.i(-77)) {
                              break L42;
                            } else {
                              if (this.field_a == 6) {
                                this.field_o = 0;
                                break L42;
                              } else {
                                return;
                              }
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      this.field_k = true;
                      if (param1 == 24) {
                        L43: {
                          if (!param2) {
                            break L43;
                          } else {
                            L44: {
                              if (this.field_n) {
                                break L44;
                              } else {
                                if (this.field_c) {
                                  break L44;
                                } else {
                                  L45: {
                                    if (0 == this.field_g.i(-77)) {
                                      break L45;
                                    } else {
                                      if (this.field_a == 6) {
                                        this.field_o = 0;
                                        break L45;
                                      } else {
                                        break L45;
                                      }
                                    }
                                  }
                                  return;
                                }
                              }
                            }
                            this.field_j = true;
                            break L43;
                          }
                        }
                        L46: {
                          if (0 == this.field_g.i(-77)) {
                            break L46;
                          } else {
                            if (this.field_a == 6) {
                              this.field_o = 0;
                              break L46;
                            } else {
                              return;
                            }
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  L47: {
                    if (!param3) {
                      break L47;
                    } else {
                      L48: {
                        if (this.field_m) {
                          break L48;
                        } else {
                          if (this.field_c) {
                            break L48;
                          } else {
                            break L47;
                          }
                        }
                      }
                      this.field_k = true;
                      break L47;
                    }
                  }
                  if (param1 == 24) {
                    L49: {
                      if (!param2) {
                        break L49;
                      } else {
                        L50: {
                          if (this.field_n) {
                            break L50;
                          } else {
                            if (this.field_c) {
                              break L50;
                            } else {
                              break L49;
                            }
                          }
                        }
                        this.field_j = true;
                        break L49;
                      }
                    }
                    L51: {
                      if (0 == this.field_g.i(-77)) {
                        break L51;
                      } else {
                        if (this.field_a == 6) {
                          this.field_o = 0;
                          break L51;
                        } else {
                          break L51;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            L52: {
              L53: {
                L54: {
                  var6 = this.field_i;
                  if (0 != var6) {
                    break L54;
                  } else {
                    if (var7 == 0) {
                      this.field_m = true;
                      this.field_n = true;
                      if (var7 == 0) {
                        break L52;
                      } else {
                        break L53;
                      }
                    } else {
                      break L54;
                    }
                  }
                }
                if (var6 == 2) {
                  break L53;
                } else {
                  break L52;
                }
              }
              this.field_e = true;
              this.field_c = true;
              if (var7 == 0) {
                break L52;
              } else {
                L55: {
                  var6 = this.field_i;
                  if (0 == var6) {
                    this.field_n = true;
                    if (var7 == 0) {
                      break L52;
                    } else {
                      this.field_c = true;
                      break L55;
                    }
                  } else {
                    L56: {
                      if (2 != var6) {
                        break L56;
                      } else {
                        break L56;
                      }
                    }
                    L57: {
                      if ((var6 ^ -1) != -5) {
                        break L57;
                      } else {
                        if (var7 == 0) {
                          break L55;
                        } else {
                          break L57;
                        }
                      }
                    }
                    if (var6 == 6) {
                      this.field_e = true;
                      break L52;
                    } else {
                      break L52;
                    }
                  }
                }
                this.field_m = true;
                if (var7 == 0) {
                  break L52;
                } else {
                  this.field_e = true;
                  break L52;
                }
              }
            }
            L58: {
              if (!param0) {
                break L58;
              } else {
                if (this.field_n) {
                  this.field_q = true;
                  break L58;
                } else {
                  if (!this.field_e) {
                    break L58;
                  } else {
                    this.field_q = true;
                    break L58;
                  }
                }
              }
            }
            if (!param4) {
              L59: {
                if (!param3) {
                  break L59;
                } else {
                  L60: {
                    if (this.field_m) {
                      break L60;
                    } else {
                      if (this.field_c) {
                        break L60;
                      } else {
                        if (param1 == 24) {
                          L61: {
                            if (!param2) {
                              break L61;
                            } else {
                              L62: {
                                if (this.field_n) {
                                  break L62;
                                } else {
                                  if (this.field_c) {
                                    break L62;
                                  } else {
                                    break L61;
                                  }
                                }
                              }
                              this.field_j = true;
                              break L61;
                            }
                          }
                          L63: {
                            if (0 == this.field_g.i(-77)) {
                              break L63;
                            } else {
                              if (this.field_a == 6) {
                                this.field_o = 0;
                                break L63;
                              } else {
                                break L63;
                              }
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  this.field_k = true;
                  break L59;
                }
              }
              if (param1 == 24) {
                L64: {
                  if (!param2) {
                    break L64;
                  } else {
                    L65: {
                      if (this.field_n) {
                        break L65;
                      } else {
                        if (this.field_c) {
                          break L65;
                        } else {
                          L66: {
                            if (0 == this.field_g.i(-77)) {
                              break L66;
                            } else {
                              if (this.field_a == 6) {
                                this.field_o = 0;
                                break L66;
                              } else {
                                break L66;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    this.field_j = true;
                    break L64;
                  }
                }
                L67: {
                  if (0 == this.field_g.i(-77)) {
                    break L67;
                  } else {
                    if (this.field_a == 6) {
                      this.field_o = 0;
                      break L67;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              if (this.field_m) {
                L68: {
                  this.field_h = true;
                  if (!param3) {
                    break L68;
                  } else {
                    L69: {
                      if (this.field_m) {
                        break L69;
                      } else {
                        if (this.field_c) {
                          break L69;
                        } else {
                          break L68;
                        }
                      }
                    }
                    this.field_k = true;
                    break L68;
                  }
                }
                if (param1 != 24) {
                  return;
                } else {
                  L70: {
                    if (!param2) {
                      break L70;
                    } else {
                      L71: {
                        if (this.field_n) {
                          break L71;
                        } else {
                          if (this.field_c) {
                            break L71;
                          } else {
                            break L70;
                          }
                        }
                      }
                      this.field_j = true;
                      break L70;
                    }
                  }
                  L72: {
                    if (0 == this.field_g.i(-77)) {
                      break L72;
                    } else {
                      if (this.field_a == 6) {
                        this.field_o = 0;
                        break L72;
                      } else {
                        break L72;
                      }
                    }
                  }
                  return;
                }
              } else {
                if (this.field_e) {
                  L73: {
                    this.field_h = true;
                    if (!param3) {
                      break L73;
                    } else {
                      L74: {
                        if (this.field_m) {
                          break L74;
                        } else {
                          if (this.field_c) {
                            break L74;
                          } else {
                            break L73;
                          }
                        }
                      }
                      this.field_k = true;
                      break L73;
                    }
                  }
                  if (param1 == 24) {
                    L75: {
                      if (!param2) {
                        break L75;
                      } else {
                        L76: {
                          if (this.field_n) {
                            break L76;
                          } else {
                            if (this.field_c) {
                              break L76;
                            } else {
                              break L75;
                            }
                          }
                        }
                        this.field_j = true;
                        break L75;
                      }
                    }
                    L77: {
                      if (0 == this.field_g.i(-77)) {
                        break L77;
                      } else {
                        if (this.field_a == 6) {
                          this.field_o = 0;
                          break L77;
                        } else {
                          break L77;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  L78: {
                    if (!param3) {
                      break L78;
                    } else {
                      L79: {
                        if (this.field_m) {
                          break L79;
                        } else {
                          if (this.field_c) {
                            break L79;
                          } else {
                            break L78;
                          }
                        }
                      }
                      this.field_k = true;
                      break L78;
                    }
                  }
                  if (param1 != 24) {
                    return;
                  } else {
                    L80: {
                      if (!param2) {
                        break L80;
                      } else {
                        L81: {
                          if (this.field_n) {
                            break L81;
                          } else {
                            if (this.field_c) {
                              break L81;
                            } else {
                              break L80;
                            }
                          }
                        }
                        this.field_j = true;
                        break L80;
                      }
                    }
                    L82: {
                      if (0 == this.field_g.i(-77)) {
                        break L82;
                      } else {
                        if (this.field_a == 6) {
                          this.field_o = 0;
                          break L82;
                        } else {
                          break L82;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        } else {
          L83: {
            L84: {
              L85: {
                var6 = this.field_i;
                if (0 == var6) {
                  this.field_n = true;
                  if (var7 == 0) {
                    break L83;
                  } else {
                    break L85;
                  }
                } else {
                  L86: {
                    if (2 != var6) {
                      break L86;
                    } else {
                      if (var7 == 0) {
                        break L85;
                      } else {
                        break L86;
                      }
                    }
                  }
                  L87: {
                    if ((var6 ^ -1) != -5) {
                      break L87;
                    } else {
                      if (var7 == 0) {
                        break L84;
                      } else {
                        break L87;
                      }
                    }
                  }
                  if (var6 == 6) {
                    this.field_e = true;
                    break L83;
                  } else {
                    break L83;
                  }
                }
              }
              this.field_c = true;
              if (var7 == 0) {
                break L83;
              } else {
                break L84;
              }
            }
            this.field_m = true;
            if (var7 == 0) {
              break L83;
            } else {
              this.field_e = true;
              break L83;
            }
          }
          L88: {
            if (!param0) {
              break L88;
            } else {
              if (this.field_n) {
                this.field_q = true;
                break L88;
              } else {
                if (!this.field_e) {
                  break L88;
                } else {
                  this.field_q = true;
                  break L88;
                }
              }
            }
          }
          if (!param4) {
            L89: {
              if (!param3) {
                break L89;
              } else {
                L90: {
                  if (this.field_m) {
                    break L90;
                  } else {
                    if (this.field_c) {
                      break L90;
                    } else {
                      if (param1 != 24) {
                        return;
                      } else {
                        L91: {
                          if (!param2) {
                            break L91;
                          } else {
                            L92: {
                              if (this.field_n) {
                                break L92;
                              } else {
                                if (this.field_c) {
                                  break L92;
                                } else {
                                  break L91;
                                }
                              }
                            }
                            this.field_j = true;
                            break L91;
                          }
                        }
                        L93: {
                          if (0 == this.field_g.i(-77)) {
                            break L93;
                          } else {
                            if (this.field_a == 6) {
                              this.field_o = 0;
                              break L93;
                            } else {
                              break L93;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                this.field_k = true;
                break L89;
              }
            }
            if (param1 == 24) {
              L94: {
                if (!param2) {
                  break L94;
                } else {
                  L95: {
                    if (this.field_n) {
                      break L95;
                    } else {
                      if (this.field_c) {
                        break L95;
                      } else {
                        L96: {
                          if (0 == this.field_g.i(-77)) {
                            break L96;
                          } else {
                            if (this.field_a == 6) {
                              this.field_o = 0;
                              break L96;
                            } else {
                              break L96;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  this.field_j = true;
                  break L94;
                }
              }
              if (0 != this.field_g.i(-77)) {
                if (this.field_a != 6) {
                  return;
                } else {
                  this.field_o = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (this.field_m) {
              L97: {
                this.field_h = true;
                if (!param3) {
                  break L97;
                } else {
                  L98: {
                    if (this.field_m) {
                      break L98;
                    } else {
                      if (this.field_c) {
                        break L98;
                      } else {
                        break L97;
                      }
                    }
                  }
                  this.field_k = true;
                  break L97;
                }
              }
              if (param1 != 24) {
                return;
              } else {
                L99: {
                  if (!param2) {
                    break L99;
                  } else {
                    L100: {
                      if (this.field_n) {
                        break L100;
                      } else {
                        if (this.field_c) {
                          break L100;
                        } else {
                          break L99;
                        }
                      }
                    }
                    this.field_j = true;
                    break L99;
                  }
                }
                L101: {
                  if (0 == this.field_g.i(-77)) {
                    break L101;
                  } else {
                    if (this.field_a == 6) {
                      this.field_o = 0;
                      break L101;
                    } else {
                      break L101;
                    }
                  }
                }
                return;
              }
            } else {
              if (this.field_e) {
                L102: {
                  this.field_h = true;
                  if (!param3) {
                    break L102;
                  } else {
                    L103: {
                      if (this.field_m) {
                        break L103;
                      } else {
                        if (this.field_c) {
                          break L103;
                        } else {
                          break L102;
                        }
                      }
                    }
                    this.field_k = true;
                    break L102;
                  }
                }
                if (param1 != 24) {
                  return;
                } else {
                  L104: {
                    if (!param2) {
                      break L104;
                    } else {
                      L105: {
                        if (this.field_n) {
                          break L105;
                        } else {
                          if (this.field_c) {
                            break L105;
                          } else {
                            break L104;
                          }
                        }
                      }
                      this.field_j = true;
                      break L104;
                    }
                  }
                  L106: {
                    if (0 == this.field_g.i(-77)) {
                      break L106;
                    } else {
                      if (this.field_a == 6) {
                        this.field_o = 0;
                        break L106;
                      } else {
                        break L106;
                      }
                    }
                  }
                  return;
                }
              } else {
                L107: {
                  if (!param3) {
                    break L107;
                  } else {
                    if (this.field_m) {
                      this.field_k = true;
                      break L107;
                    } else {
                      if (this.field_c) {
                        this.field_k = true;
                        break L107;
                      } else {
                        break L107;
                      }
                    }
                  }
                }
                if (param1 != 24) {
                  return;
                } else {
                  L108: {
                    if (!param2) {
                      break L108;
                    } else {
                      if (this.field_n) {
                        this.field_j = true;
                        break L108;
                      } else {
                        if (this.field_c) {
                          this.field_j = true;
                          break L108;
                        } else {
                          break L108;
                        }
                      }
                    }
                  }
                  L109: {
                    if (0 == this.field_g.i(-77)) {
                      break L109;
                    } else {
                      if (this.field_a == 6) {
                        this.field_o = 0;
                        break L109;
                      } else {
                        break L109;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        }
    }

    public final int b(byte param0) {
        int var2 = -104 % ((param0 - -23) / 53);
        return this.field_g.b((byte) -76) + this.field_l;
    }

    public final int c(byte param0) {
        if (param0 < 91) {
          this.field_m = true;
          return this.field_g.c((byte) 126) - -this.field_f;
        } else {
          return this.field_g.c((byte) 126) - -this.field_f;
        }
    }

    final void a(int param0) {
        int discarded$2 = 0;
        int var2 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var2 = this.field_e ? 1 : 0;
          this.field_e = this.field_c;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (var2 == 0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((fh) (this)).field_c = stackIn_3_1 != 0;
        if (param0 != 0) {
          discarded$2 = this.b((byte) -30);
          return;
        } else {
          return;
        }
    }

    public final int e(byte param0) {
        java.awt.Canvas var3 = null;
        if (param0 >= -86) {
          var3 = (java.awt.Canvas) null;
          fh.a(true, (java.awt.Canvas) null, -71);
          return this.field_g.e((byte) -115);
        } else {
          return this.field_g.e((byte) -115);
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            this.a(-19);
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (-11 < (cga.field_f ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (!qk.i(250)) {
                      break L3;
                    } else {
                      L4: {
                        if (0 != gda.field_c) {
                          break L4;
                        } else {
                          qja.a(false, param0, param2 ^ -128);
                          fga.a(0, false, 0, param1);
                          if (var4 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      dba.a(param1, (byte) 94);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  bea.a();
                  gga.b(320, 240, (byte) 113);
                  fga.a(0, false, 0, param1);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L5: {
                var3_int = 0;
                if (bsa.field_k) {
                  bsa.field_k = false;
                  var3_int = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              et.a((byte) 108, tn.a(-10918), bta.field_i, dla.a(7), var3_int != 0);
              break L1;
            }
            L6: {
              if (param2 == 0) {
                break L6;
              } else {
                fh.b(107, 37);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("fh.E(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            this.field_h = true;
            return this.field_g.d((byte) 48);
        }
        return this.field_g.d((byte) 48);
    }

    fh() {
        int fieldTemp$0 = ita.field_g;
        ita.field_g = ita.field_g + 1;
        this.field_b = fieldTemp$0;
    }

    static {
    }
}
