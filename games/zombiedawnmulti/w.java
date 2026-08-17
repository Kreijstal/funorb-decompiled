/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends gq {
    private int field_s;
    private int[] field_r;
    private int[] field_w;
    private gd field_j;
    private int field_u;
    private ug field_p;
    static String field_n;
    private int field_k;
    private ug field_o;
    private boolean field_y;
    static fm field_A;
    private boolean field_l;
    private gd field_t;
    private ug field_x;
    private gd field_v;
    static ri field_z;
    static int field_m;
    private int field_q;

    private final void a(gd param0, int param1, int param2, int param3) {
        try {
            param0.a(param2, param1, false);
            param0.a((byte) -116, param3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "w.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(ug param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_32_0 = 0;
        gd stackIn_40_0 = null;
        ug stackIn_40_1 = null;
        gd stackIn_41_0 = null;
        ug stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        gd stackIn_49_0 = null;
        ug stackIn_49_1 = null;
        gd stackIn_50_0 = null;
        ug stackIn_50_1 = null;
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
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_y) {
                break L1;
              } else {
                if (!param2) {
                  break L1;
                } else {
                  L2: {
                    if (0 >= this.field_q) {
                      L3: {
                        if (this.field_o == null) {
                          break L3;
                        } else {
                          this.field_v.g(2);
                          break L3;
                        }
                      }
                      this.field_o = param0;
                      if (param0 != null) {
                        this.field_v.a(param0, false, 8361407);
                        this.a(this.field_v, -1, param3, param1);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null == this.field_p) {
                          break L4;
                        } else {
                          this.field_j.g(2);
                          break L4;
                        }
                      }
                      this.field_p = param0;
                      if (param0 == null) {
                        break L2;
                      } else {
                        this.field_j.a(param0, false, 8361407);
                        this.a(this.field_j, -1, param3, param1);
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L5: {
              stackIn_16_0 = this;

              if (!param2) {
                stackIn_17_0 = this;
                stackIn_17_1 = 0;
                break L5;
              } else {
                stackIn_17_0 = this;
                stackIn_17_1 = 1;
                break L5;
              }
            }
            ((w) (this)).field_y = stackIn_17_1 != 0;
            if (param5) {
              if (this.field_p == param0) {
                this.field_q = param4;
                this.a(this.field_j, -1, param3, param1);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (param0 != this.field_o) {
                  L6: {
                    if (this.field_p != null) {
                      if (this.field_o != null) {
                        L7: {
                          if (524288 <= this.field_s) {
                            stackIn_32_0 = 0;
                            break L7;
                          } else {
                            stackIn_32_0 = 1;
                            break L7;
                          }
                        }
                        var7_int = stackIn_32_0;
                        break L6;
                      } else {
                        var7_int = 0;
                        break L6;
                      }
                    } else {
                      var7_int = 1;
                      break L6;
                    }
                  }
                  L8: {
                    if (var7_int == 0) {
                      L9: {
                        if (null == this.field_o) {
                          break L9;
                        } else {
                          this.field_v.g(2);
                          break L9;
                        }
                      }
                      L10: {
                        this.field_o = param0;
                        if (param0 != null) {
                          L11: {
                            stackIn_49_0 = this.field_v;

                            stackIn_49_1 = (ug) (param0);

                            if (param2) {
                              stackIn_50_0 = (gd) ((Object) stackIn_49_0);
                              stackIn_50_1 = (ug) ((Object) stackIn_49_1);
                              stackIn_50_2 = 0;
                              break L11;
                            } else {
                              stackIn_50_0 = (gd) ((Object) stackIn_49_0);
                              stackIn_50_1 = (ug) ((Object) stackIn_49_1);
                              stackIn_50_2 = 1;
                              break L11;
                            }
                          }
                          ((gd) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2 != 0, 8361407);
                          this.a(this.field_v, -1, param3, param1);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      this.field_q = -param4;
                      break L8;
                    } else {
                      L12: {
                        if (this.field_p == null) {
                          break L12;
                        } else {
                          this.field_j.g(2);
                          break L12;
                        }
                      }
                      L13: {
                        this.field_p = param0;
                        if (param0 != null) {
                          L14: {
                            stackIn_40_0 = this.field_j;

                            stackIn_40_1 = (ug) (param0);

                            if (param2) {
                              stackIn_41_0 = (gd) ((Object) stackIn_40_0);
                              stackIn_41_1 = (ug) ((Object) stackIn_40_1);
                              stackIn_41_2 = 0;
                              break L14;
                            } else {
                              stackIn_41_0 = (gd) ((Object) stackIn_40_0);
                              stackIn_41_1 = (ug) ((Object) stackIn_40_1);
                              stackIn_41_2 = 1;
                              break L14;
                            }
                          }
                          ((gd) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2 != 0, 8361407);
                          this.a(this.field_j, -1, param3, param1);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      this.field_q = param4;
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  this.field_q = -param4;
                  this.a(this.field_v, -1, param3, param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var7);

            stackIn_55_1 = new StringBuilder().append("w.C(");

            if (param0 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L15;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L15;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final gq d() {
        return null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 94 % ((param3 - -10) / 35);
        ia.a(param0, param1, param2, 0);
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (pk.field_b != null) {
          if (!pk.field_b.a(false)) {
            if (param3 == 18663) {
              L0: {
                if (bk.field_i == null) {
                  break L0;
                } else {
                  if (!bk.field_i.k(param3 ^ 18562)) {
                    break L0;
                  } else {
                    bk.field_i = null;
                    q.b(46);
                    return true;
                  }
                }
              }
              if (vc.a(param3 ^ 5010853)) {
                return true;
              } else {
                if (sd.a(param2, (byte) 122, param0, param1)) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            q.b(124);
            return true;
          }
        } else {
          if (param3 == 18663) {
            if (bk.field_i != null) {
              if (!bk.field_i.k(param3 ^ 18562)) {
                if (vc.a(param3 ^ 5010853)) {
                  return true;
                } else {
                  if (sd.a(param2, (byte) 122, param0, param1)) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                bk.field_i = null;
                q.b(46);
                return true;
              }
            } else {
              if (vc.a(param3 ^ 5010853)) {
                return true;
              } else {
                if (sd.a(param2, (byte) 122, param0, param1)) {
                  return true;
                } else {
                  return false;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if ((this.field_s ^ -1) < -1) {
          L0: {
            if (null != this.field_p) {
              this.field_j.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
          if (this.field_s < 1048576) {
            if (this.field_o == null) {
              L1: {
                if (0 >= this.field_u) {
                  break L1;
                } else {
                  if (this.field_x != null) {
                    this.field_t.a(param0);
                    break L1;
                  } else {
                    if (this.field_y) {
                      L2: {
                        if (-1 <= (this.field_q ^ -1)) {
                          break L2;
                        } else {
                          if (this.field_j.c(-106)) {
                            break L2;
                          } else {
                            this.field_p = null;
                            this.field_q = -this.field_q;
                            this.field_y = false;
                            if (this.field_q != 0) {
                              this.field_s = this.field_s + param0 * this.field_q;
                              if ((this.field_s ^ -1) <= -1048577) {
                                this.field_s = 1048576;
                                if (this.field_y) {
                                  return;
                                } else {
                                  L3: {
                                    this.field_q = 0;
                                    if (this.field_l) {
                                      break L3;
                                    } else {
                                      L4: {
                                        if (null != this.field_o) {
                                          this.field_v.g(2);
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      this.field_o = null;
                                      break L3;
                                    }
                                  }
                                  return;
                                }
                              } else {
                                if (0 >= this.field_s) {
                                  this.field_s = 0;
                                  if (!this.field_y) {
                                    this.field_q = 0;
                                    if (!this.field_l) {
                                      if (this.field_p == null) {
                                        this.field_p = null;
                                        return;
                                      } else {
                                        this.field_j.g(2);
                                        this.field_p = null;
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
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      L5: {
                        if ((this.field_q ^ -1) <= -1) {
                          break L5;
                        } else {
                          if (!this.field_v.c(-61)) {
                            this.field_o = null;
                            this.field_q = -this.field_q;
                            this.field_y = false;
                            break L5;
                          } else {
                            if (this.field_q != 0) {
                              this.field_s = this.field_s + param0 * this.field_q;
                              if ((this.field_s ^ -1) <= -1048577) {
                                this.field_s = 1048576;
                                if (this.field_y) {
                                  return;
                                } else {
                                  L6: {
                                    this.field_q = 0;
                                    if (this.field_l) {
                                      break L6;
                                    } else {
                                      L7: {
                                        if (null != this.field_o) {
                                          this.field_v.g(2);
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      }
                                      this.field_o = null;
                                      break L6;
                                    }
                                  }
                                  return;
                                }
                              } else {
                                if (0 >= this.field_s) {
                                  this.field_s = 0;
                                  if (!this.field_y) {
                                    this.field_q = 0;
                                    if (!this.field_l) {
                                      if (this.field_p == null) {
                                        this.field_p = null;
                                        return;
                                      } else {
                                        this.field_j.g(2);
                                        this.field_p = null;
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
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      if (this.field_q != 0) {
                        this.field_s = this.field_s + param0 * this.field_q;
                        if ((this.field_s ^ -1) <= -1048577) {
                          this.field_s = 1048576;
                          if (this.field_y) {
                            return;
                          } else {
                            L8: {
                              this.field_q = 0;
                              if (this.field_l) {
                                break L8;
                              } else {
                                L9: {
                                  if (null != this.field_o) {
                                    this.field_v.g(2);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                this.field_o = null;
                                break L8;
                              }
                            }
                            return;
                          }
                        } else {
                          if (0 >= this.field_s) {
                            this.field_s = 0;
                            if (!this.field_y) {
                              this.field_q = 0;
                              if (!this.field_l) {
                                if (this.field_p == null) {
                                  this.field_p = null;
                                  return;
                                } else {
                                  this.field_j.g(2);
                                  this.field_p = null;
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
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (this.field_q != 0) {
                        this.field_s = this.field_s + param0 * this.field_q;
                        if ((this.field_s ^ -1) <= -1048577) {
                          this.field_s = 1048576;
                          if (this.field_y) {
                            return;
                          } else {
                            L10: {
                              this.field_q = 0;
                              if (this.field_l) {
                                break L10;
                              } else {
                                L11: {
                                  if (null != this.field_o) {
                                    this.field_v.g(2);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                this.field_o = null;
                                break L10;
                              }
                            }
                            return;
                          }
                        } else {
                          if (0 >= this.field_s) {
                            this.field_s = 0;
                            if (!this.field_y) {
                              this.field_q = 0;
                              if (!this.field_l) {
                                if (this.field_p == null) {
                                  this.field_p = null;
                                  return;
                                } else {
                                  this.field_j.g(2);
                                  this.field_p = null;
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
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L12: {
                if (!this.field_y) {
                  break L12;
                } else {
                  L13: {
                    if (-1 <= (this.field_q ^ -1)) {
                      break L13;
                    } else {
                      if (this.field_j.c(-106)) {
                        break L13;
                      } else {
                        this.field_p = null;
                        this.field_q = -this.field_q;
                        this.field_y = false;
                        if (this.field_q != 0) {
                          this.field_s = this.field_s + param0 * this.field_q;
                          if ((this.field_s ^ -1) <= -1048577) {
                            this.field_s = 1048576;
                            if (this.field_y) {
                              return;
                            } else {
                              L14: {
                                this.field_q = 0;
                                if (this.field_l) {
                                  break L14;
                                } else {
                                  L15: {
                                    if (null != this.field_o) {
                                      this.field_v.g(2);
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  this.field_o = null;
                                  break L14;
                                }
                              }
                              return;
                            }
                          } else {
                            if (0 >= this.field_s) {
                              this.field_s = 0;
                              if (!this.field_y) {
                                this.field_q = 0;
                                if (!this.field_l) {
                                  if (this.field_p == null) {
                                    this.field_p = null;
                                    return;
                                  } else {
                                    this.field_j.g(2);
                                    this.field_p = null;
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
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if ((this.field_q ^ -1) <= -1) {
                    break L12;
                  } else {
                    if (!this.field_v.c(-61)) {
                      this.field_o = null;
                      this.field_q = -this.field_q;
                      this.field_y = false;
                      break L12;
                    } else {
                      if (this.field_q != 0) {
                        this.field_s = this.field_s + param0 * this.field_q;
                        if ((this.field_s ^ -1) <= -1048577) {
                          this.field_s = 1048576;
                          if (!this.field_y) {
                            L16: {
                              this.field_q = 0;
                              if (this.field_l) {
                                break L16;
                              } else {
                                L17: {
                                  if (null != this.field_o) {
                                    this.field_v.g(2);
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                this.field_o = null;
                                break L16;
                              }
                            }
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (0 >= this.field_s) {
                            this.field_s = 0;
                            if (!this.field_y) {
                              this.field_q = 0;
                              if (!this.field_l) {
                                if (this.field_p == null) {
                                  this.field_p = null;
                                  return;
                                } else {
                                  this.field_j.g(2);
                                  this.field_p = null;
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
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              if (this.field_q != 0) {
                this.field_s = this.field_s + param0 * this.field_q;
                if ((this.field_s ^ -1) <= -1048577) {
                  this.field_s = 1048576;
                  if (!this.field_y) {
                    L18: {
                      this.field_q = 0;
                      if (this.field_l) {
                        break L18;
                      } else {
                        L19: {
                          if (null != this.field_o) {
                            this.field_v.g(2);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        this.field_o = null;
                        break L18;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (0 >= this.field_s) {
                    this.field_s = 0;
                    if (!this.field_y) {
                      this.field_q = 0;
                      if (!this.field_l) {
                        if (this.field_p == null) {
                          this.field_p = null;
                          return;
                        } else {
                          this.field_j.g(2);
                          this.field_p = null;
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
                }
              } else {
                return;
              }
            } else {
              L20: {
                this.field_v.a(param0);
                if (0 >= this.field_u) {
                  break L20;
                } else {
                  if (this.field_x != null) {
                    this.field_t.a(param0);
                    break L20;
                  } else {
                    break L20;
                  }
                }
              }
              L21: {
                if (!this.field_y) {
                  break L21;
                } else {
                  L22: {
                    if (-1 <= (this.field_q ^ -1)) {
                      break L22;
                    } else {
                      if (this.field_j.c(-106)) {
                        break L22;
                      } else {
                        this.field_p = null;
                        this.field_q = -this.field_q;
                        this.field_y = false;
                        break L21;
                      }
                    }
                  }
                  if ((this.field_q ^ -1) <= -1) {
                    break L21;
                  } else {
                    if (!this.field_v.c(-61)) {
                      this.field_o = null;
                      this.field_q = -this.field_q;
                      this.field_y = false;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
              }
              if (this.field_q != 0) {
                this.field_s = this.field_s + param0 * this.field_q;
                if ((this.field_s ^ -1) <= -1048577) {
                  this.field_s = 1048576;
                  if (!this.field_y) {
                    this.field_q = 0;
                    if (this.field_l) {
                      return;
                    } else {
                      L23: {
                        if (null != this.field_o) {
                          this.field_v.g(2);
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      this.field_o = null;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (0 >= this.field_s) {
                    this.field_s = 0;
                    if (!this.field_y) {
                      this.field_q = 0;
                      if (!this.field_l) {
                        if (this.field_p == null) {
                          this.field_p = null;
                          return;
                        } else {
                          this.field_j.g(2);
                          this.field_p = null;
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
                }
              } else {
                return;
              }
            }
          } else {
            L24: {
              if (0 >= this.field_u) {
                break L24;
              } else {
                if (this.field_x != null) {
                  this.field_t.a(param0);
                  break L24;
                } else {
                  break L24;
                }
              }
            }
            L25: {
              if (!this.field_y) {
                break L25;
              } else {
                L26: {
                  if (-1 <= (this.field_q ^ -1)) {
                    break L26;
                  } else {
                    if (this.field_j.c(-106)) {
                      break L26;
                    } else {
                      this.field_p = null;
                      this.field_q = -this.field_q;
                      this.field_y = false;
                      break L25;
                    }
                  }
                }
                if ((this.field_q ^ -1) <= -1) {
                  break L25;
                } else {
                  if (!this.field_v.c(-61)) {
                    this.field_o = null;
                    this.field_q = -this.field_q;
                    this.field_y = false;
                    break L25;
                  } else {
                    break L25;
                  }
                }
              }
            }
            if (this.field_q != 0) {
              this.field_s = this.field_s + param0 * this.field_q;
              if ((this.field_s ^ -1) <= -1048577) {
                this.field_s = 1048576;
                if (this.field_y) {
                  return;
                } else {
                  L27: {
                    this.field_q = 0;
                    if (this.field_l) {
                      break L27;
                    } else {
                      L28: {
                        if (null != this.field_o) {
                          this.field_v.g(2);
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      this.field_o = null;
                      break L27;
                    }
                  }
                  return;
                }
              } else {
                if (0 >= this.field_s) {
                  this.field_s = 0;
                  if (!this.field_y) {
                    this.field_q = 0;
                    if (!this.field_l) {
                      if (this.field_p == null) {
                        this.field_p = null;
                        return;
                      } else {
                        this.field_j.g(2);
                        this.field_p = null;
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
              }
            } else {
              return;
            }
          }
        } else {
          L29: {
            if (this.field_s >= 1048576) {
              break L29;
            } else {
              if (this.field_o == null) {
                break L29;
              } else {
                this.field_v.a(param0);
                break L29;
              }
            }
          }
          L30: {
            if (0 >= this.field_u) {
              break L30;
            } else {
              if (this.field_x != null) {
                this.field_t.a(param0);
                break L30;
              } else {
                break L30;
              }
            }
          }
          L31: {
            if (!this.field_y) {
              break L31;
            } else {
              L32: {
                if (-1 <= (this.field_q ^ -1)) {
                  break L32;
                } else {
                  if (this.field_j.c(-106)) {
                    break L32;
                  } else {
                    this.field_p = null;
                    this.field_q = -this.field_q;
                    this.field_y = false;
                    break L31;
                  }
                }
              }
              if ((this.field_q ^ -1) <= -1) {
                break L31;
              } else {
                if (!this.field_v.c(-61)) {
                  this.field_o = null;
                  this.field_q = -this.field_q;
                  this.field_y = false;
                  break L31;
                } else {
                  break L31;
                }
              }
            }
          }
          if (this.field_q != 0) {
            this.field_s = this.field_s + param0 * this.field_q;
            if ((this.field_s ^ -1) <= -1048577) {
              this.field_s = 1048576;
              if (this.field_y) {
                return;
              } else {
                L33: {
                  this.field_q = 0;
                  if (this.field_l) {
                    break L33;
                  } else {
                    L34: {
                      if (null != this.field_o) {
                        this.field_v.g(2);
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    this.field_o = null;
                    break L33;
                  }
                }
                return;
              }
            } else {
              if (0 >= this.field_s) {
                this.field_s = 0;
                if (!this.field_y) {
                  this.field_q = 0;
                  if (!this.field_l) {
                    if (this.field_p == null) {
                      this.field_p = null;
                      return;
                    } else {
                      this.field_j.g(2);
                      this.field_p = null;
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
            }
          } else {
            return;
          }
        }
    }

    final synchronized void a(int param0, int param1) {
        if (param1 != 18813) {
            this.a();
            this.field_k = param0;
            return;
        }
        this.field_k = param0;
    }

    final synchronized int a() {
        return 2;
    }

    final static void c(int param0) {
        int var1_int = 0;
        int var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
            for (var1_int = 0; uf.field_g > var1_int; var1_int++) {
                uk.field_M[var1_int] = null;
            }
            uf.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "w.I(" + param0 + ')');
        }
    }

    final gq b() {
        return null;
    }

    public static void a(byte param0) {
        if (param0 >= -81) {
            return;
        }
        field_z = null;
        field_n = null;
        field_A = null;
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
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
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (this.field_k > 0) {
              L1: {
                if (this.field_y) {
                  L2: {
                    if (0 >= this.field_q) {
                      break L2;
                    } else {
                      if (this.field_j.c(-54)) {
                        break L2;
                      } else {
                        this.field_p = null;
                        this.field_y = false;
                        this.field_q = -this.field_q;
                        break L1;
                      }
                    }
                  }
                  if (this.field_q >= 0) {
                    break L1;
                  } else {
                    if (!this.field_v.c(-103)) {
                      this.field_o = null;
                      this.field_q = -this.field_q;
                      this.field_y = false;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = (this.field_s >> 292573932) * this.field_k / 256;
                var5 = -var4_int + this.field_k;
                if (this.field_q != 0) {
                  this.field_s = this.field_s + this.field_q * param2;
                  if (-1048577 >= (this.field_s ^ -1)) {
                    this.field_s = 1048576;
                    if (this.field_y) {
                      break L3;
                    } else {
                      this.field_q = 0;
                      if (!this.field_l) {
                        L4: {
                          if (null == this.field_o) {
                            break L4;
                          } else {
                            this.field_v.g(2);
                            break L4;
                          }
                        }
                        this.field_o = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    if (0 < this.field_s) {
                      break L3;
                    } else {
                      this.field_s = 0;
                      if (this.field_y) {
                        break L3;
                      } else {
                        this.field_q = 0;
                        if (this.field_l) {
                          break L3;
                        } else {
                          L5: {
                            if (null != this.field_p) {
                              this.field_j.g(2);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          this.field_p = null;
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (gp.field_j) {
                  stackIn_32_0 = param2 << -1305592351;
                  break L6;
                } else {
                  stackIn_32_0 = param2;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_32_0;
                if ((this.field_u ^ -1) > -257) {
                  L8: {
                    if (null != this.field_p) {
                      break L8;
                    } else {
                      if (this.field_o == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if ((var4_int ^ -1) == -257) {
                    this.field_j.b(param0, param1, param2);
                    break L7;
                  } else {
                    if (256 == var5) {
                      this.field_v.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (this.field_w == null) {
                            break L10;
                          } else {
                            if (this.field_w.length < var6) {
                              break L10;
                            } else {
                              d.a(this.field_w, 0, var6);
                              d.a(this.field_r, 0, var6);
                              break L9;
                            }
                          }
                        }
                        this.field_w = new int[var6];
                        this.field_r = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_j.b(this.field_w, 0, param2);
                        this.field_v.b(this.field_r, 0, param2);
                        if (!gp.field_j) {
                          stackIn_46_0 = param1;
                          break L11;
                        } else {
                          localTemp$0 = param1 << 1;
                          param1 = localTemp$0;
                          stackIn_46_0 = localTemp$0;
                          break L11;
                        }
                      }
                      var7 = stackIn_46_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (this.field_r[var8] * var5 + var4_int * this.field_w[var8] >> 468994792);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                L14: {
                  if (this.field_x == null) {
                    break L14;
                  } else {
                    if (this.field_u != 0) {
                      L15: {
                        L16: {
                          if (null == this.field_w) {
                            break L16;
                          } else {
                            if (this.field_w.length >= var6) {
                              d.a(this.field_w, 0, var6);
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        this.field_r = new int[var6];
                        this.field_w = new int[var6];
                        break L15;
                      }
                      L17: {
                        this.field_t.b(this.field_w, 0, param2);
                        if (!gp.field_j) {
                          stackIn_62_0 = param1;
                          break L17;
                        } else {
                          localTemp$1 = param1 << 1;
                          param1 = localTemp$1;
                          stackIn_62_0 = localTemp$1;
                          break L17;
                        }
                      }
                      var7 = stackIn_62_0;
                      var8 = this.field_u * this.field_k / 256;
                      var9 = -var8 + this.field_k;
                      var10 = 0;
                      L18: while (true) {
                        if (var6 <= var10) {
                          break L14;
                        } else {
                          param0[var10 + var7] = var8 * this.field_w[var10] + param0[var10 + var7] * var9 >> 1756589480;
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                break L13;
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
          L19: {
            var4 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var4);

            stackIn_68_1 = new StringBuilder().append("w.F(");

            if (param0 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L19;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L19;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private w() throws Throwable {
        throw new Error();
    }

    static {
        field_n = "Ready";
    }
}
