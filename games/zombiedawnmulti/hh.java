/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    private boolean field_a;
    static boolean field_b;
    static boolean field_m;
    private int field_k;
    private int field_j;
    static ja field_h;
    private int field_f;
    private int field_i;
    private int field_g;
    static volatile int field_e;
    int field_c;
    int field_d;
    static cj[] field_l;

    final boolean b(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0) {
          L0: {
            field_m = true;
            if (this.field_k == 0) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_k == 0) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean g(int param0) {
        int var2 = -121 % ((param0 - -74) / 35);
        return -103 == (this.field_i ^ -1) ? true : false;
    }

    final boolean c(int param0) {
        int stackIn_7_0 = 0;
        if (param0 == -85) {
          if (-1 == (this.field_g ^ -1)) {
            if (-85 != (this.field_i ^ -1)) {
              if (-84 == (this.field_i ^ -1)) {
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
          this.b(false);
          if (-1 == (this.field_g ^ -1)) {
            if (-85 == (this.field_i ^ -1)) {
              return true;
            } else {
              L0: {
                if (-84 != (this.field_i ^ -1)) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
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

    final void a(int param0, boolean param1, int param2) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (!param1) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((hh) (this)).field_a = stackIn_3_1 != 0;
        if (param0 != -9049) {
          L1: {
            field_h = (ja) null;
            this.field_k = 0;
            if (this.field_a) {
              this.field_d = param2;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            this.field_k = 0;
            if (this.field_a) {
              this.field_d = param2;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final boolean b(byte param0) {
        int stackIn_5_0 = 0;
        if (param0 == -66) {
          if (-3 != (this.field_f ^ -1)) {
            if (-97 == (this.field_i ^ -1)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_5_0 = 1;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    final boolean a(int param0) {
        if (param0 != 97) {
            return true;
        }
        return this.field_i == 97 ? true : false;
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 96) {
          L0: {
            this.field_j = 40;
            if (this.field_i != 96) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_i != 96) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void d(int param0) {
        if (param0 == 99) {
          this.field_i = 0;
          this.field_g = 0;
          this.field_f = 0;
          if (this.field_k != 0) {
            L0: {
              if (this.field_k != 0) {
                break L0;
              } else {
                if (sj.field_p != 98) {
                  break L0;
                } else {
                  L1: {
                    if (-1 <= (this.field_d ^ -1)) {
                      this.field_d = this.field_c;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  this.field_d = this.field_d - 1;
                  this.field_a = false;
                  break L0;
                }
              }
            }
            if (-1 == (this.field_k ^ -1)) {
              if (sj.field_p == 99) {
                this.field_d = this.field_d + 1;
                if (this.field_d < this.field_c) {
                  this.field_a = false;
                  return;
                } else {
                  this.field_d = 0;
                  this.field_a = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            this.field_i = sj.field_p;
            if (this.field_k == 0) {
              if (sj.field_p == 98) {
                L2: {
                  if (-1 <= (this.field_d ^ -1)) {
                    this.field_d = this.field_c;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_d = this.field_d - 1;
                this.field_a = false;
                if (-1 == (this.field_k ^ -1)) {
                  if (sj.field_p == 99) {
                    this.field_d = this.field_d + 1;
                    if (this.field_d < this.field_c) {
                      this.field_a = false;
                      return;
                    } else {
                      this.field_d = 0;
                      this.field_a = false;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (-1 == (this.field_k ^ -1)) {
                  if (sj.field_p == 99) {
                    this.field_d = this.field_d + 1;
                    if (this.field_d < this.field_c) {
                      this.field_a = false;
                      return;
                    } else {
                      this.field_d = 0;
                      this.field_a = false;
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
              if (-1 == (this.field_k ^ -1)) {
                if (sj.field_p == 99) {
                  this.field_d = this.field_d + 1;
                  if (this.field_d < this.field_c) {
                    this.field_a = false;
                    return;
                  } else {
                    this.field_d = 0;
                    this.field_a = false;
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
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 < 41) {
          this.field_f = 8;
          if (this.field_c <= param0) {
            throw new IllegalArgumentException();
          } else {
            if (param2 < this.field_c) {
              this.field_f = 0;
              this.field_g = 0;
              this.field_i = 0;
              if (0 == kd.field_b) {
                if (-1 != (this.field_k ^ -1)) {
                  if (-1 != (pq.field_f ^ -1)) {
                    L0: {
                      if (0 >= this.field_j) {
                        this.field_f = this.field_k;
                        this.field_j = dj.field_m;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                    L1: {
                      this.field_j = this.field_j - 1;
                      if (-1 != (kd.field_b ^ -1)) {
                        break L1;
                      } else {
                        if (0 == pq.field_f) {
                          this.field_k = 0;
                          break L1;
                        } else {
                          L2: {
                            if (-1 != (this.field_k ^ -1)) {
                              break L2;
                            } else {
                              L3: {
                                if (this.field_a) {
                                  break L3;
                                } else {
                                  if (!wc.field_J) {
                                    break L2;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              if ((param0 ^ -1) > -1) {
                                if (this.field_a) {
                                  this.field_d = -1;
                                  break L2;
                                } else {
                                  return;
                                }
                              } else {
                                if (param0 == this.field_d) {
                                  this.field_d = param0;
                                  this.field_a = true;
                                  return;
                                } else {
                                  this.field_d = param0;
                                  this.field_a = true;
                                  return;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    L4: {
                      if (-1 != (this.field_k ^ -1)) {
                        break L4;
                      } else {
                        if (this.field_a) {
                          if ((param0 ^ -1) > -1) {
                            if (this.field_a) {
                              this.field_d = -1;
                              break L4;
                            } else {
                              return;
                            }
                          } else {
                            if (param0 == this.field_d) {
                              this.field_d = param0;
                              this.field_a = true;
                              return;
                            } else {
                              this.field_d = param0;
                              this.field_a = true;
                              return;
                            }
                          }
                        } else {
                          if (!wc.field_J) {
                            break L4;
                          } else {
                            if ((param0 ^ -1) > -1) {
                              if (this.field_a) {
                                this.field_d = -1;
                                return;
                              } else {
                                return;
                              }
                            } else {
                              if (param0 == this.field_d) {
                                this.field_d = param0;
                                this.field_a = true;
                                return;
                              } else {
                                this.field_d = param0;
                                this.field_a = true;
                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    L5: {
                      if (-1 != (kd.field_b ^ -1)) {
                        break L5;
                      } else {
                        if (0 == pq.field_f) {
                          this.field_k = 0;
                          break L5;
                        } else {
                          if (-1 == (this.field_k ^ -1)) {
                            L6: {
                              if (this.field_a) {
                                break L6;
                              } else {
                                if (wc.field_J) {
                                  break L6;
                                } else {
                                  return;
                                }
                              }
                            }
                            if ((param0 ^ -1) > -1) {
                              if (!this.field_a) {
                                return;
                              } else {
                                this.field_d = -1;
                                return;
                              }
                            } else {
                              if (param0 == this.field_d) {
                                this.field_d = param0;
                                this.field_a = true;
                                return;
                              } else {
                                this.field_d = param0;
                                this.field_a = true;
                                return;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    L7: {
                      if (-1 != (this.field_k ^ -1)) {
                        break L7;
                      } else {
                        if (this.field_a) {
                          if ((param0 ^ -1) > -1) {
                            if (this.field_a) {
                              this.field_d = -1;
                              break L7;
                            } else {
                              return;
                            }
                          } else {
                            if (param0 == this.field_d) {
                              this.field_d = param0;
                              this.field_a = true;
                              return;
                            } else {
                              this.field_d = param0;
                              this.field_a = true;
                              return;
                            }
                          }
                        } else {
                          if (!wc.field_J) {
                            break L7;
                          } else {
                            if ((param0 ^ -1) > -1) {
                              if (this.field_a) {
                                this.field_d = -1;
                                return;
                              } else {
                                return;
                              }
                            } else {
                              if (param0 == this.field_d) {
                                this.field_d = param0;
                                this.field_a = true;
                                return;
                              } else {
                                this.field_d = param0;
                                this.field_a = true;
                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    if (-1 != (kd.field_b ^ -1)) {
                      break L8;
                    } else {
                      if (0 == pq.field_f) {
                        this.field_k = 0;
                        break L8;
                      } else {
                        if (-1 == (this.field_k ^ -1)) {
                          L9: {
                            if (this.field_a) {
                              break L9;
                            } else {
                              if (wc.field_J) {
                                break L9;
                              } else {
                                return;
                              }
                            }
                          }
                          if ((param0 ^ -1) > -1) {
                            if (!this.field_a) {
                              return;
                            } else {
                              this.field_d = -1;
                              return;
                            }
                          } else {
                            if (param0 == this.field_d) {
                              this.field_d = param0;
                              this.field_a = true;
                              return;
                            } else {
                              this.field_d = param0;
                              this.field_a = true;
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (-1 == (this.field_k ^ -1)) {
                    if (this.field_a) {
                      if ((param0 ^ -1) > -1) {
                        if (this.field_a) {
                          this.field_d = -1;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (param0 == this.field_d) {
                          this.field_d = param0;
                          this.field_a = true;
                          return;
                        } else {
                          this.field_d = param0;
                          this.field_a = true;
                          return;
                        }
                      }
                    } else {
                      if (wc.field_J) {
                        if ((param0 ^ -1) > -1) {
                          if (this.field_a) {
                            this.field_d = -1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (param0 == this.field_d) {
                            this.field_d = param0;
                            this.field_a = true;
                            return;
                          } else {
                            this.field_d = param0;
                            this.field_a = true;
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
                this.field_d = param2;
                this.field_j = aa.field_o;
                this.field_a = true;
                this.field_k = kd.field_b;
                this.field_f = kd.field_b;
                this.field_g = kd.field_b;
                if (-1 == (this.field_k ^ -1)) {
                  L10: {
                    if (-1 != (kd.field_b ^ -1)) {
                      break L10;
                    } else {
                      if (0 == pq.field_f) {
                        this.field_k = 0;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (-1 != (this.field_k ^ -1)) {
                      break L11;
                    } else {
                      L12: {
                        if (this.field_a) {
                          break L12;
                        } else {
                          if (!wc.field_J) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if ((param0 ^ -1) > -1) {
                        if (this.field_a) {
                          this.field_d = -1;
                          break L11;
                        } else {
                          break L11;
                        }
                      } else {
                        if (param0 == this.field_d) {
                          this.field_d = param0;
                          this.field_a = true;
                          break L11;
                        } else {
                          this.field_d = param0;
                          this.field_a = true;
                          break L11;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  L13: {
                    if (-1 == (pq.field_f ^ -1)) {
                      break L13;
                    } else {
                      L14: {
                        if (0 >= this.field_j) {
                          this.field_f = this.field_k;
                          this.field_j = dj.field_m;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      this.field_j = this.field_j - 1;
                      break L13;
                    }
                  }
                  L15: {
                    if (-1 != (kd.field_b ^ -1)) {
                      break L15;
                    } else {
                      if (0 == pq.field_f) {
                        this.field_k = 0;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (-1 != (this.field_k ^ -1)) {
                      break L16;
                    } else {
                      L17: {
                        if (this.field_a) {
                          break L17;
                        } else {
                          if (!wc.field_J) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      if ((param0 ^ -1) > -1) {
                        if (this.field_a) {
                          this.field_d = -1;
                          break L16;
                        } else {
                          break L16;
                        }
                      } else {
                        if (param0 == this.field_d) {
                          this.field_d = param0;
                          this.field_a = true;
                          break L16;
                        } else {
                          this.field_d = param0;
                          this.field_a = true;
                          break L16;
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
        } else {
          if (this.field_c <= param0) {
            throw new IllegalArgumentException();
          } else {
            if (param2 < this.field_c) {
              this.field_f = 0;
              this.field_g = 0;
              this.field_i = 0;
              if (0 == kd.field_b) {
                L18: {
                  if (-1 == (this.field_k ^ -1)) {
                    break L18;
                  } else {
                    if (-1 == (pq.field_f ^ -1)) {
                      break L18;
                    } else {
                      L19: {
                        if (0 >= this.field_j) {
                          this.field_f = this.field_k;
                          this.field_j = dj.field_m;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      this.field_j = this.field_j - 1;
                      break L18;
                    }
                  }
                }
                L20: {
                  if (-1 != (kd.field_b ^ -1)) {
                    break L20;
                  } else {
                    if (0 == pq.field_f) {
                      this.field_k = 0;
                      break L20;
                    } else {
                      L21: {
                        if (-1 != (this.field_k ^ -1)) {
                          break L21;
                        } else {
                          L22: {
                            if (this.field_a) {
                              break L22;
                            } else {
                              if (!wc.field_J) {
                                break L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          if ((param0 ^ -1) > -1) {
                            if (this.field_a) {
                              this.field_d = -1;
                              break L21;
                            } else {
                              break L21;
                            }
                          } else {
                            if (param0 == this.field_d) {
                              this.field_d = param0;
                              this.field_a = true;
                              break L21;
                            } else {
                              this.field_d = param0;
                              this.field_a = true;
                              break L21;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (-1 == (this.field_k ^ -1)) {
                  if (this.field_a) {
                    if ((param0 ^ -1) > -1) {
                      if (!this.field_a) {
                        return;
                      } else {
                        this.field_d = -1;
                        return;
                      }
                    } else {
                      if (param0 == this.field_d) {
                        this.field_d = param0;
                        this.field_a = true;
                        return;
                      } else {
                        this.field_d = param0;
                        this.field_a = true;
                        return;
                      }
                    }
                  } else {
                    if (wc.field_J) {
                      L23: {
                        if ((param0 ^ -1) > -1) {
                          if (this.field_a) {
                            this.field_d = -1;
                            break L23;
                          } else {
                            break L23;
                          }
                        } else {
                          if (param0 == this.field_d) {
                            this.field_d = param0;
                            this.field_a = true;
                            break L23;
                          } else {
                            this.field_d = param0;
                            this.field_a = true;
                            break L23;
                          }
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
              } else {
                L24: {
                  this.field_d = param2;
                  this.field_j = aa.field_o;
                  this.field_a = true;
                  this.field_k = kd.field_b;
                  this.field_f = kd.field_b;
                  this.field_g = kd.field_b;
                  if (-1 == (this.field_k ^ -1)) {
                    break L24;
                  } else {
                    if (-1 == (pq.field_f ^ -1)) {
                      break L24;
                    } else {
                      L25: {
                        if (0 >= this.field_j) {
                          this.field_f = this.field_k;
                          this.field_j = dj.field_m;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      this.field_j = this.field_j - 1;
                      break L24;
                    }
                  }
                }
                L26: {
                  if (-1 != (kd.field_b ^ -1)) {
                    break L26;
                  } else {
                    if (0 == pq.field_f) {
                      this.field_k = 0;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                }
                L27: {
                  if (-1 != (this.field_k ^ -1)) {
                    break L27;
                  } else {
                    L28: {
                      if (this.field_a) {
                        break L28;
                      } else {
                        if (!wc.field_J) {
                          break L27;
                        } else {
                          break L28;
                        }
                      }
                    }
                    if ((param0 ^ -1) > -1) {
                      if (this.field_a) {
                        this.field_d = -1;
                        break L27;
                      } else {
                        break L27;
                      }
                    } else {
                      if (param0 == this.field_d) {
                        this.field_d = param0;
                        this.field_a = true;
                        break L27;
                      } else {
                        this.field_d = param0;
                        this.field_a = true;
                        break L27;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (!param1) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((hh) (this)).field_a = stackIn_3_1 != 0;
        if (param2 == -31458) {
          this.field_k = 0;
          if (!this.field_a) {
            this.field_d = param0;
            return;
          } else {
            this.field_d = param3;
            return;
          }
        } else {
          hh.b(-34);
          this.field_k = 0;
          if (!this.field_a) {
            this.field_d = param0;
            return;
          } else {
            this.field_d = param3;
            return;
          }
        }
    }

    final static void b(int param0) {
        int var2;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (-1 <= (mh.field_h ^ -1)) {
          if ((sq.field_Q ^ -1) < -1) {
            L0: {
              sq.field_Q = sq.field_Q - 1;
              if ((mh.field_h ^ -1) < -1) {
                v.a(param0 + 199);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if ((sq.field_Q ^ -1) < -1) {
                mf.a(sq.field_Q, false);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 < da.field_a) {
              mf.a(da.field_a, false);
              return;
            } else {
              return;
            }
          } else {
            if (-1 <= (da.field_a ^ -1)) {
              L2: {
                if ((mh.field_h ^ -1) < -1) {
                  v.a(param0 + 199);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if ((sq.field_Q ^ -1) < -1) {
                  mf.a(sq.field_Q, false);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (param0 < da.field_a) {
                mf.a(da.field_a, false);
                return;
              } else {
                return;
              }
            } else {
              L4: {
                da.field_a = da.field_a - 1;
                if ((mh.field_h ^ -1) < -1) {
                  v.a(param0 + 199);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if ((sq.field_Q ^ -1) < -1) {
                  mf.a(sq.field_Q, false);
                  break L5;
                } else {
                  break L5;
                }
              }
              if (param0 >= da.field_a) {
                return;
              } else {
                mf.a(da.field_a, false);
                return;
              }
            }
          }
        } else {
          L6: {
            mh.field_h = mh.field_h - 1;
            if ((mh.field_h ^ -1) < -1) {
              v.a(param0 + 199);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if ((sq.field_Q ^ -1) < -1) {
              mf.a(sq.field_Q, false);
              break L7;
            } else {
              break L7;
            }
          }
          if (param0 >= da.field_a) {
            return;
          } else {
            mf.a(da.field_a, false);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
            field_e = -10;
            field_l = null;
            return;
        }
        field_l = null;
    }

    final boolean f(int param0) {
        if (param0 != -23954) {
            return false;
        }
        return this.field_i == 103 ? true : false;
    }

    final void a(int param0, boolean param1) {
        L0: {
          this.field_i = 0;
          this.field_f = 0;
          this.field_g = 0;
          if (0 == this.field_k) {
            this.field_i = sj.field_p;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_k != 0) {
            break L1;
          } else {
            if (-97 == (sj.field_p ^ -1)) {
              L2: {
                if (-1 <= (this.field_d ^ -1)) {
                  this.field_d = this.field_c;
                  break L2;
                } else {
                  break L2;
                }
              }
              this.field_a = false;
              this.field_d = this.field_d - 1;
              break L1;
            } else {
              if (this.field_k == 0) {
                if (-98 == (sj.field_p ^ -1)) {
                  L3: {
                    this.field_d = this.field_d + 1;
                    if (this.field_d >= this.field_c) {
                      this.field_d = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  this.field_a = false;
                  if (0 == this.field_k) {
                    L4: {
                      if (98 == sj.field_p) {
                        break L4;
                      } else {
                        if (sj.field_p == 99) {
                          break L4;
                        } else {
                          L5: {
                            if (!param1) {
                              break L5;
                            } else {
                              field_m = false;
                              break L5;
                            }
                          }
                          return;
                        }
                      }
                    }
                    this.field_a = false;
                    if (this.field_d < 0) {
                      this.field_d = param0;
                      if (param1) {
                        field_m = false;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param1) {
                        field_m = false;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param1) {
                      field_m = false;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: {
                    if (0 != this.field_k) {
                      break L6;
                    } else {
                      L7: {
                        if (98 == sj.field_p) {
                          break L7;
                        } else {
                          if (sj.field_p == 99) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      this.field_a = false;
                      if (this.field_d >= 0) {
                        break L6;
                      } else {
                        this.field_d = param0;
                        break L6;
                      }
                    }
                  }
                  L8: {
                    if (!param1) {
                      break L8;
                    } else {
                      field_m = false;
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                L9: {
                  if (0 != this.field_k) {
                    break L9;
                  } else {
                    L10: {
                      if (98 == sj.field_p) {
                        break L10;
                      } else {
                        if (sj.field_p == 99) {
                          break L10;
                        } else {
                          break L9;
                        }
                      }
                    }
                    this.field_a = false;
                    if (this.field_d >= 0) {
                      break L9;
                    } else {
                      this.field_d = param0;
                      break L9;
                    }
                  }
                }
                L11: {
                  if (!param1) {
                    break L11;
                  } else {
                    field_m = false;
                    break L11;
                  }
                }
                return;
              }
            }
          }
        }
        L12: {
          if (this.field_k != 0) {
            break L12;
          } else {
            if (-98 != (sj.field_p ^ -1)) {
              break L12;
            } else {
              L13: {
                this.field_d = this.field_d + 1;
                if (this.field_d >= this.field_c) {
                  this.field_d = 0;
                  break L13;
                } else {
                  break L13;
                }
              }
              this.field_a = false;
              break L12;
            }
          }
        }
        L14: {
          if (0 != this.field_k) {
            break L14;
          } else {
            L15: {
              if (98 == sj.field_p) {
                break L15;
              } else {
                if (sj.field_p == 99) {
                  break L15;
                } else {
                  if (param1) {
                    field_m = false;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            this.field_a = false;
            if (this.field_d >= 0) {
              break L14;
            } else {
              this.field_d = param0;
              if (param1) {
                field_m = false;
                return;
              } else {
                return;
              }
            }
          }
        }
        if (param1) {
          field_m = false;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1) {
        if (param1 != -1) {
          L0: {
            this.g(-127);
            if (this.field_k == 0) {
              this.field_d = param0;
              this.field_a = false;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_k == 0) {
              this.field_d = param0;
              this.field_a = false;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    hh(int param0) {
        this.field_a = false;
        this.field_d = 0;
        this.field_c = param0;
    }

    final boolean a(byte param0) {
        int stackIn_9_0 = 0;
        if (param0 == -106) {
          if ((this.field_f ^ -1) != -2) {
            if (97 != this.field_i) {
              if (84 != this.field_i) {
                if ((this.field_i ^ -1) == -84) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_9_0 = 1;
                return stackIn_9_0 != 0;
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

    static {
        field_e = 0;
    }
}
