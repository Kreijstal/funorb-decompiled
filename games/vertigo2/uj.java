/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    private int field_d;
    static String field_e;
    private int field_l;
    int field_b;
    static boolean field_g;
    private int field_a;
    static String field_h;
    private boolean field_f;
    private int field_i;
    static String field_k;
    static String[] field_j;
    int field_c;

    final static boolean c(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -87) {
          if (null == nj.field_b) {
            if (pm.field_a) {
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
          uj.a(-74, 73, 75, true, 41, -1);
          if (null != nj.field_b) {
            return true;
          } else {
            L0: {
              if (!pm.field_a) {
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

    final void d(byte param0) {
        L0: {
          this.field_i = 0;
          this.field_a = 0;
          if (-1 == (this.field_l ^ -1)) {
            this.field_i = de.field_f;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (0 != this.field_l) {
            break L1;
          } else {
            if ((de.field_f ^ -1) == -99) {
              L2: {
                if ((this.field_c ^ -1) >= -1) {
                  this.field_c = this.field_b;
                  break L2;
                } else {
                  break L2;
                }
              }
              this.field_c = this.field_c - 1;
              this.field_f = false;
              break L1;
            } else {
              if (param0 <= 32) {
                field_k = (String) null;
                if (0 == this.field_l) {
                  if (99 == de.field_f) {
                    this.field_c = this.field_c + 1;
                    this.field_f = false;
                    if (this.field_c >= this.field_b) {
                      this.field_c = 0;
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
                  if (99 == de.field_f) {
                    this.field_c = this.field_c + 1;
                    this.field_f = false;
                    if (this.field_c >= this.field_b) {
                      this.field_c = 0;
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
        }
        if (param0 > 32) {
          if (0 == this.field_l) {
            if (99 == de.field_f) {
              this.field_c = this.field_c + 1;
              this.field_f = false;
              if (this.field_c < this.field_b) {
                return;
              } else {
                this.field_c = 0;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          field_k = (String) null;
          if (0 == this.field_l) {
            if (99 == de.field_f) {
              this.field_c = this.field_c + 1;
              this.field_f = false;
              if (this.field_c >= this.field_b) {
                this.field_c = 0;
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

    final boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 84) {
          if (0 == this.field_a) {
            if (84 != this.field_i) {
              if (this.field_i == 83) {
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
          if (0 == this.field_a) {
            if (84 == this.field_i) {
              return true;
            } else {
              L0: {
                if (this.field_i != 83) {
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

    final void a(byte param0, int param1, int param2) {
        if (this.field_b > param1) {
          if (this.field_b > param2) {
            this.field_a = 0;
            if (param0 != -29) {
              this.field_d = -6;
              this.field_i = 0;
              if (kf.field_c != 0) {
                this.field_l = kf.field_c;
                this.field_a = kf.field_c;
                this.field_c = param2;
                this.field_f = true;
                this.field_d = uh.field_mc;
                if (this.field_l != 0) {
                  L0: {
                    if (-1 != (q.field_v ^ -1)) {
                      if (0 < this.field_d) {
                        this.field_d = this.field_d - 1;
                        break L0;
                      } else {
                        this.field_d = ol.field_I;
                        this.field_d = this.field_d - 1;
                        if (-1 == (kf.field_c ^ -1)) {
                          L1: {
                            if (q.field_v == 0) {
                              this.field_l = 0;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                          if (0 == this.field_l) {
                            L2: {
                              L3: {
                                if (this.field_f) {
                                  break L3;
                                } else {
                                  if (wo.field_s) {
                                    break L3;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                              if (param1 < 0) {
                                if (this.field_f) {
                                  this.field_c = -1;
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                if (this.field_c == param1) {
                                  this.field_c = param1;
                                  this.field_f = true;
                                  break L2;
                                } else {
                                  this.field_c = param1;
                                  this.field_f = true;
                                  return;
                                }
                              }
                            }
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (0 == this.field_l) {
                            L4: {
                              L5: {
                                if (this.field_f) {
                                  break L5;
                                } else {
                                  if (wo.field_s) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              if (param1 < 0) {
                                if (this.field_f) {
                                  this.field_c = -1;
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                if (this.field_c == param1) {
                                  this.field_c = param1;
                                  this.field_f = true;
                                  break L4;
                                } else {
                                  this.field_c = param1;
                                  this.field_f = true;
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
                      break L0;
                    }
                  }
                  L6: {
                    if (-1 != (kf.field_c ^ -1)) {
                      break L6;
                    } else {
                      if (q.field_v == 0) {
                        this.field_l = 0;
                        break L6;
                      } else {
                        if (0 == this.field_l) {
                          L7: {
                            if (this.field_f) {
                              break L7;
                            } else {
                              if (wo.field_s) {
                                break L7;
                              } else {
                                return;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (!this.field_f) {
                              return;
                            } else {
                              this.field_c = -1;
                              return;
                            }
                          } else {
                            if (this.field_c == param1) {
                              this.field_c = param1;
                              this.field_f = true;
                              return;
                            } else {
                              this.field_c = param1;
                              this.field_f = true;
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L8: {
                    if (0 != this.field_l) {
                      break L8;
                    } else {
                      L9: {
                        if (this.field_f) {
                          break L9;
                        } else {
                          if (wo.field_s) {
                            break L9;
                          } else {
                            return;
                          }
                        }
                      }
                      if (param1 < 0) {
                        if (this.field_f) {
                          this.field_c = -1;
                          break L8;
                        } else {
                          return;
                        }
                      } else {
                        if (this.field_c == param1) {
                          this.field_c = param1;
                          this.field_f = true;
                          return;
                        } else {
                          this.field_c = param1;
                          this.field_f = true;
                          return;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  L10: {
                    if (-1 != (kf.field_c ^ -1)) {
                      break L10;
                    } else {
                      if (q.field_v == 0) {
                        this.field_l = 0;
                        break L10;
                      } else {
                        if (0 == this.field_l) {
                          L11: {
                            if (this.field_f) {
                              break L11;
                            } else {
                              if (wo.field_s) {
                                break L11;
                              } else {
                                return;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (!this.field_f) {
                              return;
                            } else {
                              this.field_c = -1;
                              return;
                            }
                          } else {
                            if (this.field_c == param1) {
                              this.field_c = param1;
                              this.field_f = true;
                              return;
                            } else {
                              this.field_c = param1;
                              this.field_f = true;
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (0 == this.field_l) {
                    L12: {
                      if (this.field_f) {
                        break L12;
                      } else {
                        if (wo.field_s) {
                          break L12;
                        } else {
                          return;
                        }
                      }
                    }
                    if (param1 < 0) {
                      if (!this.field_f) {
                        return;
                      } else {
                        this.field_c = -1;
                        return;
                      }
                    } else {
                      if (this.field_c == param1) {
                        this.field_c = param1;
                        this.field_f = true;
                        return;
                      } else {
                        this.field_c = param1;
                        this.field_f = true;
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L13: {
                  if (this.field_l == 0) {
                    break L13;
                  } else {
                    if (-1 != (q.field_v ^ -1)) {
                      if (0 < this.field_d) {
                        this.field_d = this.field_d - 1;
                        break L13;
                      } else {
                        this.field_d = ol.field_I;
                        L14: {
                          this.field_d = this.field_d - 1;
                          if (-1 != (kf.field_c ^ -1)) {
                            break L14;
                          } else {
                            if (q.field_v == 0) {
                              this.field_l = 0;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        }
                        L15: {
                          if (0 != this.field_l) {
                            break L15;
                          } else {
                            L16: {
                              if (this.field_f) {
                                break L16;
                              } else {
                                if (wo.field_s) {
                                  break L16;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            if (param1 < 0) {
                              if (this.field_f) {
                                this.field_c = -1;
                                break L15;
                              } else {
                                break L15;
                              }
                            } else {
                              if (this.field_c == param1) {
                                this.field_c = param1;
                                this.field_f = true;
                                break L15;
                              } else {
                                this.field_c = param1;
                                this.field_f = true;
                                break L15;
                              }
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                L17: {
                  if (-1 != (kf.field_c ^ -1)) {
                    break L17;
                  } else {
                    if (q.field_v == 0) {
                      this.field_l = 0;
                      break L17;
                    } else {
                      L18: {
                        if (0 != this.field_l) {
                          break L18;
                        } else {
                          L19: {
                            if (this.field_f) {
                              break L19;
                            } else {
                              if (wo.field_s) {
                                break L19;
                              } else {
                                break L18;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (this.field_f) {
                              this.field_c = -1;
                              break L18;
                            } else {
                              break L18;
                            }
                          } else {
                            if (this.field_c == param1) {
                              this.field_c = param1;
                              this.field_f = true;
                              break L18;
                            } else {
                              this.field_c = param1;
                              this.field_f = true;
                              break L18;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (0 == this.field_l) {
                  L20: {
                    if (this.field_f) {
                      break L20;
                    } else {
                      if (wo.field_s) {
                        break L20;
                      } else {
                        return;
                      }
                    }
                  }
                  if (param1 < 0) {
                    if (!this.field_f) {
                      return;
                    } else {
                      this.field_c = -1;
                      return;
                    }
                  } else {
                    if (this.field_c == param1) {
                      this.field_c = param1;
                      this.field_f = true;
                      return;
                    } else {
                      this.field_c = param1;
                      this.field_f = true;
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              L21: {
                this.field_i = 0;
                if (kf.field_c == 0) {
                  break L21;
                } else {
                  this.field_l = kf.field_c;
                  this.field_a = kf.field_c;
                  this.field_c = param2;
                  this.field_f = true;
                  this.field_d = uh.field_mc;
                  break L21;
                }
              }
              L22: {
                if (this.field_l == 0) {
                  break L22;
                } else {
                  if (-1 != (q.field_v ^ -1)) {
                    if (0 < this.field_d) {
                      this.field_d = this.field_d - 1;
                      break L22;
                    } else {
                      this.field_d = ol.field_I;
                      L23: {
                        this.field_d = this.field_d - 1;
                        if (-1 != (kf.field_c ^ -1)) {
                          break L23;
                        } else {
                          if (q.field_v == 0) {
                            this.field_l = 0;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                      }
                      L24: {
                        if (0 != this.field_l) {
                          break L24;
                        } else {
                          L25: {
                            if (this.field_f) {
                              break L25;
                            } else {
                              if (wo.field_s) {
                                break L25;
                              } else {
                                break L24;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (this.field_f) {
                              this.field_c = -1;
                              break L24;
                            } else {
                              break L24;
                            }
                          } else {
                            if (this.field_c == param1) {
                              this.field_c = param1;
                              this.field_f = true;
                              break L24;
                            } else {
                              this.field_c = param1;
                              this.field_f = true;
                              break L24;
                            }
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    break L22;
                  }
                }
              }
              L26: {
                if (-1 != (kf.field_c ^ -1)) {
                  break L26;
                } else {
                  if (q.field_v == 0) {
                    this.field_l = 0;
                    break L26;
                  } else {
                    L27: {
                      if (0 != this.field_l) {
                        break L27;
                      } else {
                        L28: {
                          if (this.field_f) {
                            break L28;
                          } else {
                            if (wo.field_s) {
                              break L28;
                            } else {
                              break L27;
                            }
                          }
                        }
                        if (param1 < 0) {
                          if (this.field_f) {
                            this.field_c = -1;
                            break L27;
                          } else {
                            break L27;
                          }
                        } else {
                          if (this.field_c == param1) {
                            this.field_c = param1;
                            this.field_f = true;
                            break L27;
                          } else {
                            this.field_c = param1;
                            this.field_f = true;
                            break L27;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (0 == this.field_l) {
                L29: {
                  if (this.field_f) {
                    break L29;
                  } else {
                    if (wo.field_s) {
                      break L29;
                    } else {
                      return;
                    }
                  }
                }
                if (param1 < 0) {
                  if (!this.field_f) {
                    return;
                  } else {
                    this.field_c = -1;
                    return;
                  }
                } else {
                  if (this.field_c == param1) {
                    this.field_c = param1;
                    this.field_f = true;
                    return;
                  } else {
                    this.field_c = param1;
                    this.field_f = true;
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
        } else {
          throw new IllegalArgumentException();
        }
    }

    final void a(int param0, boolean param1) {
        this.field_i = 0;
        this.field_a = 0;
        if (this.field_l == 0) {
          this.field_i = de.field_f;
          if (0 == this.field_l) {
            if (-97 == (de.field_f ^ -1)) {
              if ((this.field_c ^ -1) < -1) {
                L0: {
                  this.field_c = this.field_c - 1;
                  this.field_f = false;
                  if (-1 != (this.field_l ^ -1)) {
                    break L0;
                  } else {
                    if ((de.field_f ^ -1) == -98) {
                      L1: {
                        this.field_c = this.field_c + 1;
                        if (this.field_c >= this.field_b) {
                          this.field_c = 0;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      this.field_f = false;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    this.field_f = true;
                    break L2;
                  }
                }
                L3: {
                  if (0 != this.field_l) {
                    break L3;
                  } else {
                    L4: {
                      if (de.field_f == 98) {
                        break L4;
                      } else {
                        if (de.field_f != 99) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_f = false;
                    if (0 <= this.field_c) {
                      break L3;
                    } else {
                      this.field_c = param0;
                      break L3;
                    }
                  }
                }
                return;
              } else {
                this.field_c = this.field_b;
                L5: {
                  this.field_c = this.field_c - 1;
                  this.field_f = false;
                  if (-1 != (this.field_l ^ -1)) {
                    break L5;
                  } else {
                    if ((de.field_f ^ -1) == -98) {
                      L6: {
                        this.field_c = this.field_c + 1;
                        if (this.field_c >= this.field_b) {
                          this.field_c = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      this.field_f = false;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L7: {
                  if (param1) {
                    break L7;
                  } else {
                    this.field_f = true;
                    break L7;
                  }
                }
                if (0 == this.field_l) {
                  if (de.field_f == 98) {
                    L8: {
                      this.field_f = false;
                      if (0 <= this.field_c) {
                        break L8;
                      } else {
                        this.field_c = param0;
                        break L8;
                      }
                    }
                    return;
                  } else {
                    L9: {
                      if (de.field_f != 99) {
                        break L9;
                      } else {
                        this.field_f = false;
                        if (0 <= this.field_c) {
                          break L9;
                        } else {
                          this.field_c = param0;
                          break L9;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L10: {
                if (-1 != (this.field_l ^ -1)) {
                  break L10;
                } else {
                  if ((de.field_f ^ -1) == -98) {
                    L11: {
                      this.field_c = this.field_c + 1;
                      if (this.field_c >= this.field_b) {
                        this.field_c = 0;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    this.field_f = false;
                    break L10;
                  } else {
                    if (param1) {
                      if (0 == this.field_l) {
                        if (de.field_f == 98) {
                          this.field_f = false;
                          if (0 <= this.field_c) {
                            return;
                          } else {
                            this.field_c = param0;
                            return;
                          }
                        } else {
                          if (de.field_f != 99) {
                            return;
                          } else {
                            L12: {
                              this.field_f = false;
                              if (0 <= this.field_c) {
                                break L12;
                              } else {
                                this.field_c = param0;
                                break L12;
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      L13: {
                        this.field_f = true;
                        if (0 != this.field_l) {
                          break L13;
                        } else {
                          L14: {
                            if (de.field_f == 98) {
                              break L14;
                            } else {
                              if (de.field_f != 99) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          this.field_f = false;
                          if (0 <= this.field_c) {
                            break L13;
                          } else {
                            this.field_c = param0;
                            break L13;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (param1) {
                L15: {
                  if (0 != this.field_l) {
                    break L15;
                  } else {
                    if (de.field_f == 98) {
                      this.field_f = false;
                      if (0 <= this.field_c) {
                        break L15;
                      } else {
                        this.field_c = param0;
                        return;
                      }
                    } else {
                      if (de.field_f != 99) {
                        break L15;
                      } else {
                        this.field_f = false;
                        if (0 <= this.field_c) {
                          return;
                        } else {
                          this.field_c = param0;
                          return;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                this.field_f = true;
                if (0 == this.field_l) {
                  if (de.field_f == 98) {
                    this.field_f = false;
                    if (0 <= this.field_c) {
                      return;
                    } else {
                      this.field_c = param0;
                      return;
                    }
                  } else {
                    if (de.field_f == 99) {
                      this.field_f = false;
                      if (0 <= this.field_c) {
                        return;
                      } else {
                        this.field_c = param0;
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
          } else {
            L16: {
              if (-1 != (this.field_l ^ -1)) {
                break L16;
              } else {
                if ((de.field_f ^ -1) == -98) {
                  L17: {
                    this.field_c = this.field_c + 1;
                    if (this.field_c >= this.field_b) {
                      this.field_c = 0;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  this.field_f = false;
                  break L16;
                } else {
                  L18: {
                    if (param1) {
                      break L18;
                    } else {
                      this.field_f = true;
                      break L18;
                    }
                  }
                  L19: {
                    if (0 != this.field_l) {
                      break L19;
                    } else {
                      L20: {
                        if (de.field_f == 98) {
                          break L20;
                        } else {
                          if (de.field_f != 99) {
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                      this.field_f = false;
                      if (0 <= this.field_c) {
                        break L19;
                      } else {
                        this.field_c = param0;
                        break L19;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (param1) {
              if (0 == this.field_l) {
                if (de.field_f == 98) {
                  this.field_f = false;
                  if (0 > this.field_c) {
                    this.field_c = param0;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (de.field_f == 99) {
                    L21: {
                      this.field_f = false;
                      if (0 <= this.field_c) {
                        break L21;
                      } else {
                        this.field_c = param0;
                        break L21;
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
              L22: {
                this.field_f = true;
                if (0 != this.field_l) {
                  break L22;
                } else {
                  L23: {
                    if (de.field_f == 98) {
                      break L23;
                    } else {
                      if (de.field_f != 99) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  this.field_f = false;
                  if (0 <= this.field_c) {
                    break L22;
                  } else {
                    this.field_c = param0;
                    break L22;
                  }
                }
              }
              return;
            }
          }
        } else {
          L24: {
            if (0 != this.field_l) {
              break L24;
            } else {
              if (-97 == (de.field_f ^ -1)) {
                if ((this.field_c ^ -1) < -1) {
                  L25: {
                    this.field_c = this.field_c - 1;
                    this.field_f = false;
                    if (-1 != (this.field_l ^ -1)) {
                      break L25;
                    } else {
                      if ((de.field_f ^ -1) == -98) {
                        L26: {
                          this.field_c = this.field_c + 1;
                          if (this.field_c >= this.field_b) {
                            this.field_c = 0;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        this.field_f = false;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                  L27: {
                    if (param1) {
                      break L27;
                    } else {
                      this.field_f = true;
                      break L27;
                    }
                  }
                  L28: {
                    if (0 != this.field_l) {
                      break L28;
                    } else {
                      L29: {
                        if (de.field_f == 98) {
                          break L29;
                        } else {
                          if (de.field_f != 99) {
                            break L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                      this.field_f = false;
                      if (0 <= this.field_c) {
                        break L28;
                      } else {
                        this.field_c = param0;
                        break L28;
                      }
                    }
                  }
                  return;
                } else {
                  this.field_c = this.field_b;
                  L30: {
                    this.field_c = this.field_c - 1;
                    this.field_f = false;
                    if (-1 != (this.field_l ^ -1)) {
                      break L30;
                    } else {
                      if ((de.field_f ^ -1) == -98) {
                        L31: {
                          this.field_c = this.field_c + 1;
                          if (this.field_c >= this.field_b) {
                            this.field_c = 0;
                            break L31;
                          } else {
                            break L31;
                          }
                        }
                        this.field_f = false;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                  }
                  L32: {
                    if (param1) {
                      break L32;
                    } else {
                      this.field_f = true;
                      break L32;
                    }
                  }
                  L33: {
                    if (0 != this.field_l) {
                      break L33;
                    } else {
                      L34: {
                        if (de.field_f == 98) {
                          break L34;
                        } else {
                          if (de.field_f != 99) {
                            break L33;
                          } else {
                            break L34;
                          }
                        }
                      }
                      this.field_f = false;
                      if (0 <= this.field_c) {
                        break L33;
                      } else {
                        this.field_c = param0;
                        break L33;
                      }
                    }
                  }
                  return;
                }
              } else {
                break L24;
              }
            }
          }
          L35: {
            if (-1 != (this.field_l ^ -1)) {
              break L35;
            } else {
              if ((de.field_f ^ -1) == -98) {
                L36: {
                  this.field_c = this.field_c + 1;
                  if (this.field_c >= this.field_b) {
                    this.field_c = 0;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                this.field_f = false;
                break L35;
              } else {
                L37: {
                  if (param1) {
                    break L37;
                  } else {
                    this.field_f = true;
                    break L37;
                  }
                }
                L38: {
                  if (0 != this.field_l) {
                    break L38;
                  } else {
                    L39: {
                      if (de.field_f == 98) {
                        break L39;
                      } else {
                        if (de.field_f != 99) {
                          break L38;
                        } else {
                          break L39;
                        }
                      }
                    }
                    this.field_f = false;
                    if (0 <= this.field_c) {
                      break L38;
                    } else {
                      this.field_c = param0;
                      break L38;
                    }
                  }
                }
                return;
              }
            }
          }
          if (param1) {
            if (0 == this.field_l) {
              if (de.field_f == 98) {
                this.field_f = false;
                if (0 > this.field_c) {
                  this.field_c = param0;
                  return;
                } else {
                  return;
                }
              } else {
                if (de.field_f == 99) {
                  L40: {
                    this.field_f = false;
                    if (0 <= this.field_c) {
                      break L40;
                    } else {
                      this.field_c = param0;
                      break L40;
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
            L41: {
              this.field_f = true;
              if (0 != this.field_l) {
                break L41;
              } else {
                L42: {
                  if (de.field_f == 98) {
                    break L42;
                  } else {
                    if (de.field_f != 99) {
                      break L41;
                    } else {
                      break L42;
                    }
                  }
                }
                this.field_f = false;
                if (0 <= this.field_c) {
                  break L41;
                } else {
                  this.field_c = param0;
                  break L41;
                }
              }
            }
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_j = null;
        if (!param0) {
          field_k = (String) null;
          field_k = null;
          field_e = null;
          return;
        } else {
          field_k = null;
          field_e = null;
          return;
        }
    }

    final boolean c(int param0) {
        boolean discarded$8 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            discarded$8 = uj.c((byte) -98);
            if ((this.field_i ^ -1) != -104) {
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
            if ((this.field_i ^ -1) != -104) {
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

    final boolean d(int param0) {
        boolean discarded$10 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -98) {
          L0: {
            discarded$10 = this.c(-119);
            if ((this.field_i ^ -1) != -98) {
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
            if ((this.field_i ^ -1) != -98) {
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

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var6_int = param2 - param4;
            var7 = param1 + -param0;
            if (var7 == 0) {
              L1: {
                if (var6_int == 0) {
                  break L1;
                } else {
                  ce.a(param0, (byte) -86, param4, param5, param2);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (var6_int != 0) {
                L2: {
                  if (0 > var7) {
                    var7 = -var7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if ((var6_int ^ -1) <= -1) {
                    break L3;
                  } else {
                    var6_int = -var6_int;
                    break L3;
                  }
                }
                L4: {
                  if (var7 >= var6_int) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L4;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L4;
                  }
                }
                L5: {
                  var8 = stackIn_16_0;
                  if (var8 != 0) {
                    var9 = param0;
                    param0 = param4;
                    var10 = param1;
                    param1 = param2;
                    param4 = var9;
                    param2 = var10;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param0 > param1) {
                    var9 = param0;
                    param0 = param1;
                    var10 = param4;
                    param4 = param2;
                    param1 = var9;
                    param2 = var10;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var9 = param4;
                  var10 = -param0 + param1;
                  var11 = param2 + -param4;
                  var12 = -(var10 >> 353843745);
                  if (param2 > param4) {
                    stackOut_24_0 = 1;
                    stackIn_25_0 = stackOut_24_0;
                    break L7;
                  } else {
                    stackOut_23_0 = -1;
                    stackIn_25_0 = stackOut_23_0;
                    break L7;
                  }
                }
                L8: {
                  var13 = stackIn_25_0;
                  if ((var11 ^ -1) > -1) {
                    var11 = -var11;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var8 != 0) {
                    var16 = param0;
                    var14 = var16;
                    L10: while (true) {
                      if (param1 < var16) {
                        break L9;
                      } else {
                        L11: {
                          var12 = var12 + var11;
                          vl.field_e[var16][var9] = param5;
                          if (var12 > 0) {
                            var12 = var12 - var10;
                            var9 = var9 + var13;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var16++;
                        continue L10;
                      }
                    }
                  } else {
                    var14 = param0;
                    L12: while (true) {
                      if (param1 < var14) {
                        break L9;
                      } else {
                        L13: {
                          vl.field_e[var9][var14] = param5;
                          var12 = var12 + var11;
                          if (-1 <= (var12 ^ -1)) {
                            break L13;
                          } else {
                            var9 = var9 + var13;
                            var12 = var12 - var10;
                            break L13;
                          }
                        }
                        var14++;
                        continue L12;
                      }
                    }
                  }
                }
                L14: {
                  if (param3) {
                    break L14;
                  } else {
                    field_e = (String) null;
                    break L14;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                oq.a(param1, param0, (byte) -84, param4, param5);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var6), "uj.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static String a(String param0, String param1, int param2, String param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param3.length();
            var5 = param0.length();
            var6 = param1.length();
            if (var5 != 0) {
              L1: {
                var7 = var4_int;
                var8 = -var5 + var6;
                if (var8 == 0) {
                  break L1;
                } else {
                  var9_int = 0;
                  L2: while (true) {
                    var9_int = param3.indexOf(param0, var9_int);
                    if (-1 < (var9_int ^ -1)) {
                      break L1;
                    } else {
                      var9_int = var9_int + var5;
                      var7 = var7 + var8;
                      continue L2;
                    }
                  }
                }
              }
              var9 = new StringBuilder(var7);
              var10 = param2;
              L3: while (true) {
                var11 = param3.indexOf(param0, var10);
                if (-1 >= (var11 ^ -1)) {
                  discarded$3 = var9.append(param3.substring(var10, var11));
                  var10 = var5 + var11;
                  discarded$4 = var9.append(param1);
                  continue L3;
                } else {
                  discarded$5 = var9.append(param3.substring(var10));
                  stackOut_11_0 = var9.toString();
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              }
            } else {
              throw new IllegalArgumentException("Key cannot have zero length");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("uj.F(");
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
          L5: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        return stackIn_12_0;
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -58) {
          L0: {
            field_j = (String[]) null;
            if ((this.field_i ^ -1) != -97) {
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
            if ((this.field_i ^ -1) != -97) {
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
        if (param0 != 45) {
            return false;
        }
        return 102 == this.field_i ? true : false;
    }

    final void a(boolean param0, int param1, int param2, byte param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        this.field_l = 0;
        if (param3 == 80) {
          L0: {
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (!param0) {
              stackOut_10_0 = this;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L0;
            } else {
              stackOut_9_0 = this;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L0;
            }
          }
          ((uj) (this)).field_f = stackIn_11_1 != 0;
          if (this.field_f) {
            this.field_c = param1;
            return;
          } else {
            this.field_c = param2;
            return;
          }
        } else {
          L1: {
            this.field_b = -66;
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((uj) (this)).field_f = stackIn_4_1 != 0;
          if (this.field_f) {
            this.field_c = param1;
            return;
          } else {
            this.field_c = param2;
            return;
          }
        }
    }

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 85) {
          L0: {
            field_k = (String) null;
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

    uj(int param0) {
        this.field_f = false;
        this.field_c = 0;
        this.field_b = param0;
    }

    static {
        field_k = "<times> <%0>";
        field_e = "you died";
        field_h = "Players";
        field_j = new String[]{"Paint all these purple to complete each level.", "You can jump higher while on a fan.", "Green portals transport you to red portals.", "You can't jump while on a gluey tile.", "You can't pass these blocks, and if you land on one you'll slide off of it.", "Danger: this block will kill you!", "Moving onto it will cause the bomb to blow up, destroying nearby blocks.", "This block crumbles when you move off of it, and must be destroyed to complete the level.", "Pulls you towards it.", "Pushes you away.", "You can't paint this block (but you don't have to).", "These blocks phase in and out of existence. You'll fall through them when they're transparent."};
    }
}
