/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static of[] field_a;
    private int field_c;
    private int field_h;
    int field_i;
    private int field_f;
    private int field_b;
    static String field_d;
    static int field_j;
    boolean field_k;
    int field_g;
    private int field_e;

    final boolean f(byte param0) {
        boolean discarded$7 = false;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -60) {
          if (this.field_e == 0) {
            if ((this.field_h ^ -1) != -85) {
              if (83 == this.field_h) {
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
          discarded$7 = this.d((byte) 26);
          if (this.field_e == 0) {
            if ((this.field_h ^ -1) == -85) {
              return true;
            } else {
              L0: {
                if (83 != this.field_h) {
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

    final void a(int param0) {
        this.field_e = param0;
        this.field_h = 0;
        this.field_c = 0;
        if (-1 == (this.field_b ^ -1)) {
          if (98 == e.field_f) {
            L0: {
              if (0 >= this.field_g) {
                this.field_g = this.field_i;
                break L0;
              } else {
                break L0;
              }
            }
            this.field_g = this.field_g - 1;
            this.field_k = false;
            if (this.field_b != 0) {
              if (this.field_b == 0) {
                if (99 == e.field_f) {
                  this.field_g = this.field_g + 1;
                  this.field_k = false;
                  if (this.field_g < this.field_i) {
                    return;
                  } else {
                    this.field_g = 0;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_h = e.field_f;
              if (this.field_b == 0) {
                if (99 == e.field_f) {
                  this.field_g = this.field_g + 1;
                  this.field_k = false;
                  if (this.field_g >= this.field_i) {
                    this.field_g = 0;
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
            if (this.field_b != 0) {
              if (this.field_b == 0) {
                if (99 == e.field_f) {
                  this.field_g = this.field_g + 1;
                  this.field_k = false;
                  if (this.field_g >= this.field_i) {
                    this.field_g = 0;
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
              this.field_h = e.field_f;
              if (this.field_b == 0) {
                if (99 == e.field_f) {
                  this.field_g = this.field_g + 1;
                  this.field_k = false;
                  if (this.field_g < this.field_i) {
                    return;
                  } else {
                    this.field_g = 0;
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
          if (this.field_b != 0) {
            if (this.field_b == 0) {
              if (99 == e.field_f) {
                this.field_g = this.field_g + 1;
                this.field_k = false;
                if (this.field_g < this.field_i) {
                  return;
                } else {
                  this.field_g = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            this.field_h = e.field_f;
            if (this.field_b == 0) {
              if (99 == e.field_f) {
                this.field_g = this.field_g + 1;
                this.field_k = false;
                if (this.field_g < this.field_i) {
                  return;
                } else {
                  this.field_g = 0;
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

    final void a(int param0, int param1) {
        if (!(param1 != (this.field_b ^ -1))) {
            this.field_k = false;
            this.field_g = param0;
        }
    }

    final void a(boolean param0) {
        this.field_e = 0;
        if (!param0) {
          L0: {
            this.field_c = 0;
            this.field_h = 0;
            if (-1 == (this.field_b ^ -1)) {
              this.field_h = e.field_f;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 != this.field_b) {
              break L1;
            } else {
              if ((e.field_f ^ -1) == -97) {
                L2: {
                  if (-1 <= (this.field_g ^ -1)) {
                    this.field_g = this.field_i;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_k = false;
                this.field_g = this.field_g - 1;
                break L1;
              } else {
                if (this.field_b == 0) {
                  if ((e.field_f ^ -1) == -98) {
                    this.field_g = this.field_g + 1;
                    this.field_k = false;
                    if (this.field_i > this.field_g) {
                      return;
                    } else {
                      this.field_g = 0;
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
          if (this.field_b == 0) {
            if ((e.field_f ^ -1) == -98) {
              this.field_g = this.field_g + 1;
              this.field_k = false;
              if (this.field_i > this.field_g) {
                return;
              } else {
                this.field_g = 0;
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

    final boolean c(int param0) {
        boolean discarded$7 = false;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -97) {
          if (this.field_c == 0) {
            if (-85 != (this.field_h ^ -1)) {
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
          discarded$7 = this.f((byte) -87);
          if (this.field_c == 0) {
            if (-85 == (this.field_h ^ -1)) {
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

    final void a(byte param0, int param1) {
        boolean discarded$10 = false;
        boolean discarded$11 = false;
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        boolean discarded$14 = false;
        boolean discarded$15 = false;
        boolean discarded$16 = false;
        boolean discarded$17 = false;
        boolean discarded$18 = false;
        boolean discarded$19 = false;
        this.field_c = 0;
        this.field_h = 0;
        this.field_e = 0;
        if (-1 == (this.field_b ^ -1)) {
          L0: {
            if ((e.field_f ^ -1) == -97) {
              if ((this.field_g ^ -1) < -1) {
                this.field_k = false;
                this.field_g = this.field_g - 1;
                break L0;
              } else {
                this.field_g = this.field_i;
                this.field_k = false;
                this.field_g = this.field_g - 1;
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (-1 != (this.field_b ^ -1)) {
            L1: {
              if (0 != this.field_b) {
                break L1;
              } else {
                if (-98 == (e.field_f ^ -1)) {
                  this.field_g = this.field_g + 1;
                  if (this.field_g < this.field_i) {
                    this.field_k = false;
                    break L1;
                  } else {
                    this.field_g = 0;
                    this.field_k = false;
                    if (param0 > 44) {
                      if (this.field_b == 0) {
                        if ((e.field_f ^ -1) == -99) {
                          this.field_k = false;
                          if (this.field_g < 0) {
                            this.field_g = param1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (99 == e.field_f) {
                            this.field_k = false;
                            if (this.field_g < 0) {
                              this.field_g = param1;
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
                      L2: {
                        discarded$10 = this.d((byte) -58);
                        if (this.field_b != 0) {
                          break L2;
                        } else {
                          L3: {
                            if ((e.field_f ^ -1) == -99) {
                              break L3;
                            } else {
                              if (99 != e.field_f) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          this.field_k = false;
                          if (this.field_g >= 0) {
                            break L2;
                          } else {
                            this.field_g = param1;
                            break L2;
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L4: {
                    if (param0 > 44) {
                      break L4;
                    } else {
                      discarded$11 = this.d((byte) -58);
                      break L4;
                    }
                  }
                  L5: {
                    if (this.field_b != 0) {
                      break L5;
                    } else {
                      L6: {
                        if ((e.field_f ^ -1) == -99) {
                          break L6;
                        } else {
                          if (99 != e.field_f) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      this.field_k = false;
                      if (this.field_g >= 0) {
                        break L5;
                      } else {
                        this.field_g = param1;
                        break L5;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (param0 > 44) {
              if (this.field_b == 0) {
                if ((e.field_f ^ -1) == -99) {
                  this.field_k = false;
                  if (this.field_g >= 0) {
                    return;
                  } else {
                    this.field_g = param1;
                    return;
                  }
                } else {
                  if (99 == e.field_f) {
                    this.field_k = false;
                    if (this.field_g >= 0) {
                      return;
                    } else {
                      this.field_g = param1;
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
              discarded$12 = this.d((byte) -58);
              if (this.field_b == 0) {
                if ((e.field_f ^ -1) == -99) {
                  this.field_k = false;
                  if (this.field_g >= 0) {
                    return;
                  } else {
                    this.field_g = param1;
                    return;
                  }
                } else {
                  if (99 == e.field_f) {
                    this.field_k = false;
                    if (this.field_g >= 0) {
                      return;
                    } else {
                      this.field_g = param1;
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
            this.field_h = e.field_f;
            if (0 == this.field_b) {
              L7: {
                if (-98 == (e.field_f ^ -1)) {
                  this.field_g = this.field_g + 1;
                  if (this.field_g >= this.field_i) {
                    this.field_g = 0;
                    this.field_k = false;
                    break L7;
                  } else {
                    L8: {
                      this.field_k = false;
                      if (param0 > 44) {
                        break L8;
                      } else {
                        discarded$13 = this.d((byte) -58);
                        break L8;
                      }
                    }
                    L9: {
                      if (this.field_b != 0) {
                        break L9;
                      } else {
                        L10: {
                          if ((e.field_f ^ -1) == -99) {
                            break L10;
                          } else {
                            if (99 != e.field_f) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_k = false;
                        if (this.field_g >= 0) {
                          break L9;
                        } else {
                          this.field_g = param1;
                          break L9;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  break L7;
                }
              }
              if (param0 > 44) {
                L11: {
                  if (this.field_b != 0) {
                    break L11;
                  } else {
                    L12: {
                      if ((e.field_f ^ -1) == -99) {
                        break L12;
                      } else {
                        if (99 != e.field_f) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    this.field_k = false;
                    if (this.field_g >= 0) {
                      break L11;
                    } else {
                      this.field_g = param1;
                      break L11;
                    }
                  }
                }
                return;
              } else {
                L13: {
                  discarded$14 = this.d((byte) -58);
                  if (this.field_b != 0) {
                    break L13;
                  } else {
                    L14: {
                      if ((e.field_f ^ -1) == -99) {
                        break L14;
                      } else {
                        if (99 != e.field_f) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    this.field_k = false;
                    if (this.field_g >= 0) {
                      break L13;
                    } else {
                      this.field_g = param1;
                      break L13;
                    }
                  }
                }
                return;
              }
            } else {
              L15: {
                if (param0 > 44) {
                  break L15;
                } else {
                  discarded$15 = this.d((byte) -58);
                  break L15;
                }
              }
              L16: {
                if (this.field_b != 0) {
                  break L16;
                } else {
                  L17: {
                    if ((e.field_f ^ -1) == -99) {
                      break L17;
                    } else {
                      if (99 != e.field_f) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  this.field_k = false;
                  if (this.field_g >= 0) {
                    break L16;
                  } else {
                    this.field_g = param1;
                    break L16;
                  }
                }
              }
              return;
            }
          }
        } else {
          if (-1 != (this.field_b ^ -1)) {
            L18: {
              if (0 != this.field_b) {
                break L18;
              } else {
                if (-98 == (e.field_f ^ -1)) {
                  this.field_g = this.field_g + 1;
                  if (this.field_g < this.field_i) {
                    this.field_k = false;
                    break L18;
                  } else {
                    L19: {
                      this.field_g = 0;
                      this.field_k = false;
                      if (param0 > 44) {
                        break L19;
                      } else {
                        discarded$16 = this.d((byte) -58);
                        break L19;
                      }
                    }
                    L20: {
                      if (this.field_b != 0) {
                        break L20;
                      } else {
                        L21: {
                          if ((e.field_f ^ -1) == -99) {
                            break L21;
                          } else {
                            if (99 != e.field_f) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        this.field_k = false;
                        if (this.field_g >= 0) {
                          break L20;
                        } else {
                          this.field_g = param1;
                          break L20;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L22: {
                    if (param0 > 44) {
                      break L22;
                    } else {
                      discarded$17 = this.d((byte) -58);
                      break L22;
                    }
                  }
                  L23: {
                    if (this.field_b != 0) {
                      break L23;
                    } else {
                      L24: {
                        if ((e.field_f ^ -1) == -99) {
                          break L24;
                        } else {
                          if (99 != e.field_f) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      this.field_k = false;
                      if (this.field_g >= 0) {
                        break L23;
                      } else {
                        this.field_g = param1;
                        break L23;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (param0 > 44) {
              if (this.field_b == 0) {
                if ((e.field_f ^ -1) == -99) {
                  this.field_k = false;
                  if (this.field_g < 0) {
                    this.field_g = param1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (99 == e.field_f) {
                    L25: {
                      this.field_k = false;
                      if (this.field_g >= 0) {
                        break L25;
                      } else {
                        this.field_g = param1;
                        break L25;
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
              L26: {
                discarded$18 = this.d((byte) -58);
                if (this.field_b != 0) {
                  break L26;
                } else {
                  L27: {
                    if ((e.field_f ^ -1) == -99) {
                      break L27;
                    } else {
                      if (99 != e.field_f) {
                        break L26;
                      } else {
                        break L27;
                      }
                    }
                  }
                  this.field_k = false;
                  if (this.field_g >= 0) {
                    break L26;
                  } else {
                    this.field_g = param1;
                    break L26;
                  }
                }
              }
              return;
            }
          } else {
            L28: {
              this.field_h = e.field_f;
              if (0 != this.field_b) {
                break L28;
              } else {
                if (-98 == (e.field_f ^ -1)) {
                  this.field_g = this.field_g + 1;
                  if (this.field_g < this.field_i) {
                    this.field_k = false;
                    break L28;
                  } else {
                    this.field_g = 0;
                    this.field_k = false;
                    break L28;
                  }
                } else {
                  break L28;
                }
              }
            }
            L29: {
              if (param0 > 44) {
                break L29;
              } else {
                discarded$19 = this.d((byte) -58);
                break L29;
              }
            }
            L30: {
              if (this.field_b != 0) {
                break L30;
              } else {
                L31: {
                  if ((e.field_f ^ -1) == -99) {
                    break L31;
                  } else {
                    if (99 != e.field_f) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                }
                this.field_k = false;
                if (this.field_g >= 0) {
                  break L30;
                } else {
                  this.field_g = param1;
                  break L30;
                }
              }
            }
            return;
          }
        }
    }

    final boolean e(byte param0) {
        int var2 = -109 % ((-67 - param0) / 33);
        return (this.field_h ^ -1) == -103 ? true : false;
    }

    final boolean b(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -108) {
          if (-3 != (this.field_c ^ -1)) {
            if ((this.field_h ^ -1) == -97) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          this.field_i = -104;
          if (-3 == (this.field_c ^ -1)) {
            return true;
          } else {
            L0: {
              if ((this.field_h ^ -1) != -97) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final void b(boolean param0) {
        this.field_c = 0;
        this.field_h = 0;
        if (param0) {
          this.field_e = 0;
          if (-1 == (this.field_b ^ -1)) {
            this.field_h = e.field_f;
            return;
          } else {
            return;
          }
        } else {
          this.field_k = false;
          this.field_e = 0;
          if (-1 != (this.field_b ^ -1)) {
            return;
          } else {
            this.field_h = e.field_f;
            return;
          }
        }
    }

    final boolean b(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 >= 81) {
          if (1 != this.field_c) {
            if (this.field_h != 97) {
              if (-85 != (this.field_h ^ -1)) {
                if (this.field_h == 83) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                return stackIn_9_0 != 0;
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

    final boolean e(int param0) {
        String discarded$8 = null;
        String var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 7632) {
          L0: {
            var3 = (String) null;
            discarded$8 = db.a((String) null, -6);
            if (-98 != (this.field_h ^ -1)) {
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
            if (-98 != (this.field_h ^ -1)) {
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

    public static void d(int param0) {
        String discarded$0 = null;
        field_d = null;
        field_a = null;
        if (param0 != -98) {
            String var2 = (String) null;
            discarded$0 = db.a((String) null, 63);
        }
    }

    final boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 106) {
          L0: {
            this.field_g = 90;
            if (-104 != (this.field_h ^ -1)) {
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
            if (-104 != (this.field_h ^ -1)) {
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
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -116) {
          L0: {
            this.field_b = -116;
            if (0 == this.field_b) {
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
            if (0 == this.field_b) {
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

    final void a(boolean param0, int param1, int param2) {
        if (this.field_i <= param1) {
          throw new IllegalArgumentException();
        } else {
          if (this.field_i <= param2) {
            throw new IllegalArgumentException();
          } else {
            this.field_h = 0;
            this.field_e = 0;
            this.field_c = 0;
            if (-1 != (ta.field_o ^ -1)) {
              L0: {
                this.field_b = ta.field_o;
                this.field_c = ta.field_o;
                this.field_e = ta.field_o;
                this.field_g = param2;
                this.field_f = cm.field_n;
                this.field_k = true;
                if (this.field_b == 0) {
                  break L0;
                } else {
                  if (ul.field_d != 0) {
                    L1: {
                      if (-1 <= (this.field_f ^ -1)) {
                        this.field_f = bp.field_d;
                        this.field_c = this.field_b;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    this.field_f = this.field_f - 1;
                    break L0;
                  } else {
                    if (ta.field_o == 0) {
                      L2: {
                        if (0 == ul.field_d) {
                          this.field_b = 0;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      if (param0) {
                        if (0 == this.field_b) {
                          if (this.field_k) {
                            L3: {
                              if ((param1 ^ -1) > -1) {
                                if (this.field_k) {
                                  this.field_g = -1;
                                  break L3;
                                } else {
                                  break L3;
                                }
                              } else {
                                if (this.field_g == param1) {
                                  this.field_g = param1;
                                  this.field_k = true;
                                  break L3;
                                } else {
                                  this.field_g = param1;
                                  this.field_k = true;
                                  break L3;
                                }
                              }
                            }
                            return;
                          } else {
                            L4: {
                              if (!he.field_a) {
                                break L4;
                              } else {
                                if ((param1 ^ -1) > -1) {
                                  if (this.field_k) {
                                    this.field_g = -1;
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  if (this.field_g == param1) {
                                    this.field_g = param1;
                                    this.field_k = true;
                                    break L4;
                                  } else {
                                    this.field_g = param1;
                                    this.field_k = true;
                                    break L4;
                                  }
                                }
                              }
                            }
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (!param0) {
                        return;
                      } else {
                        L5: {
                          if (0 != this.field_b) {
                            break L5;
                          } else {
                            L6: {
                              if (this.field_k) {
                                break L6;
                              } else {
                                if (!he.field_a) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            if ((param1 ^ -1) > -1) {
                              if (this.field_k) {
                                this.field_g = -1;
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              if (this.field_g == param1) {
                                this.field_g = param1;
                                this.field_k = true;
                                break L5;
                              } else {
                                this.field_g = param1;
                                this.field_k = true;
                                break L5;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
              L7: {
                if (ta.field_o != 0) {
                  break L7;
                } else {
                  if (0 == ul.field_d) {
                    this.field_b = 0;
                    break L7;
                  } else {
                    if (param0) {
                      if (0 == this.field_b) {
                        L8: {
                          if (this.field_k) {
                            break L8;
                          } else {
                            if (he.field_a) {
                              break L8;
                            } else {
                              return;
                            }
                          }
                        }
                        if ((param1 ^ -1) > -1) {
                          if (this.field_k) {
                            this.field_g = -1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (this.field_g == param1) {
                            this.field_g = param1;
                            this.field_k = true;
                            return;
                          } else {
                            this.field_g = param1;
                            this.field_k = true;
                            return;
                          }
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
              if (param0) {
                if (0 == this.field_b) {
                  L9: {
                    if (this.field_k) {
                      if ((param1 ^ -1) > -1) {
                        if (this.field_k) {
                          this.field_g = -1;
                          break L9;
                        } else {
                          return;
                        }
                      } else {
                        if (this.field_g == param1) {
                          this.field_g = param1;
                          this.field_k = true;
                          return;
                        } else {
                          this.field_g = param1;
                          this.field_k = true;
                          return;
                        }
                      }
                    } else {
                      if (!he.field_a) {
                        break L9;
                      } else {
                        if ((param1 ^ -1) > -1) {
                          if (this.field_k) {
                            this.field_g = -1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (this.field_g == param1) {
                            this.field_g = param1;
                            this.field_k = true;
                            return;
                          } else {
                            this.field_g = param1;
                            this.field_k = true;
                            return;
                          }
                        }
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
              L10: {
                if (this.field_b == 0) {
                  break L10;
                } else {
                  if (ul.field_d != 0) {
                    L11: {
                      if (-1 <= (this.field_f ^ -1)) {
                        this.field_f = bp.field_d;
                        this.field_c = this.field_b;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    this.field_f = this.field_f - 1;
                    break L10;
                  } else {
                    L12: {
                      if (ta.field_o != 0) {
                        break L12;
                      } else {
                        if (0 == ul.field_d) {
                          this.field_b = 0;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (!param0) {
                      return;
                    } else {
                      L13: {
                        if (0 != this.field_b) {
                          break L13;
                        } else {
                          L14: {
                            if (this.field_k) {
                              break L14;
                            } else {
                              if (!he.field_a) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if ((param1 ^ -1) > -1) {
                            if (this.field_k) {
                              this.field_g = -1;
                              break L13;
                            } else {
                              break L13;
                            }
                          } else {
                            if (this.field_g == param1) {
                              this.field_g = param1;
                              this.field_k = true;
                              break L13;
                            } else {
                              this.field_g = param1;
                              this.field_k = true;
                              break L13;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L15: {
                if (ta.field_o != 0) {
                  break L15;
                } else {
                  if (0 == ul.field_d) {
                    this.field_b = 0;
                    break L15;
                  } else {
                    if (!param0) {
                      return;
                    } else {
                      L16: {
                        if (0 != this.field_b) {
                          break L16;
                        } else {
                          L17: {
                            if (this.field_k) {
                              break L17;
                            } else {
                              if (!he.field_a) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          if ((param1 ^ -1) > -1) {
                            if (this.field_k) {
                              this.field_g = -1;
                              break L16;
                            } else {
                              break L16;
                            }
                          } else {
                            if (this.field_g == param1) {
                              this.field_g = param1;
                              this.field_k = true;
                              break L16;
                            } else {
                              this.field_g = param1;
                              this.field_k = true;
                              break L16;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (param0) {
                if (0 == this.field_b) {
                  if (this.field_k) {
                    if ((param1 ^ -1) > -1) {
                      if (!this.field_k) {
                        return;
                      } else {
                        this.field_g = -1;
                        return;
                      }
                    } else {
                      if (this.field_g == param1) {
                        this.field_g = param1;
                        this.field_k = true;
                        return;
                      } else {
                        this.field_g = param1;
                        this.field_k = true;
                        return;
                      }
                    }
                  } else {
                    if (he.field_a) {
                      L18: {
                        if ((param1 ^ -1) > -1) {
                          if (this.field_k) {
                            this.field_g = -1;
                            break L18;
                          } else {
                            break L18;
                          }
                        } else {
                          if (this.field_g == param1) {
                            this.field_g = param1;
                            this.field_k = true;
                            break L18;
                          } else {
                            this.field_g = param1;
                            this.field_k = true;
                            break L18;
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
                return;
              }
            }
          }
        }
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            if (param1 == 31108) {
              var4 = 0;
              L1: while (true) {
                if (var2_int <= var4) {
                  stackOut_7_0 = new String(var3);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3[-var4 + -1 + var2_int] = param0.charAt(var4);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = (String) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("db.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final void a(int param0, byte param1, boolean param2, int param3) {
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
          var5 = -25 / ((param1 - -9) / 58);
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
        ((db) (this)).field_k = stackIn_3_1 != 0;
        this.field_b = 0;
        if (this.field_k) {
          this.field_g = param0;
          return;
        } else {
          this.field_g = param3;
          return;
        }
    }

    final boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 31) {
          L0: {
            this.a(81);
            if ((this.field_h ^ -1) != -97) {
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
            if ((this.field_h ^ -1) != -97) {
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

    db(int param0) {
        this.field_k = false;
        this.field_g = 0;
        this.field_i = param0;
    }

    static {
        field_d = "Loading graphics";
    }
}
