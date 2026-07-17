/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    private int field_h;
    static int[] field_l;
    int field_k;
    private int field_j;
    static boolean field_c;
    private int field_b;
    private boolean field_d;
    static int field_g;
    static dd field_e;
    static int field_f;
    private int field_a;
    static String field_i;
    int field_m;

    final void a(int param0, boolean param1) {
        ((pl) this).field_b = 0;
        ((pl) this).field_j = 0;
        if (0 == ((pl) this).field_a) {
          ((pl) this).field_j = ji.field_a;
          if (param1) {
            L0: {
              if (((pl) this).field_a != 0) {
                break L0;
              } else {
                if (ji.field_a == 96) {
                  L1: {
                    if (((pl) this).field_k <= 0) {
                      ((pl) this).field_k = ((pl) this).field_m;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ((pl) this).field_d = false;
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  break L0;
                } else {
                  L2: {
                    if (((pl) this).field_a != 0) {
                      break L2;
                    } else {
                      if (97 != ji.field_a) {
                        break L2;
                      } else {
                        ((pl) this).field_k = ((pl) this).field_k + 1;
                        if (((pl) this).field_m > ((pl) this).field_k) {
                          ((pl) this).field_d = false;
                          break L2;
                        } else {
                          ((pl) this).field_k = 0;
                          ((pl) this).field_d = false;
                          break L2;
                        }
                      }
                    }
                  }
                  if (0 == ((pl) this).field_a) {
                    if (ji.field_a != 98) {
                      if (ji.field_a == 99) {
                        ((pl) this).field_d = false;
                        if (((pl) this).field_k >= 0) {
                          return;
                        } else {
                          ((pl) this).field_k = param0;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      ((pl) this).field_d = false;
                      if (((pl) this).field_k >= 0) {
                        return;
                      } else {
                        ((pl) this).field_k = param0;
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            L3: {
              if (((pl) this).field_a != 0) {
                break L3;
              } else {
                if (97 != ji.field_a) {
                  break L3;
                } else {
                  ((pl) this).field_k = ((pl) this).field_k + 1;
                  if (((pl) this).field_m > ((pl) this).field_k) {
                    L4: {
                      ((pl) this).field_d = false;
                      if (0 != ((pl) this).field_a) {
                        break L4;
                      } else {
                        L5: {
                          if (ji.field_a == 98) {
                            break L5;
                          } else {
                            if (ji.field_a == 99) {
                              break L5;
                            } else {
                              return;
                            }
                          }
                        }
                        ((pl) this).field_d = false;
                        if (((pl) this).field_k >= 0) {
                          break L4;
                        } else {
                          ((pl) this).field_k = param0;
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    ((pl) this).field_k = 0;
                    L6: {
                      ((pl) this).field_d = false;
                      if (0 != ((pl) this).field_a) {
                        break L6;
                      } else {
                        L7: {
                          if (ji.field_a == 98) {
                            break L7;
                          } else {
                            if (ji.field_a == 99) {
                              break L7;
                            } else {
                              return;
                            }
                          }
                        }
                        ((pl) this).field_d = false;
                        if (((pl) this).field_k >= 0) {
                          break L6;
                        } else {
                          ((pl) this).field_k = param0;
                          return;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            L8: {
              if (0 != ((pl) this).field_a) {
                break L8;
              } else {
                L9: {
                  if (ji.field_a == 98) {
                    break L9;
                  } else {
                    if (ji.field_a == 99) {
                      break L9;
                    } else {
                      return;
                    }
                  }
                }
                ((pl) this).field_d = false;
                if (((pl) this).field_k >= 0) {
                  break L8;
                } else {
                  ((pl) this).field_k = param0;
                  return;
                }
              }
            }
            return;
          } else {
            ((pl) this).a(-102, (byte) 70);
            if (((pl) this).field_a == 0) {
              L10: {
                if (ji.field_a == 96) {
                  L11: {
                    if (((pl) this).field_k <= 0) {
                      ((pl) this).field_k = ((pl) this).field_m;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  ((pl) this).field_d = false;
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              L12: {
                if (((pl) this).field_a != 0) {
                  break L12;
                } else {
                  if (97 != ji.field_a) {
                    break L12;
                  } else {
                    ((pl) this).field_k = ((pl) this).field_k + 1;
                    if (((pl) this).field_m > ((pl) this).field_k) {
                      ((pl) this).field_d = false;
                      break L12;
                    } else {
                      ((pl) this).field_k = 0;
                      ((pl) this).field_d = false;
                      break L12;
                    }
                  }
                }
              }
              L13: {
                if (0 != ((pl) this).field_a) {
                  break L13;
                } else {
                  L14: {
                    if (ji.field_a == 98) {
                      break L14;
                    } else {
                      if (ji.field_a == 99) {
                        break L14;
                      } else {
                        break L13;
                      }
                    }
                  }
                  ((pl) this).field_d = false;
                  if (((pl) this).field_k >= 0) {
                    break L13;
                  } else {
                    ((pl) this).field_k = param0;
                    break L13;
                  }
                }
              }
              return;
            } else {
              L15: {
                if (((pl) this).field_a != 0) {
                  break L15;
                } else {
                  if (97 != ji.field_a) {
                    break L15;
                  } else {
                    ((pl) this).field_k = ((pl) this).field_k + 1;
                    if (((pl) this).field_m > ((pl) this).field_k) {
                      ((pl) this).field_d = false;
                      break L15;
                    } else {
                      ((pl) this).field_k = 0;
                      ((pl) this).field_d = false;
                      break L15;
                    }
                  }
                }
              }
              L16: {
                if (0 != ((pl) this).field_a) {
                  break L16;
                } else {
                  L17: {
                    if (ji.field_a == 98) {
                      break L17;
                    } else {
                      if (ji.field_a == 99) {
                        break L17;
                      } else {
                        break L16;
                      }
                    }
                  }
                  ((pl) this).field_d = false;
                  if (((pl) this).field_k >= 0) {
                    break L16;
                  } else {
                    ((pl) this).field_k = param0;
                    break L16;
                  }
                }
              }
              return;
            }
          }
        } else {
          if (param1) {
            L18: {
              if (((pl) this).field_a != 0) {
                break L18;
              } else {
                if (ji.field_a == 96) {
                  L19: {
                    if (((pl) this).field_k <= 0) {
                      ((pl) this).field_k = ((pl) this).field_m;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  ((pl) this).field_d = false;
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  break L18;
                } else {
                  L20: {
                    if (((pl) this).field_a != 0) {
                      break L20;
                    } else {
                      if (97 != ji.field_a) {
                        break L20;
                      } else {
                        ((pl) this).field_k = ((pl) this).field_k + 1;
                        if (((pl) this).field_m > ((pl) this).field_k) {
                          ((pl) this).field_d = false;
                          break L20;
                        } else {
                          ((pl) this).field_k = 0;
                          ((pl) this).field_d = false;
                          break L20;
                        }
                      }
                    }
                  }
                  L21: {
                    if (0 != ((pl) this).field_a) {
                      break L21;
                    } else {
                      L22: {
                        if (ji.field_a == 98) {
                          break L22;
                        } else {
                          if (ji.field_a == 99) {
                            break L22;
                          } else {
                            break L21;
                          }
                        }
                      }
                      ((pl) this).field_d = false;
                      if (((pl) this).field_k >= 0) {
                        break L21;
                      } else {
                        ((pl) this).field_k = param0;
                        break L21;
                      }
                    }
                  }
                  return;
                }
              }
            }
            L23: {
              if (((pl) this).field_a != 0) {
                break L23;
              } else {
                if (97 != ji.field_a) {
                  break L23;
                } else {
                  ((pl) this).field_k = ((pl) this).field_k + 1;
                  if (((pl) this).field_m > ((pl) this).field_k) {
                    L24: {
                      ((pl) this).field_d = false;
                      if (0 != ((pl) this).field_a) {
                        break L24;
                      } else {
                        L25: {
                          if (ji.field_a == 98) {
                            break L25;
                          } else {
                            if (ji.field_a == 99) {
                              break L25;
                            } else {
                              break L24;
                            }
                          }
                        }
                        ((pl) this).field_d = false;
                        if (((pl) this).field_k >= 0) {
                          break L24;
                        } else {
                          ((pl) this).field_k = param0;
                          break L24;
                        }
                      }
                    }
                    return;
                  } else {
                    ((pl) this).field_k = 0;
                    L26: {
                      ((pl) this).field_d = false;
                      if (0 != ((pl) this).field_a) {
                        break L26;
                      } else {
                        L27: {
                          if (ji.field_a == 98) {
                            break L27;
                          } else {
                            if (ji.field_a == 99) {
                              break L27;
                            } else {
                              break L26;
                            }
                          }
                        }
                        ((pl) this).field_d = false;
                        if (((pl) this).field_k >= 0) {
                          break L26;
                        } else {
                          ((pl) this).field_k = param0;
                          break L26;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            L28: {
              if (0 != ((pl) this).field_a) {
                break L28;
              } else {
                L29: {
                  if (ji.field_a == 98) {
                    break L29;
                  } else {
                    if (ji.field_a == 99) {
                      break L29;
                    } else {
                      return;
                    }
                  }
                }
                ((pl) this).field_d = false;
                if (((pl) this).field_k >= 0) {
                  break L28;
                } else {
                  ((pl) this).field_k = param0;
                  return;
                }
              }
            }
            return;
          } else {
            L30: {
              ((pl) this).a(-102, (byte) 70);
              if (((pl) this).field_a != 0) {
                break L30;
              } else {
                if (ji.field_a == 96) {
                  L31: {
                    if (((pl) this).field_k <= 0) {
                      ((pl) this).field_k = ((pl) this).field_m;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  ((pl) this).field_d = false;
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  break L30;
                } else {
                  break L30;
                }
              }
            }
            L32: {
              if (((pl) this).field_a != 0) {
                break L32;
              } else {
                if (97 != ji.field_a) {
                  break L32;
                } else {
                  ((pl) this).field_k = ((pl) this).field_k + 1;
                  if (((pl) this).field_m > ((pl) this).field_k) {
                    ((pl) this).field_d = false;
                    break L32;
                  } else {
                    ((pl) this).field_k = 0;
                    ((pl) this).field_d = false;
                    break L32;
                  }
                }
              }
            }
            L33: {
              if (0 != ((pl) this).field_a) {
                break L33;
              } else {
                L34: {
                  if (ji.field_a == 98) {
                    break L34;
                  } else {
                    if (ji.field_a == 99) {
                      break L34;
                    } else {
                      break L33;
                    }
                  }
                }
                ((pl) this).field_d = false;
                if (((pl) this).field_k >= 0) {
                  break L33;
                } else {
                  ((pl) this).field_k = param0;
                  break L33;
                }
              }
            }
            return;
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        if (~((pl) this).field_m < ~param2) {
          if (~((pl) this).field_m >= ~param1) {
            throw new IllegalArgumentException();
          } else {
            ((pl) this).field_j = 0;
            ((pl) this).field_b = 0;
            if (jk.field_r != 0) {
              ((pl) this).field_h = kb.field_p;
              ((pl) this).field_a = jk.field_r;
              ((pl) this).field_b = jk.field_r;
              ((pl) this).field_k = param1;
              ((pl) this).field_d = true;
              if (((pl) this).field_a != 0) {
                L0: {
                  if (kc.field_f != 0) {
                    if (((pl) this).field_h > 0) {
                      ((pl) this).field_h = ((pl) this).field_h - 1;
                      break L0;
                    } else {
                      ((pl) this).field_h = qa.field_k;
                      ((pl) this).field_h = ((pl) this).field_h - 1;
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (jk.field_r != 0) {
                    break L1;
                  } else {
                    if (0 == kc.field_f) {
                      ((pl) this).field_a = 0;
                      break L1;
                    } else {
                      L2: {
                        if (((pl) this).field_a != 0) {
                          break L2;
                        } else {
                          L3: {
                            if (((pl) this).field_d) {
                              break L3;
                            } else {
                              if (field_c) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                          if (0 > param2) {
                            if (((pl) this).field_d) {
                              ((pl) this).field_k = -1;
                              break L2;
                            } else {
                              L4: {
                                if (param0 >= 55) {
                                  break L4;
                                } else {
                                  ((pl) this).h(94);
                                  break L4;
                                }
                              }
                              return;
                            }
                          } else {
                            if (param2 != ((pl) this).field_k) {
                              ((pl) this).field_d = true;
                              ((pl) this).field_k = param2;
                              break L2;
                            } else {
                              ((pl) this).field_d = true;
                              ((pl) this).field_k = param2;
                              break L2;
                            }
                          }
                        }
                      }
                      if (param0 >= 55) {
                        return;
                      } else {
                        ((pl) this).h(94);
                        return;
                      }
                    }
                  }
                }
                if (((pl) this).field_a != 0) {
                  if (param0 >= 55) {
                    return;
                  } else {
                    ((pl) this).h(94);
                    return;
                  }
                } else {
                  if (!((pl) this).field_d) {
                    if (!field_c) {
                      if (param0 >= 55) {
                        return;
                      } else {
                        ((pl) this).h(94);
                        return;
                      }
                    } else {
                      if (0 > param2) {
                        if (((pl) this).field_d) {
                          ((pl) this).field_k = -1;
                          if (param0 >= 55) {
                            return;
                          } else {
                            ((pl) this).h(94);
                            return;
                          }
                        } else {
                          if (param0 >= 55) {
                            return;
                          } else {
                            ((pl) this).h(94);
                            return;
                          }
                        }
                      } else {
                        if (param2 != ((pl) this).field_k) {
                          ((pl) this).field_d = true;
                          ((pl) this).field_k = param2;
                          if (param0 >= 55) {
                            return;
                          } else {
                            ((pl) this).h(94);
                            return;
                          }
                        } else {
                          ((pl) this).field_d = true;
                          ((pl) this).field_k = param2;
                          if (param0 >= 55) {
                            return;
                          } else {
                            ((pl) this).h(94);
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    if (0 > param2) {
                      if (((pl) this).field_d) {
                        ((pl) this).field_k = -1;
                        if (param0 >= 55) {
                          return;
                        } else {
                          ((pl) this).h(94);
                          return;
                        }
                      } else {
                        if (param0 >= 55) {
                          return;
                        } else {
                          ((pl) this).h(94);
                          return;
                        }
                      }
                    } else {
                      if (param2 != ((pl) this).field_k) {
                        ((pl) this).field_d = true;
                        ((pl) this).field_k = param2;
                        if (param0 >= 55) {
                          return;
                        } else {
                          ((pl) this).h(94);
                          return;
                        }
                      } else {
                        ((pl) this).field_d = true;
                        ((pl) this).field_k = param2;
                        if (param0 >= 55) {
                          return;
                        } else {
                          ((pl) this).h(94);
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                L5: {
                  if (jk.field_r != 0) {
                    break L5;
                  } else {
                    if (0 == kc.field_f) {
                      ((pl) this).field_a = 0;
                      break L5;
                    } else {
                      L6: {
                        if (((pl) this).field_a != 0) {
                          break L6;
                        } else {
                          L7: {
                            if (((pl) this).field_d) {
                              break L7;
                            } else {
                              if (field_c) {
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (0 > param2) {
                            if (((pl) this).field_d) {
                              ((pl) this).field_k = -1;
                              break L6;
                            } else {
                              break L6;
                            }
                          } else {
                            if (param2 != ((pl) this).field_k) {
                              ((pl) this).field_d = true;
                              ((pl) this).field_k = param2;
                              break L6;
                            } else {
                              ((pl) this).field_d = true;
                              ((pl) this).field_k = param2;
                              break L6;
                            }
                          }
                        }
                      }
                      L8: {
                        if (param0 >= 55) {
                          break L8;
                        } else {
                          ((pl) this).h(94);
                          break L8;
                        }
                      }
                      return;
                    }
                  }
                }
                if (((pl) this).field_a != 0) {
                  if (param0 >= 55) {
                    return;
                  } else {
                    ((pl) this).h(94);
                    return;
                  }
                } else {
                  if (!((pl) this).field_d) {
                    if (!field_c) {
                      L9: {
                        if (param0 >= 55) {
                          break L9;
                        } else {
                          ((pl) this).h(94);
                          break L9;
                        }
                      }
                      return;
                    } else {
                      if (0 > param2) {
                        if (((pl) this).field_d) {
                          ((pl) this).field_k = -1;
                          if (param0 >= 55) {
                            return;
                          } else {
                            ((pl) this).h(94);
                            return;
                          }
                        } else {
                          L10: {
                            if (param0 >= 55) {
                              break L10;
                            } else {
                              ((pl) this).h(94);
                              break L10;
                            }
                          }
                          return;
                        }
                      } else {
                        if (param2 != ((pl) this).field_k) {
                          L11: {
                            ((pl) this).field_d = true;
                            ((pl) this).field_k = param2;
                            if (param0 >= 55) {
                              break L11;
                            } else {
                              ((pl) this).h(94);
                              break L11;
                            }
                          }
                          return;
                        } else {
                          L12: {
                            ((pl) this).field_d = true;
                            ((pl) this).field_k = param2;
                            if (param0 >= 55) {
                              break L12;
                            } else {
                              ((pl) this).h(94);
                              break L12;
                            }
                          }
                          return;
                        }
                      }
                    }
                  } else {
                    if (0 > param2) {
                      if (((pl) this).field_d) {
                        ((pl) this).field_k = -1;
                        if (param0 >= 55) {
                          return;
                        } else {
                          ((pl) this).h(94);
                          return;
                        }
                      } else {
                        L13: {
                          if (param0 >= 55) {
                            break L13;
                          } else {
                            ((pl) this).h(94);
                            break L13;
                          }
                        }
                        return;
                      }
                    } else {
                      if (param2 != ((pl) this).field_k) {
                        L14: {
                          ((pl) this).field_d = true;
                          ((pl) this).field_k = param2;
                          if (param0 >= 55) {
                            break L14;
                          } else {
                            ((pl) this).h(94);
                            break L14;
                          }
                        }
                        return;
                      } else {
                        L15: {
                          ((pl) this).field_d = true;
                          ((pl) this).field_k = param2;
                          if (param0 >= 55) {
                            break L15;
                          } else {
                            ((pl) this).h(94);
                            break L15;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
            } else {
              L16: {
                if (((pl) this).field_a == 0) {
                  break L16;
                } else {
                  if (kc.field_f != 0) {
                    if (((pl) this).field_h > 0) {
                      ((pl) this).field_h = ((pl) this).field_h - 1;
                      break L16;
                    } else {
                      ((pl) this).field_h = qa.field_k;
                      ((pl) this).field_h = ((pl) this).field_h - 1;
                      break L16;
                    }
                  } else {
                    break L16;
                  }
                }
              }
              L17: {
                if (jk.field_r != 0) {
                  break L17;
                } else {
                  if (0 == kc.field_f) {
                    ((pl) this).field_a = 0;
                    break L17;
                  } else {
                    L18: {
                      if (((pl) this).field_a != 0) {
                        break L18;
                      } else {
                        L19: {
                          if (((pl) this).field_d) {
                            break L19;
                          } else {
                            if (field_c) {
                              break L19;
                            } else {
                              break L18;
                            }
                          }
                        }
                        if (0 > param2) {
                          if (((pl) this).field_d) {
                            ((pl) this).field_k = -1;
                            break L18;
                          } else {
                            break L18;
                          }
                        } else {
                          if (param2 != ((pl) this).field_k) {
                            ((pl) this).field_d = true;
                            ((pl) this).field_k = param2;
                            break L18;
                          } else {
                            ((pl) this).field_d = true;
                            ((pl) this).field_k = param2;
                            break L18;
                          }
                        }
                      }
                    }
                    L20: {
                      if (param0 >= 55) {
                        break L20;
                      } else {
                        ((pl) this).h(94);
                        break L20;
                      }
                    }
                    return;
                  }
                }
              }
              L21: {
                if (((pl) this).field_a != 0) {
                  break L21;
                } else {
                  L22: {
                    if (((pl) this).field_d) {
                      break L22;
                    } else {
                      if (field_c) {
                        break L22;
                      } else {
                        L23: {
                          if (param0 >= 55) {
                            break L23;
                          } else {
                            ((pl) this).h(94);
                            break L23;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (0 > param2) {
                    if (((pl) this).field_d) {
                      ((pl) this).field_k = -1;
                      break L21;
                    } else {
                      L24: {
                        if (param0 >= 55) {
                          break L24;
                        } else {
                          ((pl) this).h(94);
                          break L24;
                        }
                      }
                      return;
                    }
                  } else {
                    if (param2 != ((pl) this).field_k) {
                      L25: {
                        ((pl) this).field_d = true;
                        ((pl) this).field_k = param2;
                        if (param0 >= 55) {
                          break L25;
                        } else {
                          ((pl) this).h(94);
                          break L25;
                        }
                      }
                      return;
                    } else {
                      L26: {
                        ((pl) this).field_d = true;
                        ((pl) this).field_k = param2;
                        if (param0 >= 55) {
                          break L26;
                        } else {
                          ((pl) this).h(94);
                          break L26;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (param0 >= 55) {
                return;
              } else {
                ((pl) this).h(94);
                return;
              }
            }
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final void a(int param0, byte param1) {
        L0: {
          if (((pl) this).field_a == 0) {
            ((pl) this).field_k = param0;
            ((pl) this).field_d = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= -78) {
          ((pl) this).a(61, true);
          return;
        } else {
          return;
        }
    }

    public static void f(int param0) {
        field_l = null;
        field_e = null;
        field_i = null;
        if (param0 != 0) {
            pl.d(-80);
        }
    }

    final void h(int param0) {
        ((pl) this).field_j = param0;
        ((pl) this).field_b = 0;
        if (((pl) this).field_a != 0) {
          L0: {
            if (((pl) this).field_a != 0) {
              break L0;
            } else {
              if (ji.field_a != 98) {
                break L0;
              } else {
                if (((pl) this).field_k > 0) {
                  ((pl) this).field_d = false;
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  if (((pl) this).field_a == 0) {
                    if (ji.field_a == 99) {
                      ((pl) this).field_k = ((pl) this).field_k + 1;
                      if (((pl) this).field_k < ((pl) this).field_m) {
                        ((pl) this).field_d = false;
                        return;
                      } else {
                        ((pl) this).field_k = 0;
                        ((pl) this).field_d = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ((pl) this).field_k = ((pl) this).field_m;
                  ((pl) this).field_d = false;
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  if (((pl) this).field_a == 0) {
                    if (ji.field_a == 99) {
                      ((pl) this).field_k = ((pl) this).field_k + 1;
                      if (((pl) this).field_k < ((pl) this).field_m) {
                        ((pl) this).field_d = false;
                        return;
                      } else {
                        ((pl) this).field_k = 0;
                        ((pl) this).field_d = false;
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
          if (((pl) this).field_a == 0) {
            if (ji.field_a == 99) {
              ((pl) this).field_k = ((pl) this).field_k + 1;
              if (((pl) this).field_k < ((pl) this).field_m) {
                ((pl) this).field_d = false;
                return;
              } else {
                ((pl) this).field_k = 0;
                ((pl) this).field_d = false;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((pl) this).field_j = ji.field_a;
          if (((pl) this).field_a == 0) {
            if (ji.field_a == 98) {
              if (((pl) this).field_k > 0) {
                ((pl) this).field_d = false;
                ((pl) this).field_k = ((pl) this).field_k - 1;
                if (((pl) this).field_a == 0) {
                  if (ji.field_a == 99) {
                    ((pl) this).field_k = ((pl) this).field_k + 1;
                    if (((pl) this).field_k < ((pl) this).field_m) {
                      ((pl) this).field_d = false;
                      return;
                    } else {
                      ((pl) this).field_k = 0;
                      ((pl) this).field_d = false;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ((pl) this).field_k = ((pl) this).field_m;
                ((pl) this).field_d = false;
                ((pl) this).field_k = ((pl) this).field_k - 1;
                if (((pl) this).field_a == 0) {
                  if (ji.field_a == 99) {
                    ((pl) this).field_k = ((pl) this).field_k + 1;
                    if (((pl) this).field_k < ((pl) this).field_m) {
                      ((pl) this).field_d = false;
                      return;
                    } else {
                      ((pl) this).field_k = 0;
                      ((pl) this).field_d = false;
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
              if (((pl) this).field_a == 0) {
                if (ji.field_a == 99) {
                  ((pl) this).field_k = ((pl) this).field_k + 1;
                  if (((pl) this).field_k < ((pl) this).field_m) {
                    ((pl) this).field_d = false;
                    return;
                  } else {
                    ((pl) this).field_k = 0;
                    ((pl) this).field_d = false;
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
            if (((pl) this).field_a == 0) {
              if (ji.field_a == 99) {
                ((pl) this).field_k = ((pl) this).field_k + 1;
                if (((pl) this).field_k < ((pl) this).field_m) {
                  ((pl) this).field_d = false;
                  return;
                } else {
                  ((pl) this).field_k = 0;
                  ((pl) this).field_d = false;
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

    final boolean b(int param0) {
        int var2 = 0;
        var2 = -120 % ((45 - param0) / 57);
        if (((pl) this).field_b == 0) {
          if (((pl) this).field_j != 84) {
            if (((pl) this).field_j == 83) {
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

    final boolean g(int param0) {
        int var2 = 27 / ((17 - param0) / 62);
        return ((pl) this).field_j == 102 ? true : false;
    }

    final static boolean a(rh param0, rh param1, rh param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if (!param0.b((byte) -121)) {
                break L1;
              } else {
                if (!param0.a("commonui", -95)) {
                  break L1;
                } else {
                  if (!param1.b((byte) -126)) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    if (param1.a("commonui", -109)) {
                      L2: {
                        if (!param2.b((byte) -125)) {
                          break L2;
                        } else {
                          if (param2.a("button.gif", -101)) {
                            stackOut_15_0 = 1;
                            stackIn_16_0 = stackOut_15_0;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("pl.R(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          L4: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          L5: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + 1 + 41);
        }
        return stackIn_16_0 != 0;
    }

    final void c(int param0) {
        ((pl) this).field_b = 0;
        ((pl) this).field_j = 0;
        if (param0 <= -2) {
          L0: {
            if (0 == ((pl) this).field_a) {
              ((pl) this).field_j = ji.field_a;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 != ((pl) this).field_a) {
              break L1;
            } else {
              if (ji.field_a != 96) {
                break L1;
              } else {
                if (((pl) this).field_k > 0) {
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  ((pl) this).field_d = false;
                  if (((pl) this).field_a == 0) {
                    if (ji.field_a == 97) {
                      ((pl) this).field_k = ((pl) this).field_k + 1;
                      if (((pl) this).field_m > ((pl) this).field_k) {
                        ((pl) this).field_d = false;
                        return;
                      } else {
                        ((pl) this).field_k = 0;
                        ((pl) this).field_d = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ((pl) this).field_k = ((pl) this).field_m;
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  ((pl) this).field_d = false;
                  if (((pl) this).field_a == 0) {
                    if (ji.field_a == 97) {
                      ((pl) this).field_k = ((pl) this).field_k + 1;
                      if (((pl) this).field_m > ((pl) this).field_k) {
                        ((pl) this).field_d = false;
                        return;
                      } else {
                        ((pl) this).field_k = 0;
                        ((pl) this).field_d = false;
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
          if (((pl) this).field_a == 0) {
            if (ji.field_a == 97) {
              ((pl) this).field_k = ((pl) this).field_k + 1;
              if (((pl) this).field_m > ((pl) this).field_k) {
                ((pl) this).field_d = false;
                return;
              } else {
                ((pl) this).field_k = 0;
                ((pl) this).field_d = false;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          L2: {
            field_c = false;
            if (0 == ((pl) this).field_a) {
              ((pl) this).field_j = ji.field_a;
              break L2;
            } else {
              break L2;
            }
          }
          if (0 == ((pl) this).field_a) {
            if (ji.field_a == 96) {
              if (((pl) this).field_k > 0) {
                ((pl) this).field_k = ((pl) this).field_k - 1;
                ((pl) this).field_d = false;
                if (((pl) this).field_a == 0) {
                  if (ji.field_a == 97) {
                    ((pl) this).field_k = ((pl) this).field_k + 1;
                    if (((pl) this).field_m > ((pl) this).field_k) {
                      ((pl) this).field_d = false;
                      return;
                    } else {
                      ((pl) this).field_k = 0;
                      ((pl) this).field_d = false;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ((pl) this).field_k = ((pl) this).field_m;
                ((pl) this).field_k = ((pl) this).field_k - 1;
                ((pl) this).field_d = false;
                if (((pl) this).field_a == 0) {
                  if (ji.field_a == 97) {
                    ((pl) this).field_k = ((pl) this).field_k + 1;
                    if (((pl) this).field_m > ((pl) this).field_k) {
                      ((pl) this).field_d = false;
                      return;
                    } else {
                      ((pl) this).field_k = 0;
                      ((pl) this).field_d = false;
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
              if (((pl) this).field_a == 0) {
                if (ji.field_a == 97) {
                  ((pl) this).field_k = ((pl) this).field_k + 1;
                  if (((pl) this).field_m > ((pl) this).field_k) {
                    ((pl) this).field_d = false;
                    return;
                  } else {
                    ((pl) this).field_k = 0;
                    ((pl) this).field_d = false;
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
            if (((pl) this).field_a == 0) {
              if (ji.field_a == 97) {
                ((pl) this).field_k = ((pl) this).field_k + 1;
                if (((pl) this).field_m > ((pl) this).field_k) {
                  ((pl) this).field_d = false;
                  return;
                } else {
                  ((pl) this).field_k = 0;
                  ((pl) this).field_d = false;
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

    final boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return ((pl) this).field_a != 0 ? true : false;
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -23670) {
          L0: {
            ((pl) this).a(23, 68, true, 121);
            if (((pl) this).field_j != 97) {
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
            if (((pl) this).field_j != 97) {
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

    final static int a(CharSequence param0) {
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = jc.a(10, 110, true, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("pl.I(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -9816 + 41);
        }
        return stackIn_1_0;
    }

    final boolean a(byte param0) {
        if (param0 != -29) {
            return true;
        }
        return ((pl) this).field_j == 103 ? true : false;
    }

    final static void d(int param0) {
        if (param0 < 60) {
            field_i = null;
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 96) {
          L0: {
            ((pl) this).field_a = 48;
            if (((pl) this).field_j != 96) {
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
            if (((pl) this).field_j != 96) {
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

    final static void a(int param0, int param1, int param2) {
        param0 = param0 * 16;
        param2 = param2 * 16;
        gb.a(si.field_R);
        int var3 = ni.field_j * 2 % 16;
        gb.a(var3 + param2, param0 - 4, 16 + (param2 + var3), 16 + param0);
        int discarded$0 = 13421632;
        gb.h(var3 + param2, 4 + param0, 8);
        gb.b(si.field_R);
    }

    final void i(int param0) {
        ((pl) this).field_b = 0;
        if (param0 != -13093) {
          L0: {
            ((pl) this).h(-126);
            ((pl) this).field_j = 0;
            if (((pl) this).field_a == 0) {
              ((pl) this).field_j = ji.field_a;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            ((pl) this).field_j = 0;
            if (((pl) this).field_a == 0) {
              ((pl) this).field_j = ji.field_a;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
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
          ((pl) this).field_a = 0;
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
        ((pl) this).field_d = stackIn_3_1 != 0;
        if (((pl) this).field_d) {
          ((pl) this).field_k = param0;
          if (param3 < -58) {
            return;
          } else {
            boolean discarded$4 = ((pl) this).b(-3);
            return;
          }
        } else {
          ((pl) this).field_k = param1;
          if (param3 < -58) {
            return;
          } else {
            boolean discarded$5 = ((pl) this).b(-3);
            return;
          }
        }
    }

    pl(int param0) {
        ((pl) this).field_k = 0;
        ((pl) this).field_d = false;
        ((pl) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_i = "<%0>Water:<%1> fleas can't swim, so make sure they stay out of any water.";
        field_l = new int[]{41, 30};
        field_f = 0;
    }
}
