/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    static int field_c;
    private int field_e;
    private int field_a;
    static boolean field_j;
    private boolean field_k;
    private int field_h;
    int field_f;
    private int field_d;
    static int[] field_i;
    int field_g;
    static String field_b;
    private int field_l;

    final boolean d(byte param0) {
        if (param0 < 0) {
          if (this.field_d == 0) {
            if (this.field_a != 84) {
              if (-84 == (this.field_a ^ -1)) {
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

    final boolean e(byte param0) {
        if (param0 > -25) {
            return true;
        }
        return 97 == this.field_a ? true : false;
    }

    final static o b(int param0) {
        int var1 = 0;
        byte[] var2 = null;
        int[] var3 = null;
        int var4_int = 0;
        o var4 = null;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        var1 = sa.field_l[0] * uj.field_b[0];
        var2 = jc.field_c[0];
        var3 = new int[var1];
        var4_int = 0;
        L0: while (true) {
          L1: {
            if (var4_int >= var1) {
              break L1;
            } else {
              var3[var4_int] = ig.field_H[fi.a(255, (int) var2[var4_int])];
              var4_int++;
              if (var5 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = new o(kl.field_a, we.field_e, ph.field_h[param0], qf.field_d[0], sa.field_l[0], uj.field_b[0], var3);
          og.a((byte) -97);
          return var4;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = -18 / ((param0 - -23) / 53);
        field_i = null;
    }

    final static Boolean d(int param0) {
        if (param0 > -109) {
            return (Boolean) null;
        }
        Boolean var1 = n.field_b;
        n.field_b = null;
        return var1;
    }

    final void a(int param0, boolean param1) {
        this.field_d = 0;
        this.field_e = 0;
        this.field_a = 0;
        if (this.field_l == 0) {
          if ((el.field_n ^ -1) == -97) {
            if (0 < this.field_f) {
              L0: {
                this.field_f = this.field_f - 1;
                this.field_k = false;
                if (0 == this.field_l) {
                  this.field_a = el.field_n;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (-1 != (this.field_l ^ -1)) {
                  break L1;
                } else {
                  if (97 == el.field_n) {
                    this.field_f = this.field_f + 1;
                    this.field_k = false;
                    if (this.field_g > this.field_f) {
                      break L1;
                    } else {
                      this.field_f = 0;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (this.field_l != 0) {
                  break L2;
                } else {
                  L3: {
                    if (el.field_n == 98) {
                      break L3;
                    } else {
                      if (el.field_n == 99) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if ((this.field_f ^ -1) > -1) {
                      this.field_f = param0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_k = false;
                  break L2;
                }
              }
              L5: {
                if (!param1) {
                  break L5;
                } else {
                  this.field_a = -114;
                  break L5;
                }
              }
              return;
            } else {
              this.field_f = this.field_g;
              L6: {
                this.field_f = this.field_f - 1;
                this.field_k = false;
                if (0 == this.field_l) {
                  this.field_a = el.field_n;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (-1 != (this.field_l ^ -1)) {
                  break L7;
                } else {
                  if (97 == el.field_n) {
                    this.field_f = this.field_f + 1;
                    this.field_k = false;
                    if (this.field_g > this.field_f) {
                      break L7;
                    } else {
                      this.field_f = 0;
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (this.field_l != 0) {
                  break L8;
                } else {
                  L9: {
                    if (el.field_n == 98) {
                      break L9;
                    } else {
                      if (el.field_n == 99) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    if ((this.field_f ^ -1) > -1) {
                      this.field_f = param0;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  this.field_k = false;
                  break L8;
                }
              }
              if (param1) {
                this.field_a = -114;
                return;
              } else {
                return;
              }
            }
          } else {
            L11: {
              if (0 == this.field_l) {
                this.field_a = el.field_n;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (-1 != (this.field_l ^ -1)) {
                break L12;
              } else {
                if (97 == el.field_n) {
                  this.field_f = this.field_f + 1;
                  this.field_k = false;
                  if (this.field_g > this.field_f) {
                    break L12;
                  } else {
                    L13: {
                      this.field_f = 0;
                      if (this.field_l != 0) {
                        break L13;
                      } else {
                        L14: {
                          if (el.field_n == 98) {
                            break L14;
                          } else {
                            if (el.field_n == 99) {
                              break L14;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L15: {
                          if ((this.field_f ^ -1) > -1) {
                            this.field_f = param0;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        this.field_k = false;
                        break L13;
                      }
                    }
                    L16: {
                      if (!param1) {
                        break L16;
                      } else {
                        this.field_a = -114;
                        break L16;
                      }
                    }
                    return;
                  }
                } else {
                  L17: {
                    if (this.field_l != 0) {
                      break L17;
                    } else {
                      L18: {
                        if (el.field_n == 98) {
                          break L18;
                        } else {
                          if (el.field_n == 99) {
                            break L18;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L19: {
                        if ((this.field_f ^ -1) > -1) {
                          this.field_f = param0;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      this.field_k = false;
                      break L17;
                    }
                  }
                  L20: {
                    if (!param1) {
                      break L20;
                    } else {
                      this.field_a = -114;
                      break L20;
                    }
                  }
                  return;
                }
              }
            }
            L21: {
              if (this.field_l != 0) {
                break L21;
              } else {
                L22: {
                  if (el.field_n == 98) {
                    break L22;
                  } else {
                    if (el.field_n == 99) {
                      break L22;
                    } else {
                      L23: {
                        if (!param1) {
                          break L23;
                        } else {
                          this.field_a = -114;
                          break L23;
                        }
                      }
                      return;
                    }
                  }
                }
                L24: {
                  if ((this.field_f ^ -1) > -1) {
                    this.field_f = param0;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                this.field_k = false;
                break L21;
              }
            }
            if (param1) {
              this.field_a = -114;
              return;
            } else {
              return;
            }
          }
        } else {
          L25: {
            if (0 == this.field_l) {
              this.field_a = el.field_n;
              break L25;
            } else {
              break L25;
            }
          }
          L26: {
            if (-1 != (this.field_l ^ -1)) {
              break L26;
            } else {
              if (97 == el.field_n) {
                this.field_f = this.field_f + 1;
                this.field_k = false;
                if (this.field_g > this.field_f) {
                  break L26;
                } else {
                  L27: {
                    this.field_f = 0;
                    if (this.field_l != 0) {
                      break L27;
                    } else {
                      L28: {
                        if (el.field_n == 98) {
                          break L28;
                        } else {
                          if (el.field_n == 99) {
                            break L28;
                          } else {
                            break L27;
                          }
                        }
                      }
                      L29: {
                        if ((this.field_f ^ -1) > -1) {
                          this.field_f = param0;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      this.field_k = false;
                      break L27;
                    }
                  }
                  L30: {
                    if (!param1) {
                      break L30;
                    } else {
                      this.field_a = -114;
                      break L30;
                    }
                  }
                  return;
                }
              } else {
                L31: {
                  if (this.field_l != 0) {
                    break L31;
                  } else {
                    L32: {
                      if (el.field_n == 98) {
                        break L32;
                      } else {
                        if (el.field_n == 99) {
                          break L32;
                        } else {
                          break L31;
                        }
                      }
                    }
                    L33: {
                      if ((this.field_f ^ -1) > -1) {
                        this.field_f = param0;
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    this.field_k = false;
                    break L31;
                  }
                }
                L34: {
                  if (!param1) {
                    break L34;
                  } else {
                    this.field_a = -114;
                    break L34;
                  }
                }
                return;
              }
            }
          }
          L35: {
            if (this.field_l != 0) {
              break L35;
            } else {
              L36: {
                if (el.field_n == 98) {
                  break L36;
                } else {
                  if (el.field_n == 99) {
                    break L36;
                  } else {
                    L37: {
                      if (!param1) {
                        break L37;
                      } else {
                        this.field_a = -114;
                        break L37;
                      }
                    }
                    return;
                  }
                }
              }
              L38: {
                if ((this.field_f ^ -1) > -1) {
                  this.field_f = param0;
                  break L38;
                } else {
                  break L38;
                }
              }
              this.field_k = false;
              break L35;
            }
          }
          if (param1) {
            this.field_a = -114;
            return;
          } else {
            return;
          }
        }
    }

    final static void b(boolean param0) {
        if (10 == fj.field_i) {
          jd.n(-110);
          fj.field_i = 11;
          ib.field_o = true;
          if (!param0) {
            return;
          } else {
            field_c = 51;
            return;
          }
        } else {
          if (!rd.b(6144)) {
            jd.n(-110);
            fj.field_i = 11;
            ib.field_o = true;
            if (param0) {
              field_c = 51;
              return;
            } else {
              return;
            }
          } else {
            ib.field_o = true;
            if (!param0) {
              return;
            } else {
              field_c = 51;
              return;
            }
          }
        }
    }

    final void a(boolean param0) {
        this.field_e = 0;
        this.field_d = 0;
        this.field_a = 0;
        if (0 == this.field_l) {
          if (-99 == (el.field_n ^ -1)) {
            if (0 < this.field_f) {
              this.field_k = false;
              this.field_f = this.field_f - 1;
              if (this.field_l == 0) {
                this.field_a = el.field_n;
                if (0 == this.field_l) {
                  L0: {
                    if (-100 != (el.field_n ^ -1)) {
                      break L0;
                    } else {
                      this.field_f = this.field_f + 1;
                      this.field_k = false;
                      if (this.field_f >= this.field_g) {
                        this.field_f = 0;
                        break L0;
                      } else {
                        if (!param0) {
                          this.field_l = 75;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (!param0) {
                    this.field_l = 75;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (!param0) {
                    this.field_l = 75;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L1: {
                  if (0 != this.field_l) {
                    break L1;
                  } else {
                    if (-100 != (el.field_n ^ -1)) {
                      break L1;
                    } else {
                      this.field_f = this.field_f + 1;
                      this.field_k = false;
                      if (this.field_f >= this.field_g) {
                        this.field_f = 0;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                if (!param0) {
                  this.field_l = 75;
                  return;
                } else {
                  return;
                }
              }
            } else {
              this.field_f = this.field_g;
              this.field_k = false;
              this.field_f = this.field_f - 1;
              if (this.field_l != 0) {
                L2: {
                  if (0 != this.field_l) {
                    break L2;
                  } else {
                    if (-100 != (el.field_n ^ -1)) {
                      break L2;
                    } else {
                      this.field_f = this.field_f + 1;
                      this.field_k = false;
                      if (this.field_f >= this.field_g) {
                        this.field_f = 0;
                        break L2;
                      } else {
                        if (!param0) {
                          this.field_l = 75;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                if (param0) {
                  return;
                } else {
                  this.field_l = 75;
                  return;
                }
              } else {
                L3: {
                  this.field_a = el.field_n;
                  if (0 != this.field_l) {
                    break L3;
                  } else {
                    if (-100 != (el.field_n ^ -1)) {
                      break L3;
                    } else {
                      this.field_f = this.field_f + 1;
                      this.field_k = false;
                      if (this.field_f >= this.field_g) {
                        this.field_f = 0;
                        break L3;
                      } else {
                        L4: {
                          if (param0) {
                            break L4;
                          } else {
                            this.field_l = 75;
                            break L4;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                if (!param0) {
                  this.field_l = 75;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (this.field_l != 0) {
              L5: {
                if (0 != this.field_l) {
                  break L5;
                } else {
                  if (-100 != (el.field_n ^ -1)) {
                    break L5;
                  } else {
                    this.field_f = this.field_f + 1;
                    this.field_k = false;
                    if (this.field_f >= this.field_g) {
                      this.field_f = 0;
                      break L5;
                    } else {
                      L6: {
                        if (param0) {
                          break L6;
                        } else {
                          this.field_l = 75;
                          break L6;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (!param0) {
                this.field_l = 75;
                return;
              } else {
                return;
              }
            } else {
              L7: {
                this.field_a = el.field_n;
                if (0 != this.field_l) {
                  break L7;
                } else {
                  if (-100 != (el.field_n ^ -1)) {
                    break L7;
                  } else {
                    this.field_f = this.field_f + 1;
                    this.field_k = false;
                    if (this.field_f >= this.field_g) {
                      this.field_f = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L8: {
                if (param0) {
                  break L8;
                } else {
                  this.field_l = 75;
                  break L8;
                }
              }
              return;
            }
          }
        } else {
          if (this.field_l != 0) {
            L9: {
              if (0 != this.field_l) {
                break L9;
              } else {
                if (-100 != (el.field_n ^ -1)) {
                  break L9;
                } else {
                  this.field_f = this.field_f + 1;
                  this.field_k = false;
                  if (this.field_f >= this.field_g) {
                    this.field_f = 0;
                    break L9;
                  } else {
                    L10: {
                      if (param0) {
                        break L10;
                      } else {
                        this.field_l = 75;
                        break L10;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (!param0) {
              this.field_l = 75;
              return;
            } else {
              return;
            }
          } else {
            L11: {
              this.field_a = el.field_n;
              if (0 != this.field_l) {
                break L11;
              } else {
                if (-100 != (el.field_n ^ -1)) {
                  break L11;
                } else {
                  this.field_f = this.field_f + 1;
                  this.field_k = false;
                  if (this.field_f >= this.field_g) {
                    this.field_f = 0;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
            }
            L12: {
              if (param0) {
                break L12;
              } else {
                this.field_l = 75;
                break L12;
              }
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        o discarded$1 = null;
        if (param0 <= -114) {
          if (param1 >= this.field_g) {
            throw new IllegalArgumentException();
          } else {
            if (param2 >= this.field_g) {
              throw new IllegalArgumentException();
            } else {
              this.field_d = 0;
              this.field_a = 0;
              this.field_e = 0;
              if (hg.field_F == 0) {
                L0: {
                  if (-1 == (this.field_l ^ -1)) {
                    break L0;
                  } else {
                    if (wb.field_c == 0) {
                      break L0;
                    } else {
                      L1: {
                        if (0 >= this.field_h) {
                          this.field_h = dh.field_i;
                          this.field_e = this.field_l;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      this.field_h = this.field_h - 1;
                      break L0;
                    }
                  }
                }
                L2: {
                  if (0 != hg.field_F) {
                    break L2;
                  } else {
                    if (-1 != (wb.field_c ^ -1)) {
                      break L2;
                    } else {
                      this.field_l = 0;
                      if (this.field_l == 0) {
                        L3: {
                          if (this.field_k) {
                            break L3;
                          } else {
                            if (ne.field_d) {
                              break L3;
                            } else {
                              return;
                            }
                          }
                        }
                        L4: {
                          if (param1 < 0) {
                            break L4;
                          } else {
                            if (param1 == this.field_f) {
                              this.field_f = param1;
                              this.field_k = true;
                              if (SolKnight.field_L) {
                                break L4;
                              } else {
                                return;
                              }
                            } else {
                              this.field_f = param1;
                              this.field_k = true;
                              if (SolKnight.field_L) {
                                if (this.field_k) {
                                  this.field_f = -1;
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
                        if (this.field_k) {
                          this.field_f = -1;
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
                if (this.field_l == 0) {
                  L5: {
                    if (this.field_k) {
                      break L5;
                    } else {
                      if (ne.field_d) {
                        break L5;
                      } else {
                        return;
                      }
                    }
                  }
                  L6: {
                    if (param1 < 0) {
                      break L6;
                    } else {
                      if (param1 == this.field_f) {
                        this.field_f = param1;
                        this.field_k = true;
                        if (SolKnight.field_L) {
                          break L6;
                        } else {
                          return;
                        }
                      } else {
                        this.field_f = param1;
                        this.field_k = true;
                        if (SolKnight.field_L) {
                          if (!this.field_k) {
                            return;
                          } else {
                            this.field_f = -1;
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (this.field_k) {
                    this.field_f = -1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L7: {
                  this.field_e = hg.field_F;
                  this.field_d = hg.field_F;
                  this.field_f = param2;
                  this.field_k = true;
                  this.field_h = qa.field_k;
                  this.field_l = hg.field_F;
                  if (-1 == (this.field_l ^ -1)) {
                    break L7;
                  } else {
                    if (wb.field_c == 0) {
                      break L7;
                    } else {
                      L8: {
                        if (0 >= this.field_h) {
                          this.field_h = dh.field_i;
                          this.field_e = this.field_l;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      this.field_h = this.field_h - 1;
                      break L7;
                    }
                  }
                }
                L9: {
                  if (0 != hg.field_F) {
                    break L9;
                  } else {
                    if (-1 != (wb.field_c ^ -1)) {
                      break L9;
                    } else {
                      this.field_l = 0;
                      break L9;
                    }
                  }
                }
                if (this.field_l == 0) {
                  L10: {
                    if (this.field_k) {
                      break L10;
                    } else {
                      if (ne.field_d) {
                        break L10;
                      } else {
                        return;
                      }
                    }
                  }
                  L11: {
                    if (param1 < 0) {
                      break L11;
                    } else {
                      if (param1 == this.field_f) {
                        this.field_f = param1;
                        this.field_k = true;
                        if (SolKnight.field_L) {
                          break L11;
                        } else {
                          return;
                        }
                      } else {
                        L12: {
                          this.field_f = param1;
                          this.field_k = true;
                          if (!SolKnight.field_L) {
                            break L12;
                          } else {
                            if (!this.field_k) {
                              break L12;
                            } else {
                              this.field_f = -1;
                              break L12;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (this.field_k) {
                    this.field_f = -1;
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
        } else {
          discarded$1 = sf.b(54);
          if (param1 >= this.field_g) {
            throw new IllegalArgumentException();
          } else {
            if (param2 >= this.field_g) {
              throw new IllegalArgumentException();
            } else {
              this.field_d = 0;
              this.field_a = 0;
              this.field_e = 0;
              if (hg.field_F != 0) {
                this.field_e = hg.field_F;
                this.field_d = hg.field_F;
                this.field_f = param2;
                this.field_k = true;
                this.field_h = qa.field_k;
                this.field_l = hg.field_F;
                if (-1 == (this.field_l ^ -1)) {
                  L13: {
                    if (0 != hg.field_F) {
                      break L13;
                    } else {
                      if (-1 != (wb.field_c ^ -1)) {
                        break L13;
                      } else {
                        this.field_l = 0;
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (this.field_l != 0) {
                      break L14;
                    } else {
                      L15: {
                        if (this.field_k) {
                          break L15;
                        } else {
                          if (ne.field_d) {
                            break L15;
                          } else {
                            break L14;
                          }
                        }
                      }
                      L16: {
                        if (param1 < 0) {
                          break L16;
                        } else {
                          L17: {
                            if (param1 == this.field_f) {
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          this.field_f = param1;
                          this.field_k = true;
                          if (!SolKnight.field_L) {
                            break L14;
                          } else {
                            break L16;
                          }
                        }
                      }
                      if (!this.field_k) {
                        break L14;
                      } else {
                        this.field_f = -1;
                        break L14;
                      }
                    }
                  }
                  return;
                } else {
                  L18: {
                    if (wb.field_c == 0) {
                      if (0 != hg.field_F) {
                        break L18;
                      } else {
                        if (-1 != (wb.field_c ^ -1)) {
                          break L18;
                        } else {
                          this.field_l = 0;
                          break L18;
                        }
                      }
                    } else {
                      if (0 != hg.field_F) {
                        break L18;
                      } else {
                        if (-1 != (wb.field_c ^ -1)) {
                          break L18;
                        } else {
                          this.field_l = 0;
                          break L18;
                        }
                      }
                    }
                  }
                  L19: {
                    if (this.field_l != 0) {
                      break L19;
                    } else {
                      L20: {
                        if (this.field_k) {
                          break L20;
                        } else {
                          if (ne.field_d) {
                            break L20;
                          } else {
                            break L19;
                          }
                        }
                      }
                      L21: {
                        if (param1 < 0) {
                          break L21;
                        } else {
                          L22: {
                            if (param1 == this.field_f) {
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          this.field_f = param1;
                          this.field_k = true;
                          if (!SolKnight.field_L) {
                            break L19;
                          } else {
                            break L21;
                          }
                        }
                      }
                      if (!this.field_k) {
                        break L19;
                      } else {
                        this.field_f = -1;
                        break L19;
                      }
                    }
                  }
                  return;
                }
              } else {
                L23: {
                  if (-1 != (this.field_l ^ -1)) {
                    if (0 != hg.field_F) {
                      break L23;
                    } else {
                      if (-1 != (wb.field_c ^ -1)) {
                        break L23;
                      } else {
                        this.field_l = 0;
                        break L23;
                      }
                    }
                  } else {
                    if (0 != hg.field_F) {
                      break L23;
                    } else {
                      if (-1 != (wb.field_c ^ -1)) {
                        break L23;
                      } else {
                        this.field_l = 0;
                        break L23;
                      }
                    }
                  }
                }
                L24: {
                  if (this.field_l != 0) {
                    break L24;
                  } else {
                    L25: {
                      if (this.field_k) {
                        break L25;
                      } else {
                        if (ne.field_d) {
                          break L25;
                        } else {
                          break L24;
                        }
                      }
                    }
                    L26: {
                      if (param1 < 0) {
                        break L26;
                      } else {
                        L27: {
                          if (param1 == this.field_f) {
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        this.field_f = param1;
                        this.field_k = true;
                        if (!SolKnight.field_L) {
                          break L24;
                        } else {
                          break L26;
                        }
                      }
                    }
                    if (!this.field_k) {
                      break L24;
                    } else {
                      this.field_f = -1;
                      break L24;
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    final boolean a(int param0) {
        if (param0 <= 46) {
            return false;
        }
        return 0 != this.field_l ? true : false;
    }

    final void a(byte param0, int param1) {
        boolean discarded$6 = false;
        if (param0 == 111) {
          if (this.field_l == 0) {
            this.field_f = param1;
            this.field_k = false;
            return;
          } else {
            return;
          }
        } else {
          discarded$6 = this.c(-3);
          if (this.field_l != 0) {
            return;
          } else {
            this.field_f = param1;
            this.field_k = false;
            return;
          }
        }
    }

    final void b(byte param0) {
        int var2 = 57 / ((param0 - 45) / 60);
        this.field_e = 0;
        this.field_a = 0;
        this.field_d = 0;
        if (!(this.field_l != 0)) {
            this.field_a = el.field_n;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
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
          if (!param0) {
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
        ((sf) (this)).field_k = stackIn_3_1 != 0;
        if (param3 >= 119) {
          if (!this.field_k) {
            this.field_f = param1;
            if (SolKnight.field_L) {
              this.field_f = param2;
              return;
            } else {
              return;
            }
          } else {
            this.field_f = param2;
            return;
          }
        } else {
          return;
        }
    }

    final boolean f(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          if (this.field_e == 0) {
            if ((this.field_a ^ -1) != -85) {
              if (-84 == (this.field_a ^ -1)) {
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
          this.field_e = 92;
          if (this.field_e == 0) {
            if ((this.field_a ^ -1) == -85) {
              return true;
            } else {
              L0: {
                if (-84 != (this.field_a ^ -1)) {
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

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 12542) {
          L0: {
            this.field_h = -69;
            if (103 != this.field_a) {
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
            if (103 != this.field_a) {
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

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        o discarded$1 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        vg.field_I[kg.field_c] = param2;
        if (!param1) {
          pd.field_e[kg.field_c] = kg.field_c;
          qg.field_c[kg.field_c] = param0;
          if (param0 <= be.field_I) {
            if (bb.field_G <= param0) {
              L0: {
                eh.field_a[kg.field_c] = param5;
                ld.field_M[kg.field_c] = param4;
                ma.field_n[kg.field_c] = param3;
                var6 = param3 + (param4 + param5);
                if (0 == var6) {
                  stackOut_68_0 = 0;
                  stackIn_69_0 = stackOut_68_0;
                  break L0;
                } else {
                  stackOut_67_0 = param5 * 1000 / var6;
                  stackIn_69_0 = stackOut_67_0;
                  break L0;
                }
              }
              L1: {
                var7 = stackIn_69_0;
                l.field_a[kg.field_c] = var7;
                kg.field_c = kg.field_c + 1;
                if (dc.field_o < var7) {
                  dc.field_o = var7;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (bi.field_e > var7) {
                bi.field_e = var7;
                return;
              } else {
                return;
              }
            } else {
              L2: {
                bi.field_e = param0;
                eh.field_a[kg.field_c] = param5;
                ld.field_M[kg.field_c] = param4;
                ma.field_n[kg.field_c] = param3;
                var6 = param3 + (param4 + param5);
                if (0 == var6) {
                  stackOut_58_0 = 0;
                  stackIn_59_0 = stackOut_58_0;
                  break L2;
                } else {
                  stackOut_57_0 = param5 * 1000 / var6;
                  stackIn_59_0 = stackOut_57_0;
                  break L2;
                }
              }
              L3: {
                var7 = stackIn_59_0;
                l.field_a[kg.field_c] = var7;
                kg.field_c = kg.field_c + 1;
                if (dc.field_o < var7) {
                  dc.field_o = var7;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (bi.field_e > var7) {
                bi.field_e = var7;
                return;
              } else {
                return;
              }
            }
          } else {
            dc.field_o = param0;
            if (bb.field_G <= param0) {
              L4: {
                eh.field_a[kg.field_c] = param5;
                ld.field_M[kg.field_c] = param4;
                ma.field_n[kg.field_c] = param3;
                var6 = param3 + (param4 + param5);
                if (0 == var6) {
                  stackOut_47_0 = 0;
                  stackIn_48_0 = stackOut_47_0;
                  break L4;
                } else {
                  stackOut_46_0 = param5 * 1000 / var6;
                  stackIn_48_0 = stackOut_46_0;
                  break L4;
                }
              }
              L5: {
                var7 = stackIn_48_0;
                l.field_a[kg.field_c] = var7;
                kg.field_c = kg.field_c + 1;
                if (dc.field_o < var7) {
                  dc.field_o = var7;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (bi.field_e > var7) {
                bi.field_e = var7;
                return;
              } else {
                return;
              }
            } else {
              L6: {
                bi.field_e = param0;
                eh.field_a[kg.field_c] = param5;
                ld.field_M[kg.field_c] = param4;
                ma.field_n[kg.field_c] = param3;
                var6 = param3 + (param4 + param5);
                if (0 == var6) {
                  stackOut_37_0 = 0;
                  stackIn_38_0 = stackOut_37_0;
                  break L6;
                } else {
                  stackOut_36_0 = param5 * 1000 / var6;
                  stackIn_38_0 = stackOut_36_0;
                  break L6;
                }
              }
              L7: {
                var7 = stackIn_38_0;
                l.field_a[kg.field_c] = var7;
                kg.field_c = kg.field_c + 1;
                if (dc.field_o < var7) {
                  dc.field_o = var7;
                  break L7;
                } else {
                  break L7;
                }
              }
              if (bi.field_e <= var7) {
                return;
              } else {
                bi.field_e = var7;
                return;
              }
            }
          }
        } else {
          discarded$1 = sf.b(32);
          pd.field_e[kg.field_c] = kg.field_c;
          qg.field_c[kg.field_c] = param0;
          if (param0 > be.field_I) {
            dc.field_o = param0;
            if (bb.field_G > param0) {
              L8: {
                bi.field_e = param0;
                eh.field_a[kg.field_c] = param5;
                ld.field_M[kg.field_c] = param4;
                ma.field_n[kg.field_c] = param3;
                var6 = param3 + (param4 + param5);
                if (0 == var6) {
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  break L8;
                } else {
                  stackOut_24_0 = param5 * 1000 / var6;
                  stackIn_26_0 = stackOut_24_0;
                  break L8;
                }
              }
              L9: {
                var7 = stackIn_26_0;
                l.field_a[kg.field_c] = var7;
                kg.field_c = kg.field_c + 1;
                if (dc.field_o < var7) {
                  dc.field_o = var7;
                  break L9;
                } else {
                  break L9;
                }
              }
              if (bi.field_e > var7) {
                bi.field_e = var7;
                return;
              } else {
                return;
              }
            } else {
              L10: {
                eh.field_a[kg.field_c] = param5;
                ld.field_M[kg.field_c] = param4;
                ma.field_n[kg.field_c] = param3;
                var6 = param3 + (param4 + param5);
                if (0 == var6) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L10;
                } else {
                  stackOut_15_0 = param5 * 1000 / var6;
                  stackIn_17_0 = stackOut_15_0;
                  break L10;
                }
              }
              L11: {
                var7 = stackIn_17_0;
                l.field_a[kg.field_c] = var7;
                kg.field_c = kg.field_c + 1;
                if (dc.field_o < var7) {
                  dc.field_o = var7;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (bi.field_e <= var7) {
                  break L12;
                } else {
                  bi.field_e = var7;
                  break L12;
                }
              }
              return;
            }
          } else {
            L13: {
              if (bb.field_G <= param0) {
                break L13;
              } else {
                bi.field_e = param0;
                break L13;
              }
            }
            L14: {
              eh.field_a[kg.field_c] = param5;
              ld.field_M[kg.field_c] = param4;
              ma.field_n[kg.field_c] = param3;
              var6 = param3 + (param4 + param5);
              if (0 == var6) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L14;
              } else {
                stackOut_5_0 = param5 * 1000 / var6;
                stackIn_7_0 = stackOut_5_0;
                break L14;
              }
            }
            L15: {
              var7 = stackIn_7_0;
              l.field_a[kg.field_c] = var7;
              kg.field_c = kg.field_c + 1;
              if (dc.field_o < var7) {
                dc.field_o = var7;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (bi.field_e <= var7) {
                break L16;
              } else {
                bi.field_e = var7;
                break L16;
              }
            }
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
        if (param0 != 0) {
          L0: {
            this.field_a = 110;
            if (96 != this.field_a) {
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
            if (96 != this.field_a) {
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
        if (param0 != 11) {
            return true;
        }
        return 102 == this.field_a ? true : false;
    }

    sf(int param0) {
        this.field_k = false;
        this.field_f = 0;
        this.field_g = param0;
    }

    static {
        field_c = 0;
        field_j = true;
    }
}
