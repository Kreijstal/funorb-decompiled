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
        int stackIn_10_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_217_0 = 0;
        float var2;
        float var3;
        float var4;
        float var5;
        int var6;
        int var7;
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
                      stackIn_58_0 = 0;
                      break L2;
                    } else {
                      stackIn_58_0 = 1;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      L5: {
                        var6 = stackIn_58_0;
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
                          stackIn_69_0 = 0;
                          break L3;
                        }
                      }
                    }
                    if ((this.field_i.field_w ^ -1) != -6) {
                      stackIn_69_0 = 1;
                      break L3;
                    } else {
                      stackIn_69_0 = 0;
                      break L3;
                    }
                  }
                  L6: {
                    var7 = stackIn_69_0;
                    if (var7 != 0) {
                      break L6;
                    } else {
                      var3 = var3 * 2.0f;
                      var2 = var2 * 2.0f;
                      break L6;
                    }
                  }
                  L7: {
                    if (var6 == 0) {
                      var3 = var3 * 2.0f;
                      var2 = var2 * 2.0f;
                      break L7;
                    } else {
                      this.field_j.field_q = this.field_j.field_q - var3;
                      this.field_j.field_B = this.field_j.field_B - var2;
                      break L7;
                    }
                  }
                  L8: {
                    if (var7 != 0) {
                      this.field_i.field_q = this.field_i.field_q + var3;
                      this.field_i.field_B = this.field_i.field_B + var2;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                      this.field_j.field_B = (float)(80 + -this.field_j.field_G);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                      this.field_j.field_B = (float)(this.field_j.field_G + 560);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (param0 == 5) {
                      break L11;
                    } else {
                      this.field_i = (ki) null;
                      break L11;
                    }
                  }
                  L12: {
                    if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                      this.field_j.field_q = (float)(-this.field_j.field_y);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                      break L13;
                    } else {
                      this.field_i.field_B = (float)(80 - this.field_i.field_G);
                      break L13;
                    }
                  }
                  L14: {
                    if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                      this.field_i.field_B = (float)(560 + this.field_i.field_G);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                      break L15;
                    } else {
                      this.field_i.field_q = (float)(-this.field_i.field_y);
                      break L15;
                    }
                  }
                  L16: {
                    if (!this.field_j.field_j) {
                      break L16;
                    } else {
                      this.field_j.field_q = (float)(-this.field_j.field_y);
                      break L16;
                    }
                  }
                  L17: {
                    if (!this.field_i.field_j) {
                      break L17;
                    } else {
                      this.field_i.field_q = (float)(-this.field_i.field_y);
                      break L17;
                    }
                  }
                  return;
                } else {
                  stackIn_104_0 = 0;
                  break L0;
                }
              }
            } else {
              if (!this.field_j.field_j) {
                break L1;
              } else {
                L18: {
                  L19: {
                    if (this.field_i.field_x) {
                      break L19;
                    } else {
                      if (this.field_i.field_j) {
                        break L19;
                      } else {
                        stackIn_10_0 = 0;
                        break L18;
                      }
                    }
                  }
                  if (5 != this.field_j.field_w) {
                    stackIn_10_0 = 1;
                    break L18;
                  } else {
                    stackIn_10_0 = 0;
                    break L18;
                  }
                }
                L20: {
                  L21: {
                    L22: {
                      var6 = stackIn_10_0;
                      if (this.field_i.field_x) {
                        break L22;
                      } else {
                        if (!this.field_i.field_j) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                    if (this.field_j.field_x) {
                      break L21;
                    } else {
                      if (this.field_j.field_j) {
                        break L21;
                      } else {
                        stackIn_21_0 = 0;
                        break L20;
                      }
                    }
                  }
                  if ((this.field_i.field_w ^ -1) != -6) {
                    stackIn_21_0 = 1;
                    break L20;
                  } else {
                    stackIn_21_0 = 0;
                    break L20;
                  }
                }
                L23: {
                  var7 = stackIn_21_0;
                  if (var7 != 0) {
                    break L23;
                  } else {
                    var3 = var3 * 2.0f;
                    var2 = var2 * 2.0f;
                    break L23;
                  }
                }
                L24: {
                  if (var6 == 0) {
                    var3 = var3 * 2.0f;
                    var2 = var2 * 2.0f;
                    break L24;
                  } else {
                    this.field_j.field_q = this.field_j.field_q - var3;
                    this.field_j.field_B = this.field_j.field_B - var2;
                    break L24;
                  }
                }
                L25: {
                  if (var7 != 0) {
                    this.field_i.field_q = this.field_i.field_q + var3;
                    this.field_i.field_B = this.field_i.field_B + var2;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                    this.field_j.field_B = (float)(80 + -this.field_j.field_G);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                    this.field_j.field_B = (float)(this.field_j.field_G + 560);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (param0 == 5) {
                    break L28;
                  } else {
                    this.field_i = (ki) null;
                    break L28;
                  }
                }
                L29: {
                  if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                    this.field_j.field_q = (float)(-this.field_j.field_y);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                    break L30;
                  } else {
                    this.field_i.field_B = (float)(80 - this.field_i.field_G);
                    break L30;
                  }
                }
                L31: {
                  if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                    this.field_i.field_B = (float)(560 + this.field_i.field_G);
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                    break L32;
                  } else {
                    this.field_i.field_q = (float)(-this.field_i.field_y);
                    break L32;
                  }
                }
                L33: {
                  if (!this.field_j.field_j) {
                    break L33;
                  } else {
                    this.field_j.field_q = (float)(-this.field_j.field_y);
                    break L33;
                  }
                }
                L34: {
                  if (!this.field_i.field_j) {
                    break L34;
                  } else {
                    this.field_i.field_q = (float)(-this.field_i.field_y);
                    break L34;
                  }
                }
                return;
              }
            }
          }
          if (5 != this.field_j.field_w) {
            stackIn_104_0 = 1;
            break L0;
          } else {
            stackIn_104_0 = 0;
            break L0;
          }
        }
        var6 = stackIn_104_0;
        if (this.field_i.field_x) {
          if (!this.field_j.field_x) {
            if (!this.field_j.field_j) {
              L35: {
                var7 = 0;
                if (var7 != 0) {
                  break L35;
                } else {
                  var3 = var3 * 2.0f;
                  var2 = var2 * 2.0f;
                  break L35;
                }
              }
              L36: {
                if (var6 == 0) {
                  var3 = var3 * 2.0f;
                  var2 = var2 * 2.0f;
                  break L36;
                } else {
                  this.field_j.field_q = this.field_j.field_q - var3;
                  this.field_j.field_B = this.field_j.field_B - var2;
                  break L36;
                }
              }
              L37: {
                if (var7 != 0) {
                  this.field_i.field_q = this.field_i.field_q + var3;
                  this.field_i.field_B = this.field_i.field_B + var2;
                  break L37;
                } else {
                  break L37;
                }
              }
              L38: {
                if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                  this.field_j.field_B = (float)(80 + -this.field_j.field_G);
                  break L38;
                } else {
                  break L38;
                }
              }
              L39: {
                if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                  this.field_j.field_B = (float)(this.field_j.field_G + 560);
                  break L39;
                } else {
                  break L39;
                }
              }
              if (param0 == 5) {
                L40: {
                  if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                    this.field_j.field_q = (float)(-this.field_j.field_y);
                    break L40;
                  } else {
                    break L40;
                  }
                }
                if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                  L41: {
                    if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                      this.field_i.field_B = (float)(560 + this.field_i.field_G);
                      break L41;
                    } else {
                      break L41;
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
                      L42: {
                        this.field_j.field_q = (float)(-this.field_j.field_y);
                        if (!this.field_i.field_j) {
                          break L42;
                        } else {
                          this.field_i.field_q = (float)(-this.field_i.field_y);
                          break L42;
                        }
                      }
                      return;
                    }
                  } else {
                    L43: {
                      this.field_i.field_q = (float)(-this.field_i.field_y);
                      if (!this.field_j.field_j) {
                        break L43;
                      } else {
                        this.field_j.field_q = (float)(-this.field_j.field_y);
                        break L43;
                      }
                    }
                    L44: {
                      if (!this.field_i.field_j) {
                        break L44;
                      } else {
                        this.field_i.field_q = (float)(-this.field_i.field_y);
                        break L44;
                      }
                    }
                    return;
                  }
                } else {
                  L45: {
                    this.field_i.field_B = (float)(80 - this.field_i.field_G);
                    if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                      this.field_i.field_B = (float)(560 + this.field_i.field_G);
                      break L45;
                    } else {
                      break L45;
                    }
                  }
                  L46: {
                    if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                      break L46;
                    } else {
                      this.field_i.field_q = (float)(-this.field_i.field_y);
                      break L46;
                    }
                  }
                  L47: {
                    if (!this.field_j.field_j) {
                      break L47;
                    } else {
                      this.field_j.field_q = (float)(-this.field_j.field_y);
                      break L47;
                    }
                  }
                  L48: {
                    if (!this.field_i.field_j) {
                      break L48;
                    } else {
                      this.field_i.field_q = (float)(-this.field_i.field_y);
                      break L48;
                    }
                  }
                  return;
                }
              } else {
                L49: {
                  this.field_i = (ki) null;
                  if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                    this.field_j.field_q = (float)(-this.field_j.field_y);
                    break L49;
                  } else {
                    break L49;
                  }
                }
                L50: {
                  if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                    break L50;
                  } else {
                    this.field_i.field_B = (float)(80 - this.field_i.field_G);
                    break L50;
                  }
                }
                L51: {
                  if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                    this.field_i.field_B = (float)(560 + this.field_i.field_G);
                    break L51;
                  } else {
                    break L51;
                  }
                }
                L52: {
                  if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                    break L52;
                  } else {
                    this.field_i.field_q = (float)(-this.field_i.field_y);
                    break L52;
                  }
                }
                L53: {
                  if (!this.field_j.field_j) {
                    break L53;
                  } else {
                    this.field_j.field_q = (float)(-this.field_j.field_y);
                    break L53;
                  }
                }
                L54: {
                  if (!this.field_i.field_j) {
                    break L54;
                  } else {
                    this.field_i.field_q = (float)(-this.field_i.field_y);
                    break L54;
                  }
                }
                return;
              }
            } else {
              L55: {
                if ((this.field_i.field_w ^ -1) == -6) {
                  stackIn_217_0 = 0;
                  break L55;
                } else {
                  stackIn_217_0 = 1;
                  break L55;
                }
              }
              L56: {
                var7 = stackIn_217_0;
                if (var7 != 0) {
                  break L56;
                } else {
                  var3 = var3 * 2.0f;
                  var2 = var2 * 2.0f;
                  break L56;
                }
              }
              L57: {
                if (var6 == 0) {
                  var3 = var3 * 2.0f;
                  var2 = var2 * 2.0f;
                  break L57;
                } else {
                  this.field_j.field_q = this.field_j.field_q - var3;
                  this.field_j.field_B = this.field_j.field_B - var2;
                  break L57;
                }
              }
              L58: {
                if (var7 != 0) {
                  this.field_i.field_q = this.field_i.field_q + var3;
                  this.field_i.field_B = this.field_i.field_B + var2;
                  break L58;
                } else {
                  break L58;
                }
              }
              L59: {
                if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                  this.field_j.field_B = (float)(80 + -this.field_j.field_G);
                  break L59;
                } else {
                  break L59;
                }
              }
              L60: {
                if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                  this.field_j.field_B = (float)(this.field_j.field_G + 560);
                  break L60;
                } else {
                  break L60;
                }
              }
              L61: {
                if (param0 == 5) {
                  break L61;
                } else {
                  this.field_i = (ki) null;
                  break L61;
                }
              }
              L62: {
                if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                  this.field_j.field_q = (float)(-this.field_j.field_y);
                  break L62;
                } else {
                  break L62;
                }
              }
              L63: {
                if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                  break L63;
                } else {
                  this.field_i.field_B = (float)(80 - this.field_i.field_G);
                  break L63;
                }
              }
              L64: {
                if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                  this.field_i.field_B = (float)(560 + this.field_i.field_G);
                  break L64;
                } else {
                  break L64;
                }
              }
              L65: {
                if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                  break L65;
                } else {
                  this.field_i.field_q = (float)(-this.field_i.field_y);
                  break L65;
                }
              }
              L66: {
                if (!this.field_j.field_j) {
                  break L66;
                } else {
                  this.field_j.field_q = (float)(-this.field_j.field_y);
                  break L66;
                }
              }
              if (this.field_i.field_j) {
                this.field_i.field_q = (float)(-this.field_i.field_y);
                return;
              } else {
                return;
              }
            }
          } else {
            L67: {
              if ((this.field_i.field_w ^ -1) == -6) {
                stackIn_182_0 = 0;
                break L67;
              } else {
                stackIn_182_0 = 1;
                break L67;
              }
            }
            L68: {
              var7 = stackIn_182_0;
              if (var7 != 0) {
                break L68;
              } else {
                var3 = var3 * 2.0f;
                var2 = var2 * 2.0f;
                break L68;
              }
            }
            L69: {
              if (var6 == 0) {
                var3 = var3 * 2.0f;
                var2 = var2 * 2.0f;
                break L69;
              } else {
                this.field_j.field_q = this.field_j.field_q - var3;
                this.field_j.field_B = this.field_j.field_B - var2;
                break L69;
              }
            }
            L70: {
              if (var7 != 0) {
                this.field_i.field_q = this.field_i.field_q + var3;
                this.field_i.field_B = this.field_i.field_B + var2;
                break L70;
              } else {
                break L70;
              }
            }
            L71: {
              if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(80 + -this.field_j.field_G);
                break L71;
              } else {
                break L71;
              }
            }
            L72: {
              if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(this.field_j.field_G + 560);
                break L72;
              } else {
                break L72;
              }
            }
            L73: {
              if (param0 == 5) {
                break L73;
              } else {
                this.field_i = (ki) null;
                break L73;
              }
            }
            L74: {
              if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                this.field_j.field_q = (float)(-this.field_j.field_y);
                break L74;
              } else {
                break L74;
              }
            }
            L75: {
              if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                break L75;
              } else {
                this.field_i.field_B = (float)(80 - this.field_i.field_G);
                break L75;
              }
            }
            L76: {
              if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                this.field_i.field_B = (float)(560 + this.field_i.field_G);
                break L76;
              } else {
                break L76;
              }
            }
            L77: {
              if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                break L77;
              } else {
                this.field_i.field_q = (float)(-this.field_i.field_y);
                break L77;
              }
            }
            L78: {
              if (!this.field_j.field_j) {
                break L78;
              } else {
                this.field_j.field_q = (float)(-this.field_j.field_y);
                break L78;
              }
            }
            L79: {
              if (!this.field_i.field_j) {
                break L79;
              } else {
                this.field_i.field_q = (float)(-this.field_i.field_y);
                break L79;
              }
            }
            return;
          }
        } else {
          if (this.field_i.field_j) {
            L80: {
              L81: {
                if (this.field_j.field_x) {
                  break L81;
                } else {
                  if (this.field_j.field_j) {
                    break L81;
                  } else {
                    stackIn_147_0 = 0;
                    break L80;
                  }
                }
              }
              if ((this.field_i.field_w ^ -1) == -6) {
                stackIn_147_0 = 0;
                break L80;
              } else {
                stackIn_147_0 = 1;
                break L80;
              }
            }
            L82: {
              var7 = stackIn_147_0;
              if (var7 != 0) {
                break L82;
              } else {
                var3 = var3 * 2.0f;
                var2 = var2 * 2.0f;
                break L82;
              }
            }
            L83: {
              if (var6 == 0) {
                var3 = var3 * 2.0f;
                var2 = var2 * 2.0f;
                break L83;
              } else {
                this.field_j.field_q = this.field_j.field_q - var3;
                this.field_j.field_B = this.field_j.field_B - var2;
                break L83;
              }
            }
            L84: {
              if (var7 != 0) {
                this.field_i.field_q = this.field_i.field_q + var3;
                this.field_i.field_B = this.field_i.field_B + var2;
                break L84;
              } else {
                break L84;
              }
            }
            L85: {
              if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(80 + -this.field_j.field_G);
                break L85;
              } else {
                break L85;
              }
            }
            L86: {
              if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(this.field_j.field_G + 560);
                break L86;
              } else {
                break L86;
              }
            }
            L87: {
              if (param0 == 5) {
                break L87;
              } else {
                this.field_i = (ki) null;
                break L87;
              }
            }
            L88: {
              if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                this.field_j.field_q = (float)(-this.field_j.field_y);
                break L88;
              } else {
                break L88;
              }
            }
            L89: {
              if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                break L89;
              } else {
                this.field_i.field_B = (float)(80 - this.field_i.field_G);
                break L89;
              }
            }
            L90: {
              if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                this.field_i.field_B = (float)(560 + this.field_i.field_G);
                break L90;
              } else {
                break L90;
              }
            }
            L91: {
              if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                break L91;
              } else {
                this.field_i.field_q = (float)(-this.field_i.field_y);
                break L91;
              }
            }
            L92: {
              if (!this.field_j.field_j) {
                break L92;
              } else {
                this.field_j.field_q = (float)(-this.field_j.field_y);
                break L92;
              }
            }
            L93: {
              if (!this.field_i.field_j) {
                break L93;
              } else {
                this.field_i.field_q = (float)(-this.field_i.field_y);
                break L93;
              }
            }
            return;
          } else {
            L94: {
              if ((this.field_i.field_w ^ -1) == -6) {
                stackIn_109_0 = 0;
                break L94;
              } else {
                stackIn_109_0 = 1;
                break L94;
              }
            }
            L95: {
              var7 = stackIn_109_0;
              if (var7 != 0) {
                break L95;
              } else {
                var3 = var3 * 2.0f;
                var2 = var2 * 2.0f;
                break L95;
              }
            }
            L96: {
              if (var6 == 0) {
                var3 = var3 * 2.0f;
                var2 = var2 * 2.0f;
                break L96;
              } else {
                this.field_j.field_q = this.field_j.field_q - var3;
                this.field_j.field_B = this.field_j.field_B - var2;
                break L96;
              }
            }
            L97: {
              if (var7 != 0) {
                this.field_i.field_q = this.field_i.field_q + var3;
                this.field_i.field_B = this.field_i.field_B + var2;
                break L97;
              } else {
                break L97;
              }
            }
            L98: {
              if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(80 + -this.field_j.field_G);
                break L98;
              } else {
                break L98;
              }
            }
            L99: {
              if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(this.field_j.field_G + 560);
                break L99;
              } else {
                break L99;
              }
            }
            L100: {
              if (param0 == 5) {
                break L100;
              } else {
                this.field_i = (ki) null;
                break L100;
              }
            }
            L101: {
              if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                this.field_j.field_q = (float)(-this.field_j.field_y);
                break L101;
              } else {
                break L101;
              }
            }
            L102: {
              if (this.field_i.field_B + (float)this.field_i.field_G > 80.0f) {
                break L102;
              } else {
                this.field_i.field_B = (float)(80 - this.field_i.field_G);
                break L102;
              }
            }
            L103: {
              if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                this.field_i.field_B = (float)(560 + this.field_i.field_G);
                break L103;
              } else {
                break L103;
              }
            }
            L104: {
              if (this.field_i.field_q + (float)this.field_i.field_y >= 0.0f) {
                break L104;
              } else {
                this.field_i.field_q = (float)(-this.field_i.field_y);
                break L104;
              }
            }
            L105: {
              if (!this.field_j.field_j) {
                break L105;
              } else {
                this.field_j.field_q = (float)(-this.field_j.field_y);
                break L105;
              }
            }
            L106: {
              if (!this.field_i.field_j) {
                break L106;
              } else {
                this.field_i.field_q = (float)(-this.field_i.field_y);
                break L106;
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
