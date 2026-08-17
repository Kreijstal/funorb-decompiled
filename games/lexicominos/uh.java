/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uh extends lk {
    hl field_s;
    int field_u;
    private ih field_t;
    private int field_w;
    hl field_A;
    private int[] field_r;
    private ih field_m;
    private int field_x;
    private ih field_B;
    private int[] field_y;
    private hl field_z;
    static java.util.zip.CRC32 field_v;
    private boolean field_o;
    private int field_q;
    private boolean field_p;
    static dg field_l;
    static int field_D;
    static uh field_n;
    static int[] field_C;

    final synchronized void a(byte param0, int param1, ih param2, int param3) {
        try {
            this.a(256, param3, false, param2, param1, (byte) 91);
            int var5_int = 83 / ((param0 - -55) / 51);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "uh.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(hl param0, byte param1, hl param2) {
        if (param1 >= -66) {
            return;
        }
        try {
            this.field_A = param0;
            this.field_w = 1048576;
            this.field_s = param2;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "uh.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, hl param3) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              param3.a(-1, param2, false);
              if (param0 > -88) {
                this.field_o = true;
                param3.b(-180, param1);
                break L1;
              } else {
                param3.b(-180, param1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("uh.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static void a(sj param0, byte param1, int param2) {
        th var3 = null;
        if (param1 > -91) {
            return;
        }
        try {
            var3 = ed.field_q;
            var3.h(param2, 0);
            var3.c(5, -1);
            var3.c(0, -1);
            var3.e(91, param0.field_h);
            var3.c(param0.field_o, -1);
            var3.c(param0.field_m, -1);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "uh.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (0 < this.field_w) {
          L0: {
            if (this.field_B != null) {
              this.field_A.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
          if (1048576 > this.field_w) {
            L1: {
              if (this.field_t == null) {
                break L1;
              } else {
                this.field_s.a(param0);
                break L1;
              }
            }
            L2: {
              if ((this.field_q ^ -1) >= -1) {
                break L2;
              } else {
                if (this.field_m != null) {
                  this.field_z.a(param0);
                  break L2;
                } else {
                  L3: {
                    if (this.field_p) {
                      L4: {
                        if (-1 <= (this.field_x ^ -1)) {
                          break L4;
                        } else {
                          if (this.field_A.a((byte) -32)) {
                            break L4;
                          } else {
                            this.field_x = -this.field_x;
                            this.field_B = null;
                            this.field_p = false;
                            break L3;
                          }
                        }
                      }
                      if ((this.field_x ^ -1) <= -1) {
                        break L3;
                      } else {
                        if (!this.field_s.a((byte) -32)) {
                          this.field_t = null;
                          this.field_x = -this.field_x;
                          this.field_p = false;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  if (this.field_x != 0) {
                    this.field_w = this.field_w + param0 * this.field_x;
                    if (this.field_w < 1048576) {
                      if (0 >= this.field_w) {
                        this.field_w = 0;
                        if (!this.field_p) {
                          L5: {
                            this.field_x = 0;
                            if (this.field_o) {
                              break L5;
                            } else {
                              if (null == this.field_B) {
                                this.field_B = null;
                                break L5;
                              } else {
                                this.field_A.d(false);
                                this.field_B = null;
                                return;
                              }
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      this.field_w = 1048576;
                      if (!this.field_p) {
                        this.field_x = 0;
                        if (!this.field_o) {
                          if (this.field_t == null) {
                            this.field_t = null;
                            return;
                          } else {
                            this.field_s.d(false);
                            this.field_t = null;
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
                    return;
                  }
                }
              }
            }
            if (this.field_p) {
              L6: {
                if (-1 <= (this.field_x ^ -1)) {
                  break L6;
                } else {
                  if (this.field_A.a((byte) -32)) {
                    break L6;
                  } else {
                    this.field_x = -this.field_x;
                    this.field_B = null;
                    this.field_p = false;
                    if (this.field_x != 0) {
                      L7: {
                        this.field_w = this.field_w + param0 * this.field_x;
                        if (this.field_w < 1048576) {
                          if (0 < this.field_w) {
                            break L7;
                          } else {
                            this.field_w = 0;
                            if (!this.field_p) {
                              this.field_x = 0;
                              if (this.field_o) {
                                break L7;
                              } else {
                                if (null == this.field_B) {
                                  this.field_B = null;
                                  break L7;
                                } else {
                                  this.field_A.d(false);
                                  this.field_B = null;
                                  return;
                                }
                              }
                            } else {
                              return;
                            }
                          }
                        } else {
                          this.field_w = 1048576;
                          if (this.field_p) {
                            break L7;
                          } else {
                            this.field_x = 0;
                            if (!this.field_o) {
                              if (this.field_t == null) {
                                this.field_t = null;
                                return;
                              } else {
                                this.field_s.d(false);
                                this.field_t = null;
                                return;
                              }
                            } else {
                              return;
                            }
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
              L8: {
                if ((this.field_x ^ -1) <= -1) {
                  break L8;
                } else {
                  if (!this.field_s.a((byte) -32)) {
                    this.field_t = null;
                    this.field_x = -this.field_x;
                    this.field_p = false;
                    break L8;
                  } else {
                    if (this.field_x != 0) {
                      L9: {
                        this.field_w = this.field_w + param0 * this.field_x;
                        if (this.field_w < 1048576) {
                          if (0 < this.field_w) {
                            break L9;
                          } else {
                            this.field_w = 0;
                            if (!this.field_p) {
                              this.field_x = 0;
                              if (this.field_o) {
                                break L9;
                              } else {
                                if (null == this.field_B) {
                                  this.field_B = null;
                                  break L9;
                                } else {
                                  this.field_A.d(false);
                                  this.field_B = null;
                                  return;
                                }
                              }
                            } else {
                              return;
                            }
                          }
                        } else {
                          this.field_w = 1048576;
                          if (this.field_p) {
                            break L9;
                          } else {
                            this.field_x = 0;
                            if (!this.field_o) {
                              if (this.field_t == null) {
                                this.field_t = null;
                                return;
                              } else {
                                this.field_s.d(false);
                                this.field_t = null;
                                return;
                              }
                            } else {
                              return;
                            }
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
              if (this.field_x != 0) {
                L10: {
                  this.field_w = this.field_w + param0 * this.field_x;
                  if (this.field_w < 1048576) {
                    if (0 < this.field_w) {
                      break L10;
                    } else {
                      this.field_w = 0;
                      if (!this.field_p) {
                        this.field_x = 0;
                        if (this.field_o) {
                          break L10;
                        } else {
                          if (null == this.field_B) {
                            this.field_B = null;
                            break L10;
                          } else {
                            this.field_A.d(false);
                            this.field_B = null;
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    this.field_w = 1048576;
                    if (this.field_p) {
                      break L10;
                    } else {
                      this.field_x = 0;
                      if (!this.field_o) {
                        if (this.field_t == null) {
                          this.field_t = null;
                          return;
                        } else {
                          this.field_s.d(false);
                          this.field_t = null;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              if (this.field_x != 0) {
                L11: {
                  this.field_w = this.field_w + param0 * this.field_x;
                  if (this.field_w < 1048576) {
                    if (0 < this.field_w) {
                      break L11;
                    } else {
                      this.field_w = 0;
                      if (!this.field_p) {
                        this.field_x = 0;
                        if (this.field_o) {
                          break L11;
                        } else {
                          if (null == this.field_B) {
                            this.field_B = null;
                            break L11;
                          } else {
                            this.field_A.d(false);
                            this.field_B = null;
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    this.field_w = 1048576;
                    if (this.field_p) {
                      break L11;
                    } else {
                      this.field_x = 0;
                      if (!this.field_o) {
                        if (this.field_t == null) {
                          this.field_t = null;
                          return;
                        } else {
                          this.field_s.d(false);
                          this.field_t = null;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            L12: {
              if ((this.field_q ^ -1) >= -1) {
                break L12;
              } else {
                if (this.field_m != null) {
                  this.field_z.a(param0);
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            L13: {
              if (this.field_p) {
                L14: {
                  if (-1 <= (this.field_x ^ -1)) {
                    break L14;
                  } else {
                    if (this.field_A.a((byte) -32)) {
                      break L14;
                    } else {
                      this.field_x = -this.field_x;
                      this.field_B = null;
                      this.field_p = false;
                      break L13;
                    }
                  }
                }
                if ((this.field_x ^ -1) <= -1) {
                  break L13;
                } else {
                  if (!this.field_s.a((byte) -32)) {
                    this.field_t = null;
                    this.field_x = -this.field_x;
                    this.field_p = false;
                    break L13;
                  } else {
                    break L13;
                  }
                }
              } else {
                break L13;
              }
            }
            if (this.field_x != 0) {
              this.field_w = this.field_w + param0 * this.field_x;
              if (this.field_w < 1048576) {
                if (0 >= this.field_w) {
                  this.field_w = 0;
                  if (!this.field_p) {
                    this.field_x = 0;
                    if (!this.field_o) {
                      if (null == this.field_B) {
                        this.field_B = null;
                        return;
                      } else {
                        this.field_A.d(false);
                        this.field_B = null;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                this.field_w = 1048576;
                if (!this.field_p) {
                  this.field_x = 0;
                  if (!this.field_o) {
                    if (this.field_t != null) {
                      this.field_s.d(false);
                      this.field_t = null;
                      return;
                    } else {
                      this.field_t = null;
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
              return;
            }
          }
        } else {
          L15: {
            if (1048576 <= this.field_w) {
              break L15;
            } else {
              if (this.field_t == null) {
                break L15;
              } else {
                this.field_s.a(param0);
                break L15;
              }
            }
          }
          L16: {
            if ((this.field_q ^ -1) >= -1) {
              break L16;
            } else {
              if (this.field_m != null) {
                this.field_z.a(param0);
                break L16;
              } else {
                break L16;
              }
            }
          }
          L17: {
            if (this.field_p) {
              L18: {
                if (-1 <= (this.field_x ^ -1)) {
                  break L18;
                } else {
                  if (this.field_A.a((byte) -32)) {
                    break L18;
                  } else {
                    this.field_x = -this.field_x;
                    this.field_B = null;
                    this.field_p = false;
                    break L17;
                  }
                }
              }
              if ((this.field_x ^ -1) <= -1) {
                break L17;
              } else {
                if (!this.field_s.a((byte) -32)) {
                  this.field_t = null;
                  this.field_x = -this.field_x;
                  this.field_p = false;
                  break L17;
                } else {
                  break L17;
                }
              }
            } else {
              break L17;
            }
          }
          if (this.field_x != 0) {
            this.field_w = this.field_w + param0 * this.field_x;
            if (this.field_w < 1048576) {
              if (0 >= this.field_w) {
                this.field_w = 0;
                if (!this.field_p) {
                  this.field_x = 0;
                  if (!this.field_o) {
                    if (null != this.field_B) {
                      this.field_A.d(false);
                      this.field_B = null;
                      return;
                    } else {
                      this.field_B = null;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_w = 1048576;
              if (!this.field_p) {
                this.field_x = 0;
                if (!this.field_o) {
                  if (this.field_t != null) {
                    this.field_s.d(false);
                    this.field_t = null;
                    return;
                  } else {
                    this.field_t = null;
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
            return;
          }
        }
    }

    private final synchronized void a(int param0, int param1, boolean param2, ih param3, int param4, byte param5) {
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_30_0 = 0;
        hl stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        hl stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        hl stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        hl stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_p) {
                break L1;
              } else {
                if (param2) {
                  L2: {
                    if (this.field_x > 0) {
                      L3: {
                        if (this.field_B == null) {
                          break L3;
                        } else {
                          this.field_A.d(false);
                          break L3;
                        }
                      }
                      this.field_B = param3;
                      if (param3 == null) {
                        break L2;
                      } else {
                        this.field_A.a(34, false, param3);
                        this.a(-117, param4, param0, this.field_A);
                        break L2;
                      }
                    } else {
                      L4: {
                        if (this.field_t != null) {
                          this.field_s.d(false);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      this.field_t = param3;
                      if (param3 == null) {
                        break L2;
                      } else {
                        this.field_s.a(94, false, param3);
                        this.a(-101, param4, param0, this.field_s);
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              stackIn_17_0 = this;

              if (!param2) {
                stackIn_18_0 = this;
                stackIn_18_1 = 0;
                break L5;
              } else {
                stackIn_18_0 = this;
                stackIn_18_1 = 1;
                break L5;
              }
            }
            ((uh) (this)).field_p = stackIn_18_1 != 0;
            if (this.field_B != param3) {
              if (this.field_t != param3) {
                L6: {
                  if (null == this.field_B) {
                    var7_int = 1;
                    break L6;
                  } else {
                    if (null != this.field_t) {
                      L7: {
                        if (524288 <= this.field_w) {
                          stackIn_30_0 = 0;
                          break L7;
                        } else {
                          stackIn_30_0 = 1;
                          break L7;
                        }
                      }
                      var7_int = stackIn_30_0;
                      break L6;
                    } else {
                      var7_int = 0;
                      break L6;
                    }
                  }
                }
                if (param5 >= 89) {
                  if (var7_int == 0) {
                    L8: {
                      if (this.field_t == null) {
                        break L8;
                      } else {
                        this.field_s.d(false);
                        break L8;
                      }
                    }
                    L9: {
                      this.field_t = param3;
                      if (param3 == null) {
                        break L9;
                      } else {
                        L10: {
                          stackIn_49_0 = this.field_s;

                          stackIn_49_1 = 46;

                          if (param2) {
                            stackIn_50_0 = (hl) ((Object) stackIn_49_0);
                            stackIn_50_1 = stackIn_49_1;
                            stackIn_50_2 = 0;
                            break L10;
                          } else {
                            stackIn_50_0 = (hl) ((Object) stackIn_49_0);
                            stackIn_50_1 = stackIn_49_1;
                            stackIn_50_2 = 1;
                            break L10;
                          }
                        }
                        ((hl) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2 != 0, param3);
                        this.a(-116, param4, param0, this.field_s);
                        break L9;
                      }
                    }
                    this.field_x = -param1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L11: {
                      if (null != this.field_B) {
                        this.field_A.d(false);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      this.field_B = param3;
                      if (param3 == null) {
                        break L12;
                      } else {
                        L13: {
                          stackIn_41_0 = this.field_A;

                          stackIn_41_1 = 27;

                          if (param2) {
                            stackIn_42_0 = (hl) ((Object) stackIn_41_0);
                            stackIn_42_1 = stackIn_41_1;
                            stackIn_42_2 = 0;
                            break L13;
                          } else {
                            stackIn_42_0 = (hl) ((Object) stackIn_41_0);
                            stackIn_42_1 = stackIn_41_1;
                            stackIn_42_2 = 1;
                            break L13;
                          }
                        }
                        ((hl) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2 != 0, param3);
                        this.a(-124, param4, param0, this.field_A);
                        break L12;
                      }
                    }
                    this.field_x = param1;
                    return;
                  }
                } else {
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                this.field_x = -param1;
                this.a(-92, param4, param0, this.field_s);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_x = param1;
              this.a(-89, param4, param0, this.field_A);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var7 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var7);

            stackIn_55_1 = new StringBuilder().append("uh.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L14;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L14;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final lk b() {
        return null;
    }

    public static void a(byte param0) {
        sj var2;
        if (param0 <= 113) {
          var2 = (sj) null;
          uh.a((sj) null, (byte) 38, -34);
          field_l = null;
          field_C = null;
          field_n = null;
          field_v = null;
          return;
        } else {
          field_l = null;
          field_C = null;
          field_n = null;
          field_v = null;
          return;
        }
    }

    final lk d() {
        return null;
    }

    final synchronized void a(int param0, int param1) {
        if (param0 != 0) {
            this.b();
            this.field_u = param1;
            return;
        }
        this.field_u = param1;
    }

    final static db a(sh param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        db stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        db stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 < -47) {
              if (nb.a(param1, param3, (byte) 127, param0)) {
                stackIn_7_0 = eb.a((byte) 27);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (db) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("uh.K(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (db) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_59_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if ((this.field_u ^ -1) < -1) {
              L1: {
                if (!this.field_p) {
                  break L1;
                } else {
                  L2: {
                    if (0 >= this.field_x) {
                      break L2;
                    } else {
                      if (this.field_A.a((byte) -32)) {
                        break L2;
                      } else {
                        this.field_x = -this.field_x;
                        this.field_p = false;
                        this.field_B = null;
                        break L1;
                      }
                    }
                  }
                  if (this.field_x >= 0) {
                    break L1;
                  } else {
                    if (!this.field_s.a((byte) -32)) {
                      this.field_p = false;
                      this.field_t = null;
                      this.field_x = -this.field_x;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = (this.field_w >> -170141204) * this.field_u / 256;
                var5 = -var4_int + this.field_u;
                if (0 != this.field_x) {
                  this.field_w = this.field_w + param2 * this.field_x;
                  if (this.field_w >= 1048576) {
                    this.field_w = 1048576;
                    if (this.field_p) {
                      break L3;
                    } else {
                      this.field_x = 0;
                      if (!this.field_o) {
                        L4: {
                          if (null == this.field_t) {
                            break L4;
                          } else {
                            this.field_s.d(false);
                            break L4;
                          }
                        }
                        this.field_t = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    if (0 < this.field_w) {
                      break L3;
                    } else {
                      this.field_w = 0;
                      if (!this.field_p) {
                        this.field_x = 0;
                        if (this.field_o) {
                          break L3;
                        } else {
                          L5: {
                            if (this.field_B == null) {
                              break L5;
                            } else {
                              this.field_A.d(false);
                              break L5;
                            }
                          }
                          this.field_B = null;
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (!b.field_j) {
                  stackIn_31_0 = param2;
                  break L6;
                } else {
                  stackIn_31_0 = param2 << 958621377;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_31_0;
                if (-257 < (this.field_q ^ -1)) {
                  L8: {
                    if (null != this.field_B) {
                      break L8;
                    } else {
                      if (this.field_t != null) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (-257 != (var4_int ^ -1)) {
                    if (var5 != 256) {
                      L9: {
                        L10: {
                          if (null == this.field_y) {
                            break L10;
                          } else {
                            if (this.field_y.length < var6) {
                              break L10;
                            } else {
                              o.a(this.field_y, 0, var6);
                              o.a(this.field_r, 0, var6);
                              break L9;
                            }
                          }
                        }
                        this.field_r = new int[var6];
                        this.field_y = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_A.b(this.field_y, 0, param2);
                        this.field_s.b(this.field_r, 0, param2);
                        if (!b.field_j) {
                          stackIn_47_0 = param1;
                          break L11;
                        } else {
                          localTemp$0 = param1 << 1;
                          param1 = localTemp$0;
                          stackIn_47_0 = localTemp$0;
                          break L11;
                        }
                      }
                      var7 = stackIn_47_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (this.field_r[var8] * var5 + var4_int * this.field_y[var8] >> -534517816);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      this.field_s.b(param0, param1, param2);
                      break L7;
                    }
                  } else {
                    this.field_A.b(param0, param1, param2);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                if (this.field_m == null) {
                  break L13;
                } else {
                  if (-1 == (this.field_q ^ -1)) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        if (this.field_y == null) {
                          break L15;
                        } else {
                          if (this.field_y.length < var6) {
                            break L15;
                          } else {
                            o.a(this.field_y, 0, var6);
                            break L14;
                          }
                        }
                      }
                      this.field_r = new int[var6];
                      this.field_y = new int[var6];
                      break L14;
                    }
                    L16: {
                      this.field_z.b(this.field_y, 0, param2);
                      if (b.field_j) {
                        localTemp$1 = param1 << 1;
                        param1 = localTemp$1;
                        stackIn_59_0 = localTemp$1;
                        break L16;
                      } else {
                        stackIn_59_0 = param1;
                        break L16;
                      }
                    }
                    var7 = stackIn_59_0;
                    var8 = this.field_u * this.field_q / 256;
                    var9 = this.field_u + -var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var7 - -var10] = param0[var10 + var7] * var9 - -(this.field_y[var10] * var8) >> 1607914824;
                        var10++;
                        continue L17;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackIn_65_0 = (RuntimeException) (var4);

            stackIn_65_1 = new StringBuilder().append("uh.I(");

            if (param0 == null) {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "null";
              break L18;
            } else {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "{...}";
              break L18;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public uh() {
        this.field_u = 256;
        this.field_q = 0;
        this.field_o = false;
        hl var1 = new hl();
        this.a(var1, (byte) -72, new hl(var1));
    }

    final synchronized int a() {
        return 2;
    }

    static {
        field_v = new java.util.zip.CRC32();
        field_l = new dg();
        field_C = new int[4];
    }
}
