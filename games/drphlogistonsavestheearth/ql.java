/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    private int field_c;
    int field_e;
    boolean field_g;
    private int field_d;
    int field_f;
    private int field_a;
    private int field_h;
    static int[] field_b;
    private int field_j;
    static vd field_i;

    final void a(int param0, byte param1) {
        int var3 = 0;
        L0: {
          var3 = -25 % ((30 - param1) / 45);
          this.field_h = 0;
          this.field_c = 0;
          this.field_j = 0;
          if (this.field_a != 0) {
            break L0;
          } else {
            if (-97 == (di.field_c ^ -1)) {
              L1: {
                if (this.field_f <= 0) {
                  this.field_f = this.field_e;
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_g = false;
              this.field_f = this.field_f - 1;
              break L0;
            } else {
              if (this.field_a == 0) {
                this.field_h = di.field_c;
                if (this.field_a == 0) {
                  L2: {
                    if (di.field_c != 97) {
                      break L2;
                    } else {
                      L3: {
                        this.field_f = this.field_f + 1;
                        if (this.field_f >= this.field_e) {
                          this.field_f = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_g = false;
                      break L2;
                    }
                  }
                  if (0 == this.field_a) {
                    if (-99 == (di.field_c ^ -1)) {
                      this.field_g = false;
                      if (-1 < (this.field_f ^ -1)) {
                        this.field_f = param0;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (di.field_c != 99) {
                        return;
                      } else {
                        L4: {
                          this.field_g = false;
                          if (-1 >= (this.field_f ^ -1)) {
                            break L4;
                          } else {
                            this.field_f = param0;
                            break L4;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  L5: {
                    if (0 != this.field_a) {
                      break L5;
                    } else {
                      L6: {
                        if (-99 == (di.field_c ^ -1)) {
                          break L6;
                        } else {
                          if (di.field_c != 99) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      this.field_g = false;
                      if (-1 >= (this.field_f ^ -1)) {
                        break L5;
                      } else {
                        this.field_f = param0;
                        break L5;
                      }
                    }
                  }
                  return;
                }
              } else {
                L7: {
                  if (this.field_a != 0) {
                    break L7;
                  } else {
                    if (di.field_c != 97) {
                      break L7;
                    } else {
                      L8: {
                        this.field_f = this.field_f + 1;
                        if (this.field_f >= this.field_e) {
                          this.field_f = 0;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      this.field_g = false;
                      break L7;
                    }
                  }
                }
                L9: {
                  if (0 != this.field_a) {
                    break L9;
                  } else {
                    L10: {
                      if (-99 == (di.field_c ^ -1)) {
                        break L10;
                      } else {
                        if (di.field_c != 99) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    this.field_g = false;
                    if (-1 >= (this.field_f ^ -1)) {
                      break L9;
                    } else {
                      this.field_f = param0;
                      break L9;
                    }
                  }
                }
                return;
              }
            }
          }
        }
        if (this.field_a != 0) {
          L11: {
            if (this.field_a != 0) {
              break L11;
            } else {
              if (di.field_c != 97) {
                break L11;
              } else {
                L12: {
                  this.field_f = this.field_f + 1;
                  if (this.field_f >= this.field_e) {
                    this.field_f = 0;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                this.field_g = false;
                break L11;
              }
            }
          }
          if (0 == this.field_a) {
            if (-99 == (di.field_c ^ -1)) {
              this.field_g = false;
              if (-1 >= (this.field_f ^ -1)) {
                return;
              } else {
                this.field_f = param0;
                return;
              }
            } else {
              if (di.field_c == 99) {
                this.field_g = false;
                if (-1 >= (this.field_f ^ -1)) {
                  return;
                } else {
                  this.field_f = param0;
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
          L13: {
            this.field_h = di.field_c;
            if (this.field_a != 0) {
              break L13;
            } else {
              if (di.field_c != 97) {
                break L13;
              } else {
                L14: {
                  this.field_f = this.field_f + 1;
                  if (this.field_f >= this.field_e) {
                    this.field_f = 0;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                this.field_g = false;
                break L13;
              }
            }
          }
          if (0 == this.field_a) {
            if (-99 == (di.field_c ^ -1)) {
              this.field_g = false;
              if (-1 < (this.field_f ^ -1)) {
                this.field_f = param0;
                return;
              } else {
                return;
              }
            } else {
              if (di.field_c == 99) {
                this.field_g = false;
                if (-1 < (this.field_f ^ -1)) {
                  this.field_f = param0;
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
        }
    }

    final void d(int param0) {
        L0: {
          this.field_j = 0;
          this.field_c = 0;
          this.field_h = 0;
          if (this.field_a == 0) {
            this.field_h = di.field_c;
            break L0;
          } else {
            break L0;
          }
        }
        if (0 == this.field_a) {
          if (96 == di.field_c) {
            L1: {
              if (-1 <= (this.field_f ^ -1)) {
                this.field_f = this.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            this.field_g = false;
            this.field_f = this.field_f - 1;
            if (param0 == (this.field_a ^ -1)) {
              if (97 == di.field_c) {
                this.field_f = this.field_f + 1;
                this.field_g = false;
                if (this.field_f >= this.field_e) {
                  this.field_f = 0;
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
            if (param0 == (this.field_a ^ -1)) {
              if (97 == di.field_c) {
                this.field_f = this.field_f + 1;
                this.field_g = false;
                if (this.field_f >= this.field_e) {
                  this.field_f = 0;
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
          if (param0 == (this.field_a ^ -1)) {
            if (97 == di.field_c) {
              this.field_f = this.field_f + 1;
              this.field_g = false;
              if (this.field_f < this.field_e) {
                return;
              } else {
                this.field_f = 0;
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

    final void f(int param0) {
        this.field_h = 0;
        this.field_c = 0;
        if (param0 != 50) {
          return;
        } else {
          L0: {
            this.field_j = 0;
            if (-1 != (this.field_a ^ -1)) {
              break L0;
            } else {
              this.field_h = di.field_c;
              break L0;
            }
          }
          return;
        }
    }

    final void c(int param0) {
        int var2 = 0;
        this.field_j = 0;
        this.field_h = 0;
        this.field_c = 0;
        if (-1 == (this.field_a ^ -1)) {
          if (-99 == (di.field_c ^ -1)) {
            if (-1 > (this.field_f ^ -1)) {
              L0: {
                this.field_f = this.field_f - 1;
                this.field_g = false;
                if (0 == this.field_a) {
                  this.field_h = di.field_c;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (this.field_a == 0) {
                if (99 == di.field_c) {
                  this.field_f = this.field_f + 1;
                  this.field_g = false;
                  if (this.field_f < this.field_e) {
                    var2 = -7 % ((-13 - param0) / 49);
                    return;
                  } else {
                    this.field_f = 0;
                    var2 = -7 % ((-13 - param0) / 49);
                    return;
                  }
                } else {
                  var2 = -7 % ((-13 - param0) / 49);
                  return;
                }
              } else {
                var2 = -7 % ((-13 - param0) / 49);
                return;
              }
            } else {
              this.field_f = this.field_e;
              L1: {
                this.field_f = this.field_f - 1;
                this.field_g = false;
                if (0 == this.field_a) {
                  this.field_h = di.field_c;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (this.field_a == 0) {
                if (99 == di.field_c) {
                  this.field_f = this.field_f + 1;
                  this.field_g = false;
                  if (this.field_f < this.field_e) {
                    var2 = -7 % ((-13 - param0) / 49);
                    return;
                  } else {
                    this.field_f = 0;
                    var2 = -7 % ((-13 - param0) / 49);
                    return;
                  }
                } else {
                  var2 = -7 % ((-13 - param0) / 49);
                  return;
                }
              } else {
                var2 = -7 % ((-13 - param0) / 49);
                return;
              }
            }
          } else {
            L2: {
              if (0 == this.field_a) {
                this.field_h = di.field_c;
                break L2;
              } else {
                break L2;
              }
            }
            if (this.field_a == 0) {
              if (99 == di.field_c) {
                this.field_f = this.field_f + 1;
                this.field_g = false;
                if (this.field_f < this.field_e) {
                  var2 = -7 % ((-13 - param0) / 49);
                  return;
                } else {
                  this.field_f = 0;
                  var2 = -7 % ((-13 - param0) / 49);
                  return;
                }
              } else {
                var2 = -7 % ((-13 - param0) / 49);
                return;
              }
            } else {
              var2 = -7 % ((-13 - param0) / 49);
              return;
            }
          }
        } else {
          L3: {
            if (0 == this.field_a) {
              this.field_h = di.field_c;
              break L3;
            } else {
              break L3;
            }
          }
          if (this.field_a == 0) {
            if (99 == di.field_c) {
              this.field_f = this.field_f + 1;
              this.field_g = false;
              if (this.field_f < this.field_e) {
                var2 = -7 % ((-13 - param0) / 49);
                return;
              } else {
                this.field_f = 0;
                var2 = -7 % ((-13 - param0) / 49);
                return;
              }
            } else {
              var2 = -7 % ((-13 - param0) / 49);
              return;
            }
          } else {
            var2 = -7 % ((-13 - param0) / 49);
            return;
          }
        }
    }

    final boolean c(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -82) {
          if (0 == this.field_c) {
            if (84 != this.field_h) {
              if (this.field_h == 83) {
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
          this.field_c = 13;
          if (0 == this.field_c) {
            if (84 == this.field_h) {
              return true;
            } else {
              L0: {
                if (this.field_h != 83) {
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

    final boolean h(int param0) {
        int var2 = 50 % ((0 - param0) / 55);
        return 96 == this.field_h ? true : false;
    }

    final boolean i(int param0) {
        int var2 = -15 / ((57 - param0) / 54);
        return -104 == (this.field_h ^ -1) ? true : false;
    }

    final boolean b(byte param0) {
        boolean discarded$6 = false;
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 >= 16) {
          if (this.field_j != 1) {
            if (-98 != (this.field_h ^ -1)) {
              if ((this.field_h ^ -1) != -85) {
                if (-84 == (this.field_h ^ -1)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          discarded$6 = this.c((byte) -22);
          if (this.field_j != 1) {
            if (-98 != (this.field_h ^ -1)) {
              if ((this.field_h ^ -1) != -85) {
                if (-84 == (this.field_h ^ -1)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final boolean e(int param0) {
        boolean discarded$7 = false;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -748) {
          if (this.field_j == 0) {
            if (this.field_h != 84) {
              if ((this.field_h ^ -1) == -84) {
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
          discarded$7 = this.b(-81);
          if (this.field_j == 0) {
            if (this.field_h == 84) {
              return true;
            } else {
              L0: {
                if ((this.field_h ^ -1) != -84) {
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

    final void a(int param0, byte param1, boolean param2) {
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
          this.field_a = 0;
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
        ((ql) (this)).field_g = stackIn_3_1 != 0;
        if (param1 == 3) {
          if (this.field_g) {
            this.field_f = param0;
            return;
          } else {
            return;
          }
        } else {
          field_i = (vd) null;
          if (!this.field_g) {
            return;
          } else {
            this.field_f = param0;
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 >= this.field_e) {
          throw new IllegalArgumentException();
        } else {
          if (this.field_e > param2) {
            L0: {
              this.field_h = 0;
              this.field_j = 0;
              this.field_c = 0;
              if (mh.field_f != 0) {
                this.field_d = bb.field_c;
                this.field_j = mh.field_f;
                this.field_c = mh.field_f;
                this.field_g = true;
                this.field_f = param2;
                this.field_a = mh.field_f;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_a != 0) {
              if (0 != db.field_a) {
                if ((this.field_d ^ -1) < -1) {
                  this.field_d = this.field_d - 1;
                  L1: {
                    if (mh.field_f != 0) {
                      break L1;
                    } else {
                      if (db.field_a == 0) {
                        this.field_a = 0;
                        break L1;
                      } else {
                        if (this.field_a == param0) {
                          L2: {
                            if (this.field_g) {
                              break L2;
                            } else {
                              if (df.field_o) {
                                break L2;
                              } else {
                                return;
                              }
                            }
                          }
                          if (0 > param1) {
                            if (this.field_g) {
                              this.field_f = -1;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (param1 != this.field_f) {
                              this.field_g = true;
                              this.field_f = param1;
                              return;
                            } else {
                              this.field_g = true;
                              this.field_f = param1;
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (this.field_a == param0) {
                    L3: {
                      if (this.field_g) {
                        break L3;
                      } else {
                        if (df.field_o) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                    if (0 > param1) {
                      if (this.field_g) {
                        this.field_f = -1;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param1 != this.field_f) {
                        this.field_g = true;
                        this.field_f = param1;
                        return;
                      } else {
                        this.field_g = true;
                        this.field_f = param1;
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  this.field_d = eg.field_e;
                  this.field_j = this.field_a;
                  this.field_d = this.field_d - 1;
                  if (mh.field_f == 0) {
                    L4: {
                      if (db.field_a == 0) {
                        this.field_a = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (this.field_a == param0) {
                      L5: {
                        L6: {
                          if (this.field_g) {
                            break L6;
                          } else {
                            if (df.field_o) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (0 > param1) {
                          if (!this.field_g) {
                            return;
                          } else {
                            this.field_f = -1;
                            return;
                          }
                        } else {
                          if (param1 != this.field_f) {
                            this.field_g = true;
                            this.field_f = param1;
                            break L5;
                          } else {
                            this.field_g = true;
                            this.field_f = param1;
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (this.field_a == param0) {
                      L7: {
                        L8: {
                          if (this.field_g) {
                            break L8;
                          } else {
                            if (df.field_o) {
                              break L8;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (0 > param1) {
                          if (!this.field_g) {
                            return;
                          } else {
                            this.field_f = -1;
                            return;
                          }
                        } else {
                          if (param1 != this.field_f) {
                            this.field_g = true;
                            this.field_f = param1;
                            break L7;
                          } else {
                            this.field_g = true;
                            this.field_f = param1;
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L9: {
                  if (mh.field_f != 0) {
                    break L9;
                  } else {
                    if (db.field_a == 0) {
                      this.field_a = 0;
                      break L9;
                    } else {
                      L10: {
                        if (this.field_a != param0) {
                          break L10;
                        } else {
                          L11: {
                            if (this.field_g) {
                              break L11;
                            } else {
                              if (df.field_o) {
                                break L11;
                              } else {
                                break L10;
                              }
                            }
                          }
                          if (0 > param1) {
                            if (this.field_g) {
                              this.field_f = -1;
                              break L10;
                            } else {
                              break L10;
                            }
                          } else {
                            if (param1 != this.field_f) {
                              this.field_g = true;
                              this.field_f = param1;
                              break L10;
                            } else {
                              this.field_g = true;
                              this.field_f = param1;
                              break L10;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (this.field_a == param0) {
                  L12: {
                    if (this.field_g) {
                      break L12;
                    } else {
                      if (df.field_o) {
                        break L12;
                      } else {
                        return;
                      }
                    }
                  }
                  if (0 > param1) {
                    if (!this.field_g) {
                      return;
                    } else {
                      this.field_f = -1;
                      return;
                    }
                  } else {
                    if (param1 != this.field_f) {
                      this.field_g = true;
                      this.field_f = param1;
                      return;
                    } else {
                      this.field_g = true;
                      this.field_f = param1;
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              L13: {
                if (mh.field_f != 0) {
                  break L13;
                } else {
                  if (db.field_a == 0) {
                    this.field_a = 0;
                    break L13;
                  } else {
                    L14: {
                      if (this.field_a != param0) {
                        break L14;
                      } else {
                        L15: {
                          if (this.field_g) {
                            break L15;
                          } else {
                            if (df.field_o) {
                              break L15;
                            } else {
                              break L14;
                            }
                          }
                        }
                        if (0 > param1) {
                          if (this.field_g) {
                            this.field_f = -1;
                            break L14;
                          } else {
                            break L14;
                          }
                        } else {
                          if (param1 != this.field_f) {
                            this.field_g = true;
                            this.field_f = param1;
                            break L14;
                          } else {
                            this.field_g = true;
                            this.field_f = param1;
                            break L14;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (this.field_a == param0) {
                L16: {
                  if (this.field_g) {
                    break L16;
                  } else {
                    if (df.field_o) {
                      break L16;
                    } else {
                      return;
                    }
                  }
                }
                if (0 > param1) {
                  if (!this.field_g) {
                    return;
                  } else {
                    this.field_f = -1;
                    return;
                  }
                } else {
                  if (param1 != this.field_f) {
                    this.field_g = true;
                    this.field_f = param1;
                    return;
                  } else {
                    this.field_g = true;
                    this.field_f = param1;
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    final boolean a(int param0) {
        if (param0 != -14164) {
            return true;
        }
        return 0 != this.field_a ? true : false;
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
            ql.a((byte) 15);
            if ((this.field_h ^ -1) != -103) {
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
            if ((this.field_h ^ -1) != -103) {
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

    final void a(int param0, int param1) {
        if (param1 != 100) {
            return;
        }
        if (-1 == (this.field_a ^ -1)) {
            this.field_g = false;
            this.field_f = param0;
        }
    }

    public static void a(byte param0) {
        if (param0 > -112) {
            return;
        }
        field_i = null;
        field_b = null;
    }

    final boolean b(int param0) {
        if (param0 < 84) {
            return false;
        }
        return this.field_h == 97 ? true : false;
    }

    final boolean g(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -85) {
          if (-3 != (this.field_j ^ -1)) {
            if (-97 == (this.field_h ^ -1)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
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
          this.field_a = 0;
          var5 = -77 % ((param3 - 1) / 39);
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
        ((ql) (this)).field_g = stackIn_3_1 != 0;
        if (!this.field_g) {
          this.field_f = param0;
          return;
        } else {
          this.field_f = param1;
          return;
        }
    }

    ql(int param0) {
        this.field_f = 0;
        this.field_g = false;
        this.field_e = param0;
    }

    static {
        field_b = new int[]{100, 10, 45, 20, 20, 3200, 1, 50, 20, 50, 200, 10000, 80, 50, 65, 40, 65, 10000, 15000, 150, 50, 50, 150, 100, 100, 200, 150, 175, 100, 50, 50, 100, 100, 100, 100, 100, 2400, 20, 15, 30, 4, 40, 200, 200, 500, 500, 50, 45, 1, 1, 1, 20, 20, 20, 20, 20, 1, 1, 1, 45, 45, 80, 80, 130, 1, 250, 50, 150, 200, 100, 100, 200, 150, 175, 100, 50, 50};
        field_i = new vd();
    }
}
