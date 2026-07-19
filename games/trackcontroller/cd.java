/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    private int field_k;
    private int field_l;
    int field_e;
    private int field_m;
    boolean field_a;
    static ja field_h;
    static qj field_c;
    static int field_b;
    private int field_d;
    private int field_f;
    int field_i;
    static boolean field_j;
    static int field_g;

    final boolean d(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          if (0 == this.field_d) {
            if (84 != this.field_f) {
              if (-84 == (this.field_f ^ -1)) {
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
          this.a(104, 14, true, 13);
          if (0 == this.field_d) {
            if (84 == this.field_f) {
              return true;
            } else {
              L0: {
                if (-84 != (this.field_f ^ -1)) {
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

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        int discarded$2 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = this.a(param1, fg.field_a, param4, -85, param0, param2, kf.field_b);
        var7 = this.a(param1, wg.field_e, param4, -85, param0, param2, db.field_X);
        if (param3) {
          discarded$2 = this.a(-49, 68, -96, -111, -56, 63, 114);
          this.a(-126, var6, var7);
          return;
        } else {
          this.a(-126, var6, var7);
          return;
        }
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            this.b((byte) -61);
            if ((this.field_f ^ -1) != -103) {
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
            if ((this.field_f ^ -1) != -103) {
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

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            this.field_d = 58;
            if (this.field_l == 0) {
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
            if (this.field_l == 0) {
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

    final void a(byte param0) {
        this.field_f = 0;
        this.field_m = 0;
        this.field_d = 0;
        if (0 != this.field_l) {
          if (param0 >= 10) {
            L0: {
              if (0 != this.field_l) {
                break L0;
              } else {
                if (kg.field_d == 96) {
                  L1: {
                    if (this.field_e <= 0) {
                      this.field_e = this.field_i;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  this.field_a = false;
                  this.field_e = this.field_e - 1;
                  break L0;
                } else {
                  if (0 == this.field_l) {
                    if (-98 == (kg.field_d ^ -1)) {
                      this.field_e = this.field_e + 1;
                      this.field_a = false;
                      if (this.field_e >= this.field_i) {
                        this.field_e = 0;
                        return;
                      } else {
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
            if (0 == this.field_l) {
              if (-98 == (kg.field_d ^ -1)) {
                this.field_e = this.field_e + 1;
                this.field_a = false;
                if (this.field_e < this.field_i) {
                  return;
                } else {
                  this.field_e = 0;
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
          this.field_f = kg.field_d;
          if (param0 >= 10) {
            if (0 == this.field_l) {
              L2: {
                if (kg.field_d == 96) {
                  L3: {
                    if (this.field_e <= 0) {
                      this.field_e = this.field_i;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  this.field_a = false;
                  this.field_e = this.field_e - 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (0 == this.field_l) {
                if (-98 == (kg.field_d ^ -1)) {
                  this.field_e = this.field_e + 1;
                  this.field_a = false;
                  if (this.field_e >= this.field_i) {
                    this.field_e = 0;
                    return;
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
              if (0 == this.field_l) {
                if (-98 == (kg.field_d ^ -1)) {
                  this.field_e = this.field_e + 1;
                  this.field_a = false;
                  if (this.field_e >= this.field_i) {
                    this.field_e = 0;
                    return;
                  } else {
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

    final void b(byte param0) {
        if (param0 <= -52) {
          this.field_m = 0;
          this.field_d = 0;
          this.field_f = 0;
          if (this.field_l == 0) {
            this.field_f = kg.field_d;
            if (0 == this.field_l) {
              if (kg.field_d != 98) {
                L0: {
                  if (this.field_l != 0) {
                    break L0;
                  } else {
                    if (99 != kg.field_d) {
                      break L0;
                    } else {
                      L1: {
                        this.field_e = this.field_e + 1;
                        if (this.field_e >= this.field_i) {
                          this.field_e = 0;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      this.field_a = false;
                      break L0;
                    }
                  }
                }
                return;
              } else {
                L2: {
                  if ((this.field_e ^ -1) >= -1) {
                    this.field_e = this.field_i;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  this.field_a = false;
                  this.field_e = this.field_e - 1;
                  if (this.field_l != 0) {
                    break L3;
                  } else {
                    if (99 != kg.field_d) {
                      break L3;
                    } else {
                      L4: {
                        this.field_e = this.field_e + 1;
                        if (this.field_e >= this.field_i) {
                          this.field_e = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      this.field_a = false;
                      break L3;
                    }
                  }
                }
                return;
              }
            } else {
              if (this.field_l == 0) {
                if (99 != kg.field_d) {
                  return;
                } else {
                  L5: {
                    this.field_e = this.field_e + 1;
                    if (this.field_e >= this.field_i) {
                      this.field_e = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  this.field_a = false;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L6: {
              if (0 != this.field_l) {
                break L6;
              } else {
                if (kg.field_d != 98) {
                  break L6;
                } else {
                  L7: {
                    if ((this.field_e ^ -1) >= -1) {
                      this.field_e = this.field_i;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_a = false;
                  this.field_e = this.field_e - 1;
                  break L6;
                }
              }
            }
            L8: {
              if (this.field_l != 0) {
                break L8;
              } else {
                if (99 != kg.field_d) {
                  break L8;
                } else {
                  L9: {
                    this.field_e = this.field_e + 1;
                    if (this.field_e >= this.field_i) {
                      this.field_e = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  this.field_a = false;
                  break L8;
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(int param0) {
        int var2 = 52 % ((31 - param0) / 56);
        return -104 == (this.field_f ^ -1) ? true : false;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
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
          this.field_l = 0;
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
        ((cd) (this)).field_a = stackIn_3_1 != 0;
        if (param3 >= 96) {
          if (this.field_a) {
            this.field_e = param1;
            return;
          } else {
            this.field_e = param0;
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            this.field_a = false;
            if ((this.field_f ^ -1) != -98) {
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
            if ((this.field_f ^ -1) != -98) {
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

    public static void c(int param0) {
        field_c = null;
        field_h = null;
        if (param0 != 11352) {
            field_g = -51;
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$24 = false;
        boolean discarded$25 = false;
        boolean discarded$26 = false;
        boolean discarded$27 = false;
        boolean discarded$28 = false;
        boolean discarded$29 = false;
        boolean discarded$30 = false;
        boolean discarded$31 = false;
        boolean discarded$32 = false;
        boolean discarded$33 = false;
        boolean discarded$34 = false;
        boolean discarded$35 = false;
        boolean discarded$36 = false;
        boolean discarded$37 = false;
        boolean discarded$38 = false;
        boolean discarded$39 = false;
        boolean discarded$40 = false;
        boolean discarded$41 = false;
        boolean discarded$42 = false;
        boolean discarded$43 = false;
        boolean discarded$44 = false;
        boolean discarded$45 = false;
        boolean discarded$46 = false;
        boolean discarded$47 = false;
        if (this.field_i <= param1) {
          throw new IllegalArgumentException();
        } else {
          if (param2 < this.field_i) {
            L0: {
              this.field_m = 0;
              this.field_f = 0;
              this.field_d = 0;
              if (uk.field_a != 0) {
                this.field_e = param2;
                this.field_k = qk.field_N;
                this.field_l = uk.field_a;
                this.field_a = true;
                this.field_m = uk.field_a;
                this.field_d = uk.field_a;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_l != 0) {
              if (-1 != (rj.field_a ^ -1)) {
                L1: {
                  if (0 >= this.field_k) {
                    this.field_m = this.field_l;
                    this.field_k = f.field_a;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  this.field_k = this.field_k - 1;
                  if (uk.field_a != 0) {
                    break L2;
                  } else {
                    if (rj.field_a == 0) {
                      this.field_l = 0;
                      break L2;
                    } else {
                      L3: {
                        if (0 != this.field_l) {
                          break L3;
                        } else {
                          L4: {
                            if (this.field_a) {
                              break L4;
                            } else {
                              if (!mg.field_a) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (0 <= param1) {
                            if (this.field_e == param1) {
                              this.field_e = param1;
                              this.field_a = true;
                              break L3;
                            } else {
                              this.field_e = param1;
                              this.field_a = true;
                              break L3;
                            }
                          } else {
                            if (!this.field_a) {
                              break L3;
                            } else {
                              this.field_e = -1;
                              break L3;
                            }
                          }
                        }
                      }
                      L5: {
                        if (param0 < -117) {
                          break L5;
                        } else {
                          discarded$24 = this.a(true);
                          break L5;
                        }
                      }
                      return;
                    }
                  }
                }
                if (0 == this.field_l) {
                  if (this.field_a) {
                    if (0 <= param1) {
                      if (this.field_e == param1) {
                        this.field_e = param1;
                        this.field_a = true;
                        if (param0 < -117) {
                          return;
                        } else {
                          discarded$25 = this.a(true);
                          return;
                        }
                      } else {
                        this.field_e = param1;
                        this.field_a = true;
                        if (param0 < -117) {
                          return;
                        } else {
                          discarded$26 = this.a(true);
                          return;
                        }
                      }
                    } else {
                      if (!this.field_a) {
                        if (param0 < -117) {
                          return;
                        } else {
                          discarded$27 = this.a(true);
                          return;
                        }
                      } else {
                        this.field_e = -1;
                        if (param0 < -117) {
                          return;
                        } else {
                          discarded$28 = this.a(true);
                          return;
                        }
                      }
                    }
                  } else {
                    if (mg.field_a) {
                      if (0 <= param1) {
                        if (this.field_e == param1) {
                          L6: {
                            this.field_e = param1;
                            this.field_a = true;
                            if (param0 < -117) {
                              break L6;
                            } else {
                              discarded$29 = this.a(true);
                              break L6;
                            }
                          }
                          return;
                        } else {
                          L7: {
                            this.field_e = param1;
                            this.field_a = true;
                            if (param0 < -117) {
                              break L7;
                            } else {
                              discarded$30 = this.a(true);
                              break L7;
                            }
                          }
                          return;
                        }
                      } else {
                        L8: {
                          if (!this.field_a) {
                            break L8;
                          } else {
                            this.field_e = -1;
                            break L8;
                          }
                        }
                        if (param0 >= -117) {
                          discarded$31 = this.a(true);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (param0 >= -117) {
                        discarded$32 = this.a(true);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (param0 >= -117) {
                    discarded$33 = this.a(true);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L9: {
                  if (uk.field_a != 0) {
                    break L9;
                  } else {
                    if (rj.field_a == 0) {
                      this.field_l = 0;
                      break L9;
                    } else {
                      L10: {
                        if (0 != this.field_l) {
                          break L10;
                        } else {
                          L11: {
                            if (this.field_a) {
                              break L11;
                            } else {
                              if (!mg.field_a) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (0 <= param1) {
                            if (this.field_e == param1) {
                              this.field_e = param1;
                              this.field_a = true;
                              break L10;
                            } else {
                              this.field_e = param1;
                              this.field_a = true;
                              break L10;
                            }
                          } else {
                            if (!this.field_a) {
                              break L10;
                            } else {
                              this.field_e = -1;
                              break L10;
                            }
                          }
                        }
                      }
                      L12: {
                        if (param0 < -117) {
                          break L12;
                        } else {
                          discarded$34 = this.a(true);
                          break L12;
                        }
                      }
                      return;
                    }
                  }
                }
                if (0 == this.field_l) {
                  if (this.field_a) {
                    if (0 <= param1) {
                      if (this.field_e == param1) {
                        L13: {
                          this.field_e = param1;
                          this.field_a = true;
                          if (param0 < -117) {
                            break L13;
                          } else {
                            discarded$35 = this.a(true);
                            break L13;
                          }
                        }
                        return;
                      } else {
                        L14: {
                          this.field_e = param1;
                          this.field_a = true;
                          if (param0 < -117) {
                            break L14;
                          } else {
                            discarded$36 = this.a(true);
                            break L14;
                          }
                        }
                        return;
                      }
                    } else {
                      if (!this.field_a) {
                        if (param0 >= -117) {
                          discarded$37 = this.a(true);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L15: {
                          this.field_e = -1;
                          if (param0 < -117) {
                            break L15;
                          } else {
                            discarded$38 = this.a(true);
                            break L15;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    if (!mg.field_a) {
                      if (param0 >= -117) {
                        discarded$39 = this.a(true);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L16: {
                        if (0 <= param1) {
                          if (this.field_e == param1) {
                            this.field_e = param1;
                            this.field_a = true;
                            break L16;
                          } else {
                            this.field_e = param1;
                            this.field_a = true;
                            break L16;
                          }
                        } else {
                          if (!this.field_a) {
                            break L16;
                          } else {
                            this.field_e = -1;
                            break L16;
                          }
                        }
                      }
                      L17: {
                        if (param0 < -117) {
                          break L17;
                        } else {
                          discarded$40 = this.a(true);
                          break L17;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  if (param0 >= -117) {
                    discarded$41 = this.a(true);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L18: {
                if (uk.field_a != 0) {
                  break L18;
                } else {
                  if (rj.field_a == 0) {
                    this.field_l = 0;
                    break L18;
                  } else {
                    L19: {
                      if (0 != this.field_l) {
                        break L19;
                      } else {
                        L20: {
                          if (this.field_a) {
                            break L20;
                          } else {
                            if (!mg.field_a) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        if (0 <= param1) {
                          if (this.field_e == param1) {
                            this.field_e = param1;
                            this.field_a = true;
                            break L19;
                          } else {
                            this.field_e = param1;
                            this.field_a = true;
                            break L19;
                          }
                        } else {
                          if (!this.field_a) {
                            break L19;
                          } else {
                            this.field_e = -1;
                            break L19;
                          }
                        }
                      }
                    }
                    L21: {
                      if (param0 < -117) {
                        break L21;
                      } else {
                        discarded$42 = this.a(true);
                        break L21;
                      }
                    }
                    return;
                  }
                }
              }
              L22: {
                if (0 != this.field_l) {
                  break L22;
                } else {
                  if (this.field_a) {
                    if (0 <= param1) {
                      if (this.field_e == param1) {
                        L23: {
                          this.field_e = param1;
                          this.field_a = true;
                          if (param0 < -117) {
                            break L23;
                          } else {
                            discarded$43 = this.a(true);
                            break L23;
                          }
                        }
                        return;
                      } else {
                        L24: {
                          this.field_e = param1;
                          this.field_a = true;
                          if (param0 < -117) {
                            break L24;
                          } else {
                            discarded$44 = this.a(true);
                            break L24;
                          }
                        }
                        return;
                      }
                    } else {
                      if (!this.field_a) {
                        break L22;
                      } else {
                        L25: {
                          this.field_e = -1;
                          if (param0 < -117) {
                            break L25;
                          } else {
                            discarded$45 = this.a(true);
                            break L25;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    if (!mg.field_a) {
                      break L22;
                    } else {
                      L26: {
                        if (0 <= param1) {
                          if (this.field_e == param1) {
                            this.field_e = param1;
                            this.field_a = true;
                            break L26;
                          } else {
                            this.field_e = param1;
                            this.field_a = true;
                            break L26;
                          }
                        } else {
                          if (!this.field_a) {
                            break L26;
                          } else {
                            this.field_e = -1;
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if (param0 < -117) {
                          break L27;
                        } else {
                          discarded$46 = this.a(true);
                          break L27;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (param0 >= -117) {
                discarded$47 = this.a(true);
                return;
              } else {
                return;
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    final void f(int param0) {
        this.field_f = 0;
        this.field_m = 0;
        this.field_d = param0;
        if (!(this.field_l != 0)) {
            this.field_f = kg.field_d;
        }
    }

    final void a(int param0, boolean param1, byte param2) {
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
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
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
        L1: {
          ((cd) (this)).field_a = stackIn_3_1 != 0;
          this.field_l = 0;
          if (this.field_a) {
            this.field_e = param0;
            break L1;
          } else {
            break L1;
          }
        }
        if (param2 < 75) {
          this.field_k = -27;
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param3 == -85) {
          if (param0 <= param6) {
            if (param6 < param2) {
              if (param4 <= param1) {
                if (param5 * this.field_i + param4 <= param1) {
                  return -1;
                } else {
                  return (param1 - param4) / param5;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          this.field_l = -109;
          if (param0 <= param6) {
            if (param6 < param2) {
              if (param4 <= param1) {
                if (param5 * this.field_i + param4 <= param1) {
                  return -1;
                } else {
                  return (param1 - param4) / param5;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
          if (-1 == (this.field_m ^ -1)) {
            if ((this.field_f ^ -1) != -85) {
              if (this.field_f == 83) {
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
          return false;
        }
    }

    final boolean c(byte param0) {
        boolean discarded$10 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 11) {
          L0: {
            discarded$10 = this.c((byte) 69);
            if (96 != this.field_f) {
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
            if (96 != this.field_f) {
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

    cd(int param0) {
        this.field_e = 0;
        this.field_a = false;
        this.field_i = param0;
    }

    static {
        field_h = new ja();
        field_g = 0;
        field_j = false;
    }
}
