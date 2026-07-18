/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class np {
    static int field_j;
    private int field_k;
    private int field_g;
    private int field_i;
    private int field_n;
    static fb field_a;
    int field_b;
    private boolean field_e;
    static int field_o;
    static String field_l;
    static int[] field_f;
    int field_c;
    private int field_h;
    static String field_d;
    static boolean field_m;

    final boolean d(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -1) {
          if (-1 == ((np) this).field_h) {
            if (84 != ((np) this).field_i) {
              if (-84 == ((np) this).field_i) {
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
          ((np) this).field_h = 80;
          if (-1 == ((np) this).field_h) {
            if (84 == ((np) this).field_i) {
              return true;
            } else {
              L0: {
                if (-84 != ((np) this).field_i) {
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

    final void e(int param0) {
        ((np) this).field_h = 0;
        ((np) this).field_g = 0;
        ((np) this).field_i = 0;
        if (param0 > 2) {
          L0: {
            if (0 == ((np) this).field_n) {
              ((np) this).field_i = oq.field_j;
              break L0;
            } else {
              break L0;
            }
          }
          if (0 == ((np) this).field_n) {
            if (96 == oq.field_j) {
              if (((np) this).field_c > 0) {
                ((np) this).field_e = false;
                ((np) this).field_c = ((np) this).field_c - 1;
                if (0 == ((np) this).field_n) {
                  if (97 != oq.field_j) {
                    return;
                  } else {
                    L1: {
                      ((np) this).field_c = ((np) this).field_c + 1;
                      if (((np) this).field_c >= ((np) this).field_b) {
                        ((np) this).field_c = 0;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    ((np) this).field_e = false;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ((np) this).field_c = ((np) this).field_b;
                ((np) this).field_e = false;
                ((np) this).field_c = ((np) this).field_c - 1;
                if (0 == ((np) this).field_n) {
                  if (97 != oq.field_j) {
                    return;
                  } else {
                    L2: {
                      ((np) this).field_c = ((np) this).field_c + 1;
                      if (((np) this).field_c >= ((np) this).field_b) {
                        ((np) this).field_c = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ((np) this).field_e = false;
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (0 == ((np) this).field_n) {
                if (97 != oq.field_j) {
                  return;
                } else {
                  L3: {
                    ((np) this).field_c = ((np) this).field_c + 1;
                    if (((np) this).field_c >= ((np) this).field_b) {
                      ((np) this).field_c = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((np) this).field_e = false;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (0 == ((np) this).field_n) {
              if (97 != oq.field_j) {
                return;
              } else {
                L4: {
                  ((np) this).field_c = ((np) this).field_c + 1;
                  if (((np) this).field_c >= ((np) this).field_b) {
                    ((np) this).field_c = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((np) this).field_e = false;
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

    final void b(int param0) {
        ((np) this).field_i = param0;
        ((np) this).field_h = 0;
        ((np) this).field_g = 0;
        if (0 == ((np) this).field_n) {
          if (oq.field_j == 98) {
            L0: {
              if (((np) this).field_c <= 0) {
                ((np) this).field_c = ((np) this).field_b;
                break L0;
              } else {
                break L0;
              }
            }
            ((np) this).field_e = false;
            ((np) this).field_c = ((np) this).field_c - 1;
            if (((np) this).field_n != 0) {
              L1: {
                if (((np) this).field_n != 0) {
                  break L1;
                } else {
                  if (99 == oq.field_j) {
                    ((np) this).field_c = ((np) this).field_c + 1;
                    ((np) this).field_e = false;
                    if (~((np) this).field_b >= ~((np) this).field_c) {
                      ((np) this).field_c = 0;
                      break L1;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              L2: {
                ((np) this).field_i = oq.field_j;
                if (((np) this).field_n != 0) {
                  break L2;
                } else {
                  if (99 == oq.field_j) {
                    ((np) this).field_c = ((np) this).field_c + 1;
                    ((np) this).field_e = false;
                    if (~((np) this).field_b >= ~((np) this).field_c) {
                      ((np) this).field_c = 0;
                      break L2;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          } else {
            if (((np) this).field_n != 0) {
              L3: {
                if (((np) this).field_n != 0) {
                  break L3;
                } else {
                  if (99 == oq.field_j) {
                    ((np) this).field_c = ((np) this).field_c + 1;
                    ((np) this).field_e = false;
                    if (~((np) this).field_b >= ~((np) this).field_c) {
                      ((np) this).field_c = 0;
                      break L3;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              L4: {
                ((np) this).field_i = oq.field_j;
                if (((np) this).field_n != 0) {
                  break L4;
                } else {
                  if (99 == oq.field_j) {
                    ((np) this).field_c = ((np) this).field_c + 1;
                    ((np) this).field_e = false;
                    if (~((np) this).field_b >= ~((np) this).field_c) {
                      ((np) this).field_c = 0;
                      break L4;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          }
        } else {
          if (((np) this).field_n != 0) {
            L5: {
              if (((np) this).field_n != 0) {
                break L5;
              } else {
                if (99 == oq.field_j) {
                  ((np) this).field_c = ((np) this).field_c + 1;
                  ((np) this).field_e = false;
                  if (~((np) this).field_b >= ~((np) this).field_c) {
                    ((np) this).field_c = 0;
                    break L5;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            return;
          } else {
            L6: {
              ((np) this).field_i = oq.field_j;
              if (((np) this).field_n != 0) {
                break L6;
              } else {
                if (99 == oq.field_j) {
                  ((np) this).field_c = ((np) this).field_c + 1;
                  ((np) this).field_e = false;
                  if (~((np) this).field_b >= ~((np) this).field_c) {
                    ((np) this).field_c = 0;
                    break L6;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            return;
          }
        }
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1) {
          L0: {
            boolean discarded$10 = ((np) this).a(126);
            if (102 != ((np) this).field_i) {
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
            if (102 != ((np) this).field_i) {
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

    final boolean c(int param0) {
        if (param0 != -97) {
            return true;
        }
        return ((np) this).field_i == 96 ? true : false;
    }

    final boolean f(int param0) {
        if (param0 >= -38) {
            return false;
        }
        return 97 == ((np) this).field_i ? true : false;
    }

    public static void b() {
        field_l = null;
        field_a = null;
        field_f = null;
        field_d = null;
    }

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -34) {
          L0: {
            ((np) this).field_b = 69;
            if (((np) this).field_n == 0) {
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
            if (((np) this).field_n == 0) {
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
        if (((np) this).field_b <= param2) {
          throw new IllegalArgumentException();
        } else {
          if (((np) this).field_b > param1) {
            ((np) this).field_h = 0;
            ((np) this).field_i = 0;
            ((np) this).field_g = 0;
            if (0 != je.field_d) {
              ((np) this).field_k = ne.field_j;
              ((np) this).field_c = param1;
              ((np) this).field_h = je.field_d;
              ((np) this).field_g = je.field_d;
              ((np) this).field_n = je.field_d;
              ((np) this).field_e = true;
              if (~((np) this).field_n != param0) {
                if (0 != rf.field_n) {
                  if (0 < ((np) this).field_k) {
                    ((np) this).field_k = ((np) this).field_k - 1;
                    L0: {
                      if (je.field_d != 0) {
                        break L0;
                      } else {
                        if (0 == rf.field_n) {
                          ((np) this).field_n = 0;
                          break L0;
                        } else {
                          L1: {
                            if (((np) this).field_n != 0) {
                              break L1;
                            } else {
                              L2: {
                                if (((np) this).field_e) {
                                  break L2;
                                } else {
                                  if (!r.field_d) {
                                    break L1;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                              if (param2 < 0) {
                                if (((np) this).field_e) {
                                  ((np) this).field_c = -1;
                                  break L1;
                                } else {
                                  return;
                                }
                              } else {
                                if (param2 != ((np) this).field_c) {
                                  ((np) this).field_c = param2;
                                  ((np) this).field_e = true;
                                  return;
                                } else {
                                  ((np) this).field_c = param2;
                                  ((np) this).field_e = true;
                                  return;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    L3: {
                      if (((np) this).field_n != 0) {
                        break L3;
                      } else {
                        if (((np) this).field_e) {
                          if (param2 < 0) {
                            if (((np) this).field_e) {
                              ((np) this).field_c = -1;
                              break L3;
                            } else {
                              return;
                            }
                          } else {
                            if (param2 != ((np) this).field_c) {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              return;
                            } else {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              return;
                            }
                          }
                        } else {
                          if (!r.field_d) {
                            break L3;
                          } else {
                            if (param2 < 0) {
                              if (((np) this).field_e) {
                                ((np) this).field_c = -1;
                                return;
                              } else {
                                return;
                              }
                            } else {
                              if (param2 != ((np) this).field_c) {
                                ((np) this).field_c = param2;
                                ((np) this).field_e = true;
                                return;
                              } else {
                                ((np) this).field_c = param2;
                                ((np) this).field_e = true;
                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    ((np) this).field_k = eo.field_Y;
                    ((np) this).field_h = ((np) this).field_n;
                    ((np) this).field_k = ((np) this).field_k - 1;
                    if (je.field_d != 0) {
                      L4: {
                        if (((np) this).field_n != 0) {
                          break L4;
                        } else {
                          L5: {
                            if (((np) this).field_e) {
                              break L5;
                            } else {
                              if (!r.field_d) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (param2 < 0) {
                            if (((np) this).field_e) {
                              ((np) this).field_c = -1;
                              break L4;
                            } else {
                              break L4;
                            }
                          } else {
                            if (param2 != ((np) this).field_c) {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L4;
                            } else {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L4;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      L6: {
                        if (0 == rf.field_n) {
                          ((np) this).field_n = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (((np) this).field_n != 0) {
                          break L7;
                        } else {
                          L8: {
                            if (((np) this).field_e) {
                              break L8;
                            } else {
                              if (!r.field_d) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          if (param2 < 0) {
                            if (((np) this).field_e) {
                              ((np) this).field_c = -1;
                              break L7;
                            } else {
                              break L7;
                            }
                          } else {
                            if (param2 != ((np) this).field_c) {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L7;
                            } else {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L7;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L9: {
                    if (je.field_d != 0) {
                      break L9;
                    } else {
                      if (0 == rf.field_n) {
                        ((np) this).field_n = 0;
                        break L9;
                      } else {
                        if (((np) this).field_n == 0) {
                          L10: {
                            if (((np) this).field_e) {
                              break L10;
                            } else {
                              if (r.field_d) {
                                break L10;
                              } else {
                                return;
                              }
                            }
                          }
                          if (param2 < 0) {
                            if (((np) this).field_e) {
                              ((np) this).field_c = -1;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (param2 != ((np) this).field_c) {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              return;
                            } else {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (((np) this).field_n == 0) {
                    if (((np) this).field_e) {
                      if (param2 < 0) {
                        if (!((np) this).field_e) {
                          return;
                        } else {
                          ((np) this).field_c = -1;
                          return;
                        }
                      } else {
                        if (param2 != ((np) this).field_c) {
                          ((np) this).field_c = param2;
                          ((np) this).field_e = true;
                          return;
                        } else {
                          ((np) this).field_c = param2;
                          ((np) this).field_e = true;
                          return;
                        }
                      }
                    } else {
                      if (r.field_d) {
                        if (param2 < 0) {
                          if (((np) this).field_e) {
                            ((np) this).field_c = -1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (param2 != ((np) this).field_c) {
                            ((np) this).field_c = param2;
                            ((np) this).field_e = true;
                            return;
                          } else {
                            ((np) this).field_c = param2;
                            ((np) this).field_e = true;
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
                L11: {
                  if (je.field_d != 0) {
                    break L11;
                  } else {
                    if (0 == rf.field_n) {
                      ((np) this).field_n = 0;
                      break L11;
                    } else {
                      L12: {
                        if (((np) this).field_n != 0) {
                          break L12;
                        } else {
                          L13: {
                            if (((np) this).field_e) {
                              break L13;
                            } else {
                              if (!r.field_d) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (param2 < 0) {
                            if (((np) this).field_e) {
                              ((np) this).field_c = -1;
                              break L12;
                            } else {
                              break L12;
                            }
                          } else {
                            if (param2 != ((np) this).field_c) {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L12;
                            } else {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L12;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (((np) this).field_n == 0) {
                  if (((np) this).field_e) {
                    if (param2 < 0) {
                      if (!((np) this).field_e) {
                        return;
                      } else {
                        ((np) this).field_c = -1;
                        return;
                      }
                    } else {
                      if (param2 != ((np) this).field_c) {
                        ((np) this).field_c = param2;
                        ((np) this).field_e = true;
                        return;
                      } else {
                        ((np) this).field_c = param2;
                        ((np) this).field_e = true;
                        return;
                      }
                    }
                  } else {
                    if (r.field_d) {
                      L14: {
                        if (param2 < 0) {
                          if (((np) this).field_e) {
                            ((np) this).field_c = -1;
                            break L14;
                          } else {
                            break L14;
                          }
                        } else {
                          if (param2 != ((np) this).field_c) {
                            ((np) this).field_c = param2;
                            ((np) this).field_e = true;
                            break L14;
                          } else {
                            ((np) this).field_c = param2;
                            ((np) this).field_e = true;
                            break L14;
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
              }
            } else {
              L15: {
                if (~((np) this).field_n == param0) {
                  break L15;
                } else {
                  if (0 == rf.field_n) {
                    break L15;
                  } else {
                    if (0 < ((np) this).field_k) {
                      ((np) this).field_k = ((np) this).field_k - 1;
                      break L15;
                    } else {
                      ((np) this).field_k = eo.field_Y;
                      ((np) this).field_h = ((np) this).field_n;
                      L16: {
                        ((np) this).field_k = ((np) this).field_k - 1;
                        if (je.field_d != 0) {
                          break L16;
                        } else {
                          if (0 == rf.field_n) {
                            ((np) this).field_n = 0;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        if (((np) this).field_n != 0) {
                          break L17;
                        } else {
                          L18: {
                            if (((np) this).field_e) {
                              break L18;
                            } else {
                              if (!r.field_d) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          if (param2 < 0) {
                            if (((np) this).field_e) {
                              ((np) this).field_c = -1;
                              break L17;
                            } else {
                              break L17;
                            }
                          } else {
                            if (param2 != ((np) this).field_c) {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L17;
                            } else {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L17;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L19: {
                if (je.field_d != 0) {
                  break L19;
                } else {
                  if (0 == rf.field_n) {
                    ((np) this).field_n = 0;
                    break L19;
                  } else {
                    L20: {
                      if (((np) this).field_n != 0) {
                        break L20;
                      } else {
                        L21: {
                          if (((np) this).field_e) {
                            break L21;
                          } else {
                            if (!r.field_d) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if (param2 < 0) {
                          if (((np) this).field_e) {
                            ((np) this).field_c = -1;
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          if (param2 != ((np) this).field_c) {
                            ((np) this).field_c = param2;
                            ((np) this).field_e = true;
                            break L20;
                          } else {
                            ((np) this).field_c = param2;
                            ((np) this).field_e = true;
                            break L20;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (((np) this).field_n == 0) {
                if (((np) this).field_e) {
                  if (param2 < 0) {
                    if (!((np) this).field_e) {
                      return;
                    } else {
                      ((np) this).field_c = -1;
                      return;
                    }
                  } else {
                    if (param2 != ((np) this).field_c) {
                      ((np) this).field_c = param2;
                      ((np) this).field_e = true;
                      return;
                    } else {
                      ((np) this).field_c = param2;
                      ((np) this).field_e = true;
                      return;
                    }
                  }
                } else {
                  if (r.field_d) {
                    L22: {
                      if (param2 < 0) {
                        if (((np) this).field_e) {
                          ((np) this).field_c = -1;
                          break L22;
                        } else {
                          break L22;
                        }
                      } else {
                        if (param2 != ((np) this).field_c) {
                          ((np) this).field_c = param2;
                          ((np) this).field_e = true;
                          break L22;
                        } else {
                          ((np) this).field_c = param2;
                          ((np) this).field_e = true;
                          break L22;
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
            }
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    final static java.net.URL a(String param0, int param1, String param2, boolean param3, java.net.URL param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_38_0 = null;
            java.net.URL stackIn_40_0 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            String stackIn_44_2 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_37_0 = null;
            java.net.URL stackOut_39_0 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            String stackOut_43_2 = null;
            RuntimeException stackOut_42_0 = null;
            StringBuilder stackOut_42_1 = null;
            String stackOut_42_2 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            var9 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              var5_ref = param4.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  L2: {
                    if (!var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      break L2;
                    } else {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (0 <= var7_int) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (var7_int >= 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (0 <= var7_int) {
                        if (param0 == null) {
                          break L1;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L0;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L6;
                      } else {
                        if (var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int < 0) {
                      break L5;
                    } else {
                      if (param2 != null) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    }
                  }
                  L7: {
                    var7 = new StringBuilder(var6);
                    StringBuilder discarded$7 = var7.append(var5_ref.substring(0, var6));
                    if (param0 == null) {
                      break L7;
                    } else {
                      if (param0.length() > 0) {
                        StringBuilder discarded$8 = var7.append("/p=");
                        StringBuilder discarded$9 = var7.append(param0);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (param2 == null) {
                      break L8;
                    } else {
                      if (param2.length() > 0) {
                        StringBuilder discarded$10 = var7.append("/s=");
                        StringBuilder discarded$11 = var7.append(param2);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var5_ref.length() > var6) {
                      StringBuilder discarded$12 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      field_d = null;
                      break L9;
                    } else {
                      StringBuilder discarded$13 = var7.append('/');
                      field_d = null;
                      break L9;
                    }
                  }
                  try {
                    L10: {
                      stackOut_37_0 = new java.net.URL(param4, var7.toString());
                      stackIn_38_0 = stackOut_37_0;
                      break L10;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_39_0 = (java.net.URL) param4;
                    stackIn_40_0 = stackOut_39_0;
                    return stackIn_40_0;
                  }
                  return stackIn_38_0;
                }
                var6 = var7_int;
                continue L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_41_0 = (RuntimeException) var5;
                stackOut_41_1 = new StringBuilder().append("np.G(");
                stackIn_43_0 = stackOut_41_0;
                stackIn_43_1 = stackOut_41_1;
                stackIn_42_0 = stackOut_41_0;
                stackIn_42_1 = stackOut_41_1;
                if (param0 == null) {
                  stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                  stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
                  stackOut_43_2 = "null";
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  stackIn_44_2 = stackOut_43_2;
                  break L11;
                } else {
                  stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                  stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                  stackOut_42_2 = "{...}";
                  stackIn_44_0 = stackOut_42_0;
                  stackIn_44_1 = stackOut_42_1;
                  stackIn_44_2 = stackOut_42_2;
                  break L11;
                }
              }
              L12: {
                stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',').append(-1).append(',');
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                if (param2 == null) {
                  stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                  stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                  stackOut_46_2 = "null";
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  break L12;
                } else {
                  stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                  stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                  stackOut_45_2 = "{...}";
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_47_2 = stackOut_45_2;
                  break L12;
                }
              }
              L13: {
                stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(false).append(',');
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                if (param4 == null) {
                  stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                  stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                  stackOut_49_2 = "null";
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  break L13;
                } else {
                  stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                  stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                  stackOut_48_2 = "{...}";
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  break L13;
                }
              }
              throw r.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
          var5 = 31 % (param3 / 42);
          ((np) this).field_n = 0;
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
        ((np) this).field_e = stackIn_3_1 != 0;
        if (((np) this).field_e) {
          ((np) this).field_c = param0;
          return;
        } else {
          ((np) this).field_c = param1;
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
            field_f = null;
            if (((np) this).field_i != 103) {
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
            if (((np) this).field_i != 103) {
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
        int var2 = 0;
        var2 = -16 / ((param0 - 2) / 34);
        if (((np) this).field_g == 0) {
          if (((np) this).field_i != 84) {
            if (((np) this).field_i == 83) {
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

    np(int param0) {
        ((np) this).field_e = false;
        ((np) this).field_c = 0;
        ((np) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Opposing fleets destroyed.";
        field_o = 5;
        field_d = "Skip Intro";
    }
}
