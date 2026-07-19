/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends ug {
    ki field_j;
    ki field_i;
    static byte[] field_g;
    static int field_h;
    private float field_f;
    static int field_e;

    final void e(int param0) {
        float var2 = 0.0f;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_186_0 = 0;
        int stackIn_222_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        L0: {
          L1: {
            var2 = -this.field_j.field_B + this.field_i.field_B;
            var3 = this.field_i.field_q - this.field_j.field_q;
            var4 = var2 * var2 + var3 * var3;
            var5 = this.field_f / (var4 + this.field_f) - 0.5f;
            var2 = var2 * var5;
            var3 = var3 * var5;
            if (this.field_j.field_x) {
              if (this.field_i.field_x) {
                break L1;
              } else {
                if (this.field_i.field_j) {
                  L2: {
                    if (5 == this.field_j.field_w) {
                      stackOut_58_0 = 0;
                      stackIn_59_0 = stackOut_58_0;
                      break L2;
                    } else {
                      stackOut_57_0 = 1;
                      stackIn_59_0 = stackOut_57_0;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      L5: {
                        var6 = stackIn_59_0;
                        if (this.field_i.field_x) {
                          break L5;
                        } else {
                          if (!this.field_i.field_j) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (this.field_j.field_x) {
                        break L4;
                      } else {
                        if (this.field_j.field_j) {
                          break L4;
                        } else {
                          stackOut_64_0 = 0;
                          stackIn_70_0 = stackOut_64_0;
                          break L3;
                        }
                      }
                    }
                    if ((this.field_i.field_w ^ -1) != -6) {
                      stackOut_68_0 = 1;
                      stackIn_70_0 = stackOut_68_0;
                      break L3;
                    } else {
                      stackOut_67_0 = 0;
                      stackIn_70_0 = stackOut_67_0;
                      break L3;
                    }
                  }
                  L6: {
                    var7 = stackIn_70_0;
                    if (var7 != 0) {
                      break L6;
                    } else {
                      var3 = var3 * 2.0f;
                      var2 = var2 * 2.0f;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      if (var6 == 0) {
                        break L8;
                      } else {
                        this.field_j.field_q = this.field_j.field_q - var3;
                        this.field_j.field_B = this.field_j.field_B - var2;
                        if (!MonkeyPuzzle2.field_F) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var3 = var3 * 2.0f;
                    var2 = var2 * 2.0f;
                    break L7;
                  }
                  L9: {
                    if (var7 != 0) {
                      this.field_i.field_q = this.field_i.field_q + var3;
                      this.field_i.field_B = this.field_i.field_B + var2;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                      this.field_j.field_B = (float)(80 + -this.field_j.field_G);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                      this.field_j.field_B = (float)(this.field_j.field_G + 560);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (param0 == 5) {
                      break L12;
                    } else {
                      this.field_i = (ki) null;
                      break L12;
                    }
                  }
                  L13: {
                    if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                      this.field_j.field_q = (float)(-this.field_j.field_y);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                      break L14;
                    } else {
                      this.field_i.field_B = (float)(80 - this.field_i.field_G);
                      break L14;
                    }
                  }
                  L15: {
                    if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                      this.field_i.field_B = (float)(560 + this.field_i.field_G);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                      break L16;
                    } else {
                      this.field_i.field_q = (float)(-this.field_i.field_y);
                      break L16;
                    }
                  }
                  L17: {
                    if (!this.field_j.field_j) {
                      break L17;
                    } else {
                      this.field_j.field_q = (float)(-this.field_j.field_y);
                      break L17;
                    }
                  }
                  L18: {
                    if (!this.field_i.field_j) {
                      break L18;
                    } else {
                      this.field_i.field_q = (float)(-this.field_i.field_y);
                      break L18;
                    }
                  }
                  return;
                } else {
                  stackOut_55_0 = 0;
                  stackIn_106_0 = stackOut_55_0;
                  break L0;
                }
              }
            } else {
              if (!this.field_j.field_j) {
                break L1;
              } else {
                L19: {
                  L20: {
                    if (this.field_i.field_x) {
                      break L20;
                    } else {
                      if (this.field_i.field_j) {
                        break L20;
                      } else {
                        stackOut_4_0 = 0;
                        stackIn_10_0 = stackOut_4_0;
                        break L19;
                      }
                    }
                  }
                  if (5 != this.field_j.field_w) {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L19;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_10_0 = stackOut_7_0;
                    break L19;
                  }
                }
                L21: {
                  L22: {
                    L23: {
                      var6 = stackIn_10_0;
                      if (this.field_i.field_x) {
                        break L23;
                      } else {
                        if (!this.field_i.field_j) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    if (this.field_j.field_x) {
                      break L22;
                    } else {
                      if (this.field_j.field_j) {
                        break L22;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_21_0 = stackOut_15_0;
                        break L21;
                      }
                    }
                  }
                  if ((this.field_i.field_w ^ -1) != -6) {
                    stackOut_19_0 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    break L21;
                  } else {
                    stackOut_18_0 = 0;
                    stackIn_21_0 = stackOut_18_0;
                    break L21;
                  }
                }
                L24: {
                  var7 = stackIn_21_0;
                  if (var7 != 0) {
                    break L24;
                  } else {
                    var3 = var3 * 2.0f;
                    var2 = var2 * 2.0f;
                    break L24;
                  }
                }
                L25: {
                  L26: {
                    if (var6 == 0) {
                      break L26;
                    } else {
                      this.field_j.field_q = this.field_j.field_q - var3;
                      this.field_j.field_B = this.field_j.field_B - var2;
                      if (!MonkeyPuzzle2.field_F) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  var3 = var3 * 2.0f;
                  var2 = var2 * 2.0f;
                  break L25;
                }
                L27: {
                  if (var7 != 0) {
                    this.field_i.field_q = this.field_i.field_q + var3;
                    this.field_i.field_B = this.field_i.field_B + var2;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                    this.field_j.field_B = (float)(80 + -this.field_j.field_G);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                    this.field_j.field_B = (float)(this.field_j.field_G + 560);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (param0 == 5) {
                    break L30;
                  } else {
                    this.field_i = (ki) null;
                    break L30;
                  }
                }
                L31: {
                  if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                    this.field_j.field_q = (float)(-this.field_j.field_y);
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                    break L32;
                  } else {
                    this.field_i.field_B = (float)(80 - this.field_i.field_G);
                    break L32;
                  }
                }
                L33: {
                  if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                    this.field_i.field_B = (float)(560 + this.field_i.field_G);
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                    break L34;
                  } else {
                    this.field_i.field_q = (float)(-this.field_i.field_y);
                    break L34;
                  }
                }
                L35: {
                  if (!this.field_j.field_j) {
                    break L35;
                  } else {
                    this.field_j.field_q = (float)(-this.field_j.field_y);
                    break L35;
                  }
                }
                L36: {
                  if (!this.field_i.field_j) {
                    break L36;
                  } else {
                    this.field_i.field_q = (float)(-this.field_i.field_y);
                    break L36;
                  }
                }
                return;
              }
            }
          }
          if (5 != this.field_j.field_w) {
            stackOut_104_0 = 1;
            stackIn_106_0 = stackOut_104_0;
            break L0;
          } else {
            stackOut_103_0 = 0;
            stackIn_106_0 = stackOut_103_0;
            break L0;
          }
        }
        var6 = stackIn_106_0;
        if (this.field_i.field_x) {
          if (!this.field_j.field_x) {
            if (!this.field_j.field_j) {
              L37: {
                var7 = 0;
                if (var7 != 0) {
                  break L37;
                } else {
                  var3 = var3 * 2.0f;
                  var2 = var2 * 2.0f;
                  break L37;
                }
              }
              L38: {
                if (var6 == 0) {
                  var3 = var3 * 2.0f;
                  var2 = var2 * 2.0f;
                  break L38;
                } else {
                  this.field_j.field_q = this.field_j.field_q - var3;
                  this.field_j.field_B = this.field_j.field_B - var2;
                  if (!MonkeyPuzzle2.field_F) {
                    break L38;
                  } else {
                    L39: {
                      var3 = var3 * 2.0f;
                      var2 = var2 * 2.0f;
                      if (var7 != 0) {
                        this.field_i.field_q = this.field_i.field_q + var3;
                        this.field_i.field_B = this.field_i.field_B + var2;
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                    L40: {
                      if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                        this.field_j.field_B = (float)(80 + -this.field_j.field_G);
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    L41: {
                      if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                        this.field_j.field_B = (float)(this.field_j.field_G + 560);
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                    if (param0 != 5) {
                      L42: {
                        this.field_i = (ki) null;
                        if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                          this.field_j.field_q = (float)(-this.field_j.field_y);
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                      if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                        L43: {
                          if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                            this.field_i.field_B = (float)(560 + this.field_i.field_G);
                            break L43;
                          } else {
                            break L43;
                          }
                        }
                        L44: {
                          if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                            break L44;
                          } else {
                            this.field_i.field_q = (float)(-this.field_i.field_y);
                            break L44;
                          }
                        }
                        L45: {
                          if (!this.field_j.field_j) {
                            break L45;
                          } else {
                            this.field_j.field_q = (float)(-this.field_j.field_y);
                            break L45;
                          }
                        }
                        L46: {
                          if (!this.field_i.field_j) {
                            break L46;
                          } else {
                            this.field_i.field_q = (float)(-this.field_i.field_y);
                            break L46;
                          }
                        }
                        return;
                      } else {
                        L47: {
                          this.field_i.field_B = (float)(80 - this.field_i.field_G);
                          if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                            this.field_i.field_B = (float)(560 + this.field_i.field_G);
                            break L47;
                          } else {
                            break L47;
                          }
                        }
                        L48: {
                          if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                            break L48;
                          } else {
                            this.field_i.field_q = (float)(-this.field_i.field_y);
                            break L48;
                          }
                        }
                        L49: {
                          if (!this.field_j.field_j) {
                            break L49;
                          } else {
                            this.field_j.field_q = (float)(-this.field_j.field_y);
                            break L49;
                          }
                        }
                        L50: {
                          if (!this.field_i.field_j) {
                            break L50;
                          } else {
                            this.field_i.field_q = (float)(-this.field_i.field_y);
                            break L50;
                          }
                        }
                        return;
                      }
                    } else {
                      L51: {
                        if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                          this.field_j.field_q = (float)(-this.field_j.field_y);
                          break L51;
                        } else {
                          break L51;
                        }
                      }
                      L52: {
                        if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                          break L52;
                        } else {
                          this.field_i.field_B = (float)(80 - this.field_i.field_G);
                          break L52;
                        }
                      }
                      L53: {
                        if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                          this.field_i.field_B = (float)(560 + this.field_i.field_G);
                          break L53;
                        } else {
                          break L53;
                        }
                      }
                      L54: {
                        if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                          break L54;
                        } else {
                          this.field_i.field_q = (float)(-this.field_i.field_y);
                          break L54;
                        }
                      }
                      L55: {
                        if (!this.field_j.field_j) {
                          break L55;
                        } else {
                          this.field_j.field_q = (float)(-this.field_j.field_y);
                          break L55;
                        }
                      }
                      L56: {
                        if (!this.field_i.field_j) {
                          break L56;
                        } else {
                          this.field_i.field_q = (float)(-this.field_i.field_y);
                          break L56;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L57: {
                if (var7 != 0) {
                  this.field_i.field_q = this.field_i.field_q + var3;
                  this.field_i.field_B = this.field_i.field_B + var2;
                  break L57;
                } else {
                  break L57;
                }
              }
              L58: {
                if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                  this.field_j.field_B = (float)(80 + -this.field_j.field_G);
                  break L58;
                } else {
                  break L58;
                }
              }
              L59: {
                if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                  this.field_j.field_B = (float)(this.field_j.field_G + 560);
                  break L59;
                } else {
                  break L59;
                }
              }
              if (param0 == 5) {
                L60: {
                  if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                    this.field_j.field_q = (float)(-this.field_j.field_y);
                    break L60;
                  } else {
                    break L60;
                  }
                }
                if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                  L61: {
                    if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                      this.field_i.field_B = (float)(560 + this.field_i.field_G);
                      break L61;
                    } else {
                      break L61;
                    }
                  }
                  if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                    if (!this.field_j.field_j) {
                      if (this.field_i.field_j) {
                        this.field_i.field_q = (float)(-this.field_i.field_y);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L62: {
                        this.field_j.field_q = (float)(-this.field_j.field_y);
                        if (!this.field_i.field_j) {
                          break L62;
                        } else {
                          this.field_i.field_q = (float)(-this.field_i.field_y);
                          break L62;
                        }
                      }
                      return;
                    }
                  } else {
                    L63: {
                      this.field_i.field_q = (float)(-this.field_i.field_y);
                      if (!this.field_j.field_j) {
                        break L63;
                      } else {
                        this.field_j.field_q = (float)(-this.field_j.field_y);
                        break L63;
                      }
                    }
                    L64: {
                      if (!this.field_i.field_j) {
                        break L64;
                      } else {
                        this.field_i.field_q = (float)(-this.field_i.field_y);
                        break L64;
                      }
                    }
                    return;
                  }
                } else {
                  L65: {
                    this.field_i.field_B = (float)(80 - this.field_i.field_G);
                    if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                      this.field_i.field_B = (float)(560 + this.field_i.field_G);
                      break L65;
                    } else {
                      break L65;
                    }
                  }
                  L66: {
                    if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                      break L66;
                    } else {
                      this.field_i.field_q = (float)(-this.field_i.field_y);
                      break L66;
                    }
                  }
                  L67: {
                    if (!this.field_j.field_j) {
                      break L67;
                    } else {
                      this.field_j.field_q = (float)(-this.field_j.field_y);
                      break L67;
                    }
                  }
                  L68: {
                    if (!this.field_i.field_j) {
                      break L68;
                    } else {
                      this.field_i.field_q = (float)(-this.field_i.field_y);
                      break L68;
                    }
                  }
                  return;
                }
              } else {
                L69: {
                  this.field_i = (ki) null;
                  if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                    this.field_j.field_q = (float)(-this.field_j.field_y);
                    break L69;
                  } else {
                    break L69;
                  }
                }
                L70: {
                  if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                    break L70;
                  } else {
                    this.field_i.field_B = (float)(80 - this.field_i.field_G);
                    break L70;
                  }
                }
                L71: {
                  if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                    this.field_i.field_B = (float)(560 + this.field_i.field_G);
                    break L71;
                  } else {
                    break L71;
                  }
                }
                L72: {
                  if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                    break L72;
                  } else {
                    this.field_i.field_q = (float)(-this.field_i.field_y);
                    break L72;
                  }
                }
                L73: {
                  if (!this.field_j.field_j) {
                    break L73;
                  } else {
                    this.field_j.field_q = (float)(-this.field_j.field_y);
                    break L73;
                  }
                }
                L74: {
                  if (!this.field_i.field_j) {
                    break L74;
                  } else {
                    this.field_i.field_q = (float)(-this.field_i.field_y);
                    break L74;
                  }
                }
                return;
              }
            } else {
              L75: {
                if ((this.field_i.field_w ^ -1) == -6) {
                  stackOut_221_0 = 0;
                  stackIn_222_0 = stackOut_221_0;
                  break L75;
                } else {
                  stackOut_220_0 = 1;
                  stackIn_222_0 = stackOut_220_0;
                  break L75;
                }
              }
              L76: {
                var7 = stackIn_222_0;
                if (var7 != 0) {
                  break L76;
                } else {
                  var3 = var3 * 2.0f;
                  var2 = var2 * 2.0f;
                  break L76;
                }
              }
              L77: {
                L78: {
                  if (var6 == 0) {
                    break L78;
                  } else {
                    this.field_j.field_q = this.field_j.field_q - var3;
                    this.field_j.field_B = this.field_j.field_B - var2;
                    if (!MonkeyPuzzle2.field_F) {
                      break L77;
                    } else {
                      break L78;
                    }
                  }
                }
                var3 = var3 * 2.0f;
                var2 = var2 * 2.0f;
                break L77;
              }
              L79: {
                if (var7 != 0) {
                  this.field_i.field_q = this.field_i.field_q + var3;
                  this.field_i.field_B = this.field_i.field_B + var2;
                  break L79;
                } else {
                  break L79;
                }
              }
              L80: {
                if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                  this.field_j.field_B = (float)(80 + -this.field_j.field_G);
                  break L80;
                } else {
                  break L80;
                }
              }
              L81: {
                if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                  this.field_j.field_B = (float)(this.field_j.field_G + 560);
                  break L81;
                } else {
                  break L81;
                }
              }
              L82: {
                if (param0 == 5) {
                  break L82;
                } else {
                  this.field_i = (ki) null;
                  break L82;
                }
              }
              L83: {
                if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                  this.field_j.field_q = (float)(-this.field_j.field_y);
                  break L83;
                } else {
                  break L83;
                }
              }
              L84: {
                if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                  break L84;
                } else {
                  this.field_i.field_B = (float)(80 - this.field_i.field_G);
                  break L84;
                }
              }
              L85: {
                if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                  this.field_i.field_B = (float)(560 + this.field_i.field_G);
                  break L85;
                } else {
                  break L85;
                }
              }
              L86: {
                if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                  break L86;
                } else {
                  this.field_i.field_q = (float)(-this.field_i.field_y);
                  break L86;
                }
              }
              L87: {
                if (!this.field_j.field_j) {
                  break L87;
                } else {
                  this.field_j.field_q = (float)(-this.field_j.field_y);
                  break L87;
                }
              }
              L88: {
                if (!this.field_i.field_j) {
                  break L88;
                } else {
                  this.field_i.field_q = (float)(-this.field_i.field_y);
                  break L88;
                }
              }
              return;
            }
          } else {
            L89: {
              if ((this.field_i.field_w ^ -1) == -6) {
                stackOut_185_0 = 0;
                stackIn_186_0 = stackOut_185_0;
                break L89;
              } else {
                stackOut_184_0 = 1;
                stackIn_186_0 = stackOut_184_0;
                break L89;
              }
            }
            L90: {
              var7 = stackIn_186_0;
              if (var7 != 0) {
                break L90;
              } else {
                var3 = var3 * 2.0f;
                var2 = var2 * 2.0f;
                break L90;
              }
            }
            L91: {
              L92: {
                if (var6 == 0) {
                  break L92;
                } else {
                  this.field_j.field_q = this.field_j.field_q - var3;
                  this.field_j.field_B = this.field_j.field_B - var2;
                  if (!MonkeyPuzzle2.field_F) {
                    break L91;
                  } else {
                    break L92;
                  }
                }
              }
              var3 = var3 * 2.0f;
              var2 = var2 * 2.0f;
              break L91;
            }
            L93: {
              if (var7 != 0) {
                this.field_i.field_q = this.field_i.field_q + var3;
                this.field_i.field_B = this.field_i.field_B + var2;
                break L93;
              } else {
                break L93;
              }
            }
            L94: {
              if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(80 + -this.field_j.field_G);
                break L94;
              } else {
                break L94;
              }
            }
            L95: {
              if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(this.field_j.field_G + 560);
                break L95;
              } else {
                break L95;
              }
            }
            L96: {
              if (param0 == 5) {
                break L96;
              } else {
                this.field_i = (ki) null;
                break L96;
              }
            }
            L97: {
              if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                this.field_j.field_q = (float)(-this.field_j.field_y);
                break L97;
              } else {
                break L97;
              }
            }
            L98: {
              if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                break L98;
              } else {
                this.field_i.field_B = (float)(80 - this.field_i.field_G);
                break L98;
              }
            }
            L99: {
              if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                this.field_i.field_B = (float)(560 + this.field_i.field_G);
                break L99;
              } else {
                break L99;
              }
            }
            L100: {
              if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                break L100;
              } else {
                this.field_i.field_q = (float)(-this.field_i.field_y);
                break L100;
              }
            }
            L101: {
              if (!this.field_j.field_j) {
                break L101;
              } else {
                this.field_j.field_q = (float)(-this.field_j.field_y);
                break L101;
              }
            }
            L102: {
              if (!this.field_i.field_j) {
                break L102;
              } else {
                this.field_i.field_q = (float)(-this.field_i.field_y);
                break L102;
              }
            }
            return;
          }
        } else {
          if (this.field_i.field_j) {
            L103: {
              L104: {
                if (this.field_j.field_x) {
                  break L104;
                } else {
                  if (this.field_j.field_j) {
                    break L104;
                  } else {
                    stackOut_145_0 = 0;
                    stackIn_150_0 = stackOut_145_0;
                    break L103;
                  }
                }
              }
              if ((this.field_i.field_w ^ -1) == -6) {
                stackOut_149_0 = 0;
                stackIn_150_0 = stackOut_149_0;
                break L103;
              } else {
                stackOut_148_0 = 1;
                stackIn_150_0 = stackOut_148_0;
                break L103;
              }
            }
            L105: {
              var7 = stackIn_150_0;
              if (var7 != 0) {
                break L105;
              } else {
                var3 = var3 * 2.0f;
                var2 = var2 * 2.0f;
                break L105;
              }
            }
            L106: {
              L107: {
                if (var6 == 0) {
                  break L107;
                } else {
                  this.field_j.field_q = this.field_j.field_q - var3;
                  this.field_j.field_B = this.field_j.field_B - var2;
                  if (!MonkeyPuzzle2.field_F) {
                    break L106;
                  } else {
                    break L107;
                  }
                }
              }
              var3 = var3 * 2.0f;
              var2 = var2 * 2.0f;
              break L106;
            }
            L108: {
              if (var7 != 0) {
                this.field_i.field_q = this.field_i.field_q + var3;
                this.field_i.field_B = this.field_i.field_B + var2;
                break L108;
              } else {
                break L108;
              }
            }
            L109: {
              if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(80 + -this.field_j.field_G);
                break L109;
              } else {
                break L109;
              }
            }
            L110: {
              if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(this.field_j.field_G + 560);
                break L110;
              } else {
                break L110;
              }
            }
            L111: {
              if (param0 == 5) {
                break L111;
              } else {
                this.field_i = (ki) null;
                break L111;
              }
            }
            L112: {
              if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                this.field_j.field_q = (float)(-this.field_j.field_y);
                break L112;
              } else {
                break L112;
              }
            }
            L113: {
              if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                break L113;
              } else {
                this.field_i.field_B = (float)(80 - this.field_i.field_G);
                break L113;
              }
            }
            L114: {
              if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                this.field_i.field_B = (float)(560 + this.field_i.field_G);
                break L114;
              } else {
                break L114;
              }
            }
            L115: {
              if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                break L115;
              } else {
                this.field_i.field_q = (float)(-this.field_i.field_y);
                break L115;
              }
            }
            L116: {
              if (!this.field_j.field_j) {
                break L116;
              } else {
                this.field_j.field_q = (float)(-this.field_j.field_y);
                break L116;
              }
            }
            L117: {
              if (!this.field_i.field_j) {
                break L117;
              } else {
                this.field_i.field_q = (float)(-this.field_i.field_y);
                break L117;
              }
            }
            return;
          } else {
            L118: {
              if ((this.field_i.field_w ^ -1) == -6) {
                stackOut_110_0 = 0;
                stackIn_111_0 = stackOut_110_0;
                break L118;
              } else {
                stackOut_109_0 = 1;
                stackIn_111_0 = stackOut_109_0;
                break L118;
              }
            }
            L119: {
              var7 = stackIn_111_0;
              if (var7 != 0) {
                break L119;
              } else {
                var3 = var3 * 2.0f;
                var2 = var2 * 2.0f;
                break L119;
              }
            }
            L120: {
              L121: {
                if (var6 == 0) {
                  break L121;
                } else {
                  this.field_j.field_q = this.field_j.field_q - var3;
                  this.field_j.field_B = this.field_j.field_B - var2;
                  if (!MonkeyPuzzle2.field_F) {
                    break L120;
                  } else {
                    break L121;
                  }
                }
              }
              var3 = var3 * 2.0f;
              var2 = var2 * 2.0f;
              break L120;
            }
            L122: {
              if (var7 != 0) {
                this.field_i.field_q = this.field_i.field_q + var3;
                this.field_i.field_B = this.field_i.field_B + var2;
                break L122;
              } else {
                break L122;
              }
            }
            L123: {
              if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(80 + -this.field_j.field_G);
                break L123;
              } else {
                break L123;
              }
            }
            L124: {
              if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(this.field_j.field_G + 560);
                break L124;
              } else {
                break L124;
              }
            }
            L125: {
              if (param0 == 5) {
                break L125;
              } else {
                this.field_i = (ki) null;
                break L125;
              }
            }
            L126: {
              if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                this.field_j.field_q = (float)(-this.field_j.field_y);
                break L126;
              } else {
                break L126;
              }
            }
            L127: {
              if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                break L127;
              } else {
                this.field_i.field_B = (float)(80 - this.field_i.field_G);
                break L127;
              }
            }
            L128: {
              if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                this.field_i.field_B = (float)(560 + this.field_i.field_G);
                break L128;
              } else {
                break L128;
              }
            }
            L129: {
              if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                break L129;
              } else {
                this.field_i.field_q = (float)(-this.field_i.field_y);
                break L129;
              }
            }
            L130: {
              if (!this.field_j.field_j) {
                break L130;
              } else {
                this.field_j.field_q = (float)(-this.field_j.field_y);
                break L130;
              }
            }
            L131: {
              if (!this.field_i.field_j) {
                break L131;
              } else {
                this.field_i.field_q = (float)(-this.field_i.field_y);
                break L131;
              }
            }
            return;
          }
        }
    }

    final static void a(boolean param0) {
        hl.b(-16);
        qh.a(4, param0);
    }

    final static fg a(int param0) {
        if (param0 != -20601) {
            field_g = (byte[]) null;
            return (fg) ((Object) new uf());
        }
        return (fg) ((Object) new uf());
    }

    final void a(int param0, ki param1, float param2, ki param3) {
        try {
            this.field_j = param1;
            this.field_i = param3;
            this.field_f = param2 * ((float)param0 + param2);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "il.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    il(ki param0, ki param1, float param2) {
        try {
            this.field_j = param0;
            this.field_f = (-1.0f + param2) * param2;
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "il.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_g = null;
    }

    static {
        field_e = -1;
    }
}
