/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends ej {
    private mf field_u;
    private mf field_r;
    private mf field_v;
    private rl field_n;
    private boolean field_m;
    private int[] field_w;
    private int field_A;
    private int field_s;
    private boolean field_o;
    static String field_z;
    static String field_x;
    private rl field_y;
    private int field_p;
    private int[] field_t;
    private int field_l;
    private rl field_q;

    final synchronized void a(int param0, int param1, boolean param2, rl param3, int param4, int param5) {
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_33_0 = 0;
        mf stackIn_42_0 = null;
        mf stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        mf stackIn_50_0 = null;
        mf stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_o) {
                break L1;
              } else {
                if (!param2) {
                  break L1;
                } else {
                  L2: {
                    if (-1 <= (this.field_s ^ -1)) {
                      L3: {
                        if (null == this.field_q) {
                          break L3;
                        } else {
                          this.field_v.a((byte) 97);
                          break L3;
                        }
                      }
                      this.field_q = param3;
                      if (param3 != null) {
                        this.field_v.a(false, param3, true);
                        this.a((byte) -71, this.field_v, param4, param5);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null != this.field_n) {
                          this.field_r.a((byte) 97);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      this.field_n = param3;
                      if (param3 == null) {
                        break L2;
                      } else {
                        this.field_r.a(false, param3, true);
                        this.a((byte) -113, this.field_r, param4, param5);
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
            L6: {
              ((se) (this)).field_o = stackIn_18_1 != 0;
              if (param1 == 0) {
                break L6;
              } else {
                this.field_A = -21;
                break L6;
              }
            }
            if (this.field_n == param3) {
              this.field_s = param0;
              this.a((byte) -106, this.field_r, param4, param5);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (this.field_q == param3) {
                this.field_s = -param0;
                this.a((byte) -84, this.field_v, param4, param5);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L7: {
                  if (null != this.field_n) {
                    if (null == this.field_q) {
                      var7_int = 0;
                      break L7;
                    } else {
                      L8: {
                        if (-524289 >= (this.field_l ^ -1)) {
                          stackIn_33_0 = 0;
                          break L8;
                        } else {
                          stackIn_33_0 = 1;
                          break L8;
                        }
                      }
                      var7_int = stackIn_33_0;
                      break L7;
                    }
                  } else {
                    var7_int = 1;
                    break L7;
                  }
                }
                if (var7_int != 0) {
                  L9: {
                    if (null == this.field_n) {
                      break L9;
                    } else {
                      this.field_r.a((byte) 97);
                      break L9;
                    }
                  }
                  L10: {
                    this.field_n = param3;
                    if (param3 == null) {
                      break L10;
                    } else {
                      L11: {
                        stackIn_50_0 = this.field_r;

                        if (param2) {
                          stackIn_51_0 = (mf) ((Object) stackIn_50_0);
                          stackIn_51_1 = 0;
                          break L11;
                        } else {
                          stackIn_51_0 = (mf) ((Object) stackIn_50_0);
                          stackIn_51_1 = 1;
                          break L11;
                        }
                      }
                      ((mf) (Object) stackIn_51_0).a(stackIn_51_1 != 0, param3, true);
                      this.a((byte) -84, this.field_r, param4, param5);
                      break L10;
                    }
                  }
                  this.field_s = param0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L12: {
                    if (this.field_q == null) {
                      break L12;
                    } else {
                      this.field_v.a((byte) 97);
                      break L12;
                    }
                  }
                  L13: {
                    this.field_q = param3;
                    if (param3 != null) {
                      L14: {
                        stackIn_42_0 = this.field_v;

                        if (param2) {
                          stackIn_43_0 = (mf) ((Object) stackIn_42_0);
                          stackIn_43_1 = 0;
                          break L14;
                        } else {
                          stackIn_43_0 = (mf) ((Object) stackIn_42_0);
                          stackIn_43_1 = 1;
                          break L14;
                        }
                      }
                      ((mf) (Object) stackIn_43_0).a(stackIn_43_1 != 0, param3, true);
                      this.a((byte) -95, this.field_v, param4, param5);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  this.field_s = -param0;
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackIn_56_0 = (RuntimeException) (var7);

            stackIn_56_1 = new StringBuilder().append("se.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L15;
            } else {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L15;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param4 + ',' + param5 + ')');
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
              return;
            }
          }
        }
    }

    final synchronized void b(int param0, int param1) {
        if (param0 != -15705) {
            field_z = (String) null;
            this.field_p = param1;
            return;
        }
        this.field_p = param1;
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = SolKnight.field_L ? 1 : 0;
        if ((this.field_l ^ -1) < -1) {
          L0: {
            if (this.field_n != null) {
              this.field_r.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
          if (1048576 > this.field_l) {
            L1: {
              if (null == this.field_q) {
                break L1;
              } else {
                this.field_v.a(param0);
                break L1;
              }
            }
            L2: {
              if (this.field_A <= 0) {
                break L2;
              } else {
                if (null != this.field_y) {
                  this.field_u.a(param0);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (this.field_o) {
              L3: {
                if (this.field_s <= 0) {
                  break L3;
                } else {
                  if (!this.field_r.d(144)) {
                    L4: {
                      this.field_o = false;
                      this.field_s = -this.field_s;
                      this.field_n = null;
                      if (this.field_s == 0) {
                        break L4;
                      } else {
                        this.field_l = this.field_l + this.field_s * param0;
                        if ((this.field_l ^ -1) <= -1048577) {
                          this.field_l = 1048576;
                          if (this.field_o) {
                            break L4;
                          } else {
                            this.field_s = 0;
                            if (this.field_m) {
                              break L4;
                            } else {
                              if (null == this.field_q) {
                                this.field_q = null;
                                break L4;
                              } else {
                                this.field_v.a((byte) 97);
                                this.field_q = null;
                                return;
                              }
                            }
                          }
                        } else {
                          if (0 < this.field_l) {
                            break L4;
                          } else {
                            this.field_l = 0;
                            if (!this.field_o) {
                              this.field_s = 0;
                              if (!this.field_m) {
                                L5: {
                                  if (null != this.field_n) {
                                    this.field_r.a((byte) 97);
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                this.field_n = null;
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
                    }
                    return;
                  } else {
                    break L3;
                  }
                }
              }
              if (-1 < (this.field_s ^ -1)) {
                if (this.field_v.d(144)) {
                  L6: {
                    if (this.field_s == 0) {
                      break L6;
                    } else {
                      this.field_l = this.field_l + this.field_s * param0;
                      if ((this.field_l ^ -1) <= -1048577) {
                        this.field_l = 1048576;
                        if (this.field_o) {
                          break L6;
                        } else {
                          this.field_s = 0;
                          if (this.field_m) {
                            break L6;
                          } else {
                            if (null == this.field_q) {
                              this.field_q = null;
                              break L6;
                            } else {
                              this.field_v.a((byte) 97);
                              this.field_q = null;
                              return;
                            }
                          }
                        }
                      } else {
                        if (0 < this.field_l) {
                          break L6;
                        } else {
                          this.field_l = 0;
                          if (!this.field_o) {
                            this.field_s = 0;
                            if (!this.field_m) {
                              L7: {
                                if (null != this.field_n) {
                                  this.field_r.a((byte) 97);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              this.field_n = null;
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
                  }
                  return;
                } else {
                  this.field_o = false;
                  this.field_s = -this.field_s;
                  this.field_q = null;
                  if (this.field_s != 0) {
                    this.field_l = this.field_l + this.field_s * param0;
                    if ((this.field_l ^ -1) <= -1048577) {
                      L8: {
                        this.field_l = 1048576;
                        if (this.field_o) {
                          break L8;
                        } else {
                          this.field_s = 0;
                          if (this.field_m) {
                            break L8;
                          } else {
                            if (null == this.field_q) {
                              this.field_q = null;
                              break L8;
                            } else {
                              this.field_v.a((byte) 97);
                              this.field_q = null;
                              return;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      if (0 >= this.field_l) {
                        this.field_l = 0;
                        if (!this.field_o) {
                          this.field_s = 0;
                          if (!this.field_m) {
                            L9: {
                              if (null != this.field_n) {
                                this.field_r.a((byte) 97);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            this.field_n = null;
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
              } else {
                L10: {
                  if (this.field_s == 0) {
                    break L10;
                  } else {
                    this.field_l = this.field_l + this.field_s * param0;
                    if ((this.field_l ^ -1) <= -1048577) {
                      this.field_l = 1048576;
                      if (this.field_o) {
                        break L10;
                      } else {
                        this.field_s = 0;
                        if (this.field_m) {
                          break L10;
                        } else {
                          if (null == this.field_q) {
                            this.field_q = null;
                            break L10;
                          } else {
                            this.field_v.a((byte) 97);
                            this.field_q = null;
                            return;
                          }
                        }
                      }
                    } else {
                      if (0 < this.field_l) {
                        break L10;
                      } else {
                        this.field_l = 0;
                        if (!this.field_o) {
                          this.field_s = 0;
                          if (!this.field_m) {
                            L11: {
                              if (null != this.field_n) {
                                this.field_r.a((byte) 97);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            this.field_n = null;
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
                }
                return;
              }
            } else {
              if (this.field_s != 0) {
                this.field_l = this.field_l + this.field_s * param0;
                if ((this.field_l ^ -1) <= -1048577) {
                  this.field_l = 1048576;
                  if (!this.field_o) {
                    L12: {
                      this.field_s = 0;
                      if (this.field_m) {
                        break L12;
                      } else {
                        if (null == this.field_q) {
                          this.field_q = null;
                          break L12;
                        } else {
                          this.field_v.a((byte) 97);
                          this.field_q = null;
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (0 >= this.field_l) {
                    this.field_l = 0;
                    if (!this.field_o) {
                      this.field_s = 0;
                      if (this.field_m) {
                        return;
                      } else {
                        L13: {
                          if (null != this.field_n) {
                            this.field_r.a((byte) 97);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        this.field_n = null;
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
            L14: {
              if (this.field_A <= 0) {
                break L14;
              } else {
                if (null != this.field_y) {
                  this.field_u.a(param0);
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            L15: {
              if (!this.field_o) {
                break L15;
              } else {
                L16: {
                  if (this.field_s <= 0) {
                    break L16;
                  } else {
                    if (this.field_r.d(144)) {
                      break L16;
                    } else {
                      L17: {
                        this.field_o = false;
                        this.field_s = -this.field_s;
                        this.field_n = null;
                        if (this.field_s == 0) {
                          break L17;
                        } else {
                          this.field_l = this.field_l + this.field_s * param0;
                          if ((this.field_l ^ -1) <= -1048577) {
                            this.field_l = 1048576;
                            if (this.field_o) {
                              break L17;
                            } else {
                              this.field_s = 0;
                              if (this.field_m) {
                                break L17;
                              } else {
                                L18: {
                                  if (null == this.field_q) {
                                    break L18;
                                  } else {
                                    this.field_v.a((byte) 97);
                                    break L18;
                                  }
                                }
                                this.field_q = null;
                                break L17;
                              }
                            }
                          } else {
                            if (0 < this.field_l) {
                              break L17;
                            } else {
                              this.field_l = 0;
                              if (!this.field_o) {
                                this.field_s = 0;
                                if (!this.field_m) {
                                  L19: {
                                    if (null != this.field_n) {
                                      this.field_r.a((byte) 97);
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  this.field_n = null;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (-1 >= (this.field_s ^ -1)) {
                  break L15;
                } else {
                  if (this.field_v.d(144)) {
                    break L15;
                  } else {
                    L20: {
                      this.field_o = false;
                      this.field_s = -this.field_s;
                      this.field_q = null;
                      if (this.field_s == 0) {
                        break L20;
                      } else {
                        this.field_l = this.field_l + this.field_s * param0;
                        if ((this.field_l ^ -1) <= -1048577) {
                          this.field_l = 1048576;
                          if (this.field_o) {
                            break L20;
                          } else {
                            this.field_s = 0;
                            if (this.field_m) {
                              break L20;
                            } else {
                              if (null == this.field_q) {
                                this.field_q = null;
                                break L20;
                              } else {
                                this.field_v.a((byte) 97);
                                this.field_q = null;
                                break L20;
                              }
                            }
                          }
                        } else {
                          if (0 < this.field_l) {
                            break L20;
                          } else {
                            this.field_l = 0;
                            if (!this.field_o) {
                              this.field_s = 0;
                              if (!this.field_m) {
                                L21: {
                                  if (null != this.field_n) {
                                    this.field_r.a((byte) 97);
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                this.field_n = null;
                                break L20;
                              } else {
                                break L20;
                              }
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (this.field_s != 0) {
              this.field_l = this.field_l + this.field_s * param0;
              if ((this.field_l ^ -1) <= -1048577) {
                this.field_l = 1048576;
                if (!this.field_o) {
                  this.field_s = 0;
                  if (!this.field_m) {
                    if (null == this.field_q) {
                      this.field_q = null;
                      return;
                    } else {
                      this.field_v.a((byte) 97);
                      this.field_q = null;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (0 >= this.field_l) {
                  this.field_l = 0;
                  if (!this.field_o) {
                    this.field_s = 0;
                    if (!this.field_m) {
                      L22: {
                        if (null != this.field_n) {
                          this.field_r.a((byte) 97);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      this.field_n = null;
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
        } else {
          L23: {
            if (1048576 <= this.field_l) {
              break L23;
            } else {
              if (null == this.field_q) {
                break L23;
              } else {
                this.field_v.a(param0);
                break L23;
              }
            }
          }
          L24: {
            if (this.field_A <= 0) {
              break L24;
            } else {
              if (null != this.field_y) {
                this.field_u.a(param0);
                break L24;
              } else {
                break L24;
              }
            }
          }
          L25: {
            if (!this.field_o) {
              break L25;
            } else {
              L26: {
                if (this.field_s <= 0) {
                  break L26;
                } else {
                  if (this.field_r.d(144)) {
                    break L26;
                  } else {
                    L27: {
                      this.field_o = false;
                      this.field_s = -this.field_s;
                      this.field_n = null;
                      if (this.field_s == 0) {
                        break L27;
                      } else {
                        this.field_l = this.field_l + this.field_s * param0;
                        if ((this.field_l ^ -1) <= -1048577) {
                          this.field_l = 1048576;
                          if (this.field_o) {
                            break L27;
                          } else {
                            this.field_s = 0;
                            if (this.field_m) {
                              break L27;
                            } else {
                              if (null == this.field_q) {
                                this.field_q = null;
                                break L27;
                              } else {
                                this.field_v.a((byte) 97);
                                this.field_q = null;
                                break L27;
                              }
                            }
                          }
                        } else {
                          if (0 < this.field_l) {
                            break L27;
                          } else {
                            this.field_l = 0;
                            if (!this.field_o) {
                              this.field_s = 0;
                              if (!this.field_m) {
                                L28: {
                                  if (null != this.field_n) {
                                    this.field_r.a((byte) 97);
                                    break L28;
                                  } else {
                                    break L28;
                                  }
                                }
                                this.field_n = null;
                                break L27;
                              } else {
                                break L27;
                              }
                            } else {
                              break L27;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (-1 >= (this.field_s ^ -1)) {
                break L25;
              } else {
                if (this.field_v.d(144)) {
                  break L25;
                } else {
                  L29: {
                    this.field_o = false;
                    this.field_s = -this.field_s;
                    this.field_q = null;
                    if (this.field_s == 0) {
                      break L29;
                    } else {
                      this.field_l = this.field_l + this.field_s * param0;
                      if ((this.field_l ^ -1) <= -1048577) {
                        this.field_l = 1048576;
                        if (this.field_o) {
                          break L29;
                        } else {
                          this.field_s = 0;
                          if (this.field_m) {
                            break L29;
                          } else {
                            if (null == this.field_q) {
                              this.field_q = null;
                              break L29;
                            } else {
                              this.field_v.a((byte) 97);
                              this.field_q = null;
                              break L29;
                            }
                          }
                        }
                      } else {
                        if (0 < this.field_l) {
                          break L29;
                        } else {
                          this.field_l = 0;
                          if (!this.field_o) {
                            this.field_s = 0;
                            if (!this.field_m) {
                              L30: {
                                if (null != this.field_n) {
                                  this.field_r.a((byte) 97);
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              this.field_n = null;
                              break L29;
                            } else {
                              break L29;
                            }
                          } else {
                            break L29;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          if (this.field_s != 0) {
            this.field_l = this.field_l + this.field_s * param0;
            if ((this.field_l ^ -1) <= -1048577) {
              this.field_l = 1048576;
              if (!this.field_o) {
                this.field_s = 0;
                if (!this.field_m) {
                  if (null != this.field_q) {
                    this.field_v.a((byte) 97);
                    this.field_q = null;
                    return;
                  } else {
                    this.field_q = null;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (0 >= this.field_l) {
                this.field_l = 0;
                if (!this.field_o) {
                  this.field_s = 0;
                  if (this.field_m) {
                    return;
                  } else {
                    L31: {
                      if (null != this.field_n) {
                        this.field_r.a((byte) 97);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    this.field_n = null;
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

    final void a(int[] param0, int param1, int param2) {
        int stackIn_32_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
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
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (-1 <= (this.field_p ^ -1)) {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!this.field_o) {
                  break L1;
                } else {
                  L2: {
                    if (this.field_s <= 0) {
                      break L2;
                    } else {
                      if (this.field_r.d(144)) {
                        break L2;
                      } else {
                        this.field_n = null;
                        this.field_s = -this.field_s;
                        this.field_o = false;
                        break L1;
                      }
                    }
                  }
                  if ((this.field_s ^ -1) <= -1) {
                    break L1;
                  } else {
                    if (this.field_v.d(144)) {
                      break L1;
                    } else {
                      this.field_q = null;
                      this.field_o = false;
                      this.field_s = -this.field_s;
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = (this.field_l >> 263738636) * this.field_p / 256;
                var5 = this.field_p + -var4_int;
                if (this.field_s != 0) {
                  this.field_l = this.field_l + param2 * this.field_s;
                  if ((this.field_l ^ -1) <= -1048577) {
                    this.field_l = 1048576;
                    if (this.field_o) {
                      break L3;
                    } else {
                      this.field_s = 0;
                      if (this.field_m) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_q != null) {
                            this.field_v.a((byte) 97);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.field_q = null;
                        break L3;
                      }
                    }
                  } else {
                    if (0 >= this.field_l) {
                      this.field_l = 0;
                      if (this.field_o) {
                        break L3;
                      } else {
                        this.field_s = 0;
                        if (this.field_m) {
                          break L3;
                        } else {
                          L5: {
                            if (this.field_n != null) {
                              this.field_r.a((byte) 97);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          this.field_n = null;
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (!gj.field_u) {
                  stackIn_32_0 = param2;
                  break L6;
                } else {
                  stackIn_32_0 = param2 << -76864383;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_32_0;
                if (this.field_A >= 256) {
                  break L7;
                } else {
                  L8: {
                    if (null != this.field_n) {
                      break L8;
                    } else {
                      if (this.field_q == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (-257 == (var4_int ^ -1)) {
                    this.field_r.a(param0, param1, param2);
                    break L7;
                  } else {
                    if (var5 != 256) {
                      L9: {
                        L10: {
                          if (this.field_w == null) {
                            break L10;
                          } else {
                            if (this.field_w.length >= var6) {
                              fk.a(this.field_w, 0, var6);
                              fk.a(this.field_t, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_w = new int[var6];
                        this.field_t = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_r.a(this.field_w, 0, param2);
                        this.field_v.a(this.field_t, 0, param2);
                        if (gj.field_u) {
                          param1 = param1 << 1;
                          stackIn_47_0 = param1 << 1;
                          break L11;
                        } else {
                          stackIn_47_0 = param1;
                          break L11;
                        }
                      }
                      var7 = stackIn_47_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (this.field_t[var8] * var5 + this.field_w[var8] * var4_int >> -450835704);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      this.field_v.a(param0, param1, param2);
                      break L7;
                    }
                  }
                }
              }
              L13: {
                if (this.field_y == null) {
                  break L13;
                } else {
                  if (0 == this.field_A) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        if (null == this.field_w) {
                          break L15;
                        } else {
                          if (this.field_w.length >= var6) {
                            fk.a(this.field_w, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_w = new int[var6];
                      this.field_t = new int[var6];
                      break L14;
                    }
                    L16: {
                      this.field_u.a(this.field_w, 0, param2);
                      if (!gj.field_u) {
                        stackIn_61_0 = param1;
                        break L16;
                      } else {
                        param1 = param1 << 1;
                        stackIn_61_0 = param1 << 1;
                        break L16;
                      }
                    }
                    var7 = stackIn_61_0;
                    var8 = this.field_A * this.field_p / 256;
                    var9 = this.field_p + -var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var7 - -var10] = param0[var10 + var7] * var9 + this.field_w[var10] * var8 >> 15817128;
                        var10++;
                        continue L17;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackIn_67_0 = (RuntimeException) (var4);

            stackIn_67_1 = new StringBuilder().append("se.AA(");

            if (param0 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L18;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L18;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, mf param1, int param2, int param3) {
        try {
            param1.b(param3, -1, -129);
            param1.b(param2, (byte) -110);
            if (param0 > -61) {
                this.b();
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "se.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ej b() {
        return null;
    }

    final ej a() {
        return null;
    }

    public static void b(boolean param0) {
        field_x = null;
        field_z = null;
        if (param0) {
            field_x = (String) null;
        }
    }

    private se() throws Throwable {
        throw new Error();
    }

    final synchronized int d() {
        return 2;
    }

    static {
        field_z = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_x = "Invalid password.";
    }
}
