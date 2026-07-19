/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tj extends uh {
    static int[] field_w;
    private gj field_x;
    static String field_t;
    static String field_A;
    static int field_u;
    static ti field_s;
    static String field_z;
    static int field_y;
    static String field_v;

    final boolean c(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            pj var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            pj var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_19_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_77_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_88_0 = 0;
            int stackIn_95_0 = 0;
            int stackIn_98_0 = 0;
            int stackIn_108_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_30_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_75_0 = 0;
            int stackOut_87_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_94_0 = 0;
            int stackOut_97_0 = 0;
            int stackOut_96_0 = 0;
            int stackOut_107_0 = 0;
            int stackOut_18_0 = 0;
            L0: {
              var16 = Transmogrify.field_A ? 1 : 0;
              if (null == this.field_x) {
                break L0;
              } else {
                L1: {
                  var2_long = lk.a(0);
                  var4 = (int)(-this.field_l + var2_long);
                  this.field_l = var2_long;
                  if (200 < var4) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_b = this.field_b + var4;
                if (this.field_b <= 30000) {
                  break L0;
                } else {
                  try {
                    L2: {
                      this.field_x.a(true);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_x = null;
                  break L0;
                }
              }
            }
            if (null == this.field_x) {
              if (0 == this.a((byte) -68)) {
                if (this.e(-10236) != 0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              try {
                L4: {
                  this.field_x.d(-60);
                  if (param0 > 115) {
                    var2_ref = (pj) ((Object) this.field_c.b((byte) 125));
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (var2_ref == null) {
                            break L7;
                          } else {
                            this.field_i.field_h = 0;
                            this.field_i.f(6389, 1);
                            this.field_i.a(var2_ref.field_j, true);
                            this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
                            this.field_h.a((byte) -128, var2_ref);
                            var2_ref = (pj) ((Object) this.field_c.a(97));
                            if (var16 != 0) {
                              break L6;
                            } else {
                              if (var16 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        var2_ref = (pj) ((Object) this.field_a.b((byte) 114));
                        break L6;
                      }
                      L8: while (true) {
                        L9: {
                          if (var2_ref == null) {
                            break L9;
                          } else {
                            this.field_i.field_h = 0;
                            this.field_i.f(6389, 0);
                            this.field_i.a(var2_ref.field_j, true);
                            this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
                            this.field_n.a((byte) -128, var2_ref);
                            var2_ref = (pj) ((Object) this.field_a.a(104));
                            if (var16 == 0) {
                              continue L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var2_int = 0;
                        L10: while (true) {
                          L11: {
                            L12: {
                              if (100 <= var2_int) {
                                break L12;
                              } else {
                                var3_int = this.field_x.a((byte) -119);
                                stackOut_30_0 = 0;
                                stackIn_108_0 = stackOut_30_0;
                                stackIn_31_0 = stackOut_30_0;
                                if (var16 != 0) {
                                  break L11;
                                } else {
                                  if (stackIn_31_0 > var3_int) {
                                    throw new IOException();
                                  } else {
                                    L13: {
                                      if (0 != var3_int) {
                                        break L13;
                                      } else {
                                        if (var16 == 0) {
                                          break L12;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    L14: {
                                      L15: {
                                        this.field_b = 0;
                                        var4 = 0;
                                        if (this.field_e != null) {
                                          break L15;
                                        } else {
                                          var4 = 10;
                                          if (var16 == 0) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      if (-1 != (this.field_e.field_C ^ -1)) {
                                        break L14;
                                      } else {
                                        var4 = 1;
                                        break L14;
                                      }
                                    }
                                    L16: {
                                      L17: {
                                        if (var4 > 0) {
                                          break L17;
                                        } else {
                                          L18: {
                                            var5 = -this.field_e.field_z + this.field_e.field_B.field_g.length;
                                            var6 = -this.field_e.field_C + 512;
                                            if (var5 - this.field_e.field_B.field_h >= var6) {
                                              break L18;
                                            } else {
                                              var6 = var5 + -this.field_e.field_B.field_h;
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            if (var6 <= var3_int) {
                                              break L19;
                                            } else {
                                              var6 = var3_int;
                                              break L19;
                                            }
                                          }
                                          L20: {
                                            L21: {
                                              this.field_x.a(this.field_e.field_B.field_h, var6, this.field_e.field_B.field_g, 5768);
                                              if (this.field_m != 0) {
                                                var7 = 0;
                                                L22: while (true) {
                                                  if (var7 >= var6) {
                                                    break L21;
                                                  } else {
                                                    this.field_e.field_B.field_g[var7 + this.field_e.field_B.field_h] = (byte)ak.a((int) this.field_e.field_B.field_g[var7 + this.field_e.field_B.field_h], (int) this.field_m);
                                                    var7++;
                                                    if (var16 != 0) {
                                                      break L20;
                                                    } else {
                                                      continue L22;
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L21;
                                              }
                                            }
                                            this.field_e.field_B.field_h = this.field_e.field_B.field_h + var6;
                                            this.field_e.field_C = this.field_e.field_C + var6;
                                            break L20;
                                          }
                                          L23: {
                                            if (this.field_e.field_B.field_h != var5) {
                                              break L23;
                                            } else {
                                              this.field_e.b((byte) -79);
                                              this.field_e.field_m = false;
                                              this.field_e = null;
                                              if (var16 == 0) {
                                                break L16;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          if (-513 == (this.field_e.field_C ^ -1)) {
                                            this.field_e.field_C = 0;
                                            if (var16 == 0) {
                                              break L16;
                                            } else {
                                              break L17;
                                            }
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      L24: {
                                        var5 = -this.field_g.field_h + var4;
                                        if (var5 > var3_int) {
                                          var5 = var3_int;
                                          break L24;
                                        } else {
                                          break L24;
                                        }
                                      }
                                      L25: {
                                        L26: {
                                          this.field_x.a(this.field_g.field_h, var5, this.field_g.field_g, 5768);
                                          if (this.field_m != 0) {
                                            var6 = 0;
                                            L27: while (true) {
                                              if (var5 <= var6) {
                                                break L26;
                                              } else {
                                                this.field_g.field_g[var6 + this.field_g.field_h] = (byte)ak.a((int) this.field_g.field_g[var6 + this.field_g.field_h], (int) this.field_m);
                                                var6++;
                                                if (var16 != 0) {
                                                  break L25;
                                                } else {
                                                  continue L27;
                                                }
                                              }
                                            }
                                          } else {
                                            break L26;
                                          }
                                        }
                                        this.field_g.field_h = this.field_g.field_h + var5;
                                        break L25;
                                      }
                                      if (var4 > this.field_g.field_h) {
                                        break L16;
                                      } else {
                                        L28: {
                                          if (this.field_e == null) {
                                            L29: {
                                              this.field_g.field_h = 0;
                                              var6 = this.field_g.d((byte) 56);
                                              var7 = this.field_g.c((byte) -125);
                                              var8 = this.field_g.d((byte) 90);
                                              var9 = this.field_g.c((byte) -104);
                                              var10 = 127 & var8;
                                              if ((var8 & 128) == 0) {
                                                stackOut_76_0 = 0;
                                                stackIn_77_0 = stackOut_76_0;
                                                break L29;
                                              } else {
                                                stackOut_75_0 = 1;
                                                stackIn_77_0 = stackOut_75_0;
                                                break L29;
                                              }
                                            }
                                            L30: {
                                              L31: {
                                                var11 = stackIn_77_0;
                                                var12 = ((long)var6 << 1160970720) - -(long)var7;
                                                var14 = null;
                                                if (var11 == 0) {
                                                  var14_ref = (pj) ((Object) this.field_h.b((byte) 124));
                                                  L32: while (true) {
                                                    if (var14_ref == null) {
                                                      break L31;
                                                    } else {
                                                      stackOut_87_0 = (var12 < var14_ref.field_j ? -1 : (var12 == var14_ref.field_j ? 0 : 1));
                                                      stackIn_95_0 = stackOut_87_0;
                                                      stackIn_88_0 = stackOut_87_0;
                                                      if (var16 != 0) {
                                                        break L30;
                                                      } else {
                                                        L33: {
                                                          if (stackIn_88_0 != 0) {
                                                            break L33;
                                                          } else {
                                                            if (var16 == 0) {
                                                              break L31;
                                                            } else {
                                                              break L33;
                                                            }
                                                          }
                                                        }
                                                        var14_ref = (pj) ((Object) this.field_h.a(119));
                                                        if (var16 == 0) {
                                                          continue L32;
                                                        } else {
                                                          break L31;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (pj) ((Object) this.field_n.b((byte) 127));
                                                  L34: while (true) {
                                                    if (var14_ref == null) {
                                                      break L31;
                                                    } else {
                                                      stackOut_80_0 = ((var12 ^ -1L) < (var14_ref.field_j ^ -1L) ? -1 : ((var12 ^ -1L) == (var14_ref.field_j ^ -1L) ? 0 : 1));
                                                      stackIn_95_0 = stackOut_80_0;
                                                      stackIn_81_0 = stackOut_80_0;
                                                      if (var16 != 0) {
                                                        break L30;
                                                      } else {
                                                        L35: {
                                                          if (stackIn_81_0 != 0) {
                                                            break L35;
                                                          } else {
                                                            if (var16 == 0) {
                                                              break L31;
                                                            } else {
                                                              break L35;
                                                            }
                                                          }
                                                        }
                                                        var14_ref = (pj) ((Object) this.field_n.a(83));
                                                        continue L34;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref != null) {
                                                this.field_e = var14_ref;
                                                stackOut_94_0 = var10;
                                                stackIn_95_0 = stackOut_94_0;
                                                break L30;
                                              } else {
                                                throw new IOException();
                                              }
                                            }
                                            L36: {
                                              if (stackIn_95_0 == 0) {
                                                stackOut_97_0 = 5;
                                                stackIn_98_0 = stackOut_97_0;
                                                break L36;
                                              } else {
                                                stackOut_96_0 = 9;
                                                stackIn_98_0 = stackOut_96_0;
                                                break L36;
                                              }
                                            }
                                            var15 = stackIn_98_0;
                                            this.field_e.field_B = new oa(var15 + (var9 + this.field_e.field_z));
                                            this.field_e.field_B.f(6389, var10);
                                            this.field_e.field_B.a(-112, var9);
                                            this.field_g.field_h = 0;
                                            this.field_e.field_C = 10;
                                            if (var16 == 0) {
                                              break L16;
                                            } else {
                                              break L28;
                                            }
                                          } else {
                                            break L28;
                                          }
                                        }
                                        L37: {
                                          if (0 != this.field_e.field_C) {
                                            break L37;
                                          } else {
                                            L38: {
                                              if ((this.field_g.field_g[0] ^ -1) == 0) {
                                                break L38;
                                              } else {
                                                this.field_e = null;
                                                if (var16 == 0) {
                                                  break L16;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                            }
                                            this.field_g.field_h = 0;
                                            this.field_e.field_C = 1;
                                            if (var16 == 0) {
                                              break L16;
                                            } else {
                                              break L37;
                                            }
                                          }
                                        }
                                        throw new IOException();
                                      }
                                    }
                                    var2_int++;
                                    if (var16 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_107_0 = 1;
                            stackIn_108_0 = stackOut_107_0;
                            break L11;
                          }
                          decompiledRegionSelector0 = 1;
                          break L4;
                        }
                      }
                    }
                  } else {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L39: {
                    this.field_x.a(true);
                    break L39;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L40: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L40;
                  }
                }
                this.field_p = this.field_p + 1;
                this.field_k = -2;
                this.field_x = null;
                if (this.a((byte) 87) == 0) {
                  if (this.e(-10236) != 0) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_108_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            pj var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            var6 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (this.field_x != null) {
                    try {
                      L2: {
                        this.field_x.a(true);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_x = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_x = (gj) (param1);
                this.a(false);
                this.a(3, param0);
                this.field_e = null;
                if (param2 == 20) {
                  this.field_g.field_h = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        L7: {
                          var4_ref3 = (pj) ((Object) this.field_h.d(-31914));
                          if (var4_ref3 != null) {
                            break L7;
                          } else {
                            if (var6 != 0) {
                              break L6;
                            } else {
                              if (var6 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        this.field_c.a((byte) -128, var4_ref3);
                        break L6;
                      }
                      if (var6 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                    L8: while (true) {
                      L9: {
                        L10: {
                          L11: {
                            var4_ref3 = (pj) ((Object) this.field_n.d(param2 + -31934));
                            if (var4_ref3 != null) {
                              break L11;
                            } else {
                              if (var6 != 0) {
                                break L10;
                              } else {
                                if (var6 == 0) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          this.field_a.a((byte) -128, var4_ref3);
                          break L10;
                        }
                        if (var6 == 0) {
                          continue L8;
                        } else {
                          break L9;
                        }
                      }
                      L12: {
                        if (this.field_m != 0) {
                          try {
                            L13: {
                              this.field_i.field_h = 0;
                              this.field_i.f(6389, 4);
                              this.field_i.f(6389, (int) this.field_m);
                              this.field_i.a(-122, 0);
                              this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
                              break L13;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L14: {
                              var4_ref = (IOException) (Object) decompiledCaughtException;
                              try {
                                L15: {
                                  this.field_x.a(true);
                                  break L15;
                                }
                              } catch (java.lang.Exception decompiledCaughtParameter2) {
                                decompiledCaughtException = decompiledCaughtParameter2;
                                L16: {
                                  var5 = (Exception) (Object) decompiledCaughtException;
                                  break L16;
                                }
                              }
                              this.field_p = this.field_p + 1;
                              this.field_k = -2;
                              this.field_x = null;
                              break L14;
                            }
                          }
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      this.field_b = 0;
                      this.field_l = lk.a(param2 + -20);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L17: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_34_0 = (RuntimeException) (var4_ref2);
                stackOut_34_1 = new StringBuilder().append("tj.D(").append(param0).append(',');
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                if (param1 == null) {
                  stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackOut_36_2 = "null";
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  stackIn_37_2 = stackOut_36_2;
                  break L17;
                } else {
                  stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
                  stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
                  stackOut_35_2 = "{...}";
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_37_2 = stackOut_35_2;
                  break L17;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void d(int param0) {
        try {
            this.field_x.a(true);
            int var2_int = 19 % ((81 - param0) / 34);
        } catch (Exception exception) {
        }
        this.field_k = -1;
        this.field_x = null;
        this.field_p = this.field_p + 1;
        this.field_m = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            oa stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            oa stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            oa stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            Throwable decompiledCaughtException = null;
            oa stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            oa stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            oa stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            if (this.field_x != null) {
              try {
                L0: {
                  L1: {
                    if (param0 == 3) {
                      break L1;
                    } else {
                      this.a(-2, false);
                      break L1;
                    }
                  }
                  L2: {
                    this.field_i.field_h = 0;
                    stackOut_4_0 = this.field_i;
                    stackOut_4_1 = 6389;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (param1) {
                      stackOut_6_0 = (oa) ((Object) stackIn_6_0);
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = 2;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      break L2;
                    } else {
                      stackOut_5_0 = (oa) ((Object) stackIn_5_0);
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 3;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      break L2;
                    }
                  }
                  ((oa) (Object) stackIn_7_0).f(stackIn_7_1, stackIn_7_2);
                  this.field_i.a(0L, true);
                  this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_x.a(true);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_p = this.field_p + 1;
                  this.field_k = -2;
                  this.field_x = null;
                  break L3;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            gj stackIn_9_0 = null;
            gj stackIn_10_0 = null;
            gj stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            Throwable decompiledCaughtException = null;
            gj stackOut_8_0 = null;
            gj stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            gj stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            L0: {
              if (!param0) {
                break L0;
              } else {
                this.a(-105);
                break L0;
              }
            }
            if (this.field_x == null) {
              return;
            } else {
              try {
                L1: {
                  this.field_i.field_h = 0;
                  this.field_i.f(6389, 6);
                  this.field_i.i(3, 45);
                  this.field_i.c(0, -159688920);
                  this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
                  break L1;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      L4: {
                        stackOut_8_0 = this.field_x;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (param0) {
                          stackOut_10_0 = (gj) ((Object) stackIn_10_0);
                          stackOut_10_1 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          break L4;
                        } else {
                          stackOut_9_0 = (gj) ((Object) stackIn_9_0);
                          stackOut_9_1 = 1;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          break L4;
                        }
                      }
                      ((gj) (Object) stackIn_11_0).a(stackIn_11_1 != 0);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_x = null;
                  this.field_p = this.field_p + 1;
                  this.field_k = -2;
                  break L2;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        if (!(null == this.field_x)) {
            this.field_x.a(true);
        }
        if (param0 != -2025316960) {
            field_A = (String) null;
        }
    }

    public tj() {
    }

    public static void d(byte param0) {
        field_z = null;
        field_w = null;
        field_v = null;
        int var1 = 109 % ((49 - param0) / 45);
        field_t = null;
        field_A = null;
        field_s = null;
    }

    static {
        field_w = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_t = "Create a free account to start using this feature";
        field_z = "Submit for ";
        field_A = "Please enter your age in years";
        field_v = null;
    }
}
