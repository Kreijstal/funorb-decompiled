/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    private int field_l;
    static jp field_h;
    static int field_g;
    private int field_e;
    int field_r;
    static dj field_b;
    private int field_c;
    static int[] field_q;
    static String field_f;
    static String field_a;
    static int field_i;
    private int field_o;
    static jp field_k;
    private boolean field_d;
    static String[] field_p;
    static mh field_m;
    private int field_n;
    int field_j;

    public static void b(byte param0) {
        if (param0 != -60) {
          return;
        } else {
          field_h = null;
          field_m = null;
          field_a = null;
          field_f = null;
          field_b = null;
          field_q = null;
          field_k = null;
          field_p = null;
          return;
        }
    }

    final void a(int param0, int param1) {
        L0: {
          this.field_l = 0;
          this.field_e = 0;
          this.field_c = 0;
          if ((this.field_n ^ -1) == param1) {
            this.field_e = dc.field_b;
            break L0;
          } else {
            break L0;
          }
        }
        if (0 != this.field_n) {
          L1: {
            if (this.field_n != 0) {
              break L1;
            } else {
              if (-98 != (dc.field_b ^ -1)) {
                break L1;
              } else {
                this.field_j = this.field_j + 1;
                this.field_d = false;
                if (this.field_r <= this.field_j) {
                  this.field_j = 0;
                  break L1;
                } else {
                  if (-1 == (this.field_n ^ -1)) {
                    if ((dc.field_b ^ -1) == -99) {
                      this.field_d = false;
                      if (0 <= this.field_j) {
                        return;
                      } else {
                        this.field_j = param0;
                        return;
                      }
                    } else {
                      if (dc.field_b == 99) {
                        this.field_d = false;
                        if (0 <= this.field_j) {
                          return;
                        } else {
                          this.field_j = param0;
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
          L2: {
            if (-1 != (this.field_n ^ -1)) {
              break L2;
            } else {
              if ((dc.field_b ^ -1) == -99) {
                this.field_d = false;
                if (0 <= this.field_j) {
                  break L2;
                } else {
                  this.field_j = param0;
                  return;
                }
              } else {
                if (dc.field_b != 99) {
                  break L2;
                } else {
                  this.field_d = false;
                  if (0 <= this.field_j) {
                    return;
                  } else {
                    this.field_j = param0;
                    return;
                  }
                }
              }
            }
          }
          return;
        } else {
          if (96 == dc.field_b) {
            if (this.field_j > 0) {
              L3: {
                this.field_j = this.field_j - 1;
                this.field_d = false;
                if (this.field_n != 0) {
                  break L3;
                } else {
                  if (-98 != (dc.field_b ^ -1)) {
                    break L3;
                  } else {
                    this.field_j = this.field_j + 1;
                    this.field_d = false;
                    if (this.field_r <= this.field_j) {
                      this.field_j = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (-1 != (this.field_n ^ -1)) {
                  break L4;
                } else {
                  L5: {
                    if ((dc.field_b ^ -1) == -99) {
                      break L5;
                    } else {
                      if (dc.field_b != 99) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  this.field_d = false;
                  if (0 <= this.field_j) {
                    break L4;
                  } else {
                    this.field_j = param0;
                    break L4;
                  }
                }
              }
              return;
            } else {
              this.field_j = this.field_r;
              this.field_j = this.field_j - 1;
              this.field_d = false;
              if (this.field_n == 0) {
                if (-98 == (dc.field_b ^ -1)) {
                  this.field_j = this.field_j + 1;
                  this.field_d = false;
                  if (this.field_r <= this.field_j) {
                    this.field_j = 0;
                    if (-1 == (this.field_n ^ -1)) {
                      if ((dc.field_b ^ -1) == -99) {
                        this.field_d = false;
                        if (0 <= this.field_j) {
                          return;
                        } else {
                          this.field_j = param0;
                          return;
                        }
                      } else {
                        if (dc.field_b == 99) {
                          this.field_d = false;
                          if (0 > this.field_j) {
                            this.field_j = param0;
                            return;
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
                    L6: {
                      if (-1 != (this.field_n ^ -1)) {
                        break L6;
                      } else {
                        L7: {
                          if ((dc.field_b ^ -1) == -99) {
                            break L7;
                          } else {
                            if (dc.field_b != 99) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        this.field_d = false;
                        if (0 <= this.field_j) {
                          break L6;
                        } else {
                          this.field_j = param0;
                          break L6;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  if (-1 == (this.field_n ^ -1)) {
                    if ((dc.field_b ^ -1) == -99) {
                      this.field_d = false;
                      if (0 > this.field_j) {
                        this.field_j = param0;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (dc.field_b == 99) {
                        L8: {
                          this.field_d = false;
                          if (0 <= this.field_j) {
                            break L8;
                          } else {
                            this.field_j = param0;
                            break L8;
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
                if (-1 == (this.field_n ^ -1)) {
                  if ((dc.field_b ^ -1) == -99) {
                    this.field_d = false;
                    if (0 > this.field_j) {
                      this.field_j = param0;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (dc.field_b == 99) {
                      L9: {
                        this.field_d = false;
                        if (0 <= this.field_j) {
                          break L9;
                        } else {
                          this.field_j = param0;
                          break L9;
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
          } else {
            if (this.field_n == 0) {
              if (-98 != (dc.field_b ^ -1)) {
                L10: {
                  if (-1 != (this.field_n ^ -1)) {
                    break L10;
                  } else {
                    L11: {
                      if ((dc.field_b ^ -1) == -99) {
                        break L11;
                      } else {
                        if (dc.field_b != 99) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    this.field_d = false;
                    if (0 <= this.field_j) {
                      break L10;
                    } else {
                      this.field_j = param0;
                      break L10;
                    }
                  }
                }
                return;
              } else {
                L12: {
                  this.field_j = this.field_j + 1;
                  this.field_d = false;
                  if (this.field_r <= this.field_j) {
                    this.field_j = 0;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (-1 != (this.field_n ^ -1)) {
                    break L13;
                  } else {
                    L14: {
                      if ((dc.field_b ^ -1) == -99) {
                        break L14;
                      } else {
                        if (dc.field_b != 99) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    this.field_d = false;
                    if (0 <= this.field_j) {
                      break L13;
                    } else {
                      this.field_j = param0;
                      break L13;
                    }
                  }
                }
                return;
              }
            } else {
              L15: {
                if (-1 != (this.field_n ^ -1)) {
                  break L15;
                } else {
                  L16: {
                    if ((dc.field_b ^ -1) == -99) {
                      break L16;
                    } else {
                      if (dc.field_b != 99) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  this.field_d = false;
                  if (0 <= this.field_j) {
                    break L15;
                  } else {
                    this.field_j = param0;
                    break L15;
                  }
                }
              }
              return;
            }
          }
        }
    }

    final void d(int param0) {
        this.field_l = 0;
        this.field_c = 0;
        this.field_e = 0;
        if (this.field_n != 0) {
          if (param0 != (this.field_n ^ -1)) {
            if (-1 == (this.field_n ^ -1)) {
              if (dc.field_b == 99) {
                this.field_j = this.field_j + 1;
                if (this.field_r > this.field_j) {
                  this.field_d = false;
                  return;
                } else {
                  this.field_j = 0;
                  this.field_d = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (dc.field_b == 98) {
              if (this.field_j > 0) {
                this.field_d = false;
                this.field_j = this.field_j - 1;
                if (-1 == (this.field_n ^ -1)) {
                  if (dc.field_b == 99) {
                    this.field_j = this.field_j + 1;
                    if (this.field_r > this.field_j) {
                      this.field_d = false;
                      return;
                    } else {
                      this.field_j = 0;
                      this.field_d = false;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                this.field_j = this.field_r;
                this.field_d = false;
                this.field_j = this.field_j - 1;
                if (-1 == (this.field_n ^ -1)) {
                  if (dc.field_b == 99) {
                    this.field_j = this.field_j + 1;
                    if (this.field_r > this.field_j) {
                      this.field_d = false;
                      return;
                    } else {
                      this.field_j = 0;
                      this.field_d = false;
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
              if (-1 == (this.field_n ^ -1)) {
                if (dc.field_b == 99) {
                  this.field_j = this.field_j + 1;
                  if (this.field_r > this.field_j) {
                    this.field_d = false;
                    return;
                  } else {
                    this.field_j = 0;
                    this.field_d = false;
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
        } else {
          this.field_e = dc.field_b;
          if (param0 == (this.field_n ^ -1)) {
            L0: {
              if (dc.field_b == 98) {
                if (this.field_j > 0) {
                  this.field_d = false;
                  this.field_j = this.field_j - 1;
                  break L0;
                } else {
                  this.field_j = this.field_r;
                  this.field_d = false;
                  this.field_j = this.field_j - 1;
                  if (-1 == (this.field_n ^ -1)) {
                    if (dc.field_b == 99) {
                      this.field_j = this.field_j + 1;
                      if (this.field_r > this.field_j) {
                        this.field_d = false;
                        return;
                      } else {
                        this.field_j = 0;
                        this.field_d = false;
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
                break L0;
              }
            }
            if (-1 == (this.field_n ^ -1)) {
              if (dc.field_b == 99) {
                this.field_j = this.field_j + 1;
                if (this.field_r > this.field_j) {
                  this.field_d = false;
                  return;
                } else {
                  this.field_j = 0;
                  this.field_d = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (-1 == (this.field_n ^ -1)) {
              if (dc.field_b == 99) {
                this.field_j = this.field_j + 1;
                if (this.field_r > this.field_j) {
                  this.field_d = false;
                  return;
                } else {
                  this.field_j = 0;
                  this.field_d = false;
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

    final void a(int param0, int param1, boolean param2, byte param3) {
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
        ((re) (this)).field_d = stackIn_3_1 != 0;
        this.field_n = 0;
        if (param3 < -126) {
          if (this.field_d) {
            this.field_j = param0;
            return;
          } else {
            this.field_j = param1;
            return;
          }
        } else {
          field_k = (jp) null;
          if (this.field_d) {
            this.field_j = param0;
            return;
          } else {
            this.field_j = param1;
            return;
          }
        }
    }

    final static void f(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        wj var3_ref_wj = null;
        int var3 = 0;
        ln var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        pi var9 = null;
        byte[] var13 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param0 == -71) {
              L1: {
                var9 = jl.field_e;
                var2 = var9.l(255);
                if (0 != var2) {
                  if (-2 == (var2 ^ -1)) {
                    var3 = var9.e(255);
                    var4 = (ln) ((Object) ie.field_v.d(-37));
                    L2: while (true) {
                      L3: {
                        if (var4 == null) {
                          break L3;
                        } else {
                          if (var3 == var4.field_m) {
                            break L3;
                          } else {
                            var4 = (ln) ((Object) ie.field_v.a((byte) 116));
                            continue L2;
                          }
                        }
                      }
                      if (var4 == null) {
                        hn.a((byte) 104);
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4.b((byte) 111);
                        break L1;
                      }
                    }
                  } else {
                    rk.a("A1: " + eq.c((byte) -101), (Throwable) null, 123);
                    hn.a((byte) 60);
                    break L1;
                  }
                } else {
                  var3_ref_wj = (wj) ((Object) uc.field_q.d(-110));
                  if (var3_ref_wj != null) {
                    L4: {
                      var4_int = var9.l(255);
                      if (var4_int == 0) {
                        var5 = null;
                        break L4;
                      } else {
                        var13 = new byte[var4_int];
                        var9.a(0, var13, 116, var4_int);
                        break L4;
                      }
                    }
                    var9.field_l = var9.field_l + 4;
                    if (var9.d((byte) -27)) {
                      var3_ref_wj.b((byte) 111);
                      break L1;
                    } else {
                      hn.a((byte) 86);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    hn.a((byte) 76);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "re.P(" + param0 + ')');
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

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -98) {
          L0: {
            field_k = (jp) null;
            if ((this.field_e ^ -1) != -98) {
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
            if ((this.field_e ^ -1) != -98) {
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

    final void a(int param0, int param1, int param2) {
        if (this.field_r <= param0) {
          throw new IllegalArgumentException();
        } else {
          if (param2 < this.field_r) {
            this.field_e = 0;
            this.field_l = 0;
            if (param1 == 27479) {
              L0: {
                this.field_c = 0;
                if (ki.field_e != 0) {
                  this.field_o = vd.field_c;
                  this.field_j = param2;
                  this.field_l = ki.field_e;
                  this.field_c = ki.field_e;
                  this.field_n = ki.field_e;
                  this.field_d = true;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (0 != this.field_n) {
                if (-1 != (cb.field_q ^ -1)) {
                  L1: {
                    if ((this.field_o ^ -1) >= -1) {
                      this.field_l = this.field_n;
                      this.field_o = pe.field_q;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    this.field_o = this.field_o - 1;
                    if (-1 != (ki.field_e ^ -1)) {
                      break L2;
                    } else {
                      if (-1 == (cb.field_q ^ -1)) {
                        this.field_n = 0;
                        break L2;
                      } else {
                        L3: {
                          if (this.field_n != 0) {
                            break L3;
                          } else {
                            L4: {
                              if (this.field_d) {
                                break L4;
                              } else {
                                if (!kb.field_Xb) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            if ((param0 ^ -1) > -1) {
                              if (this.field_d) {
                                this.field_j = -1;
                                break L3;
                              } else {
                                return;
                              }
                            } else {
                              if (param0 != this.field_j) {
                                this.field_d = true;
                                this.field_j = param0;
                                return;
                              } else {
                                this.field_d = true;
                                this.field_j = param0;
                                return;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  L5: {
                    if (this.field_n != 0) {
                      break L5;
                    } else {
                      if (this.field_d) {
                        if ((param0 ^ -1) > -1) {
                          if (this.field_d) {
                            this.field_j = -1;
                            break L5;
                          } else {
                            return;
                          }
                        } else {
                          if (param0 != this.field_j) {
                            this.field_d = true;
                            this.field_j = param0;
                            return;
                          } else {
                            this.field_d = true;
                            this.field_j = param0;
                            return;
                          }
                        }
                      } else {
                        if (!kb.field_Xb) {
                          break L5;
                        } else {
                          if ((param0 ^ -1) > -1) {
                            if (this.field_d) {
                              this.field_j = -1;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (param0 != this.field_j) {
                              this.field_d = true;
                              this.field_j = param0;
                              return;
                            } else {
                              this.field_d = true;
                              this.field_j = param0;
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  L6: {
                    if (-1 != (ki.field_e ^ -1)) {
                      break L6;
                    } else {
                      if (-1 == (cb.field_q ^ -1)) {
                        this.field_n = 0;
                        break L6;
                      } else {
                        if (this.field_n == 0) {
                          L7: {
                            if (this.field_d) {
                              break L7;
                            } else {
                              if (kb.field_Xb) {
                                break L7;
                              } else {
                                return;
                              }
                            }
                          }
                          if ((param0 ^ -1) > -1) {
                            if (this.field_d) {
                              this.field_j = -1;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (param0 != this.field_j) {
                              this.field_d = true;
                              this.field_j = param0;
                              return;
                            } else {
                              this.field_d = true;
                              this.field_j = param0;
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (this.field_n == 0) {
                    if (this.field_d) {
                      if ((param0 ^ -1) > -1) {
                        if (!this.field_d) {
                          return;
                        } else {
                          this.field_j = -1;
                          return;
                        }
                      } else {
                        if (param0 != this.field_j) {
                          this.field_d = true;
                          this.field_j = param0;
                          return;
                        } else {
                          this.field_d = true;
                          this.field_j = param0;
                          return;
                        }
                      }
                    } else {
                      if (kb.field_Xb) {
                        if ((param0 ^ -1) > -1) {
                          if (!this.field_d) {
                            return;
                          } else {
                            this.field_j = -1;
                            return;
                          }
                        } else {
                          if (param0 != this.field_j) {
                            this.field_d = true;
                            this.field_j = param0;
                            return;
                          } else {
                            this.field_d = true;
                            this.field_j = param0;
                            return;
                          }
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
                L8: {
                  if (-1 != (ki.field_e ^ -1)) {
                    break L8;
                  } else {
                    if (-1 == (cb.field_q ^ -1)) {
                      this.field_n = 0;
                      break L8;
                    } else {
                      if (this.field_n == 0) {
                        L9: {
                          if (this.field_d) {
                            break L9;
                          } else {
                            if (kb.field_Xb) {
                              break L9;
                            } else {
                              return;
                            }
                          }
                        }
                        if ((param0 ^ -1) > -1) {
                          if (!this.field_d) {
                            return;
                          } else {
                            this.field_j = -1;
                            return;
                          }
                        } else {
                          if (param0 != this.field_j) {
                            this.field_d = true;
                            this.field_j = param0;
                            return;
                          } else {
                            this.field_d = true;
                            this.field_j = param0;
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (this.field_n == 0) {
                  if (this.field_d) {
                    if ((param0 ^ -1) > -1) {
                      if (!this.field_d) {
                        return;
                      } else {
                        this.field_j = -1;
                        return;
                      }
                    } else {
                      if (param0 != this.field_j) {
                        this.field_d = true;
                        this.field_j = param0;
                        return;
                      } else {
                        this.field_d = true;
                        this.field_j = param0;
                        return;
                      }
                    }
                  } else {
                    if (kb.field_Xb) {
                      if ((param0 ^ -1) > -1) {
                        if (!this.field_d) {
                          return;
                        } else {
                          this.field_j = -1;
                          return;
                        }
                      } else {
                        if (param0 != this.field_j) {
                          this.field_d = true;
                          this.field_j = param0;
                          return;
                        } else {
                          this.field_d = true;
                          this.field_j = param0;
                          return;
                        }
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
                this.field_l = -88;
                this.field_c = 0;
                if (ki.field_e != 0) {
                  this.field_o = vd.field_c;
                  this.field_j = param2;
                  this.field_l = ki.field_e;
                  this.field_c = ki.field_e;
                  this.field_n = ki.field_e;
                  this.field_d = true;
                  break L10;
                } else {
                  break L10;
                }
              }
              if (0 != this.field_n) {
                if (-1 == (cb.field_q ^ -1)) {
                  L11: {
                    if (-1 != (ki.field_e ^ -1)) {
                      break L11;
                    } else {
                      if (-1 == (cb.field_q ^ -1)) {
                        this.field_n = 0;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (this.field_n != 0) {
                      break L12;
                    } else {
                      L13: {
                        if (this.field_d) {
                          break L13;
                        } else {
                          if (!kb.field_Xb) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      if ((param0 ^ -1) > -1) {
                        if (this.field_d) {
                          this.field_j = -1;
                          break L12;
                        } else {
                          break L12;
                        }
                      } else {
                        if (param0 != this.field_j) {
                          this.field_d = true;
                          this.field_j = param0;
                          break L12;
                        } else {
                          this.field_d = true;
                          this.field_j = param0;
                          break L12;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  L14: {
                    if ((this.field_o ^ -1) >= -1) {
                      this.field_l = this.field_n;
                      this.field_o = pe.field_q;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    this.field_o = this.field_o - 1;
                    if (-1 != (ki.field_e ^ -1)) {
                      break L15;
                    } else {
                      if (-1 == (cb.field_q ^ -1)) {
                        this.field_n = 0;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (this.field_n != 0) {
                      break L16;
                    } else {
                      L17: {
                        if (this.field_d) {
                          break L17;
                        } else {
                          if (!kb.field_Xb) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      if ((param0 ^ -1) > -1) {
                        if (this.field_d) {
                          this.field_j = -1;
                          break L16;
                        } else {
                          break L16;
                        }
                      } else {
                        if (param0 != this.field_j) {
                          this.field_d = true;
                          this.field_j = param0;
                          break L16;
                        } else {
                          this.field_d = true;
                          this.field_j = param0;
                          break L16;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L18: {
                  if (-1 != (ki.field_e ^ -1)) {
                    break L18;
                  } else {
                    if (-1 == (cb.field_q ^ -1)) {
                      this.field_n = 0;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                }
                L19: {
                  if (this.field_n != 0) {
                    break L19;
                  } else {
                    L20: {
                      if (this.field_d) {
                        break L20;
                      } else {
                        if (!kb.field_Xb) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    if ((param0 ^ -1) > -1) {
                      if (this.field_d) {
                        this.field_j = -1;
                        break L19;
                      } else {
                        break L19;
                      }
                    } else {
                      if (param0 != this.field_j) {
                        this.field_d = true;
                        this.field_j = param0;
                        break L19;
                      } else {
                        this.field_d = true;
                        this.field_j = param0;
                        break L19;
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    final void d(byte param0) {
        if (param0 == -124) {
          this.field_e = 0;
          this.field_l = 0;
          this.field_c = 0;
          if (this.field_n == 0) {
            this.field_e = dc.field_b;
            return;
          } else {
            return;
          }
        } else {
          field_b = (dj) null;
          this.field_e = 0;
          this.field_l = 0;
          this.field_c = 0;
          if (this.field_n != 0) {
            return;
          } else {
            this.field_e = dc.field_b;
            return;
          }
        }
    }

    final static int e(byte param0) {
        if (param0 <= 28) {
            re.b((byte) 56);
            return 256;
        }
        return 256;
    }

    final boolean c(byte param0) {
        int var2 = 0;
        var2 = 77 % ((44 - param0) / 51);
        if (this.field_l == 0) {
          if (84 != this.field_e) {
            if (83 == this.field_e) {
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
    }

    final boolean a(int param0) {
        if (param0 != -1) {
            return false;
        }
        return this.field_e == 103 ? true : false;
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            this.d(-91);
            if (this.field_n == 0) {
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
            if (this.field_n == 0) {
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

    final boolean g(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -57) {
          L0: {
            this.field_j = 105;
            if (this.field_e != 96) {
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
            if (this.field_e != 96) {
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

    final void a(boolean param0, int param1) {
        if (-1 != (this.field_n ^ -1)) {
          if (param0) {
            this.field_e = -38;
            return;
          } else {
            return;
          }
        } else {
          this.field_j = param1;
          this.field_d = false;
          if (!param0) {
            return;
          } else {
            this.field_e = -38;
            return;
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
        if (param0 != -103) {
          L0: {
            this.a(-49, -52, false, (byte) 110);
            if ((this.field_e ^ -1) != -103) {
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
            if ((this.field_e ^ -1) != -103) {
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

    final boolean a(byte param0) {
        if (param0 == 113) {
          if (0 == this.field_c) {
            if (84 != this.field_e) {
              if ((this.field_e ^ -1) == -84) {
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
          return true;
        }
    }

    re(int param0) {
        this.field_j = 0;
        this.field_d = false;
        this.field_r = param0;
    }

    static {
        field_f = "<%0> is not a member, and cannot play with the current options.";
        field_a = "No";
        field_p = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
