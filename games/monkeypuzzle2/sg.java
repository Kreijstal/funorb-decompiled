/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    int field_a;
    static String field_h;
    private int field_g;
    private int field_c;
    private int field_d;
    int field_i;
    private int field_e;
    boolean field_b;
    private int field_f;

    final static void a(String param0, byte param1) {
        boolean discarded$0 = false;
        try {
            if (param1 != -120) {
                String var3 = (String) null;
                discarded$0 = sg.a((String) null, false);
            }
            ld.a(param0, (byte) -13);
            vi.a(k.field_k, 12345, false);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "sg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(byte param0) {
        this.field_d = 0;
        if (param0 >= 60) {
          this.field_g = 0;
          this.field_c = 0;
          if (0 == this.field_f) {
            this.field_g = oa.field_H;
            return;
          } else {
            return;
          }
        } else {
          this.field_a = -93;
          this.field_g = 0;
          this.field_c = 0;
          if (0 != this.field_f) {
            return;
          } else {
            this.field_g = oa.field_H;
            return;
          }
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0 / ((param1 - 25) / 40);
        if (!(this.field_f != 0)) {
            this.field_b = false;
            this.field_a = param0;
        }
    }

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 10) {
          L0: {
            this.e(-63);
            if (0 == this.field_f) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (0 == this.field_f) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean f(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            this.a(-79, -5, -113, false);
            if (96 != this.field_g) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (96 != this.field_g) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
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
          this.field_f = param2;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
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
        ((sg) (this)).field_b = stackIn_3_1 != 0;
        if (this.field_b) {
          this.field_a = param1;
          if (MonkeyPuzzle2.field_F) {
            this.field_a = param0;
            return;
          } else {
            return;
          }
        } else {
          this.field_a = param0;
          return;
        }
    }

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 25149) {
          L0: {
            this.a(-106, -108, false);
            if (this.field_g != 97) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_g != 97) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        int var4 = -19 / ((-92 - param2) / 34);
        return ec.a(1);
    }

    final void e(int param0) {
        L0: {
          this.field_g = 0;
          this.field_c = 0;
          this.field_d = 0;
          if (this.field_f == 0) {
            this.field_g = oa.field_H;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == this.field_f) {
          if (-99 == (oa.field_H ^ -1)) {
            if (0 < this.field_a) {
              L1: {
                this.field_b = false;
                this.field_a = this.field_a - 1;
                if (this.field_f != 0) {
                  break L1;
                } else {
                  if (-100 != (oa.field_H ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      this.field_a = this.field_a + 1;
                      if (this.field_i <= this.field_a) {
                        this.field_a = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    this.field_b = false;
                    break L1;
                  }
                }
              }
              return;
            } else {
              this.field_a = this.field_i;
              L3: {
                this.field_b = false;
                this.field_a = this.field_a - 1;
                if (this.field_f != 0) {
                  break L3;
                } else {
                  if (-100 != (oa.field_H ^ -1)) {
                    break L3;
                  } else {
                    L4: {
                      this.field_a = this.field_a + 1;
                      if (this.field_i <= this.field_a) {
                        this.field_a = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    this.field_b = false;
                    break L3;
                  }
                }
              }
              return;
            }
          } else {
            L5: {
              if (this.field_f != 0) {
                break L5;
              } else {
                if (-100 != (oa.field_H ^ -1)) {
                  break L5;
                } else {
                  L6: {
                    this.field_a = this.field_a + 1;
                    if (this.field_i <= this.field_a) {
                      this.field_a = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  this.field_b = false;
                  break L5;
                }
              }
            }
            return;
          }
        } else {
          if (this.field_f == 0) {
            if (-100 != (oa.field_H ^ -1)) {
              return;
            } else {
              L7: {
                this.field_a = this.field_a + 1;
                if (this.field_i <= this.field_a) {
                  this.field_a = 0;
                  break L7;
                } else {
                  break L7;
                }
              }
              this.field_b = false;
              return;
            }
          } else {
            return;
          }
        }
    }

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 102) {
          L0: {
            this.field_d = 74;
            if (this.field_g != 102) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_g != 102) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean c(byte param0) {
        String var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 <= -76) {
          if (this.field_d == 0) {
            if (84 != this.field_g) {
              if (-84 == (this.field_g ^ -1)) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var3 = (String) null;
          sg.a((String) null, (byte) 84);
          if (this.field_d == 0) {
            if (84 == this.field_g) {
              return true;
            } else {
              L0: {
                if (-84 != (this.field_g ^ -1)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final void a(byte param0, int param1, boolean param2) {
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
          this.field_f = 0;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param2) {
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
        ((sg) (this)).field_b = stackIn_3_1 != 0;
        if (param0 != 60) {
          L1: {
            field_h = (String) null;
            if (this.field_b) {
              this.field_a = param1;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (this.field_b) {
              this.field_a = param1;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        boolean discarded$1 = false;
        if (this.field_i <= param0) {
          throw new IllegalArgumentException();
        } else {
          if (param1 >= this.field_i) {
            throw new IllegalArgumentException();
          } else {
            this.field_g = 0;
            if (!param2) {
              L0: {
                discarded$1 = this.d(47);
                this.field_d = 0;
                this.field_c = 0;
                if (-1 != (kc.field_d ^ -1)) {
                  this.field_e = kb.field_b;
                  this.field_f = kc.field_d;
                  this.field_b = true;
                  this.field_c = kc.field_d;
                  this.field_d = kc.field_d;
                  this.field_a = param1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (-1 != (this.field_f ^ -1)) {
                if (ni.field_a != 0) {
                  if ((this.field_e ^ -1) < -1) {
                    L1: {
                      this.field_e = this.field_e - 1;
                      if (kc.field_d != 0) {
                        break L1;
                      } else {
                        if (ni.field_a == 0) {
                          this.field_f = 0;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    L2: {
                      if (this.field_f != 0) {
                        break L2;
                      } else {
                        L3: {
                          if (this.field_b) {
                            break L3;
                          } else {
                            if (!oe.field_d) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L4: {
                          if (0 > param0) {
                            break L4;
                          } else {
                            L5: {
                              if (param0 == this.field_a) {
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            this.field_a = param0;
                            this.field_b = true;
                            if (!MonkeyPuzzle2.field_F) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (!this.field_b) {
                          break L2;
                        } else {
                          this.field_a = -1;
                          break L2;
                        }
                      }
                    }
                    return;
                  } else {
                    this.field_e = aj.field_f;
                    this.field_c = this.field_f;
                    this.field_e = this.field_e - 1;
                    if (kc.field_d == 0) {
                      L6: {
                        if (ni.field_a == 0) {
                          this.field_f = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (this.field_f == 0) {
                        L7: {
                          L8: {
                            if (this.field_b) {
                              break L8;
                            } else {
                              if (!oe.field_d) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (0 > param0) {
                              break L9;
                            } else {
                              L10: {
                                if (param0 == this.field_a) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              this.field_a = param0;
                              this.field_b = true;
                              if (!MonkeyPuzzle2.field_F) {
                                break L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (!this.field_b) {
                            break L7;
                          } else {
                            this.field_a = -1;
                            break L7;
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L11: {
                        if (this.field_f != 0) {
                          break L11;
                        } else {
                          L12: {
                            if (this.field_b) {
                              break L12;
                            } else {
                              if (!oe.field_d) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            if (0 > param0) {
                              break L13;
                            } else {
                              L14: {
                                if (param0 == this.field_a) {
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              this.field_a = param0;
                              this.field_b = true;
                              if (!MonkeyPuzzle2.field_F) {
                                break L11;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (!this.field_b) {
                            break L11;
                          } else {
                            this.field_a = -1;
                            break L11;
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L15: {
                    if (kc.field_d != 0) {
                      break L15;
                    } else {
                      if (ni.field_a == 0) {
                        this.field_f = 0;
                        break L15;
                      } else {
                        if (this.field_f == 0) {
                          if (this.field_b) {
                            L16: {
                              if (0 > param0) {
                                break L16;
                              } else {
                                if (param0 == this.field_a) {
                                  this.field_a = param0;
                                  this.field_b = true;
                                  if (MonkeyPuzzle2.field_F) {
                                    break L16;
                                  } else {
                                    return;
                                  }
                                } else {
                                  this.field_a = param0;
                                  this.field_b = true;
                                  if (MonkeyPuzzle2.field_F) {
                                    if (this.field_b) {
                                      this.field_a = -1;
                                      return;
                                    } else {
                                      return;
                                    }
                                  } else {
                                    return;
                                  }
                                }
                              }
                            }
                            if (!this.field_b) {
                              return;
                            } else {
                              this.field_a = -1;
                              return;
                            }
                          } else {
                            if (!oe.field_d) {
                              return;
                            } else {
                              L17: {
                                L18: {
                                  if (0 > param0) {
                                    break L18;
                                  } else {
                                    L19: {
                                      if (param0 == this.field_a) {
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    this.field_a = param0;
                                    this.field_b = true;
                                    if (!MonkeyPuzzle2.field_F) {
                                      break L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                if (!this.field_b) {
                                  break L17;
                                } else {
                                  this.field_a = -1;
                                  break L17;
                                }
                              }
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L20: {
                    if (this.field_f != 0) {
                      break L20;
                    } else {
                      if (this.field_b) {
                        L21: {
                          if (0 > param0) {
                            break L21;
                          } else {
                            if (param0 == this.field_a) {
                              this.field_a = param0;
                              this.field_b = true;
                              if (!MonkeyPuzzle2.field_F) {
                                break L20;
                              } else {
                                break L21;
                              }
                            } else {
                              L22: {
                                this.field_a = param0;
                                this.field_b = true;
                                if (!MonkeyPuzzle2.field_F) {
                                  break L22;
                                } else {
                                  if (!this.field_b) {
                                    break L22;
                                  } else {
                                    this.field_a = -1;
                                    return;
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                        if (!this.field_b) {
                          break L20;
                        } else {
                          this.field_a = -1;
                          return;
                        }
                      } else {
                        if (!oe.field_d) {
                          break L20;
                        } else {
                          L23: {
                            L24: {
                              if (0 > param0) {
                                break L24;
                              } else {
                                if (param0 == this.field_a) {
                                  this.field_a = param0;
                                  this.field_b = true;
                                  if (!MonkeyPuzzle2.field_F) {
                                    break L23;
                                  } else {
                                    break L24;
                                  }
                                } else {
                                  L25: {
                                    this.field_a = param0;
                                    this.field_b = true;
                                    if (!MonkeyPuzzle2.field_F) {
                                      break L25;
                                    } else {
                                      if (!this.field_b) {
                                        break L25;
                                      } else {
                                        this.field_a = -1;
                                        return;
                                      }
                                    }
                                  }
                                  return;
                                }
                              }
                            }
                            if (!this.field_b) {
                              break L23;
                            } else {
                              this.field_a = -1;
                              return;
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L26: {
                  if (kc.field_d != 0) {
                    break L26;
                  } else {
                    if (ni.field_a == 0) {
                      this.field_f = 0;
                      break L26;
                    } else {
                      L27: {
                        if (this.field_f != 0) {
                          break L27;
                        } else {
                          L28: {
                            if (this.field_b) {
                              break L28;
                            } else {
                              if (!oe.field_d) {
                                break L27;
                              } else {
                                break L28;
                              }
                            }
                          }
                          L29: {
                            if (0 > param0) {
                              break L29;
                            } else {
                              L30: {
                                if (param0 == this.field_a) {
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              this.field_a = param0;
                              this.field_b = true;
                              if (!MonkeyPuzzle2.field_F) {
                                break L27;
                              } else {
                                break L29;
                              }
                            }
                          }
                          if (!this.field_b) {
                            break L27;
                          } else {
                            this.field_a = -1;
                            break L27;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (this.field_f == 0) {
                  if (this.field_b) {
                    L31: {
                      if (0 > param0) {
                        break L31;
                      } else {
                        if (param0 == this.field_a) {
                          this.field_a = param0;
                          this.field_b = true;
                          if (MonkeyPuzzle2.field_F) {
                            break L31;
                          } else {
                            return;
                          }
                        } else {
                          L32: {
                            this.field_a = param0;
                            this.field_b = true;
                            if (!MonkeyPuzzle2.field_F) {
                              break L32;
                            } else {
                              if (!this.field_b) {
                                break L32;
                              } else {
                                this.field_a = -1;
                                break L32;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (this.field_b) {
                      this.field_a = -1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (oe.field_d) {
                      L33: {
                        L34: {
                          if (0 > param0) {
                            break L34;
                          } else {
                            L35: {
                              if (param0 == this.field_a) {
                                break L35;
                              } else {
                                break L35;
                              }
                            }
                            this.field_a = param0;
                            this.field_b = true;
                            if (!MonkeyPuzzle2.field_F) {
                              break L33;
                            } else {
                              break L34;
                            }
                          }
                        }
                        if (!this.field_b) {
                          break L33;
                        } else {
                          this.field_a = -1;
                          break L33;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              L36: {
                this.field_d = 0;
                this.field_c = 0;
                if (-1 != (kc.field_d ^ -1)) {
                  this.field_e = kb.field_b;
                  this.field_f = kc.field_d;
                  this.field_b = true;
                  this.field_c = kc.field_d;
                  this.field_d = kc.field_d;
                  this.field_a = param1;
                  break L36;
                } else {
                  break L36;
                }
              }
              L37: {
                if (-1 == (this.field_f ^ -1)) {
                  break L37;
                } else {
                  if (ni.field_a != 0) {
                    if ((this.field_e ^ -1) < -1) {
                      L38: {
                        this.field_e = this.field_e - 1;
                        if (kc.field_d != 0) {
                          break L38;
                        } else {
                          if (ni.field_a == 0) {
                            this.field_f = 0;
                            break L38;
                          } else {
                            break L38;
                          }
                        }
                      }
                      L39: {
                        if (this.field_f != 0) {
                          break L39;
                        } else {
                          L40: {
                            if (this.field_b) {
                              break L40;
                            } else {
                              if (!oe.field_d) {
                                break L39;
                              } else {
                                break L40;
                              }
                            }
                          }
                          L41: {
                            if (0 > param0) {
                              break L41;
                            } else {
                              L42: {
                                if (param0 == this.field_a) {
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                              this.field_a = param0;
                              this.field_b = true;
                              if (!MonkeyPuzzle2.field_F) {
                                break L39;
                              } else {
                                break L41;
                              }
                            }
                          }
                          if (!this.field_b) {
                            break L39;
                          } else {
                            this.field_a = -1;
                            break L39;
                          }
                        }
                      }
                      return;
                    } else {
                      this.field_e = aj.field_f;
                      this.field_c = this.field_f;
                      L43: {
                        this.field_e = this.field_e - 1;
                        if (kc.field_d != 0) {
                          break L43;
                        } else {
                          if (ni.field_a == 0) {
                            this.field_f = 0;
                            break L43;
                          } else {
                            break L43;
                          }
                        }
                      }
                      L44: {
                        if (this.field_f != 0) {
                          break L44;
                        } else {
                          L45: {
                            if (this.field_b) {
                              break L45;
                            } else {
                              if (!oe.field_d) {
                                break L44;
                              } else {
                                break L45;
                              }
                            }
                          }
                          L46: {
                            if (0 > param0) {
                              break L46;
                            } else {
                              L47: {
                                if (param0 == this.field_a) {
                                  break L47;
                                } else {
                                  break L47;
                                }
                              }
                              this.field_a = param0;
                              this.field_b = true;
                              if (!MonkeyPuzzle2.field_F) {
                                break L44;
                              } else {
                                break L46;
                              }
                            }
                          }
                          if (!this.field_b) {
                            break L44;
                          } else {
                            this.field_a = -1;
                            break L44;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    break L37;
                  }
                }
              }
              L48: {
                if (kc.field_d != 0) {
                  break L48;
                } else {
                  if (ni.field_a == 0) {
                    this.field_f = 0;
                    break L48;
                  } else {
                    L49: {
                      if (this.field_f != 0) {
                        break L49;
                      } else {
                        L50: {
                          if (this.field_b) {
                            break L50;
                          } else {
                            if (!oe.field_d) {
                              break L49;
                            } else {
                              break L50;
                            }
                          }
                        }
                        L51: {
                          if (0 > param0) {
                            break L51;
                          } else {
                            L52: {
                              if (param0 == this.field_a) {
                                break L52;
                              } else {
                                break L52;
                              }
                            }
                            this.field_a = param0;
                            this.field_b = true;
                            if (!MonkeyPuzzle2.field_F) {
                              break L49;
                            } else {
                              break L51;
                            }
                          }
                        }
                        if (!this.field_b) {
                          break L49;
                        } else {
                          this.field_a = -1;
                          break L49;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (this.field_f == 0) {
                if (this.field_b) {
                  L53: {
                    if (0 > param0) {
                      break L53;
                    } else {
                      if (param0 == this.field_a) {
                        this.field_a = param0;
                        this.field_b = true;
                        if (MonkeyPuzzle2.field_F) {
                          break L53;
                        } else {
                          return;
                        }
                      } else {
                        L54: {
                          this.field_a = param0;
                          this.field_b = true;
                          if (!MonkeyPuzzle2.field_F) {
                            break L54;
                          } else {
                            if (!this.field_b) {
                              break L54;
                            } else {
                              this.field_a = -1;
                              break L54;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (this.field_b) {
                    this.field_a = -1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (oe.field_d) {
                    L55: {
                      L56: {
                        if (0 > param0) {
                          break L56;
                        } else {
                          L57: {
                            if (param0 == this.field_a) {
                              break L57;
                            } else {
                              break L57;
                            }
                          }
                          this.field_a = param0;
                          this.field_b = true;
                          if (!MonkeyPuzzle2.field_F) {
                            break L55;
                          } else {
                            break L56;
                          }
                        }
                      }
                      if (!this.field_b) {
                        break L55;
                      } else {
                        this.field_a = -1;
                        break L55;
                      }
                    }
                    return;
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
    }

    public static void a(int param0) {
        if (param0 != 27303) {
            return;
        }
        field_h = null;
    }

    final boolean g(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          if (-1 == (this.field_c ^ -1)) {
            if (84 != this.field_g) {
              if (83 == this.field_g) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_h = (String) null;
          if (-1 == (this.field_c ^ -1)) {
            if (84 == this.field_g) {
              return true;
            } else {
              L0: {
                if (83 != this.field_g) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final static boolean a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        char stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.charAt(0);
            if (!param1) {
              var3 = 1;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 >= param0.length()) {
                      break L3;
                    } else {
                      stackOut_6_0 = param0.charAt(var3);
                      stackIn_12_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (stackIn_7_0 == var2_int) {
                          var3++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          stackOut_8_0 = 0;
                          stackIn_9_0 = stackOut_8_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("sg.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -29996) {
          L0: {
            this.field_b = true;
            if (103 != this.field_g) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (103 != this.field_g) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    sg(int param0) {
        this.field_a = 0;
        this.field_b = false;
        this.field_i = param0;
    }

    static {
        field_h = "Connection restored.";
    }
}
